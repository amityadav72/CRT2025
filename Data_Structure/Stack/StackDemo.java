package CRT2025.Data_Structure.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Character> stackdemo = new Stack<Character>();
        stackdemo.push('a');
        stackdemo.push('b');
        stackdemo.push('c');

        System.out.println(stackdemo);

        for (int i = stackdemo.size(); i >= 1; i--) {
            System.out.println(stackdemo.pop());
        }

        while (!stackdemo.empty()) {
            System.out.println(stackdemo.pop());
        }
    }
}
