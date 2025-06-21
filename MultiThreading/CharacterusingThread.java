package CRT2025.MultiThreading;

public class CharacterusingThread {
    public static void main(String[] args) {
        String s = "String";
        char[] arr = s.toCharArray();

        Thread t1 = new Thread(new FirstThreadString(arr));
        Thread t2 = new Thread(new SecondThreadString(arr));

        t1.start();
        t2.start();
    }
}

class FirstThreadString implements Runnable {
    char[] arr;

    public FirstThreadString(char[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int length = 0;
        for (char c : arr) {
            length++;
        }
        System.out.println("Total characters (using loop): " + length);
    }
}

class SecondThreadString implements Runnable {
    char[] arr;

    public SecondThreadString(char[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int vowlen = 0;
        for (int i = 0; i < arr.length; i++) {
            char lower = Character.toLowerCase(arr[i]);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                vowlen++;
            }
        }
        System.out.println("Total vowels: " + vowlen);
    }
}
