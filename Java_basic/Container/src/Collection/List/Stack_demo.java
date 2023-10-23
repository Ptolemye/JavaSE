package Collection.List;

import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("aaaa");
        stack.push("bbb");
        for(String i:stack){
            System.out.printf(i+" ");
        }
        System.out.println();
        stack.pop();
        for(String i:stack){
            System.out.print(i);
        }
        System.out.println(stack);
    }
}