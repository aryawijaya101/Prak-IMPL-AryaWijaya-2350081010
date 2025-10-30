package Latihan.LatihanDIP;

class Car {
    private EngineInterface engine;
    public Car(EngineInterface engine) {
        this.engine = engine;
    }
    void start(){
        this.engine.start();
    }
}
