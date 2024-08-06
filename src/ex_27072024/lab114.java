package ex_27072024;

import java.util.Arrays;

public class lab114 {
    public static void main(String[] args) {

        //Find Second Highest Salary in array

        int[] salaries = {7, 10, 4, 2, 5, 18, 49, 28, 17};
        Arrays.sort(salaries);

        int highest_sal = salaries[salaries.length-1];
        int second_highestSal = salaries[salaries.length-2];

        System.out.println(highest_sal);
        System.out.println(second_highestSal);
        int highest = salaries[0];
        int second_highest = salaries[0];
    }}