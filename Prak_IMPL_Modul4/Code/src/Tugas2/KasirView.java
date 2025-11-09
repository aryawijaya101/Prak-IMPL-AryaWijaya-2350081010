package Tugas2;

import java.util.Scanner;
import Tugas2.Barang;

public class KasirView {
    private final Scanner in;

    public KasirView(Scanner in) {
        this.in = in;
    }

    public void tampilkanInfo(Barang barang) {
        System.out.println("Nama Barang : " + barang.getNama());
        System.out.println("Harga Barang : " + barang.getHarga());
        System.out.println("Stok Barang : " + barang.getStok());
    }

    public void tampilkanHeaderTransaksi() {
        System.out.println("Transaksi Pembelian");
    }

    public int mintaQty() {
        System.out.print("Jumlah barang : ");
        while (!in.hasNextInt()) {
            System.out.println("Input tidak valid. Masukkan angka bulat.");
            System.out.print("Jumlah barang : ");
            in.next(); // buang token non-angka
        }
        int qty = in.nextInt();
        in.nextLine(); // konsumsi newline
        return qty;
    }

    public void tampilkanTotal(int total) {
        System.out.println("Jumlah Bayar : " + total);
    }

    public void tampilkanError(String pesan) {
        System.out.println("Error: " + pesan);
    }
}