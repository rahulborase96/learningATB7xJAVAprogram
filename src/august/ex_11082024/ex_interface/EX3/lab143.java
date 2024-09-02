package august.ex_11082024.ex_interface.EX3;

import javax.xml.transform.Source;

public class lab143 {
    public static void main(String[] args) {
        car c =new car();
        c.start();
    }
}
interface Eng{
    void start();
default void m1(){
    System.out.println("M1");
}
}
interface gearBox extends Eng{
    void gear();
}
interface keys extends gearBox{
    void openCar();
}
class car implements keys{

    @Override
    public void openCar() {

    }

    @Override
    public void gear() {

    }

    @Override
    public void start() {
        System.out.println("start the car");

    }
}