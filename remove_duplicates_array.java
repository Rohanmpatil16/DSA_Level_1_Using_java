import java.util.*;

public class remove_duplicates_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp[] = new int[n];   // to store unique elements
        int newLength = 0;

        for (int i = 0; i < n; i++) {
            int j;
            // check if arr[i] already exists in temp[]
            for (j = 0; j < newLength; j++) {
                if (arr[i] == temp[j]) {
                    break;   // stop, means duplicate found
                }
            }
            // if j == newLength → no duplicate found
            if (j == newLength) {
                temp[newLength] = arr[i];
                newLength++;
            }
        }

        // Print unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(temp[i] + " ");
        }
    }
} 