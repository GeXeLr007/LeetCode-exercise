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

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = p.length();
        int l = 0, r = 0;
        int[] hash = new int[300];
//        创建hash表
        for (char c :
                p.toCharArray()) {
            hash[c]++;
        }
        while (r != s.length()) {
            hash[s.charAt(r)]--;
            if (hash[s.charAt(r)] >= 0) {
//                count表示还有多少个p中的字符没有进入窗口
                count--;
            }
            if (count == 0) {
                list.add(l);
            }
//            当窗口长度等于p字符串的长度时，需要将l索引++，因为有字符退出窗口所以hash表相应字符的个数要++，如果hash表中该字符个数>= 0，count需要++
            if (r - l + 1 == p.length()) {
                if (hash[s.charAt(l)] >= 0) {
                    count++;
                }
                hash[s.charAt(l)]++;
                l++;
            }

            r++;
        }
        return list;

    }

}