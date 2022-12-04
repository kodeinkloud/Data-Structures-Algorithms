
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";

        if (strs == null || strs.length == 0)
            return commonPrefix;

        if(strs.length == 1) {
            return strs[0];
        }

        int start = 0;
        boolean flag = true;
        while (flag) {
            if (start >= strs[0].length()) {
                break;
            }
            Character currC = strs[0].charAt(start);
            for (int i = 1; i < strs.length; i++) {
                if (start >= strs[i].length() || strs[i].charAt(start) != currC) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                commonPrefix = commonPrefix + currC;
                start++;
                if (start >= strs[0].length())
                    flag = false;
            }
        }
        return commonPrefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String[] strs1 = { "flow", "flower", "flight" };
        String[] strs2 = { "dog", "racecar", "car" };
        String[] strs3 = {};
        String[] strs4 = {""};
        String[] strs5= {"", ""};

        System.out.println(obj.longestCommonPrefix(strs1));
        System.out.println(obj.longestCommonPrefix(strs2));
        System.out.println(obj.longestCommonPrefix(strs3));
        System.out.println(obj.longestCommonPrefix(strs4));
        System.out.println(obj.longestCommonPrefix(strs5));
    }

}
