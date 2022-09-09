import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String pattern=sc.nextLine();
        String text=sc.nextLine();
        int lps[]=lpsConstruct(pattern);
        int j=0,i=0,count=0;
        int n=text.length();
        int m=pattern.length();
        while(i<n){
            if(text.charAt(i)==pattern.charAt(j)){
                j++;
                i++;
            }
            if(j==m){
                count++;
                j=lps[j-1];
            }
            else if(i<n && text.charAt(i)!=pattern.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        System.out.print(count);
    }
    public static int[] lpsConstruct(String pattern){
        //ABCDABD->00001

        int lps[]=new int[pattern.length()];
        lps[0]=0;
        int j=0;
        for(int i=1;i<pattern.length();i++){
            if(pattern.charAt(i)==pattern.charAt(j)){
            lps[i]=j+1;
            j++;
            }
            else{
                j=0;
                lps[i]=0;
            }
        }
        return lps;
    }
}
