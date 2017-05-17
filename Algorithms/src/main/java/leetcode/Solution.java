package leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by slyuan on 17-3-12.
 */
public class Solution {

    public static void reverse(ListNode head, int from, int to) {

        ListNode pCur = head.next;
        int i;
        for (i = 0; i < from-1; i++) {
            head = pCur;
            pCur = pCur.next;
        }

        ListNode pPre = pCur;
        pCur = pCur.next;
        to--;
        ListNode  pNext;
        for (; i<to; i++) {
            pNext = pCur.next;
            pCur.next = head.next;
            head.next = pCur;
            pPre.next = pNext;
            pCur = pNext;
        }
    }

    public static int maxDepth(TreeNode root) {

        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int count = 0;

        while(!queue.isEmpty()) {

            int size = queue.size();
            while (size-- > 0) {

                TreeNode treeNode = queue.poll();
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
//            size = queue.size();
            count ++;
        }

        return count;
    }

    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }


    public static void main(String[] args) {
        int re = getSum(3,6);

    }


}
