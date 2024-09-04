package august.ex_17082024;

public enum Colors {
    RED("#ff000"),
    Green("#fs000"),
    Blue("#fa000");


    private final  String hexValue;
    Colors (String hexValue){
        this.hexValue = hexValue;
    }

    public String getHexValue() {
        return hexValue;
    }
}
