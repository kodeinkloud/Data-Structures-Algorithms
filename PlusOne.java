// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order. 
// The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int val = digits[i] + carry;
            carry = val / 10;
            digits[i] = (val % 10);
        }
        if(carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            for(int i = digits.length - 1; i >= 0; i--) {
                newDigits[i] = digits[i];
            }
            newDigits[0] = carry;
            return newDigits;
        }
        return digits;
    }

   public static void main(String[] args) {
    PlusOne obj = new PlusOne();
    // int[] digits = {9, 9, 9, 9, 9, 9};
    // int[] digits = {4,3,2,2};
    int[] digits = {9};
    System.out.println(Arrays.toString(obj.plusOne(digits)));
   }
}
