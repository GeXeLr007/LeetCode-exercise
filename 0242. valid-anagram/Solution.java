import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public boolean isAnagram(String s, String t) {
//        先判断字符串长度是否相等，这是大前提
        if (s.length() != t.length()) {
            return false;
        }
        int[] book = new int[300];
        for (char c :
                s.toCharArray()) {
            book[c]++;
        }
        for (char c :
                t.toCharArray()) {
//            如果此时哈希表中该字符出现次数为0，则即将减少为负数，说明t字符串中有s中未出现的
            if (book[c] == 0) {
                return false;
            }
            book[c]--;
        }
        return true;

    }

}