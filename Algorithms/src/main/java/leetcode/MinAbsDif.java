package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by hadoop on 17-4-18.
 */
public class MinAbsDif {

    int minDiff = Integer.MAX_VALUE;
    TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) minDiff = Math.min(minDiff, root.val - prev.val);
        prev = root;
        inorder(root.right);
    }

    public static void main(String[] args) {

    }
}


