package ex_28072024;

public class lab123_Car {
    String name;
    String color;


    void ac(){
        System.out.println("car is fully AC");
    }
    void  gear(){
        System.out.println("auto gear");
    }

    public static void main(String[] args) {
        lab123_Car car =new lab123_Car();
        car.name = "BMW";
        car.color= "black";
        car.gear();

        lab123_Car car2 =new lab123_Car();
        car2.name = "Tata";
        car2.color= "white";
        car2.gear();
        car2.ac();
    }

}
