package Tugas2;

import Tugas2.Barang;
import Tugas2.KasirView;

public class KasirController {
    private final Barang barang;
    private final KasirView view;

    public KasirController(Barang barang, KasirView view) {
        this.barang = barang;
        this.view = view;
    }

    public void mulai() {
        view.tampilkanInfo(barang);
        view.tampilkanHeaderTransaksi();

        int qty = view.mintaQty();

        try {
            int total = barang.beli(qty);
            view.tampilkanTotal(total);
        } catch (IllegalArgumentException e) {
            view.tampilkanError(e.getMessage());
            return;
        }

        view.tampilkanInfo(barang);
    }
}