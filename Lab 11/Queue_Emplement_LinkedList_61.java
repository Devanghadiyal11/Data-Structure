import java.util.*;
class LinkedList{
	Node first;
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}

	//insertAtLast like queue push
	public void push(int data){
		Node n1=new Node(data);
		n1.link=first;
		first=n1;
		// Node new_n=new Node(data);
		// Node temp=first;
		// if(first==null){
		// 	first=new_n;
		// }
		// while(temp.link!=null){
		// 	temp=temp.link;
		// }
		// temp.link=new_n;
	}

	//deleteAtFirst like as pop
	public void pop(){
		if(first==null){
			System.out.println("stack Underflow:");
		}
		else{
			Node save=first;
			Node pre=null;
			while(save.link!=null){
				pre=save;
				save=save.link;
			}
			pre.link=null;
		}
	}

	//travel method or display 
	public void display(){
		Node temp=first;
		int i=0;
		while(temp!=null){
			System.out.println("n["+i+"]="+temp.data);
			temp=temp.link;
			i++;
		}
	}
}
public class Queue_Emplement_LinkedList_61{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			LinkedList l1=new LinkedList();
			l1.push(10);
			l1.push(20);
			l1.push(30);
			l1.push(40);
			l1.pop();
			l1.display();
	}
}