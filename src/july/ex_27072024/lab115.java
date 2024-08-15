package july.ex_27072024;

public class lab115 {
    public static void main(String[] args) {
        int[] list_sal = {7, 10, 4, 33, 25, 18, 19, 8, 17};
        int [] sort_sal = new int[5];

        for (int i = 0; i < list_sal.length-1; i++) {

            for (int j = 0; j < list_sal.length - i - 1 ; j++) {
                if (list_sal[j] > list_sal[j+1]) {
                    // if true swap
                    int temp = list_sal[j];
                    list_sal[j] = list_sal[j+1];
                    list_sal [j+1] = temp;
                }
            }

        }
        System.out.println("Second high salary will be.... "+list_sal[list_sal.length-2]);

        }

    }
