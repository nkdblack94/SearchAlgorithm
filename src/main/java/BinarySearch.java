public class BinarySearch {
    static int[] array = {1, 3, 5, 7, 8, 10, 12, 25, 50, 82};

    public static int binarySearch(int[] arr, int value) {
        int low = 0;
        int high = arr.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (value < arr[mid]) {
                high = mid - 1;
            }else if (value == arr[mid]){
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(array, 12));
        System.out.println(binarySearch(array, 8));
        System.out.println(binarySearch(array, 20));
        System.out.println(binarySearch(array, 50));
    }
}
