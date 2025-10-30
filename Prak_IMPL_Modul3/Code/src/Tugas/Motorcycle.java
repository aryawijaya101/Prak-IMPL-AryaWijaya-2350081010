package Tugas;

class Motorcycle implements VehicleInterface {

    // Implementasi fungsi drive
    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }

    // Implementasi fungsi stop
    @Override
    public void stop() {
        System.out.println("Motorcycle has stopped");
    }

    // Implementasi fungsi refuel
    @Override
    public void refuel() {
        System.out.println("Motorcycle is refueling");
    }
}
