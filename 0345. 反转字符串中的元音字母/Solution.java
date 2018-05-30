import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 0};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("leetcode"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    //    总是忘记大写字母，对撞指针
    public String reverseVowels(String s) {
        char[] out = new char[s.length()];
        s.getChars(0, s.length(), out, 0);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!isvowels(Character.toLowerCase(out[l]))) {
                l++;
            } else if (!isvowels(Character.toLowerCase(out[r]))) {
                r--;
            } else {
                char t = out[l];
                out[l] = out[r];
                out[r] = t;
                l++;
                r--;
            }
        }
        return new String(out);

    }

    private boolean isvowels(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

}