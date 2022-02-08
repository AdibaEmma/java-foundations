package com.aweperi.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        String expr = "([{}])";
        System.out.println(checkBalancedBrackets(expr));
    }

    static boolean checkBalancedBrackets(String expr) {
        // Using ArrayDeque is faster than using Stack class
        // ArrayDeque is a Doubly ended Queue implemented as an Array and also is not written to be inherently thread safe.
        // Acquiring and releasing thread locks is relatively expensive time wise.
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}
