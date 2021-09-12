public class Fibo {

    private static Integer[] fiboList;

    public Fibo(int n) {
        fiboList = new Integer[n];
    }

    public static int getFibo(int N) {
        if (N <= 2) {
            return 1;
        }
        int prevA = 1;
        int prevB = 1;
        int buffer;
        for (int i = 3; i <= N; i++) {
            buffer = prevA;
            prevA += prevB;
            prevB = buffer;
        }
        return prevA;
    }

    public static int getFiboRec(int N) {
        if (N <= 2) {
            return 1;
        }
        return getFibo(N - 1) + getFibo(N - 2);
    }

    public int getFiboRecOptimized(int N) {
        if (N <= 2) {
            return 1;
        }
        Integer fiboA = fiboList[N-1];
        if (fiboA == null) {
            fiboA = getFiboRecOptimized(N-1);
            fiboList[N-1] = fiboA;
        }
        Integer fiboB = fiboList[N-2];
        if (fiboB == null) {
            fiboB = getFiboRecOptimized(N-2);
            fiboList[N-2] = fiboB;
        }
        return fiboA + fiboB;
    }
}
