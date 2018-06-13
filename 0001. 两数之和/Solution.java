import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 0};
        int[] arr2 = {3};
        Solution solution = new Solution();
        solution.merge(arr1, 5, arr2, 1);

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    //    使用hash表，边扫描加入元素边检验
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                Integer index1 = map.get(target - numbers[i]);
                Integer index2 = i;
                return new int[]{index1, index2};
            } else {
                map.put(numbers[i], i);
            }
        }
        return null;

    }

}