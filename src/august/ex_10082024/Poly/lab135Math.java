package august.ex_10082024.Poly;

public class lab135Math {
    //Polymorphism
    public static void main(String[] args) {
        MathOfAdd math = new MathOfAdd();
        int result = math.add(5,5);
        double result2 = math.add(5.5,55.2);
        String result3 = math.add("rahul","Borase");
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}
