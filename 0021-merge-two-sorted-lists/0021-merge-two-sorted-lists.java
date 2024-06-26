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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        if(list1==null&&list2==null){
            return  null;
        }else if(list1==null){
            return list2;
        }else if(list2==null){
            return list1;
        }
        if(list1.val>list2.val){
            head=list2;
            list2=list2.next;
        }else{
            head=list1;
                   list1=list1.next;
        }
        ListNode ans=head;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                ans.next=list2;
                list2=list2.next;
                
            }else{
                ans.next=list1;
                list1=list1.next;
            }
            ans=ans.next;
        }
        if(list1!=null){
            ans.next=list1;
        }else {
            ans.next=list2;
        }
        return head;

        
    }
}