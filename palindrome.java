package Array;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3};//input
        int n = arr.length;
        int cost=0,temp;
        boolean check=false;
        for(int i=0;i<arr.length;i++)
        {
            if(check)
            {
                System.out.print("-1");//return -1
                System.exit(0);
            }
            if(arr[i]!=arr[n-i-1])
            {
                for(int j=i+1;j<n-i-1;j++)
                {
                    if(arr[j]==arr[i])
                    {
                        temp=arr[j];
                        arr[j]=arr[n-i-1];
                        arr[n-i-1]=temp;
                        if(j<=n/2 -1 && (n-i-1)>=(n/2))
                        {
                            cost++;
                        }
                        check=false;
                        break;
                    }
                    check=true;
                }
            }
        }
        System.out.print(cost); //return cost
    }
}
