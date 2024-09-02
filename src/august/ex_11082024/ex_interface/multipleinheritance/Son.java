package august.ex_11082024.ex_interface.multipleinheritance;

public class Son implements Father, Mother{
    @Override
    public void Money() {
        System.out.println("This the p=only one function");
    }

    @Override
    public void Home() {

    }
}
