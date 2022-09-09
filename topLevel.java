import java.util.*;
import java.io.*;

class ANode {
    ANode left;
    ANode right;
    int data;
    
    ANode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class topLevel {

	/* 
    
    class ANode 
    	int data;
    	ANode left;
    	ANode right;
	*/
    static int arr[]=new int[]{0,0};
	public static void topView(ANode root) {
    System.out.print(root.data+" ");
    recurr(root,0,0);
    }
    public static void recurr(ANode root,int minlevel,int maxlevel)
    {
        if(root==null) return;
        recurr(root.left,minlevel-1,maxlevel-1);
        if(minlevel<arr[0])
        {
            arr[0]=minlevel;
            System.out.print(root.data+" ");
        }
        else if(maxlevel>arr[1])
        {
            arr[1]=maxlevel;
            System.out.print(root.data+" ");
        }
        recurr(root.right,minlevel+1,maxlevel+1);
    }

	public static ANode insert(ANode root, int data) {
        if(root == null) {
            return new ANode(data);
        } else {
            ANode cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        ANode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}
