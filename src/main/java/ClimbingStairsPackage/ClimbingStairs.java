package ClimbingStairsPackage;

public class ClimbingStairs {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(climbStairs(i));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}