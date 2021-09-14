package Problems;

public class MergeSort {
    public static int[] sortArray(int[] nums) {
        int length = nums.length;
        mergeSort(nums, 0, length - 1);
        return nums;
    }

    // Arr is an array of integer type
    // start and end are the starting and ending index of current interval of Arr

    static void mergeSort(int Arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(Arr, start, mid);
            mergeSort(Arr, mid + 1, end);
            merge(Arr, start, mid, end);
        }
    }

    static void merge(int Arr[], int start, int mid, int end) {
        int i = start, j = mid + 1, k = 0;

        int[] temp = new int[end - start + 1];

        while (i <= mid && j <= end) {
            if (Arr[i] < Arr[j]) {
                temp[k] = Arr[i];

                i++;     
            } else {
                temp[k] = Arr[j];

                j++;
            }

            k++;
        }

        while (i <= mid) {
            temp[k] = Arr[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = Arr[j];
            j++;
            k++;
        }

        for (int a = 0; a <= end - start; a++) {
            Arr[start + a] = temp[a];
        }
    }
}