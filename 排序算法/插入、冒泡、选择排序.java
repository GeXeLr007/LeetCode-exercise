import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        注意判断数组不为空，没有元素、只有一个元素的情况
        int[] v = {12, 34, 6, 2, 4, 98, 43, 5, 76};
        insertSort(v);
        System.out.println(Arrays.toString(v));
//        System.out.println(10 & 4);

    }

    public static void insertSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int temp = v[i];
            int j = i - 1;
            for (; j >= 0 && temp < v[j]; j--) {
                v[j + 1] = v[j];
            }
            v[j + 1] = temp;
        }
    }

    public static void selectSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int t = v[k];
                v[k] = v[i];
                v[i] = t;
            }
        }
    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            boolean flag = true;
            for (int j = 1; j < v.length - i; j++) {
                if (v[j - 1] > v[j]) {
                    int t = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = t;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

    }

}
