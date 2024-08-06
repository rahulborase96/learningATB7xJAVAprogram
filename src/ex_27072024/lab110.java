package ex_27072024;

public class lab110 {
    public static void main(String[] args) {
        int num[] ={15,58,69,8,7,68,97,65,};

        int max = 1;
        for (int i =0;i< num.length; i++){
        if (num[i]>max){
            max = num[i];

        }
    }
        System.out.println("max num is->"+max);

    }
}
