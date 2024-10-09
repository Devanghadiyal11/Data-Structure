import java.util.*;
class Linked_list{
    class Node
    {
        int data;
        Node link;
    }
    Node first;
   

    //insert node at first position 
    public void insert_at_first(int x)
    {
        Node n1=new Node();
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

    //sort the elements
    public void sort()
    {
        Node save=first;
        Node temp;
        //temporary variable to swaping
        int x;

        while(save!=null){
            temp=save.link;

            while(temp!=null){
                if(save.data > temp.data){
                    x=save.data;
                    save.data=temp.data;
                    temp.data=x;
                    temp=temp.link;
                }
                else{
                    temp=temp.link;
                }
            }
            save=save.link;
        }
    }
}
public class P65_sort {

    public static void main(String[] args) {
        Linked_list l=new Linked_list();
        l.insert_at_first(50);
        l.insert_at_first(5);
        l.insert_at_first(20);
        l.insert_at_first(3);
        l.insert_at_first(1);
        l.display();
        System.out.println();
        System.out.println("sorted linked list: ");
        l.sort();
        l.display();
    }
}
