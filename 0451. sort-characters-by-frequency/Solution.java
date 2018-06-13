import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 2, 4, 3};
        int[] arr2 = {3};
        Solution solution = new Solution();
        System.out.println(solution.frequencySort("cccaaa"));

//        int[] arr2 = {1, 3, 4};
//        ListNode listNode = new ListNode(arr);
//        ListNode listNode2 = new ListNode(arr2);
//        System.out.println(listNode);
//        System.out.println(reverseKGroup(listNode, 1));

    }

    class Zimu implements Comparable<Zimu> {
        public char c;
        public int cnt;

        public Zimu(char c, int cnt) {
            this.c = c;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Zimu o) {
            return o.cnt - this.cnt;
        }
    }

    public String frequencySort(String s) {
        HashMap<Character, Zimu> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                Zimu zimu = new Zimu(c, 1);
                map.put(c, zimu);
            } else {
                map.get(c).cnt++;
            }

        }
        Zimu[] zimus = map.values().toArray(new Zimu[0]);
        Arrays.sort(zimus);
        StringBuilder stringBuilder = new StringBuilder();
        for (Zimu zimu : zimus) {
            for (int i = 0; i < zimu.cnt; i++) {
                stringBuilder.append(zimu.c);
            }
        }
        return stringBuilder.toString();

    }

}