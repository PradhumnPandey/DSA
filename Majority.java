package Array;
import java.io.*;
class Majority {
    public static int majorityElement(int[] nums) {
        int ansIndex=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[ansIndex]) count++;
            else count--;
            if(count==0){
                nums[ansIndex]=i;
                count=1;
            }
        }
        int check=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[ansIndex]){
                check++;
            }
            if(check>Math.floor(nums.length/2)){
                return nums[ansIndex];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={3,2,3};
        System.out.print(majorityElement(a));
    }
}
