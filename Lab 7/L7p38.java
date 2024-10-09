import java.util.*;

class Operation{
    int top=-1;
    int arr[]=new int[5];
    public void push(int x){
        if(top>=4){
            System.out.println("Stack overflow");
        }
        else{
            top=top+1;
            arr[top]=x;
        }
    }

    public int pop(){
        if(top<=-1){
            System.out.println("Stack underflow");
        }
        else{
            top=top-1;
           return arr[top];
        }
    }

    public void display(){
        if(top<=-1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println("arr["+i+"]: "+arr[i]);
            }
        }
    }

    public int peep(int i){
        if((top-i+1) <= -1){
            System.out.println("element "+i+"th not available");
            return 0;
        }
        else{
            return arr[top-i+1];
        }
    }
    public void change(int i,int x){
        if((top-i+1) <= -1){
            System.out.println("element "+i+"th is not available ");
        }
        else{
           arr[top-i+1]=x;
        }
    }

}

public class L7p38 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Operation op=new Operation();
    
        System.out.println("Enter 1 for push, 2 for pop, 3 for display , 4 for peep, 5 for change and 6 for exiting the code: ");
        op.push(10);
        op.push(12);
        op.push(14);
        op.display();
        op.pop();
        op.display();
        op.push(16);
        op.peep(1);
        op.display();

    }
}
