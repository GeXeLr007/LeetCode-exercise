import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 0};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.reverseString("A man, a plan, a canal: Panama"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public String reverseString(String s) {
        char[] out = new char[s.length()];
        s.getChars(0, s.length(), out, 0);

        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            char t = out[i];
            out[i] = out[size - 1 - i];
            out[size - 1 - i] = t;

        }
        return new String(out);

    }

}