import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int newnum = 0;
            String num = String.valueOf(n);
            for (int i = 0; i < num.length(); i++) {
                newnum += (num.charAt(i) - '0') * (num.charAt(i) - '0');
            }
            if (newnum == 1) {
                return true;
            } else {
                if (set.contains(newnum)) {
                    return false;
                } else {
                    set.add(newnum);
                    n = newnum;
                }
            }
        }

    }

}