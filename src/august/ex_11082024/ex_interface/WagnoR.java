package august.ex_11082024.ex_interface;

public class WagnoR implements Engine{
     void Drive(){
         startEngine();
         stopEngine();
     }


    @Override
    public void startEngine() {
        System.out.println("WagonR is start");
    }

    @Override
    public void stopEngine() {
        System.out.println("WagonR is stop");


    }
}
