class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public static void main(String[] args) {
        
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0, num2 =0,output =0;
       ListNode head = null,curr = null,n=null;
        while(l1.next!=null)
        {
            num1*=10;
            num1+=l1.val;
            l1=l1.next;
        }
        while(l2.next!=null)
        {
            num2*=10;
            num2+=l2.val;
            l2=l2.next;
        }
       output = num1+num2;
        
        while(output>0)
        {
            n = new ListNode(output%10,null);
            output/=10;
            if(head == null) 
            {
                head = n;
            }
            else
            {
            curr = head;
            while(curr.next!=null) curr = curr.next;
            curr.next = n;
            }
        }
        
        return head;
    }
   
}