package Tugas.Tugas3OCP;

class MahasiswaCinema extends Cinema {
    public MahasiswaCinema(Double price) {

        this.price = price;
    }

    @Override
    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}