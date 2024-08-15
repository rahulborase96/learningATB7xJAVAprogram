package july.ex_27072024;

public class lab0113HM_2nd_max_num {
    public static void main(String[] args) {
        //How to Find the Second Highest Salary in the Array?
        //int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int[] salaries = {7, 10, 4, 33, 25, 18, 19, 8, 17};

        int max1 = salaries[0];
        int max2 = salaries[0];

        for (int i= 0; i < salaries.length; i++){

            if (salaries[i] > max1){
                  max2=max1;
                max1 =salaries[i];
            }
        }
        System.out.println(max2);

    }

}
