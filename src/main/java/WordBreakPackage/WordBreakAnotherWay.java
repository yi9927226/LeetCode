package WordBreakPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakAnotherWay {
    public static void main(String[] args) {
        String s = "catsandog";
//        String s = "a";
//        String s = "leetcode";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
//        List<String> wordDict = Arrays.asList("leet","code");
//        List<String> wordDict = Collections.emptyList();
        System.out.println(wordBreak(s, wordDict));
    }

    private static Set<String> map = new HashSet();
    // 紀錄失敗的s不重覆查詢
    public static boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s)) {
            return true;
        }
        if(map.contains(s)) {
            return false;
        }
        for(String word : wordDict){
            if(s.startsWith(word)){
                if(wordBreak(s.substring(word.length()), wordDict)) return true;
            }
        }
        map.add(s);
        return false;
    }
}
