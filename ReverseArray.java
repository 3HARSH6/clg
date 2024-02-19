public class ReverseArray {
    public static void reverseArray(int[] arr, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(arr[i]+" ");
        reverseArray(arr, i - 1);
    }
    

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6 };

        reverseArray(arr, arr.length - 1);
    }
}
