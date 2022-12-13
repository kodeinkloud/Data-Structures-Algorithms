//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
// The returned integer should be non-negative as well.

public class NearestSquare {
    
    public int sqrt(int x) {
        if(x < 2) return x;

        int left = 1;
        int right = x/2;
        while(left <= right) {
            int mid = left + (right - left)/2;
            long midSqr = (long) mid * mid;
            if(midSqr == x) return mid;
            if(midSqr > x) right = mid - 1;
            if(midSqr < x) left = mid + 1;
        }
        return right;
    }

    public static void main(String[] args) {
        NearestSquare obj = new NearestSquare();
        System.out.println(obj.sqrt(45));
    }

}
