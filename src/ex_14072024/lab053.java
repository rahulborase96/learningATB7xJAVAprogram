package ex_14072024;

public class lab053 {
    public static void main(String[] args) {

String name1 = "Good Morning Everyone";    //SCP area
String name2 = "Good Morning Everyone";    //SCP area


String name3 = new String("Good Morning Everyone");   // Heap area

        System.out.println(name1==name2);         // check for ref

        System.out.println(name1.equals(name2));  //check for content


        System.out.println(name1==name3);          //check for ref
        System.out.println(name1.equals(name3));   //check for content


    }


}
