package july.ex_21072024;

public class lab100Testing_function {
    public static void main(String[] args) {

open_the_browser();
testingpage();
testingpage2("page 2");
close_the_browser();
        System.out.println("................");
        open_the_browser();
        testingpage2("page 3");
        close_the_browser();
        System.out.println("................");
        open_the_browser();
        testingpage2("page 4");
        close_the_browser();



    }

    static void open_the_browser(){
        System.out.println("open the browser");
    }
    static void close_the_browser(){
        System.out.println("close the browser");
    }
    static void testingpage(){
        System.out.println("testing page 1 opened");
    }
    static void testingpage2(String page){
        System.out.println("testing page ->" + page);
    }



}
