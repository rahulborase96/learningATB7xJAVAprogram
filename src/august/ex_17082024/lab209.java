package august.ex_17082024;

public class lab209 {

    public static void main(String[] args) {
          String ip = args[0];  // ArrayIndexOutOfBoundsException
          int a = Integer.parseInt(ip);  // NumberFormatException
          int b =1000/a;   // ArithmeticException
        System.out.println(ip);
        System.out.println(b);

        //JVM will be Initialized
        //Creates and Starts the main Thread. - Main Called
        //1)Collects the Command Line Arguments
        //2)Creates the String array with CLI
        //3. Lab209.main(0)
        //Now Control will be transferred from main Thread to main method
        // When problem comes in main -> JVM
        // If don't handle the exception JVM -
        // Exception a=new Exception() and terminate the program.  G



    }

}
