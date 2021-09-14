package Problems;
import Helpers.PrintHelper;

public class MergeSortTest {
    // test
    public static void start() {
        int[] nums = new int[] { 4, 3, 2, 1 };

        MergeSort.sortArray(nums);
        PrintHelper.printArray(nums);
    }
}