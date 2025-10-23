package LatihanSRP;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Sample Item", 10000.0);
        Item another = new Item("Another Item", 25000.0);

        Order order = new Order();
        order.addItem(item);
        order.addItem(another);

        OrderHistory history = new OrderHistory();
        history.getDailyHistory();

        OrderViewer viewer = new OrderViewer();
        viewer.printOrder(order);
    }

    // Didefinisikan di sini agar tetap hanya 4 file.
    public static class Item {
        private final String name;
        private final double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
        public String getName() { return name; }
        public double getPrice() { return price; }
    }
}
