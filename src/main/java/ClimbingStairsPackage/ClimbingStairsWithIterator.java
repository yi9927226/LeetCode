package ClimbingStairsPackage;

public class ClimbingStairsWithIterator {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(climbStairs(i));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int third = 0;
        for (int i = 3; i < n+1; i ++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}
