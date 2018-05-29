import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5, 6, 0};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    //    对撞指针检验回文串。
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                continue;
            }
            if (!(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r)))) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }

//    这种方法更简洁
    public boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) ++left;
            else if (!Character.isLetterOrDigit(s.charAt(right))) --right;
            else if (s.charAt(left) != s.charAt(right)) return false;
            else { ++left; --right; }
        }
        return true;
    }

}