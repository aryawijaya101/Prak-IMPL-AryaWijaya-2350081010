package Tugas2;

public class Barang {
    private String nama;
    private int harga;
    private int stok;

    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        if (harga < 0) throw new IllegalArgumentException("Harga tidak boleh negatif.");
        this.harga = harga;
    }

    public void setStok(int stok) {
        if (stok < 0) throw new IllegalArgumentException("Stok tidak boleh negatif.");
        this.stok = stok;
    }

    /** Kurangi stok sesuai qty dan kembalikan total harga. */
    public int beli(int qty) {
        if (qty <= 0) throw new IllegalArgumentException("Jumlah barang harus lebih dari 0.");
        if (qty > stok) throw new IllegalArgumentException("Stok tidak mencukupi.");
        stok -= qty;
        return qty * harga;
    }
}