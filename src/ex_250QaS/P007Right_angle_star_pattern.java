package ex_250QaS;

public class P007Right_angle_star_pattern {
    public static void main(String[] args) {
/*     ✅ Right Triangle Star Pattern
*
**
***
****
*****
*/
    int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
