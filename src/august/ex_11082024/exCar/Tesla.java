package august.ex_11082024.exCar;

public class Tesla extends Engine{
    void Drive (){
        openCar();
        start();
        PartOfGear();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("start Tesla");
    }

    @Override
    void speed() {
        System.out.println("250km/Hr");
    }

    @Override
    void stop() {
        System.out.println("Stop Tesla");

    }

    @Override
    void PartOfGear() {
        System.out.println("Gear box of Tesla");

    }

    @Override
    void openCar() {
        System.out.println("OPen the Tesla");

    }
}
