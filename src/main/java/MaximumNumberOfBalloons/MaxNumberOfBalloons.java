package MaximumNumberOfBalloons;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> sumMap = new HashMap<>();
        sumMap.put('b', 0);
        sumMap.put('a', 0);
        sumMap.put('l', 0);
        sumMap.put('o', 0);
        sumMap.put('n', 0);
        for (char ch : text.toCharArray()) {
            if (sumMap.containsKey(ch)) {
                sumMap.replace(ch, sumMap.get(ch) + (ch == 'l' || ch == 'o' ? 1 : 2));
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i : sumMap.values()) {
            if (i < result) result = i;
        }

        return (result)/2;
    }

    /*
     Best way
     class Solution {
        public int maxNumberOfBalloons(String text) {
            if(text==null || text.length()==0) return 0;
            char[] arr=new char[26], dict=new char[]{'b','a','l','l','o','o','n'};
            for(char ch : text.toCharArray()) {
                arr[ch-'a']++;
            }
            int max=Integer.MAX_VALUE;
            arr['l'-'a'] /=2;
            arr['o'-'a'] /=2;
            for(char ch : dict) {
                max=Math.min(max, arr[ch-'a']);
            }
            return max;
        }
    }
     */

}
