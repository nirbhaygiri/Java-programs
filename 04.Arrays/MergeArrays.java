public class MergeArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int num : arr1) {
            result[i++] = num;
        }
        for (int num : arr2) {
            result[i++] = num;
        }

        return result;
    }

    public static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = merge(arr1, arr2);

        display(merged);
    }
}