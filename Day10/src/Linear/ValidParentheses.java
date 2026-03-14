package Linear;

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s) {
        //if(s.length()%2!=0)return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s1="{[()]}";
        String s2="{]{](]";
        String s3="(([[";
        System.out.println(s1+" ->"+(isValid(s1)?"valid":"invalid"));
        System.out.println(s2+" ->"+(isValid(s2)?"valid":"invalid"));
        System.out.println(s3+" ->"+(isValid(s3)?"valid":"invalid"));

    }
}
