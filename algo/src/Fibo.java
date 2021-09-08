public class Fibo {
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
}
