package ss13_binary_searching.practices;

public class BinarySearchTest {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static void main(String[] args) {

        System.out.print("<------------------------------BinarySearchNoRecursive---------------------------------->");
        System.out.println(binarySearchNoRecursive(list, 2));  /* 0 */
        System.out.println(binarySearchNoRecursive(list, 11)); /* 4 */
        System.out.println(binarySearchNoRecursive(list, 79)); /*12 */
        System.out.println(binarySearchNoRecursive(list, 1));  /*-1 */
        System.out.println(binarySearchNoRecursive(list, 5));  /*-1 */
        System.out.println(binarySearchNoRecursive(list, 80)); /*-1 */
        System.out.println("<---------------------------BinarySearchRecursive------------------------------------->");
        System.out.println(binarySearchRecursive(list,0,list.length-1,50));
        System.out.println(binarySearchRecursive(list,0,list.length-1,2));
        System.out.println(binarySearchRecursive(list,0,list.length-1,11));
    }

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

    public static int binarySearchNoRecursive(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }
}
