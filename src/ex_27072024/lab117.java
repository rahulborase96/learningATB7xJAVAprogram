package ex_27072024;

public class lab117 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
            int sal[]= {35,56,3,22,44,616,84,2,34};
            int n=sal.length;
            int second,i;
            int largest =second=Integer.MIN_VALUE;
            for (i = 0; i < sal.length; i++) {
                largest=Math.max(largest, sal[i]);
            }
            System.out.println("Fisrt maximum salary--->"+largest);
            for ( i = 0; i < sal.length; i++) {
                if (sal[i]!=largest) {
                    second=Math.max(second, sal[i]);
                }
            }
            if (second==Integer.MIN_VALUE) {
                System.out.println("No second largest salary");
            }else {
                System.out.println("Second maximum salary--->"+second);
            }
                    }}

