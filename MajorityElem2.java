package Array;
import java.util.*;
public class MajorityElem2 {
        public static List<Integer> majorityElement(int[] nums) {
            List<Integer> l=new ArrayList<>();
            Map<Integer,Integer> m=new HashMap<>();
            int x=(int)Math.floor(nums.length/3);
            for(int i:nums){
                try{
                    m.put(i,m.get(i)+1);
                }
                catch(Exception e){
                    m.put(i,1);
                }
            }
            for(Map.Entry<Integer,Integer> e:m.entrySet()){
                if((e.getValue()>=x)) l.add(e.getKey());
            }
            return l;
        }
        public static void main(String[] args) {
            int a[]={3,2,3};
            System.out.print(majorityElement(a));
        }
    }
