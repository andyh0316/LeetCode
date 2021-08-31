package Problems;
import Helpers.PrintHelper;

public class MergeSortTest {
    // test
    public static void start() {
        int[] nums = new int[] { 5, 2, 4, 1 };

        MergeSort.sortArray(nums);
        PrintHelper.printArray(nums);
    }
}