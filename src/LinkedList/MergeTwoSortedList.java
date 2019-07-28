package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        node.next = new ListNode(8);
        node.next.next = new ListNode(20);
        ListNode node2 = new ListNode(4);
        node2.next = new ListNode(11);
        node2.next.next = new ListNode(15);
        ListNode temp = new MergeTwoSortedList().mergeTwoLists(node,node2);

    }

    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        Queue<ListNode> q = new LinkedList<>();
        ListNode cur1 = A, cur2 = B;
        while(cur1!=null && cur2!=null){
            if(cur1.val >= cur2.val){
                q.add(cur2);
                cur2 = cur2.next;
            }
            else{
                q.add(cur1);
                cur1 = cur1.next;
            }
        }
        while(cur1!=null){
            q.add(cur1);
            cur1 = cur1.next;
        }
        while(cur2!=null){
            q.add(cur2);
            cur2 = cur2.next;
        }
        ListNode head = q.poll();
        ListNode node = head;
        while(!q.isEmpty()){
            node.next = q.poll();
            node = node.next;
        }
        return head;
    }
}
