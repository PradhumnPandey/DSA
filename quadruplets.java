import java.util.*;
class quadruplets {
    public static void main(String[] args) {
        System.out.print(fourSum(new int[]{1,0,-1,0,-2,2},0).toString());
    }
    public static  List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ll=new ArrayList<>();
        int k,l,rem,temp;
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                rem=target-nums[i]-nums[j];
                k=j+1;
                l=len-1;
                while(k<l)
                {
                    temp=nums[k]+nums[l];
                    if(rem>temp) k++;
                    else if(temp>rem) l--;
                    else
                    {
                        List<Integer> x=new ArrayList<>();
                        x.add(i);
                        x.add(j);
                        x.add(k);
                        x.add(l);
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                        ll.add(x);
                    }
                }
                 while(j+1< len && nums[j]==nums[j+1]) j++;
            }
             while(i+1< len && nums[i]==nums[i+1]) i++;
        }
        return ll;
    }
}