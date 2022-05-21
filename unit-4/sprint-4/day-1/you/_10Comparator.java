package day10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class _10Comparator {
    public static void main(String[] args) {
        Student s1=new Student("1", "one");
        Student s2=new Student("2", "two");
        Student s3=new Student("1", "one"); //duplicate
        Student s4=new Student("4", "four");
        Set<Student> set= new TreeSet<>(new StudentNameComparator());
        set.add(s1);
        set.add(s2);
        set.add(s4);
        set.add(s3);
        System.out.println(set);

    }
}

class StudentNameComparator implements Comparator<Student>
{

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName().compareTo(o2.getName()));

    }
}