package july.ex_20072024;

import java.util.Scanner;

public class lab068switch {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter th browser name Where you want execute ");
        String browser_name = sc.next();
         browser_name =browser_name.toLowerCase();

    switch (browser_name){
    case "chrome":
        System.out.println("starting the chrome browser");
        break;
    case "firefox":
            System.out.println("starting the firefox browser");
            break;
    case "edge":
        System.out.println("starting the edge browser");
        break;
    default:
        System.out.println("I have no idea which browser is this");
        }

    }





}
