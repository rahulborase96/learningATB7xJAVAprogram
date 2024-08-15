package july.ex_13072024;

public class lab031 {
    public static void main(String[] args) {

        //Relational operator
        // <,>,<=,>=,==,!=

        int x = 20;
        int y =25;
        boolean result1= x<y;
        boolean result2= x>y;
        boolean result13= x<=y;
        boolean result14= x>=y;
        for (boolean b : new boolean[]{result1, result2, result13, result14}) {
            System.out.println(b);
        }


    }
}
