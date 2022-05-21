package day10;

import java.util.HashSet;

public class _7hashCode {
    public static void main(String[] args) {
        Student s1= new Student("1", "one");
        s1.hashCode();
        Student s2 = new Student("2","two");
        Student s3 = new Student("2","two");

        //bad hashCode function %2
        //5%2=1
        //7%2=1
        //contract of HashCode()
        //1. consistency:
        //2. always override both the hashcode and equals
        //s1.equals(s2) => true then s1==s2 true
        //s1.equals(s2) false, s1==s2?
        HashSet<Student> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());
        //when to override hashcode and equals
        //1. using set

    }
}
