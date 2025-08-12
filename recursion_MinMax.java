public class recursion_MinMax {
    static int min, max;
    static int min1, max1;

    public static int mm(int arr[], int l, int u) {
        if (l == u) { // one element
            min = max = arr[l];
            return arr[l];
        } 
        else if (l == u - 1) { // two elements
            if (arr[l] < arr[u]) {
                min = arr[l];
                max = arr[u];
            } else {
                min = arr[u];
                max = arr[l];
            }
            return 0;
        } 
        else {
            int mid = (l + u) / 2;

            // Left half
            mm(arr, l, mid);
            min1 = min;
            max1 = max;

            // Right half
            mm(arr, mid + 1, u);

            // Combine min values
            if (min > min1) {
                min = min1;
            }

            // Combine max values
            if (max < max1) {
                max = max1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {3,6,5,4,5};

        mm(arr, 0, arr.length - 1);

        System.out.println("Min " + min);
        System.out.println("Max " + max);
    }
}
