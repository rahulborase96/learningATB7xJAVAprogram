package august.ex_18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class lab228 {
    public static void main(String[] args) {
      //  Collections Framework
        // Collection - Interface
        // Collection(I) -> List (I)
        // List (I) -> ArrayList, LinkedList, Vector, Stack

        // Shopping List, Marks List, Collection of items, Todo List, Student List.
//        Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
//        List mylist = new ArrayList(); //  Dynamic Dispatch
        Collection mylist3 = new ArrayList(); //  Dynamic Dispatch
        List myslist = new ArrayList();
        ArrayList myslist2 = new ArrayList();
        myslist2.add("rahul");
        myslist2.add("ram");
        myslist2.add("rakesh");
        myslist2.add("jay");
        myslist2.add("mehul");
        myslist2.add("rakesh");
        System.out.println(myslist2);

        System.out.println(myslist2.size());
        System.out.println(myslist2.contains("jay"));
        System.out.println(myslist2.contains("sham"));

        String s1 =(String) myslist2.get(1);
        System.out.println(s1);

    }
}
