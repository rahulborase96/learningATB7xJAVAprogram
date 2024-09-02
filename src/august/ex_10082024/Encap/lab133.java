package august.ex_10082024.Encap;

public class lab133 {
    //Fixed Encapsulation
    public static void main(String[] args) {
        VWOLogin1 vwolOgin =new VWOLogin1("admin","pass123");
        System.out.println(vwolOgin.getPassword());
        System.out.println(vwolOgin.getUsername());
        vwolOgin.setUsername("rahul");
        vwolOgin.setPassword("123545",true);
        System.out.println(vwolOgin.getPassword());
        System.out.println(vwolOgin.getUsername());
        vwolOgin.setPassword("18792",false);
        }
}
class VWOLogin1 {
    // Data members
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,Boolean isauth) {
        if (isauth) {
            this.password = password;
        } else {
            System.out.println("not allowed");
        }
    }
    public VWOLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
