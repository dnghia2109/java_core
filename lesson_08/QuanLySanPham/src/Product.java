public class Product {
    private int id, quantity;
    private long price;
    private String description, productName, donVi;

    public Product() {
    }

    public Product(int id, int quantity, long price, String description, String productName, String donVi) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.productName = productName;
        this.donVi = donVi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", productName='" + productName + '\'' +
                ", donVi='" + donVi + '\'' +
                '}';
    }
}
