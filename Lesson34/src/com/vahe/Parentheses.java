package com.vahe;

import java.util.Map;
import java.util.Stack;

public class Parentheses {

    private static final Map<Character, Character> PARS_MAP =
            Map.of('}', '{',
                    ')', '(',
                    ']', '[');

    public static void main(String[] args) {
        System.out.println(isValidParentheses("{{()}}"));
        System.out.println(isValidParentheses("{{([)}}"));
        System.out.println(isValidParentheses("{{(bb[aa])}}()"));

        //[[ [{()}]]]   ()
    }

    public static boolean isValidParentheses(String str) {

        Stack<Character> stack = new Stack<>();
        char[] charsInStr = str.toCharArray();
        for (char cur : charsInStr) {
            // If the current character is a closing bracket.
            if (PARS_MAP.containsKey(cur)) {
                //PARS_MAP.values().contains(cur);
                char top = stack.pop();
                if (top != PARS_MAP.get(cur)) {
                    return false;
                }

            } else
                // If it was an opening bracket, push to the stack.
                if (PARS_MAP.containsValue(cur)) {
                    stack.push(cur);
                }
        }

        return stack.isEmpty();

    }
}
