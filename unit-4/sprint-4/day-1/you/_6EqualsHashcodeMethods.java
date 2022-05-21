package day10;

public class _6EqualsHashcodeMethods {
    public static void main(String[] args) {
        Student s1=new Student("1", "one");
        System.out.println("s1 ");
        System.out.println(s1.hashCode());
        //? ToString Method
        System.out.println(s1);
        Student s2=new Student("2", "two");
        Student s3=new Student("1", "one");
        System.out.println(s2.hashCode());
        System.out.println("s3 "+s3.hashCode());
        //equals vs ==
        //== compares memory locations
        System.out.println(s1==s2);

        //equals
        /*
        *  public boolean equals(Object obj) {
        return (this == obj);
    }
        * */
        System.out.println(s1.equals(s2));


        //comparing
        System.out.println(s1==s3); //false
        System.out.println(s1.equals(s3)); //false
        String s;
        //equals() in String class compares the content not the m/m address
        String a="a";
        String b="b";
        String c="a";
        System.out.println(a==b); //false
        System.out.println(a.equals(b)); //false

        System.out.println(a==c); //false ; I don't agree
        System.out.println(a.equals(c)); //true
        System.out.println(5==5);
        Integer wrapperFive=5;
        int primFive=5;
        System.out.println(wrapperFive.equals(primFive));
        //Contract of equals() in Java

        Object o=new Object();
        //1. reflexive
        //o.equals(o);
        System.out.println(s1.equals(s1));
        //2. symetric
        //x.equals(y)
        //3. transitive
        //a.equals(b)
        //4. consistency s1.equals(s3)

    }
}
