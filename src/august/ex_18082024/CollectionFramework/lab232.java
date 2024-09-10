package august.ex_18082024.CollectionFramework;

import java.util.*;

public class lab232 {
    public static void main(String[] args) {
        List marks = new ArrayList<>();
        marks.add(92);
        marks.add(65);
        marks.add(72);
        marks.add(82);
        marks.add(90);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);

    }
}
