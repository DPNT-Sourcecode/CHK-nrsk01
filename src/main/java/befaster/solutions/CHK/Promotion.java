package befaster.solutions.CHK;

public class Promotion {

    private String id;
    private Character sku;
    private Integer quantity;
    private Integer unitPrice;

    public Promotion() {
    }

    public Promotion(String id, Character sku, Integer quantity, Integer unitPrice) {
        this.id = id;
        this.sku = sku;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Character getSku() {
        return sku;
    }

    public void setSku(Character sku) {
        this.sku = sku;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
}

