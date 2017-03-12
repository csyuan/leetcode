package leetcode;

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
}
