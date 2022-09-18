package befaster.solutions.CHK;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {

    private ProductsService productsService;
    private PromotionsService promotionsService;

    public CheckoutSolution() {
        productsService = new ProductsService();
        promotionsService = new PromotionsService();
    }

    public Integer checkout(String skus) {
        try {
            Map<Product, Integer> basket = groupByProduct(skus);
            Map<Product, Integer> basketWithPromotions = applyPromos(basket);
            Integer total = 0;
            for (Product product: basketWithPromotions.keySet()) {
                total += basketWithPromotions.get(product) * product.getPrice();
            }
            return total;
        } catch (InvalidParameterException e) {
            return -1;
        }
    }

    private Map<Product, Integer> groupByProduct(String skus) {
        char[] basket = skus.toCharArray();
        Map<Product, Integer> groupedProducts = productsService.getProducts().stream().collect(Collectors.toMap(Function.identity(), a -> 0));
        for (char sku : basket) {
            Product product = productsService.getProductBySKU(sku);
            groupedProducts.put(product, groupedProducts.get(product) + 1);
        }
        return groupedProducts;
    }

    private Map<Product, Integer> applyPromos(Map<Product, Integer> basket) {
        Map<Product, Integer> baskteWithPromotions = new HashMap<>(basket);
        for (Product product: basket.keySet()) {
            Optional<Promotion> promotionOptional = promotionsService.getPromotionBySKU(product.getSku());
            if (promotionOptional.isPresent()) {
                Promotion promotion = promotionOptional.get();
                Integer promotionQuantity = promotion.getQuantity();
                if (basket.get(product) >= promotionQuantity) {
                    Product promotionProduct = new Product(promotion.getId(), promotion.getUnitPrice());
                    baskteWithPromotions.put(promotionProduct, basket.get(product) / promotionQuantity);
                    baskteWithPromotions.put(product, basket.get(product) % promotionQuantity);
                }
            }
        }
        return baskteWithPromotions;
    }
}
