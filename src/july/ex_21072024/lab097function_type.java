package july.ex_21072024;

public class lab097function_type {
    public static void main(String[] args) {


//1.Function without parameter and without return type
//2.Function without parameter and with return type
//3.Function with parameter and without return type
//4.Function with parameter and with return type

        function_type1();
        System.out.println("...............................");
        String name = function_type2();
        System.out.println(name);
        System.out.println("...............................");
        function_type3("rahul");
        System.out.println("...............................");

        int Sum_result = function_type4(10,28);
        System.out.println("sum of number->" + Sum_result);
         }

        static void function_type1(){
             System.out.println("Function without parameter and without return type");
         }

    static String function_type2() {
        System.out.println("Function without parameter and with return type");
        return "Rahul Borase";
    }

    static void function_type3(String name2) {
        System.out.println("Function with parameter and without return type");
        System.out.println("your name->" + name2);
    }

    static int function_type4(int a, int b) {
        System.out.println("Function with parameter and with return type");
        return a+b;
    }


}
