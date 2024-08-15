package july.ex_27072024;

public class lab119String_builder {
    public static void main(String[] args) {
//        String= immutable in nature
//StringBuilder & StringBuffer = mutable
        String s1 = "pramod";
        s1 = "rahul";

        StringBuilder Stbuilder = new StringBuilder("Rahul");
        //chane the value of StringBuilder
        Stbuilder.append("Borase");

     StringBuffer StBuffer =new StringBuffer("rakesh");
        //chane the value of StringBuffer

     StBuffer.append("patil");

        System.out.println(Stbuilder);
        System.out.println(StBuffer);

    }
}
