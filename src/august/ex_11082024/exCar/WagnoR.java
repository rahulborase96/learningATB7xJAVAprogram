package august.ex_11082024.exCar;

public class WagnoR extends Engine{
    void Drive (){
        openCar();
        start();
        PartOfGear();
        speed();
        stop();
    }
    @Override
    void start() {
        System.out.println("start the WagnoR");
    }

    @Override
    void stop() {
        System.out.println("Stop the WagnoR");

    }

    @Override
    void speed() {
        System.out.println("200km/Hr");

    }

    @Override
    void PartOfGear() {
        System.out.println("Gear box of the WagnoR");

    }

    @Override
    void openCar() {
        System.out.println("OPen the WagnoR");

    }
}
