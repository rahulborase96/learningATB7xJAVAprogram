package august.ex_11082024.RealLifeex;

public class CHROME extends BaseClass{
    @Override
    String openBrowser(String Browser) {
        System.out.println("Open the chrome");
        return "";
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("Close the chrome");

        return "";
    }

    @Override
    void takeScreenshot() {
        System.out.println("Ok taking Screenshot in Chrome");
    }
}
