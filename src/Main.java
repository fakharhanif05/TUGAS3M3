public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        MenuItem item1 = new MenuItem("Mie Ayam", 12000);
        item1.setQuantity(1);

        MenuItem item2 = new MenuItem("Bakso", 10000);
        item2.setQuantity(1);

        order.addItem(item1);
        order.addItem(item2);

        // Cetak Nota
        order.printReceipt();
    }
}
