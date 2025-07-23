public class recursion_binary_search {
    
    public static int binarySearch(int[] arr, int start, int end, int find) {
        if (start > end) {
            return -1; 
        }

        int mid = (start + end) / 2;

        if (arr[mid] == find) {
            return mid; 
        } else if (arr[mid] > find) {
            return binarySearch(arr, start, mid - 1, find); 
        } else {
            return binarySearch(arr, mid + 1, end, find);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int find = 4;

        int result = binarySearch(arr, 0, arr.length - 1, find);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
