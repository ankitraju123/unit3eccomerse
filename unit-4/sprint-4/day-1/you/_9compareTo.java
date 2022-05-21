package day10;

public class _9compareTo {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="xyz";
        String s3="xyz";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s2.compareTo(s3));
        //s1.compareTo(s2); //s1=this s2=that
        //s1.compareTo(s3); //s1=this s3=that
    }
}
