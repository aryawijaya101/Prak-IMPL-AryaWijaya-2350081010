package Tugas2;

import java.util.Scanner;

public class Mvcpatterndemo {
    public static void main(String[] args) {
        // Inisiasi data seperti program awal
        Barang barang = new Barang("GeForce GTX 1060Ti", 3000, 10);

        // View berbasis console
        Scanner scanner = new Scanner(System.in);
        KasirView view = new KasirView(scanner);

        // Controller
        KasirController controller = new KasirController(barang, view);

        // Jalankan alur
        controller.mulai();
    }
}