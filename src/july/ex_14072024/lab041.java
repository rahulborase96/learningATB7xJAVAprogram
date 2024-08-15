package july.ex_14072024;

public class lab041 {
    public static void main(String[] args) {

 int price = 120;
  float GST = 18.45f;
  int total_price = price + (int) GST;
        System.out.println(total_price); //Explicit narrowing   //loss of date

        float total_price2 = price + GST;
        System.out.println(total_price2);



    }
}
