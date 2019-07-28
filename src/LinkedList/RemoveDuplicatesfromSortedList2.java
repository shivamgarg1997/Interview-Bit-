package LinkedList;

public class RemoveDuplicatesfromSortedList2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        ListNode temp = new RemoveDuplicatesfromSortedList2().deleteDuplicates(node);
    }

    public ListNode deleteDuplicates(ListNode A) {
        ListNode dummy = new ListNode(-1);
        dummy.next = A;
        ListNode current = A,prev = dummy;
        if(A==null) return A;
        while(current!=null){
            while(current.next!=null && prev.next.val==current.next.val)
                current = current.next;
            if(prev.next == current)
                prev = prev.next;
            else{
                prev.next = current.next;
            }
            current = current.next;
        }
        A = dummy.next;
        return A;

    }
}
