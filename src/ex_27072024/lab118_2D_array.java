package ex_27072024;

public class lab118_2D_array {
    public static void main(String[] args) {
        int [][] array_2d ={
                {12,58,77},
                {25,54,6,},
                {54,5,68,}
        };

        for (int i = 0;i<array_2d.length;i++){
            for (int j=0;j<array_2d[i].length;j++){
                System.out.print(array_2d[i][j]);
                System.out.print(" ");     //for space
            }
            System.out.println();    //for new line as table format
        }
    }
}
