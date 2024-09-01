public class StackTraceExample {

    public static void main(String[] args) {
        methodA();
    }
    public static void methodA() {
        methodB();
    }
    public static void methodB() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // This will cause an ArrayIndexOutOfBoundsException
    }
}
