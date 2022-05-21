package day10;

import java.util.Stack;

public class _4Stack {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("one");
        //stack.pop();
        String fromTop=stack.peek(); //throw exception if stack size is zero
        stack.pop();
        stack.isEmpty();

        //stack.peek();
    }
}
