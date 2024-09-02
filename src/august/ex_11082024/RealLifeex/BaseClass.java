package august.ex_11082024.RealLifeex;

abstract class BaseClass extends GrandBaseCLASS{
    // web Automation
    // single inheritance
    //Hide the functionalities to the open the browser
     abstract String openBrowser(String Browser);
     abstract String closeBrowser(String Browser);

    @Override
    void takeScreenshot() {
        System.out.println("Ok taking Screenshot");
    }
}


