package july.ex_20072024;
import java.util.Scanner;
public class lab069vowel {
    public static void main(String[] args) {

      // take user input as  char and tell the user if it is vowel
        //aeiou
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the char,i will tell you,If it is vowel or Not");
         char User_input =sc.next().charAt(0);
        System.out.println(User_input);
        switch (User_input){
            case 'a':
                System.out.println("it is vowel");
                break;
            case 'e':
                System.out.println("it is vowel");
                break;
            case 'i':
                System.out.println("it is vowel");
                break;
            case 'o':
                System.out.println("it is vowel");
                break;
            case 'u':
                System.out.println("it is vowel");
                break;
            default:
                System.out.println("it is not vowel, it is consonant");
                break;
        }
    }


}
