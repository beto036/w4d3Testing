package com.example.admin.w4d3testing;

import java.util.Stack;

/**
 * Created by admin on 11/9/2016.
 */

public class Balancer {

    public boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        char current;

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty())
                    return false;
            }
            if (c == '}') {
                current = stack.pop();
                if (current != '{')
                    return false;
            }
            if (c == ']') {
                current = stack.pop();
                if (current != '[')
                    return false;
            }
            if (c == ')') {
                current = stack.pop();
                if (current != '(')
                    return false;
            }
        }

        return stack.empty();
    }

}
