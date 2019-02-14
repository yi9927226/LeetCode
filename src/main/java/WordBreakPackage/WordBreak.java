package WordBreakPackage;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "catsandog";
//        String s = "a";
//        String s = "leetcode";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
//        List<String> wordDict = Arrays.asList("leet","code");
//        List<String> wordDict = Collections.emptyList();
        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        for (int i = 0; i < wordDict.size(); i ++) {
            boolean check = false;
            if (s.length() >= wordDict.get(i).length() &&
                    wordDict.get(i).equals(s.substring(0, wordDict.get(i).length()))) {
                if (s.equals(wordDict.get(i))) {
                    return true;
                } else {
                    check = wordBreak(s.substring(wordDict.get(i).length()), wordDict);
                }
            }

            if (check) {
                return true;
            }
        }
        return false;
    }
}
