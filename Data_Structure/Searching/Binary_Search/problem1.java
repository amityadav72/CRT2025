package CRT2025.Data_Structure.Searching.Binary_Search;

public class problem1 {
    public static void main(String[] args) {
        int[] arr ={10,40,60,80};
        double[] arr1 ={40.00, 45.50, 50.00, 80.9};
        double target1 = 50;
        int target =10;
        int index =binary(arr, target);
        if(index > -1){
            System.out.println("Element found at index : " + index);
        }
        else{
            System.out.println("Element not found");
        }
        int  index1 = binary1(arr1, target1);
        if(index1 > -1){
            System.out.println("Element found at index : " + index1);
        }
    }



    public static int binary(int[] arr, int target){
        int start =0;
        int end =arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static int binary1(double []arr1, double target){
        int start =0;
        int end = arr1.length -1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr1[mid]==target){
                return mid;
            }
            else if(arr1[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }

}
