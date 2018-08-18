import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] v = {12, 34, 6, 2, 4, 98, 43, 5, 76};
        quickSort(v);
        System.out.println(Arrays.toString(v));

    }

    public static void quickSort(int[] v) {
        quickSort(v, 0, v.length - 1);
    }

    private static void quickSort(int[] v, int l, int r) {
        if (l < r) {
            int i = pivot(v, l, r);
            quickSort(v, l, i - 1);
            quickSort(v, i + 1, r);
        }
    }

    private static int pivot(int[] v, int l, int r) {
        int key = v[l];
        while (l < r) {
            while (l < r && v[r] > key) {
                r--;
            }
            if (l < r) {
                v[l] = v[r];
                l++;
            }
            while (l < r && v[l] <= key) {
                l++;
            }
            if (l < r) {
                v[r] = v[l];
                r--;
            }
        }
        v[l] = key;
        return l;
    }

}
