package LinkedList;

public class ReverseLinkList2 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        System.out.println(new ReverseLinkList2().reverseBetween(node,2,5));
    }

    public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A==null )  return null;
        ListNode temp1 = A;
        ListNode save1 = null;
        while(B-- > 1){
            save1 = temp1;
            temp1 = temp1.next;
        }
        ListNode temp2 = A;
        while(C-- > 1){
            temp2 = temp2.next;
        }
        ListNode save2 = temp2.next;
        ListNode prev = null , node = temp1, next = temp1.next;
        ListNode save3 = null;
        while(next != temp2.next){
            node.next = prev;
            if(prev == null){
                prev = node;
                save3 = node;
            } else prev = node;
            node = next;
            next = node.next;
        }
        node.next = prev;

        save1.next = node;
        save3.next = save2;
      //  print(A);
        return A;
    }
}
