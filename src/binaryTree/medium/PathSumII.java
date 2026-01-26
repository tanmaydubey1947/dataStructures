package binaryTree.medium;

import binaryTree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        AllPath(root, targetSum, path, ans);
        return ans;
    }

    public void AllPath(TreeNode root, int target, List<Integer> path, List<List<Integer>> ans) {
        if (root == null) {  // this should be the 1st base case.
            return;
        }
        if (target == root.val && root.left == null && root.right == null) {  // value is equal to remaining target and root is a leaf.
            List<Integer> newPath = new ArrayList<>(path);
            newPath.add(root.val);
            ans.add(newPath);
            return;
        }
        List<Integer> newPath = new ArrayList<>(path);
        newPath.add(root.val);
        AllPath(root.left, target - root.val, newPath, ans);
        AllPath(root.right, target - root.val, newPath, ans);
    }
}
