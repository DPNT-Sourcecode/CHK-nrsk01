package befaster.solutions.CHK;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class ProductsService {

    private List<Product> products;

    public ProductsService() {
        products = new ArrayList<>(4);
        products.add(new Product("A", 50));
        products.add(new Product("B", 30));
        products.add(new Product("C", 20));
        products.add(new Product("D", 15));
    }

    public Product getProductBySKU(char sku) {
        return products.stream().filter(p -> p.getSku().equals(String.valueOf(sku)))
                .findFirst().orElseThrow(InvalidParameterException::new);
    }

    public List<Product> getProducts() {
        return products;
    }
}
