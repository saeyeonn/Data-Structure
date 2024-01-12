package Recursion;

public class Fibonacci {
    public static String isFibo(long n) {
        long first = 2;
        long second = 3;
        long result;

        if (0 <= n && n <= 3) {
            return "IsFibo";
        }

        while (second < n) {
            result = first + second;
            first = second;
            second = result;

            if (result == n) {
                return "IsFibo";
            }
        }
        return "IsNotFibo";
    }
}
