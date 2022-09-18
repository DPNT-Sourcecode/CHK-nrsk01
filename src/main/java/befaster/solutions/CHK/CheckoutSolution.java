package befaster.solutions.CHK;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckoutSolution {

    private ProductsService productsService;

    public CheckoutSolution() {
        productsService = new ProductsService();
    }

    public Integer checkout(String skus) {
        try {
            Map<Product, Integer> basket = groupByProduct(skus);
            Integer total = 0;
            for (Product product: basket.keySet()) {
                total += basket.get(product) * product.getPrice();
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
}
