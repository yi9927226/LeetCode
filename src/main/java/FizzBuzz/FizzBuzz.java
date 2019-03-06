package FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= n; i ++) {
            if (i % 3 == 0 && i % 5 == 0) {
                stringList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                stringList.add("Fizz");
            } else if (i % 5 == 0) {
                stringList.add("Buzz");
            } else {
                stringList.add(String.valueOf(i));
            }
        }

        return stringList;
    }
}
