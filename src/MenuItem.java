public class MenuItem {
    private String name;
    private double price;
    private int quantity;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
