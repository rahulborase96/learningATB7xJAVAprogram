package august.ex_17082024;

public class lab202
{
    public static void main(String[] args) {
        Car c = new Car("tesla");
        c.drive();
        System.out.println(c.make);

//to access inner class object
       Car.GearBox gb = c.new GearBox();
       gb.m2();

    }


}
class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }
    //method
    void drive(){
        System.out.println("you can drive a car");
    }
class  GearBox{
        void m2 (){
            System.out.println("m2");
        }
    class  nutBolts{

    }
    }
}