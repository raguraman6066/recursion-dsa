public class Recursion {
    public static void main(String[] args) {
        printDemo2();
    }

    static void printDemo() {
        System.out.println("hello");
        printDemo();
    }

    static int count = 1;

    static void printDemo2() {
        count++;
        if (count <= 5) {
            printDemo2();
            System.out.println("hello");
        }
    }
}

// recursion is a process in which method calls itself continuously.it make code
// compact but complex
