import java.util.*;
class Link{
    Link left;
    Link right;
    int data;
    Link(int data){
        this.data=data;
        left=right=null;
    }
}
public class BST {
    Link root;
    public static void main(String[] args) {
        BST b=new BST();
        b.insert(8);
        b.insert(3);
        b.insert(10);
        b.insert(1);
        b.insert(6);
        b.insert(14);
        b.insert(4);
        b.insert(7);
        b.insert(13);
        b.inorderStack(b.root);

    }
    void insert(int data){
        Link n=new Link(data);
        if(root==null){
            this.root=n;
        }
        else{
            Link curr=root;
            while(data<curr.data){
                if(curr.left==null){
                    curr.left=n;
                    break;
                }
                else
                curr=curr.left;
            }
            while(data>curr.data){
                if(curr.right==null){
                    curr.right=n;
                    break;
                }
                else
                curr=curr.right;
            }
        }
    }
    void display(Link root){
        if(root==null){
            return;
        }
        
        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }
    void inorderStack(Link root)
    {
        Link curr=root;
        Stack<Link> s= new Stack<>();
        while(curr!=null || !s.isEmpty())
        {
            while(curr!=null)
            {
            s.push(curr);
            curr=curr.left;
            }
            curr=s.pop();
            System.out.print(curr.data);
            curr=curr.right;
        }
    }
    void leftView(Link curr)
    {
        if(curr==null) return;
        leftView(curr.left);
        if(curr==this.root) return;
        System.out.print(" "+curr.data);
    }
    void rightView(Link curr)
    {
        if(curr==null) return;
        System.out.print(" "+curr.data);
        rightView(curr.right);
    }
}
