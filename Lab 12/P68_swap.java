import java.util.*;
class Linked_list
{
    class Node{
        int data;
        Node link;
        
        public Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    Node first;
    //insert node at first position 
    public void insert_at_first(int x)
    {
        Node n1=new Node(x);
        n1.data=x;
        n1.link=first;
        first=n1;
    }

    //display the linked list
    public void display()
    {
        Node temp=first;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }

    int count=0;
    //count the nodes in the linked list
    public void count(){
        Node save=first;
        while(save!=null){
            count++;
            save=save.link;
        }
        System.out.println("Number of nodes: "+count);
    }

    //swap corresponding nodes 
    public void swap(){
        Node save=first;
        Node next=first.link;

        int count=0;
        while(save!=null)
        {
            Node temp=next.link;
            save.link=next;
            next.link=temp;

            if(count==0){
                first=next;
                count++;
            }
           
            save=save.link;
            next=save.link;
            System.out.println("save : "+save.data);
            System.out.println("next : "+next.data);
        }
    }
}
public class P68_swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_list l=new Linked_list();
        l.insert_at_first(8);
        l.insert_at_first(7);
        l.insert_at_first(6);
        l.insert_at_first(5);
        l.insert_at_first(4);
        l.insert_at_first(3);
        l.insert_at_first(2);
        l.insert_at_first(1);
        l.display();
        System.out.println();
        System.out.println("after swapping two corresponding nodes the linked list is:");
        l.swap();
        l.display();
    }
}
