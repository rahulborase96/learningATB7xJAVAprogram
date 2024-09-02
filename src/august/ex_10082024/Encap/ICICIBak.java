package august.ex_10082024.Encap;

public class ICICIBak {
    private String name;
    private long bal;

    public ICICIBak(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean IfAdmin) {
        if (IfAdmin){
            this.name = name;
            System.out.println("not Allowed");

        }else {
            System.out.println("not allowed");
        }
    }

    public long getBal() {
        return bal;
    }
    public void setBal(long bal, boolean IfAdmin) {
        if (IfAdmin) {
            this.bal = bal;
            System.out.println("Allowed");

        } else {
            System.out.println("not Allowed");
        }
    }
}
