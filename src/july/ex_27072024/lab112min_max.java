package july.ex_27072024;

public class lab112min_max {
    public static void main(String[] args) {
        int num[] ={15,58,69,8,7,68,97,65,};

        int max = 1;
        int min = num[0];
        for (int i =0;i< num.length; i++){
            if (num[i]>max){
                max = num[i];
            }
            if (num[i]<min){
                min =num[i];
            }
        }
        System.out.println("max numis->"+max);
        System.out.println("min numis->"+min);

    }
}
