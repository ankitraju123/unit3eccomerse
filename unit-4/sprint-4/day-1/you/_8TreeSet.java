package day10;

import java.util.*;

public class _8TreeSet {
    public static void main(String[] args) {
        //object are sorted in natural order by default.
        Set<Integer> treeSet= new    TreeSet<>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        System.out.println(treeSet);


        Student s1=new Student("1", "one");
        Student s2=new Student("2", "two");
        Student s3=new Student("1", "one"); //duplicate
        Student s4=new Student("4", "four");
        Set<Student> set= new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s4);
        set.add(s3);
        System.out.println(set);

    }

}
