public class MiddleOFList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head,prev=null;
        int count=1;
        while(curr!=null)
        {
            if(count>n) prev = (prev==null) ? head : prev.next;
            curr=curr.next;
            count++;
        }
        if(prev==null) return head.next;
        prev.next=prev.next.next;
        return head;
    }

}
