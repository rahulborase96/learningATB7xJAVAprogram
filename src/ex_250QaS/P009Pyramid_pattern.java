package ex_250QaS;

public class P009Pyramid_pattern {
    public static void main(String[] args) {
/*✅ Pyramid pattern in Java

    *
   ***
  *****
 *******
*********
*/
        for (int i = 1; i <=5; i++) {
            // Print spaces before the stars

            for (int j = 1; j <=5- i; j++) {
                System.out.print(" ");
        }
            //now print star
        for (int k=1; k<= 2*i-1; k++ ){
            System.out.print("*");
        }
            System.out.println();
        }
    }
}
