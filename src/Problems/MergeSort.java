package Problems;
import Helpers.PrintHelper;

public class MergeSort {
    public static void start() {
        int[] nums = new int[] { 5, 2, 4, 1 };
        sortArray(nums);

        PrintHelper.printArray(nums);
    }

    public static int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];
        int[] temp = new int[nums.length];
        mergeSortRecursive(nums, 0, nums.length - 1, temp);
        return nums;
    }

    private static void mergeSortRecursive(int[] nums, int start, int end, int[] temp) {
        if (start >= end) {
            return;
        }

        mergeSortRecursive(nums, start, (start + end) / 2, temp);
        mergeSortRecursive(nums, (start + end) / 2 + 1, end, temp);

        merge(nums, start, end, temp);
    }

    private static void merge(int[] nums, int start, int end, int[] temp) {
        int middle = (start + end) / 2;
        int leftStart = start, rightStart = middle + 1;
        int index = leftStart;

        while (leftStart <= middle && rightStart <= end) {
            if (nums[leftStart] < nums[rightStart]) {
                temp[index++] = nums[leftStart++];
            } else {
                temp[index++] = nums[rightStart++];
            }
        }

        while (leftStart <= middle) {
            temp[index++] = nums[leftStart++];
        }
        while (rightStart <= end) {
            temp[index++] = nums[rightStart++];
        }
        // when we finish placing merging result in the temp, we update the result array
        // update until index end
        for (int i = 0; i <= end; i++) {
            nums[i] = temp[i];
        }
    }
}