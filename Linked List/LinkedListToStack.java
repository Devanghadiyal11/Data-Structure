public class LinkedListToStack{
	Node first=null;
	Node top=null;
		int count=1;
	public static void main(String[] args) {
		LinkedListToStack list = new LinkedListToStack();
		list.push(3);
		list.push(2);
		list.push(1);
		list.push(0);
		list.pop();
		list.printList();
			list.peek();
		 list.countStack();
	}


	public class Node{
		int data;
		Node next;

		Node(int data){
			this.data=data;
			this.next=null;
		}

	}

	//Add first
	public void push(int data){
		Node newNode= new Node(data);
		if(first==null){
			first=newNode;
            return;
		}
		newNode.next=first;
		first =newNode;
		
	} 

	//Delete at first
	public void pop(){
		if(first==null){
			System.out.println("Cannot be deleted as LinkedList is empty");
		}
		else{
			Node top=first;
			first = first.next;

		}
	}
	//return element
	public void peek(){
		if(first==null){
			System.out.println("Cannot be deleted as LinkedList is empty");
		}
		else{
			Node top=first;
			System.out.println("Top element of stack is "+top.data);
		}
	}

	//count node
	public void countStack(){
		if(first==null){
			int count=0;
		}
		Node save=first;
		while(save.next!=null){
			save=save.next;
			count=count+1;
		}
		System.out.println("Total nunber of Nodes = "+count);
	}


	

	public void printList(){
		Node saveNode=first;
		if(first==null){
			System.out.println("list is empty");
            return;
		}
		
		while(saveNode!=null){
			System.out.print(saveNode.data+"=>");
			saveNode=saveNode.next;
		}
		System.out.println("Null");

	   }
}