package august.ex_11082024.RealLifeex;

import august.ex_11082024.exLoan.Son;

public class lab139 {
    public static void main(String[] args) {
        CHROME Browser1 =new CHROME();
        Browser1.openBrowser("OPEN THE CHROME");
        Browser1.takeScreenshot();
        Browser1.closeBrowser("CLOSE THE CHROME");
        System.out.println(".........      .............");
        Firefox Browser2 = new Firefox();
        Browser2.openBrowser("OPEN");
        Browser2.closeBrowser("CLOSE");
        Browser2.takeScreenshot();


    }


}
