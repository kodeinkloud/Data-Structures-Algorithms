// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count++;
            } else {
                if (nums[i] != element)
                    count--;
                else
                    count++;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(new int[] { 7, 3, 7 }));
        System.out.println(obj.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
        System.out.println(obj.majorityElement(new int[] { 7, 9, 2, 9, 9 }));
    }
}
