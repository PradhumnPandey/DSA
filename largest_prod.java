import java.io.*;
import java.util.*;
class largest_prod{
    static int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        int ans;
        while(t>0){
            ans=1;
            int n=Integer.parseInt(in.readLine());
            Set<Integer> A= new HashSet<Integer>(n);
            Set<Integer> B= new HashSet<Integer>(n);
            String s1[]=(in.readLine()).split(" ");
            String s2[]=(in.readLine()).split(" ");
            for(int i=0;i<n;i++){
                A.add(Integer.parseInt(s1[i]));
                B.add(Integer.parseInt(s2[i]));
            }
            Integer[] A_ = new Integer[A.size()];
            A.toArray(A_);
            Integer[] B_ = new Integer[A.size()];
            B.toArray(B_);
            for(int i=0;i<n;i++){
                ans*=max((A_[i]+B_[i]),(A_[i]*B_[i]));
            }
            System.out.println(ans);
            t--;
        }
    }
}