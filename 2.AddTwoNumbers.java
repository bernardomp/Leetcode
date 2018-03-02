/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode c = new ListNode(0);
        ListNode d = c;
        
        int ax = 0;
        int ac = 0;
        int sum = 0;
        
        int v2,v1;
        
        do {
            
            v1 = (l1==null)? 0:l1.val;
            v2 = (l2==null)? 0: l2.val;
            
            sum = v1 + v2 + ac;
            ax = sum%10;
            ac = sum/10;
            
            c.next = new ListNode(ax);
            c = c.next;
            
            l1 = (l1!=null)?l1.next:null;
            l2 = (l2!=null)?l2.next:null;
            
        }  while(l1!=null || l2!=null);
        
       
        if(ac!=0) c.next = new ListNode(ac);
        
    
        return d.next;
        
    }
    
}
