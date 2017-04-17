package leetcode;

/**
 * Created by hadoop on 17-3-29.
 */
public class Capital {
    public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");

    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode temp = root.right;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) invertTree(root.left);
        if (root.right != null) invertTree(root.right);


        return root;
    }


    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Ca"));
    }
}
