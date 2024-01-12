public class TimeCompare {
    public static void main(String[] args) {
        long n = 10000;

        long t0 = System.currentTimeMillis();
        long sum = 0;
        for (long i = 1; i <= n; i++) sum += i;
        long t1 = System.currentTimeMillis();
        System.out.println(sum + " : " + (t1 - t0));

        System.out.println("\n\n");

        t0 = System.currentTimeMillis();
        sum = 0;
        for (long i = 1; i <= n; i++)
            for (long j = 1; j <= i; j++) sum += 1;
        t1 = System.currentTimeMillis();
        System.out.println(sum + " : " + (t1 - t0));

        System.out.println("\n\n");

        t0 = System.currentTimeMillis();
        sum = n*(n + 1) / 2;
        t1 = System.currentTimeMillis();
        System.out.println(sum + " : " + (t1 - t0));

    }
}
