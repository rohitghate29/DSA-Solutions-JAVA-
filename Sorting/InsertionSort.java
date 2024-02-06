import java.util.Arrays;

class InsertionSort {
    
    public static void insertionSort(int[] arr, int size) {
        for(int i=0; i<size; i++) {
            int j=i;
            while(j>0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr [] = {20,24,54,21,66,52};
        int size = arr.length;
        insertionSort(arr, size);
        System.out.println("Sorted array using Insertion Sort is :");
        System.out.println(Arrays.toString(arr));
    }
}