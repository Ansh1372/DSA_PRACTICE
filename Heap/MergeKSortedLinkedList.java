package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeKSortedLinkedList {
        
        public static ListNode mergeKLists(ListNode[] lists) {
            if(lists==null||lists.length==0)
                return null;
        
            PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
                public int compare(ListNode l1, ListNode l2){
                    return l1.val - l2.val;
                }
            });
        
            ListNode head = new ListNode(0);
            ListNode p = head;
        
            for(ListNode list: lists){
                if(list!=null)
                    queue.offer(list);
            }    
        
            while(!queue.isEmpty()){
                ListNode n = queue.poll();
                p.next = n;
                p=p.next;
        
                if(n.next!=null)
                    queue.offer(n.next);
            }    
        
            return head.next;
        
        }
    public static void main(String[] args) {
        // write your code here
        MergeKSortedLinkedList mkl = new MergeKSortedLinkedList();
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(7);
        ListNode node3 = new ListNode(9,node5);
        ListNode node8 = new ListNode(2,node6);
        ListNode node7 = new ListNode(6,node8);
        ListNode node2 = new ListNode(1,node3);
        ListNode node4 = new ListNode(3,node7); 
        ListNode node1 = new ListNode(5,node2);
        ListNode[] arr = {node1,node4};
        System.out.println("Merged Linked List is : "+mkl.mergeKLists(arr));
    }
    
}
