import java.util.*;
class StringCompression {
    public static void main(String[] args) {
        char chars[]={'a','a','a','b','b','a','a','c'};
       compress(chars);
        
    }
    public static int compress(char[] chars) {
        int count=1;
        String s="";
        //aaabbaa
        for(int i=0;i<chars.length;i++){
          if(i<chars.length-1 && chars[i]==chars[i+1]){
            count++;
          }
          else{
              if(count>1)
              s+=Character.toString(chars[i])+count;
              else
              s+=Character.toString(chars[i]);
              count=1;
          }
        }
        System.out.print(s);
        
    }
}
