package test5;

public class Run {
    public static void main(String[] args) {
        System.out.println(call());
    }

    static int call() {
        try {
            int x = 1 / 0;
            return 1;
        } catch (ArithmeticException e) {
            return 2;
        } finally {
            System.out.println("finally 실행");
        }
    }
}

