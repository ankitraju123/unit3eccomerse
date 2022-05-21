package day10;

public class _2Autoboxing {
    public static void main(String[] args) {
        //primitives
        //int, float, char, boolean
        int i=5;

        //wrapper classes
        Integer j=5;
        //boxing: primitive -> wrapper
        int primitiveNum=10;
        Integer wrapperNum=Integer.valueOf(primitiveNum);
        //autoboxing
        int primtiveInteger=100;
        Integer wrapInt=primtiveInteger;

        //unboxing: wrapper -> primitive
        int primitiveValue=wrapperNum.intValue();
        //autounboxing.
    }
}
