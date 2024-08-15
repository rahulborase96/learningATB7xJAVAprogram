package july.ex_27072024;

public class lab120 {
    public static void main(String[] args) {
        StringBuilder Stbuilder = new StringBuilder("Rahul");
        //chane the value of StringBuilder
        Stbuilder.append("Borase");
        Stbuilder.append("age");
        Stbuilder.append("27");

        StringBuffer StBuffer =new StringBuffer("rakesh");
        //chane the value of StringBuffer
        StBuffer.append("patil");
        StBuffer.append("age");
        StBuffer.append("28");

        System.out.println(Stbuilder);
        System.out.println(StBuffer);
    }
}
