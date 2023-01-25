package org.example.fibachi;

import java.util.HashMap;
import java.util.Map;

public class fibinachi {

    private Map<Integer, Long> dictionary = new HashMap<Integer, Long>();
    public static void main(String[] args) {
        fibinachi fn = new fibinachi();

        for (int i = 0; i <= 50; i++) {
            System.out.println("fib(" + i + ") = " + (fn.fib(i)));
        }
    }

    private long fib(int i) {
        if (i == 0) {
            return 0L;
        }

        if (i == 1) {
            return 1L;
        }

        return memo(i - 1) + memo(i - 2);
    }

    private long memo(int i) {

        Long value = dictionary.get(i);

        if(value != null)
            return value;

        value = fib(i);
        dictionary.put(Integer.valueOf(i), value);
        return value;
    }
}
