package august.ex_11082024.ex_interface.EX2;

public interface E {
void  StartEngine();
void  StopEngine();
    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();
//   void m4(){
//       System.out.println("Not possible");
//   }

}