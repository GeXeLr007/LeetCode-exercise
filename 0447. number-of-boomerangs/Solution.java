import java.util.*;

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

    //    计算每两个点之间的距离，看距离相等的点有多少个
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int dis = distance(points[i], points[j]);
                    if (!map.containsKey(dis)) {
                        map.put(dis, 1);
                    } else {
                        map.put(dis, map.get(dis) + 1);
                    }
                }
            }
            Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                if (entry.getValue() >= 2) {
                    res += entry.getValue() * (entry.getValue() - 1);
                }
            }
        }
        return res;

    }

    private int distance(int[] point, int[] point1) {
        return (point[0] - point1[0]) * (point[0] - point1[0]) + (point[1] - point1[1]) * (point[1] - point1[1]);
    }

}