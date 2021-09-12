public class Main {
    public static void main(String[] args) {
        fibo(10);  // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }

    private static void fibo(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.printf("N = %d, cyclic fibo: %d, recursive fibo: %d", i, Fibo.getFibo(i), Fibo.getFiboRec(i));
            System.out.println();
        }
        Fibo fibo = new Fibo(N);
        System.out.printf("Optimized fibo for N = %d: %d", N, fibo.getFiboRecOptimized(N));
    }
}