
// Given an integer x, return true if x is a palindrome, and false otherwise.
public class Palindrome {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.isPalindrome(12341));
        System.out.println(obj.isPalindrome(12344321));
        System.out.println(obj.isPalindrome(1234312));
    }
}
