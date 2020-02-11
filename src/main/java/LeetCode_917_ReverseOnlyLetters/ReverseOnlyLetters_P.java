package LeetCode_917_ReverseOnlyLetters;

public class ReverseOnlyLetters_P {
    public String reverseOnlyLetters(String S) {
        char[] ans = S.toCharArray();
        int i = 0;
        int j = S.length() - 1;
        while (i < j) {
            if (Character.isLetter(ans[i]) && Character.isLetter(ans[j])) {
                char temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i ++;
                j --;
            } else {
                if (!Character.isLetter(ans[i])) {
                    i ++;
                }
                if (!Character.isLetter(ans[j])) {
                    j --;
                }
            }
        }

        return String.valueOf(ans);
    }
}
