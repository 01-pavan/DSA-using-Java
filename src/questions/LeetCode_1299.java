package questions;

public class LeetCode_1299 {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
    }

    public void replaceElements(int[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i + 1];
            if (max < arr[i + 2]) {
                max = arr[i + 2];
            }
        }

        return;
    }
}