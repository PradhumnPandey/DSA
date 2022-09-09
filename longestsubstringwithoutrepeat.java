//longestsubstringwithoutrepeat
import java.util.*;
class longestsubstringwithoutrepeat {
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("abcabcbb"));
    }
    public static  int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int count=0,l=0,r=0;
        char i;
        while(r<s.length())
        {
            i=s.charAt(r);
            if(m.containsKey(i))
                if(l<=m.get(i)) l=m.get(i)+1;
                if(count<(r-l+1)) count=r-l+1;
                m.put(i,r);
                r++;
        }
        return count;
    }
}