// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1)
            return n;

        int[] fib = new int[n + 1];
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n - 1];
    }

    public static void main(String[] args) {
        ClimbingStairs obj = new ClimbingStairs();
        System.out.println(obj.climbStairs(5));
        System.out.println(obj.climbStairs(15));
        System.out.println(obj.climbStairs(25));
        System.out.println(obj.climbStairs(35));
        System.out.println(obj.climbStairs(45));
    }
}
