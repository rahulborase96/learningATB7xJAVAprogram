package august.ex_10082024.Encap;

public class lab132 {
    //Encapsulation
    public static void main(String[] args) {
        VWOLogin vwolOgin1 =new VWOLogin("admin","pass123");
        System.out.println(vwolOgin1.password);
        vwolOgin1.password="Pass123456";
        System.out.println(vwolOgin1.password);


    }

}
class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}