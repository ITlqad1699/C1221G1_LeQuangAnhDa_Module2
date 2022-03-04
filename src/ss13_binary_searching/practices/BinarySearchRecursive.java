package ss13_binary_searching.practices;

public class BinarySearchRecursive {
    public static int binarySearchRecursive(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearchRecursive(arr, low, mid - 1, value);
            return binarySearchRecursive(arr, mid + 1, high, value);
        }
        return -1;
    }
}
