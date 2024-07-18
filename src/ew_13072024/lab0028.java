package ew_13072024;

public class lab0028 {
    public static void main(String[] args) {
         char  c1 = '\b';     //Backlash, delete 1 char
         char  c2 = '\t';    //add tab
         char  c3 = '\n';    // new line
         char  c4 = '\r';    // backlash , delete 1 word
        System.out.println("rahul" + c1 + "borase");
        System.out.println("rahul" + c3 + "borase");
        System.out.println("rahul" + c2 + "borase");
        System.out.println("rahul" + c4 + "borase");
        System.out.println("rahul" + c1+ c3 + "borase" + c1);


//               resul is
//
//       1.rahuborase
//       2.rahul
//         borase
//       3.rahul	borase
//       4.borase
//       5.rahu
//         boras



    }
}
