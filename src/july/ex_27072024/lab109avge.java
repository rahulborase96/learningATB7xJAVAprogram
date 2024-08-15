package july.ex_27072024;
import java.util.Scanner;
public class lab109avge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        // Loop through each subject to get the marks
        int i =0;
        while (i < marks.length) {
            System.out.println("Enter the marks of " + (i+1));
            marks[i] = sc.nextFloat();
            i++;
        }

float avg =(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg marks ->"+avg);
        sc.close();
    }
    }
