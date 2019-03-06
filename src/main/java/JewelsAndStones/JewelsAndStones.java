package JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> charSet = new HashSet<>();
        int temp = 0;
        for (char c : J.toCharArray()) {
            charSet.add(c);
        }
        for (char c : S.toCharArray()) {
            if (charSet.contains(c)) {
                temp++;
            }
        }
        return temp;
    }
}
