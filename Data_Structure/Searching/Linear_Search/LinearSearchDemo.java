package CRT2025.Data_Structure.Searching.Linear_Search;

public class LinearSearchDemo {

    public static void main(String[] args) {

        int target = 32;
        int[] arr ={10,45,36,57,32};
        int index = linearsearch(arr, target);
        if(index > -1){
            System.out.println("Element found at index : " + index);
        }else{
            System.out.println("Element not found");
        }

    }

    public static int linearsearch(int[]arr, int target){
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}

