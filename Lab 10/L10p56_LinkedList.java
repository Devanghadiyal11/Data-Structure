class Node{
    int data;
    Node link;
//     public Node(data){
//         this.data=data;
//         link=null;
//     }
}
class LinkedList{
    Node first;
    public void insertAtFirst(int data){
        Node n1=new Node();
        n1.data=data;
        n1.link=first;
        first=n1;

    }
    public void traversal(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
    public void insertAtLast(int data){
        Node n1=new Node();
        Node temp=first;
        while(temp.link!=null){
            temp=temp.link;
        }
        temp.link=n1;
        n1.data=data;
    }
    public void deleteAtFirst(){
        if(first==null){
            System.out.println("Stack Underflow");
        }
        else{
            Node save=first;
            first=first.link;
            save=null;
        }

    }
    public void deleteAtLast(){
        if(first==null){
            System.out.println("Stack underflow");
        }
       Node pre=null;
        Node save=first;
        while(save.link!=null){
           pre=save;
            save=save.link;
            
        }
        pre.link=null;
    }
    public void insertAtOrder(int x){
        Node n1=new Node();
        if(first==null){
             first.data=x;
             return;
        }
        if(x<=first.data){
            n1.link=first;
            n1.data=x;
            first=n;
        }
        Node pre=null;
        Node save=first;

    }
}

public class L10p56_LinkedList {
    public static void main(String[] args) {
        Node n1=new Node();
        LinkedList l=new LinkedList();
        System.out.println("Linked List is: ");
        l.insertAtFirst(5);
        l.insertAtFirst(4);
        l.insertAtFirst(3);
        l.insertAtLast(6);
        l.traversal();
        // l.deleteAtFirst();
        // l.deleteAtLast();
        // l.traversal();
        // l.insertAtOrder(10);
        // l.traversal();
        

    }
}
