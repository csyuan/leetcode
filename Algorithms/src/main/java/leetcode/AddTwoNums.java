package leetcode;


/**
 * Created by slyuan on 17-3-12.
 */

public class AddTwoNums {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int size1 = count(l1);
        int size2 = count(l2);

        ListNode head = new ListNode(1);
        head.next = (size1 < size2) ? helper(l2,l1,size2-size1):helper(l1,l2,size1-size2);
        if(head.next.val > 9) {
            head.next.val = head.next.val % 10;
            return head;
        }

        return head.next;
    }

    public static int count(ListNode list) {
        int count = 0;

        while(list.next != null) {
            count++;
            list = list.next;
        }

        return count;
    }

    public static ListNode helper(ListNode l1, ListNode l2, int offset) {
        if (l1 == null) return null;
        ListNode result = (offset == 0) ? new ListNode(l1.val + l2.val) : new ListNode(l1.val);
        ListNode post  = (offset == 0) ? helper(l1.next,l2.next,0) : helper(l1.next, l2, offset-1);

        if(post != null && post.val > 9) {
            post.val = post.val % 10;
            result.val = result.val + 1;
        }

        result.next = post;
        return result;

    }
}
