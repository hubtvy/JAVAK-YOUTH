public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {0,1,2};
            System.out.println(numbers[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } finally {
            System.out.println("This is the finally block");
        }

    }
}