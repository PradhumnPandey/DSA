import java.util.*;
class BNode
{
    BNode left,right;
    int data;
    BNode(int data)
    {
        left=right=null;
        this.data=data;
    }
}
public class BT {
    BNode root;
    BT()
    {
        root=null;
    }
    public static void main(String[] args) {
        BT tree=new BT();
        tree.insert(5);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(3);
        tree.insert(9);
        tree.insert(10);
        tree.display(tree.root);
    }
    void insert(int data)
    {
        BNode n=new BNode(data);
        if(root==null)
        {
            root=n;
            return;
        }
        Queue<BNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            BNode temp=q.poll();
            if(temp.left==null)
            {
                temp.left=n;
                return;
            }
            else
            {
                q.add(temp.left);
            }
            if(temp.right==null)
            {
                temp.right=n;
                return;
            }
            else
            {
                q.add(temp.right);
            }
        }
    }
    void display(BNode root)
    {
        if(root==null) return;
        display(root.left);
        System.out.print(" "+root.data);
        display(root.right);
    }

}
