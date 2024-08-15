package july.ex_28072024;

public class lab122_Building {
    public static void main(String[] args) {
        BuildingBP dlf =new BuildingBP();
        dlf.name ="DLF Builder";
        dlf.color= "red";
        dlf.noOfroom=12;

        dlf.uselift();

        BuildingBP tata =new BuildingBP();
        tata.name ="DLF Builder";
        tata.color= "red";
        tata.noOfroom=12;

        tata.uselift();
        tata.activities();



    }
}
