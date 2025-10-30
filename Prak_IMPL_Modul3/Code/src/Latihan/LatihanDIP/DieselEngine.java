package Latihan.LatihanDIP;

class DieselEngine implements EngineInterface {
    @Override
    public void start() {
        System.out.println("Diesel Engine has started");
    }
}