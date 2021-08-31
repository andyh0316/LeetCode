package Helpers;

public final class PrintHelper {
    private PrintHelper() {
    }

    public static void printArray(int[] nums) {
        System.out.print("[ ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}
