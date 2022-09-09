class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
}
class MyLinkedList {
    Node head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head=null;
    }
    
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(5);
        obj.addAtHead(4);
        obj.addAtHead(3);
        obj.addAtHead(2);
        obj.head=obj.reverseList(obj.head);
        while(obj.head.next!=null){
            System.out.print(obj.head.data+" ");
            obj.head=obj.head.next;
        }
    }
    public Node reverseList(Node head) {
        Node prev=null,curr=head,next=head.next;
        while(curr.next!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            next=curr.next;
        }
        curr.next=prev;
        return curr;
    }
    public int get(int index) {
        if(index>this.size()) return -1;
        if(index==0){
            return this.head.data;
        }
        Node curr=this.head;
        int i=0;
        while(i<index && curr.next!=null) curr=curr.next;
        return curr.data;
        
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node n=new Node(val);
        n.next=this.head;
        this.head=n;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node n=new Node(val);
        Node curr=this.head;
        while(curr.next!=null) curr=curr.next;
        curr.next=n;
    }
    public int size(){
        int count=1;
        Node curr=this.head;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    //1 2 3 5
    public void addAtIndex(int index, int val) {
        if(index>this.size()) return;
        if(index==0)
        {
            this.addAtHead(val);
            return;
        }
        if(index == this.size())
        {
            this.addAtTail(val);
            return;
        }
        Node curr=this.head;
        int i=0;
        while(i<index-1 && curr!=null){
            i++;
            curr=curr.next;
        }
        if(curr==null) return;
        Node n=new Node(val);
        n.next=curr.next;
        curr.next=n;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>this.size()) return;
        if(index==0){
            this.head=this.head.next;
            return;
        }
        Node curr=this.head;
        if(index==this.size()){
            while(curr.next!=null) curr=curr.next;
            curr=null;
            return;
        }
        int i=0;
        while(i<index-1 && curr!=null){
            i++;
            curr=curr.next;
        }
        if(curr==null) return;
        curr.next=curr.next.next;
    }
}


    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    //1 2 3 4 5
  /*   public int get(int index) {
        int i=0;
        Node curr=this.head;
        while(i<index && curr!=null){
            i++;
            curr=curr.next;
        }
        return curr.data;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    /* public void addAtHead(int val) {
        Node n=new Node(val);
        if(this.head==null)
            this.head=n;
        else{
            n.next=this.head;
            this.head=n;
        }
    }
     */
    /** Append a node of value val to the last element of the linked list. */
    /* public void addAtTail(int val) {
        Node n=new Node(val);
        Node curr=this.head;
        while(curr.next!=null) curr=curr.next;
        curr.next=n;
    } */
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    //1 2 3  5 6 7
    /* public void addAtIndex(int index, int val) {
         int i=0;
         if(index==0) addAtHead(val);
        else{
        Node n=new Node(val);
        Node curr=this.head;
        while(i!=index-1 && curr!=null){
            i++;
            curr=curr.next;
        }
        n.next=curr.next;
        curr.next=n;
    }
    } */
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    /* public void deleteAtIndex(int index) {
          int i=0;
        Node curr=this.head;
        while(i<index-1 && curr!=null){
            i++;
            curr=curr.next;
        }
        if(index==0){
            head=head.next;
        }
        else if(curr.next.next==null) curr.next=null;
        else
        curr.next=curr.next.next;
    }
} */

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */