package stacks_queues;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args){
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("(("));
    }

    // a classic stack use case: push opening brackets, and for every
    // closing bracket, check it matches the most recent opening one
    static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                   (c == '}' && top != '{') ||
                   (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

// Practice: Extend isBalanced() to also ignore any non-bracket
// characters mixed into the string, like "a(b[c]d)e".
