package LinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode A) {
        ListNode node = A,prev;
        while(node!=null){
            if(node.next!=null){
                while(node.val == node.next.val && node.next!=null){
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
