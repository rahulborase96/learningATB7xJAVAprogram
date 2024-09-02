package august.ex_11082024.staticKeyword;

public class lab144 {
//static
    //data member
    //function
    //class
    //block
public static void main(String[] args) {
    System.out.println(ATB.courseName);
    ATB a1 =new ATB("rahul");
    System.out.println(a1.getName());
    System.out.println("..............");
    ATB a2 = new ATB("rakesh");
    System.out.println(a2.getName());
    ATB.doAssignment();
}
}

class  ATB{
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation

        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }
    private String name;
    static String courseName="ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
    static void doAssignment(){
        System.out.println("Do Assignment");
    }
}