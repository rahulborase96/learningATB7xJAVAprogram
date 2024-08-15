package july.ex_27072024;

public class lab103 {
    public static void main(String[] args) {

        int marks[] = new int [3];
        marks[2] =97;
        marks[0] =81;
        marks[1] =90;


        System.out.println(marks[1]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
     //   System.out.println(marks[4]);  //array index out of bound exception
        System.out.println("index...................");
        for (int i = 0; i<marks.length; i++){
            System.out.println(   i  + "-"+  marks[i]);
        }
        System.out.println("WeekDays");
        String [] weekdays={"sun","mon","tue","wed","thus","fri", "sat"};
            for (int i=0; i< weekdays.length;i++) {
                System.out.println(weekdays[i]);
            }

    }
}
