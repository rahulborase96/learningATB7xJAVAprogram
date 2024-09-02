package august.ex_10082024.Encap;

public class lab134_ICICIBank {
    public static void main(String[] args) {
        ICICIBak iciciBak = new ICICIBak("rahul", 1252546);

    System.out.println(iciciBak.getName());
        iciciBak.setName("Rahul",true);
        System.out.println(iciciBak.getName());
        iciciBak.setName("rfghh",false);
        iciciBak.setBal(500000,true);




    }

}
