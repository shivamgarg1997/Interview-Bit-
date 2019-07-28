package LinkedList;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class PalindromeList {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(21);
        node.next.next.next = new ListNode(1);
        System.out.println(new PalindromeList().lPalin(node));
    }
    public int lPalin(ListNode head) {
        if(head == null) return 0;
        if(head.next == null) return 1;
        ListNode slow = head, fast = head;
        while(fast !=  null){
            if(fast.next == null) fast = fast.next;
            else fast = fast.next.next;
            slow = slow.next;
        }

        //reverse
        ListNode prev = null , node = slow, next = slow.next;
        while(next != null){
            node.next = prev;
            prev = node;
            node = next;
            next = node.next;
        }
        node.next = prev;
        //print(node);

        //checl for palindrome
        ListNode temp = head;
        while(node != null){
            if(node.val == temp.val) {
                node = node.next;
                temp = temp.next;
            }
            else return 0;
        }
        return 1;

    }

    public void print(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
