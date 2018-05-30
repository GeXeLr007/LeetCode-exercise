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

//    另一种思路，记录上一次某字符出现的索引
//    https://soulmachine.gitbooks.io/algorithm-essentials/content/java/greedy/longest-substring-without-repeating-characters.html
//    记录字符出现的次数
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[300];
        int l = 0, r = -1;
        int res = 0;
        while (l < s.length()) {
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)]++;
            } else {
                freq[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }

        return res;

    }

}