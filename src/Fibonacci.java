public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci of 6 is " + fib(6));
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
// 0, 1, 1, 2, 3, 5 ,8, 13,..