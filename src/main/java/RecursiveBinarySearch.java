public class RecursiveBinarySearch {
    static int[] array = {1, 3, 4, 6, 7, 12, 21, 34, 56, 87};

    protected static int recursiveBinarySearch(int[] arr, int low, int high, int value) {
        while (high >= low) {
            int mid = (low + high) / 2;
            if (value == arr[mid]) {
                return mid;
            } else if (value < arr[mid]) {
                return recursiveBinarySearch(arr, low, mid - 1, value);
            } else{
                return recursiveBinarySearch(arr, mid + 1, high, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(array, 0, array.length, 12));
        System.out.println(recursiveBinarySearch(array, 0, array.length, 31));
        System.out.println(recursiveBinarySearch(array, 0, array.length, 7));
        System.out.println(recursiveBinarySearch(array, 0, array.length, 56));
    }
}
