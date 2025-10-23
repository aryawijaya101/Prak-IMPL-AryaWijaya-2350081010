package LatihanSRP;

public class OrderViewer {
    public void printOrder(Order order) {
        System.out.println("=== RINGKASAN ORDER ===");
        order.getItems();
        order.getItemCount();
        order.calculateTotalSum();
        System.out.println("========================");
    }

    public void showOrder(Order order) {
        printOrder(order);
    }
}
