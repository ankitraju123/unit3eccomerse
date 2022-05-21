package day10;

import java.util.ArrayList;
import java.util.Iterator;
import  java.util.List;

public class _1ArrayListDemo {
    public static void main(String[] args) {
        List<Object> list =new ArrayList();
        //5 is an object as well as a primitive
        list.add(5);
        list.add(20);
        list.add("five");
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.remove(1);
        integerList.contains(4);
        List<Integer> integers=new ArrayList<>(100);
        integers.add(100);

        integerList.addAll(integers);
        integerList.containsAll(integers);

        System.out.println(integerList);



        //initial capacity
        //load factor

        //traversing a list.
        //1st
        for(int i=0;i< integers.size();i++)
            System.out.println(integers.get(i)); //a[i]
        //2nd way // for each
        for(Integer i:integers)
            System.out.println(i);
        //old way:
        Iterator<Integer> iterator=integers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        //java 8 way : Lambda - yet to be taught
        integers.forEach(System.out::println);
        integers.forEach(num -> System.out.println(num));
    }
}
