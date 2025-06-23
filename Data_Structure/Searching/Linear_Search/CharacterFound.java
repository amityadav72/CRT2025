package CRT2025.Data_Structure.Searching.Linear_Search;

public class CharacterFound {
    public static void main(String[] args) {
        String str = "data base system";
        char[] arr = str.toCharArray();
        char target = 'k';

        System.out.println(9+9+"9");

        int index = linearsearch(arr, target);
        if (index > -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearsearch(char[] arr, char target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }

}
