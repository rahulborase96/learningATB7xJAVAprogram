package august.ex_11082024.exCar;

class Car extends Engine {
    //Engine
    //Gear Box
    //Keys

    @Override
    void openCar() {
        System.out.println("open car with keys");
    }

    @Override
    void speed() {

    }

    @Override
    void PartOfGear() {
        System.out.println(" Part of gera box");

    }

    @Override
    void stop() {
        System.out.println(" stop the car");

    }

    @Override
    void start() {
        System.out.println("start the car");

    }
}
