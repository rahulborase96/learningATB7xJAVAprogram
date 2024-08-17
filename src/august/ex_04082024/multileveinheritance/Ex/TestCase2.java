package august.ex_04082024.multileveinheritance.Ex;

public class TestCase2 extends baseTest{
    void testcase2 (){
        startBrowser();
        //testcase
        getdata();
        closeBrowser();
    }

    public static void main(String[] args) {
        new TestCase2().testcase2();
    }
}
