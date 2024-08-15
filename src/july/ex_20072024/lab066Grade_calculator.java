package july.ex_20072024;

import java.io.StreamCorruptedException;
import java.util.Scanner;

public class lab066Grade_calculator {
    public static void main(String[] args) {

        //Garde calculator

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Score");
int score =sc.nextInt();
char Grade = 'f';

if (score <= 100&& score>=90){
    Grade ='A';
} else if (score <= 89 && score>=80) {
    Grade = 'B';
} else if (score <= 79 && score>= 70) {
    Grade = 'C';
} else if (score <= 69 && score>=60) {
    Grade = 'D';
} else if (score <= 59 && score>= 50) {
    Grade = 'F';
}
        System.out.println("Your Grade is ->" +Grade);
    sc.close();
    }

}
