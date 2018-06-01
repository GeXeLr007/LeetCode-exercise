import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    
    
    public String minWindow(String s, String t) {
        int[] book = new int[300];
        int res = Integer.MAX_VALUE;
        String ress = "";
        for (char c :
                t.toCharArray()) {
            book[c]++;
        }
        int cnt = t.length();
        int right = -1, left = 0;
        while (left != s.length()) {
            if (right + 1 != s.length() && cnt != 0) {
                right++;
                if (book[s.charAt(right)] > 0) {
                    cnt--;
                }
                book[s.charAt(right)]--;
            } else {
                if (cnt == 0) {
                    if (right - left + 1 < res) {
                        res = right - left + 1;
                        ress = s.substring(left, right + 1);
                    }
                }
                if (book[s.charAt(left)] >= 0) {
                    cnt++;
                }
//                这条语句是关键，不能放在if语句里面，无论什么情况都应该将退出窗口的字符的个数++
                book[s.charAt(left)]++;
                left++;
            }
        }
        return ress;

    }

}