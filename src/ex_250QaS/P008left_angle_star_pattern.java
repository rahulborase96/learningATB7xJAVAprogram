package ex_250QaS;

public class P008left_angle_star_pattern {
    public static void main(String[] args) {
//    ✅ Left Triangle Star Pattern
//*****
//****
//***
//**
//*
           for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  //for new line
        }
    }
}

