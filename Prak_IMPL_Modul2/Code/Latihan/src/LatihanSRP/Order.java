package LatihanSRP;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Main.Item> items = new ArrayList<>();

    public void calculateTotalSum() {
        double total = 0.0;
        for (Main.Item i : items) total += i.getPrice();
        System.out.println("Total harga: " + total);
    }

    public void getItems() {
        if (items.isEmpty()) {
            System.out.println("Belum ada item.");
            return;
        }
        System.out.println("Daftar item:");
        for (Main.Item i : items) {
            System.out.println("- " + i.getName() + " : " + i.getPrice());
        }
    }

    public void getItemCount() {
        System.out.println("Jumlah item: " + items.size());
    }

    public void addItem(Main.Item item) {
        if (item != null) items.add(item);
    }

    public void deleteItem(Main.Item item) {
        items.remove(item);
    }
}
