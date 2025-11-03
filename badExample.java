// BadExample.java
public class BadExample {
    private static final int MAX = 100;
    private int count = 0;

    public static void main(String[] args) {
        BadExample ex = new BadExample();
        ex.doSomething();
        ex.divideNumbers(10, 0);
    }

    public void doSomething() {
        int unusedVar = 10;
        for (int i = 0; i < MAX; i++) {
            if (i == 50)
                break;
        }
    }

    public int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            // empty catch block
        }
        return 0;
    }
}
