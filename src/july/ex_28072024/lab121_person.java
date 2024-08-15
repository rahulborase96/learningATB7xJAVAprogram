package july.ex_28072024;

public class lab121_person {
    public static void main(String[] args) {
    person p1=new person();
    p1.name ="rahul";
    p1.age = 12;
    p1.height = 140;
    p1.weight=55;
        person p2=new person();
        p2.name ="rohit";
        p2.age = 18;
        p2.height = 130;
        p2.weight=51;
        person p3=new person();
        p3.name ="rakesh";
        p3.age = 18;
        p3.height = 120;
        p3.weight=52;

        p1.walk();
        p1.read();
        p2.talk();
    }
}
