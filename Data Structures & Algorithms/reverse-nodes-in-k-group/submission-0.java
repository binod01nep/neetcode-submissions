/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    void swap(ListNode head,int size){
        ListNode curr=head;
        ListNode prev=null;
        while(size-->0){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return;
    }
    public ListNode reverseKGroup(ListNode head,int k) {
        if(head==null) return null;
        ListNode right;
        ListNode left=head;
        ListNode res=null;
        ListNode prevLeft=null;
        int size=k;
        while(true){
            right=left;
            for(int i=0;i<size-1;i++){
               if(right==null) break;
                right=right.next;
            }
            if(right!=null){
                ListNode nextLeft=right.next;
                swap(left,size);
                if(prevLeft!=null){
                    prevLeft.next=right;
                    prevLeft=null;
                }
                if(res==null){
                    res=right;
                }
                prevLeft=left;
                left=nextLeft;
            }
            else{
                if(prevLeft!=null){
                    prevLeft.next = left;
                }
                if(res==null) res=left;
                break;
            }
            
        }
        return res;
    }
}