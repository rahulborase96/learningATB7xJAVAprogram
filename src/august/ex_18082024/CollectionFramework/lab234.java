package august.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab234 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");

        System.out.println(" - To Print Arraylist - 1 ");
for (String s1 : mylist){
    System.out.println(s1);
        }

        System.out.println(" - To Print Arraylist - 2 ");
for ( int i = 0 ; i<mylist.size();i++){
    System.out.println(mylist.get(i));
}


        System.out.println(" - To Print Arraylist - 3 ");

        // Iterator
        Iterator <String> its =mylist.iterator();
        while (its.hasNext())
            System.out.println(its.next());

    }
}
