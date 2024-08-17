package august;

public class ATBperson {
    String name;
    long phone;


    //DC
    ATBperson() {
         System.out.println("Object is created");

    }
    ATBperson(String name) {
        this.name = name;
    }

    ATBperson(String name ,long phone) {
        this.name=name;
        this.phone = phone;
    }
}
