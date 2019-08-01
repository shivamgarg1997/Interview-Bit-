package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        ListNode temp = new RemoveDuplicatesFromSortedList().deleteDuplicates(node);
    }
    public ListNode deleteDuplicates(ListNode A) {
        ListNode node = A,prev;
        while(node!=null){
            if(node.next!=null){
                while(node.next!=null && node.val == node.next.val){
                    prev = node;
                    node = node.next;
                    prev.next = node.next;
                    node = prev;

                }
                node= node.next;
                continue;
            }
            node= node.next;
        }
        return A;
    }
}
