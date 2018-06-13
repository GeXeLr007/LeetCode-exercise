import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.frequencySort("cccaaa"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

//    题目已经给出数据规模较小，所以用n平方时间复杂度的算法即可
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (!map.containsKey(A[i] + B[j])) {
                    map.put(A[i] + B[j], 1);
                } else {
                    map.put(A[i] + B[j], map.get(A[i] + B[j]) + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                if (map.containsKey(0 - C[i] - D[j])) {
                    res += map.get(0 - C[i] - D[j]);
                }
            }
        }
        return res;

    }

}