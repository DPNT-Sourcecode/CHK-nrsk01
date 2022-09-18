package befaster.solutions.CHK.model;

public class Product {

    private String  sku;
    private Integer price;

    public Product() {
    }

    public Product(String  sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String  sku) {
        this.sku = sku;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
