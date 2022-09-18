package befaster.solutions.CHK;

public class Promotion {

    private Character sku;
    private Integer quantity;
    private Integer totalValue;

    public Promotion() {
    }

    public Promotion(Character sku, Integer quantity, Integer totalValue) {
        this.sku = sku;
        this.quantity = quantity;
        this.totalValue = totalValue;
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

    public Integer getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
    }
}
