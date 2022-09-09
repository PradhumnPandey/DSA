import java.util.*;
class NodeL{
    int data;
    NodeL next;
    NodeL(int data){
        this.data=data;
        next=null;
    }
}
class LinkedListl{
    NodeL head;
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        LinkedListl l=new LinkedListl();
        System.out.println("Start");
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.display();
        }
    public void insert(int data){
        NodeL n=new NodeL(data);
        if(this.head==null)
        this.head=n;
        else{
            NodeL last=this.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=n;
        }
    }
    public void display(){
        NodeL curr=this.head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
        
    }
}