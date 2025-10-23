package Tugas.Tugas3OCP;

class Main {
    public static void main(String[] args) {
        MahasiswaCinema mahasiswaCinema = new MahasiswaCinema(100.0);
        Double adminFee = mahasiswaCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}
