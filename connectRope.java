import java.util.*;
class connectRope {
    public static void main(String[] args) {
        System.out.print(mergeStones(new int[]{4,3,2,1}, 2));
    }
    public static int mergeStones(int[] stones, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:stones)
        {
            pq.add(i);
        }
        int sum;
        while(pq.size()>1)
        {
            sum=0;
            for(int i=0;i<k;i++)
            {
                if(pq.isEmpty()) return -1;
                sum+=pq.poll();
            }
            pq.add(sum);
        }
        return pq.poll();
    }
}