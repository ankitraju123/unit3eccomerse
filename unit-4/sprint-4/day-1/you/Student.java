package day10;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    String rollNumber;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber='" + rollNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Student student = (Student) other;
        return rollNumber.equals(student.rollNumber) && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name);
    }

    public Student(String rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNumber.compareTo(that.rollNumber);
        /*
        * if((this.rollNumber).compareTo(that.rollNumber)>0)
            return 1;
        else if((this.rollNumber).compareTo(that.rollNumber)<0)
                return -1;
        else
            return 0;
        * */

    }
}
