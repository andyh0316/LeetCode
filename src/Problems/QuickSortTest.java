package Problems;
import Helpers.PrintHelper;

public class QuickSortTest {
    // test
    public static void start() {
        int[] nums = new int[] { 4, 3, 2, 1 };

        QuickSort.sortArray(nums);
        PrintHelper.printArray(nums);
    }
}