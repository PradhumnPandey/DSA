import java.util.*;
class DNode{
    DNode next,prev;
    int data;
    DNode(int data){
        this.data=data;
        next=prev=null;
    }
}
public class doublyLL {
    DNode head,tail;
    public static void main(String[] args) {
        doublyLL l=new doublyLL();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.headdisplay();
        l.taildisplay();
    }
    void insert(int data){
        DNode n=new DNode(data);
        if(this.head==null){
            this.head=n;
        }
        else{
            DNode curr=this.head;
            while(curr.next!=null){curr=curr.next;}
            curr.next=n;
            n.prev=curr;
            this.tail=n;
        }
    }
    void headdisplay(){
        DNode curr=this.head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    void taildisplay(){
        DNode curr=this.tail;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.prev;
        }
    }
}
