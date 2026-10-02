public class MergeArray {
    static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            }
            else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] result = mergeSortedArrays(a, b);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}