package nopoly;

public class SortingUtility {
    public static void sort(int[] arr, boolean reverseSort) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0) {
                boolean swapNeeded = reverseSort ? arr[j - 1] < arr[j] : arr[j - 1] > arr[j];
                if (swapNeeded) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                } else {
                    break;
                }
            }
        }
    }
}

/**
 *
 */
