package HammingDistance;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int tempResult = 0;
        for (char c : Integer.toBinaryString(x ^ y).toCharArray()) {
            if (c == '1') {
                tempResult++;
            }
        }
        return tempResult;
    }
}
