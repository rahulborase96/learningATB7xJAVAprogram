package july.ex_27072024;

public class lab119_2D_array {
    public static void main(String[] args) {
        int [][] array_2d ={
                {25,58},
                {56,54},
                {12,32}
        };
        for (int a=0;a<array_2d.length;a++){
            for (int b=0;b<array_2d[a].length;b++){
                System.out.print(array_2d[a][b]);
                System.out.print("\t");    //for space tab
            }
            System.out.println();  //for new line
        }

    }
}
