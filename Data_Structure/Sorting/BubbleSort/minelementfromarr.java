package CRT2025.Data_Structure.Sorting.BubbleSort;

public class minelementfromarr {
    public static void main(String[] args) {

        int[] arr = {10, 20, -2, 5, 7};

        bubbleSort(arr);

        System.out.print("Sorted array first element (minimum): " + arr[0]);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
