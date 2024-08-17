package august.ex_04082024.accessModifiers.police;

public class Cop {
    int gun;
    String IDCard;

   public Cop(int gun) {
        this.gun = gun;
    }

  public   void CanIshoot() {
        System.out.println("Yes You Can!!");
    }
    protected void shoot(){
        System.out.println("shoot");
    }
}