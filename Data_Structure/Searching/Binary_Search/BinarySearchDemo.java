package CRT2025.Data_Structure.Searching.Binary_Search;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target =30;
        int index = binarySearch(arr, target);
        if(index > -1){
            System.out.println("Element found at index : " + index);
        }else{
            System.out.println("Element not found");
        }
    }


    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
                continue;
            } else {
                end = mid - 1;
                continue;
            }
        }
        return -1;
    }
}
