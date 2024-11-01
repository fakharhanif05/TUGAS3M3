import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotalOrder() {
                double total = 0;
                        for (MenuItem item : items) {
                            total += item.calculateTotalPrice();
                        }
                        return total;

    }

    // Menampilkan Nota
    public void printReceipt() {
        System.out.println("----- Nota Pemesanan -----");
        for (MenuItem item : items) {
            System.out.printf("%s x%d: Rp%.2f\n", item.getName(), item.getQuantity(), item.calculateTotalPrice());
        }
        System.out.printf("Total: Rp%.2f\n", calculateTotalOrder());
        System.out.println("--------------------------");
    }
}
