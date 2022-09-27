import java.util.*;

public class P15PathSumIII {
    
    public static int pathSum(TreeNode root, int targetSum) {

        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 1L);

        return (int) helper(root, 0, targetSum, map);
    }

    private static long helper(TreeNode root, long currSum, long targetSum, Map<Long, Long> map) {
        if (root == null) {
            return 0L;
        }

        currSum += (long) root.val;
        long res = map.getOrDefault(currSum - targetSum, 0L);

        map.put(currSum, map.getOrDefault(currSum, 0L) + 1);
        res += helper(root.left, currSum, targetSum, map) + helper(root.right, currSum, targetSum, map);
        map.put(currSum, map.get(currSum) - 1);

        return res;
    }
}
