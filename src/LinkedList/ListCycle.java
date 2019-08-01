package LinkedList;

import org.w3c.dom.ls.LSInput;

public class ListCycle {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = node.next;
        System.out.println(new ListCycle().detectCycle(node).val);
    }

    public ListNode detectCycle(ListNode A){
        if(A== null) return null;
        if(A.next== null) return null;
        ListNode slow = A, fast = A;
        while(fast!=  null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }

        if(fast==null || fast.next  == null) return null;

        slow = A;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        //return slow.next;
    }
}
