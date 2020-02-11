package LeetCode_917_ReverseOnlyLetters;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        char[] ans = S.toCharArray();
        int i = 0;
        int j = S.length() - 1;
        while (i < S.length()) {
            if (Character.isLetter(S.charAt(i))) {
                while (!(Character.isLetter(S.charAt(j)))) {
                    j --;
                }
                ans[i] = S.charAt(j);
                i ++;
                j --;
            } else {
                ans[i] = S.charAt(i);
                i ++;
            }
        }

        return String.valueOf(ans);
    }
}

// over
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Only Letters.
Memory Usage: 38 MB, less than 8.70% of Java online submissions for Reverse Only Letters.
 */