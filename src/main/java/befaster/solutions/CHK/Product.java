package befaster.solutions.CHK;

public class Product {

    private Character sku;
    private Integer price;

    public Product() {
    }

    public Product(Character sku, Integer price) {
        this.sku = sku;
        this.price = price;
    }

    public Character getSku() {
        return sku;
    }

    public void setSku(Character sku) {
        this.sku = sku;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
