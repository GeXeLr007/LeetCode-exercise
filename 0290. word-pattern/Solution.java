import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog dog dog dog"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (strings.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(strings[i])) {
                    return false;
                }
            } else {
//                还需要检查value是否已经出现过了
                if (map.containsValue(strings[i])){
                    return false;
                }
                map.put(pattern.charAt(i), strings[i]);
            }
        }
        return true;

    }

}