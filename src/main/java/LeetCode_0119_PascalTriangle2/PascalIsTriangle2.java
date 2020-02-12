package LeetCode_0119_PascalTriangle2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalIsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        } else if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        } else {
            List<Integer> upRow = getRow(rowIndex -1);
            List<Integer> res = new ArrayList<>();
            res.add(1);
            for (int i = 0; i + 1 < upRow.size(); i ++) {
                res.add(upRow.get(i) + upRow.get(i+1));
            }
            res.add(1);
            return res;
        }
    }
}
