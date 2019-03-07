package CountingBits;

public class CountingBits {
    public int[] countBits(int num) {
        int[] resultArray = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int tempResult = 0;
            for (char c : Integer.toBinaryString(i).toCharArray()) {
                if (c == '1') {
                    tempResult++;
                }
            }
            resultArray[i] = tempResult;
        }

        return resultArray;
    }
}
