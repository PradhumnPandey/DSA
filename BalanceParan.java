import java.util.*;
class BalanceParan {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char x;
        try{
        for(int i=0;i<s.length();i++){
            x=s.charAt(i);
            if(x=='('|| x=='{' || x=='[') st.push(x);
            if(x==')'){if(st.peek() =='(') st.pop();}
            if(x=='}'){if(st.peek() =='{') st.pop();}
            if(x==']'){if(st.peek() =='[') st.pop();}
        }
        }
        catch(Exception e){return false;}
        if(!st.empty()) return false;
        return true;
    }
}