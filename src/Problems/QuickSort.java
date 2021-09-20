package Problems;

public class QuickSort {
    public static int[] sortArray(int[] nums) {
        nums = new int[] {5,2,3,1}; 
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right)
            return;

        int pivotIndex = partition(nums, left, right);

        quickSort(nums, left, pivotIndex);
        quickSort(nums, pivotIndex + 1, right);
    }

    public static int partition(int[] nums, int left, int right) {
        int i = left, j = right; // change later

        // pick a pivot
        int pivotIndex = left;

        while (i < j) {
            while (nums[i] <= nums[pivotIndex] && i < right) {
                i++;
            }

            while (nums[j] > nums[pivotIndex] && j > left) {
                j--;
            }

            if (i >= j) {
                break;
            }

            swap(nums, i, j);
        }

        swap(nums, pivotIndex, j);

        return j;
    }

    public static void swap(int[] nums, int index1, int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}