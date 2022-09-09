import java.util.*;
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
 }
 
class BTNode
{
    TreeNode node;
    int level;
    BTNode(TreeNode node,int i)
    {
        this.node=node;
        level=i;
    }
}
class verticalTraversal {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,List<Integer>> map=new TreeMap<>();
        List<List<Integer>>l=new LinkedList<>();
        Queue<BTNode> q=new LinkedList<>();
        q.add(new BTNode(root,0));
        q.add(null);
        List<Integer> x=new LinkedList<>();
        x.add(root.val);
        map.put(0,x);
        while(!q.isEmpty())
        {
            
            BTNode temp=q.poll();
            if(map.containsKey(temp.level))
            {
                map.get(temp.level).add(temp.node.val);
            }
            else
            {
                x=new LinkedList<>();
                x.add(temp.node.val);
                map.put(temp.level,x);
            }
            if(temp.node.left!=null)
            {
                q.add(new BTNode(temp.node.left,temp.level-1));
            }
            if(temp.node.right!=null)
            {
                q.add(new BTNode(temp.node.right,temp.level+1));
            }
        }
        for(Map.Entry<Integer, List<Integer>> e : map.entrySet())
        {
            l.add(e.getValue());
        }
          return l;
    }
}