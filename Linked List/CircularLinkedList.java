public class CircularLinkedList{
	Node con=null;
	Node first=null;
	Node last=null;
		int count=1;
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
	
			list.printList();
			list.countNode();
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
	public void addFirst(int data){
		Node newNode= new Node(data);
		if(first==null){
			first=newNode;
			first.next=first;
			last=first;
		}
		else{
			newNode.next=first.next;
			first.next=newNode;
			last=newNode;
			
		}
		
	} 
	public void countNode(){
		if(first==null){
			int count=0;
			System.out.println("Total nunber of Nodes = "+count);
			return ;
		}
		Node save=first;
		while(save.next!=first){
			save=save.next;
			count=count+1;
		}
		System.out.println("Total nunber of Nodes = "+count);
	}

	public void printList(){
		
		if(first==null){
			System.out.println("list is empty");
            return;
		}
		Node saveNode=first.next;
		do{
		    System.out.print(saveNode.data+"=>");
			saveNode=saveNode.next;
		}
		while(saveNode!=first.next);
		    System.out.println(saveNode.data+"...");
	   }


}