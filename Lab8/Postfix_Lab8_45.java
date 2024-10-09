import java.util.*;
public class Postfix_Lab8_45 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="a+b*c/d-c+f/g/(h+i)) ";
        Stack<Character> stack =new Stack<>();
        // enter opening bracket
        stack.push('(');
        String polish="";
        int rank=0;
        //char top=stack.peek();
        int i=0;
        char ch=str.charAt(i);
        
    }
    public static int rank(char temp){
        if(temp=='+'||temp=='-'||temp=='*'||temp=='/'||temp=='('||temp==')'){
            return -1;
        }else{
            return 1;
        }
    }
}
