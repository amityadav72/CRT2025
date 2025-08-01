package CRT2025.Data_Structure.Sorting.InsertionSort;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr ={10, 20 , -2, 5 , 7};

        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(" "+ arr[i]);
        }
    }
}
