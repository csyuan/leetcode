package leetcode;

/**
 * Created by slyuan on 17-3-15.
 */
public class TreeNode {

    int val;

    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }


    public void preOrderRecur(TreeNode head) {
        if(head == null) return;
        System.out.println(head.val);
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public void inOrderRecur(TreeNode head) {
        if(head == null) return;
        inOrderRecur(head.left);
        System.out.println(head.val);
        inOrderRecur(head.right);
    }


    public void posOrderRecur(TreeNode head) {
        if(head == null) return;
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.val);
    }
}
