public class Product {
    private String name;
    private Integer stock;
    private Integer minStock;
    public Product(String name, Integer stock, Integer minStock) {
        this.name = name;
        this.stock = stock;
        this.minStock = minStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getMinStock() {
        return minStock;
    }

    public void setMinStock(Integer minStock) {
        this.minStock = minStock;
    }
}
