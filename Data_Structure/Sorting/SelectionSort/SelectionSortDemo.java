package CRT2025.Data_Structure.Sorting.SelectionSort;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int [] arr = {10,20,-2,5,7};

        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
