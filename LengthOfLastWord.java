// Given a string s consisting of words and spaces, return the length of the last word in the string.
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int result = 0;
        if (s == null)
            return result;

        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!flag && s.charAt(i) == ' ') {
                continue;
            } else if (flag && s.charAt(i) == ' ') {
                break;
            }
            flag = true;
            result++;
        }
        return result;
    }
}
