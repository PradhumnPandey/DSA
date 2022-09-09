package Graph;
import java.util.*;
public class adjacencyList {
    ArrayList<Integer> list[];
    adjacencyList(int n)
    {
        list=new ArrayList[n];
    }
    void addEdgeUndirected(int u,int v)
    {
        if(list[u]==null) list[u]=new ArrayList<>();
        if(list[v]==null) list[v]=new ArrayList<>();
        list[u].add(v);      
        list[v].add(u);                                       
    }
    void addEdgeDirected(int u,int v)
    {
        if(list[u]==null) list[u]=new ArrayList<>();
        list[u].add(v);      
    }
    void BFS(int u,boolean[] visited)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        visited[u]=true;
        int curr;
        while(!q.isEmpty())
        {
            curr=q.poll();
            for(int i:list[curr])
            {
                if(!visited[i])
                {
                visited[i]=true;
                q.add(i);
                }
            }
            System.out.print(curr+" ");
        }
    }
    void DFS(int u,boolean[] visit)
    {
        visit[u]=true;
        System.out.print(u+" ");
        for(int i: this.list[u])
        {
            if(!visit[i])
            {
                DFS(i,visit);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        adjacencyList graph=new adjacencyList(n);
        // graph.addEdgeUndirected(0, 1);
        // graph.addEdgeUndirected(0, 4);
        // graph.addEdgeUndirected(1, 4);
        // graph.addEdgeUndirected(1, 3);
        // graph.addEdgeUndirected(4, 3);
        // graph.addEdgeUndirected(1,2);
        // graph.addEdgeUndirected(2, 3);
        graph.addEdgeDirected(0, 1);
        graph.addEdgeDirected(0, 2);
        graph.addEdgeDirected(1, 2);
        graph.addEdgeDirected(2, 0);
        graph.addEdgeDirected(2, 3);
        graph.addEdgeDirected(3, 3);
        boolean visited[]=new boolean[n];
        //graph.DFS(2, visited);
        System.out.println();
        graph.BFS(2, visited);
        sc.close();
    }
}
