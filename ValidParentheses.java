
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<String> stk = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("{") ||
                    s.substring(i, i + 1).equals("[") ||
                    s.substring(i, i + 1).equals("(")) {
                stk.push(s.substring(i, i + 1));
            } else if (s.substring(i, i + 1).equals("}")) {
                if (!stk.empty() && stk.peek().equals("{"))
                    stk.pop();
                else
                    return false;
            } else if (s.substring(i, i + 1).equals(")")) {
                if (!stk.empty() && stk.peek().equals("("))
                    stk.pop();
                else
                    return false;
            } else if (s.substring(i, i + 1).equals("]")) {
                if (!stk.empty() && stk.peek().equals("["))
                    stk.pop();
                else
                    return false;
            }
        }
        if (!stk.empty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();
        System.out.println(obj.isValid("[]"));
    }
}
