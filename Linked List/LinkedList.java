public class LinkedList{
	Node first=null;
		int count=1;
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(4);
		list.addFirst(2);
		list.addFirst(1);
		list.addFirst(0);
		list.deleteAtFirst();
		list.deleteAtLast();
        list.addAtorder(3);
        list.deleteAtOrder(2);
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
            return;
		}
		newNode.next=first;
		first =newNode;
		
	} 
	//Add last
	public void addLast(int data){
		Node newNode=new Node(data);

		if(first==null ||newNode.data<=first.data){
			newNode.next=first;
			first=newNode;
            return;
		}
		Node saveNode=first;
		while(saveNode.next!=null){
			newNode=saveNode.next;
		}
		saveNode.next=newNode;

	}
	//Add at order
	public void addAtorder(int data){
		Node newNode=new Node(data);

		if(first==null ||newNode.data<=first.data){
			newNode.next=first;
			first=newNode;
            return;
		}
		Node saveNode=first;
		while(saveNode.next!=null && newNode.data>=saveNode.next.data){
			saveNode=saveNode.next;
		}
		newNode.next=saveNode.next;
		saveNode.next=newNode;

	}
	//Delete at first
	public void deleteAtFirst(){
		if(first==null){
			System.out.println("Cannot be deleted as LinkedList is empty");
		}
		else{
			first = first.next;
		}
	}
	//Delete at last
	public void deleteAtLast(){
		if(first==null){
			System.out.println("Cannot be deleted as LinkedList is empty");
		}
		else{
			Node saveNode=first;
			while((saveNode.next).next!=null){
				saveNode = saveNode.next;
			}
			saveNode.next = null;
		}
	}
	//delete at order
	public void deleteAtOrder(int data){
	    	if(first==null){
	    	    System.out.println("Empty!");
	    	    return;
	    	}
	    	Node saveNode=first,prev=null;
	    	//first node holds the key
	    	if(saveNode.data==data){
	    	    first=saveNode.next;
	    	    return;
	    	}
		while(saveNode!=null && saveNode.data!=data){
				prev=saveNode;
			saveNode=saveNode.next;
		}
		if(saveNode==null){
		    System.out.println("Node not found");
		}
		prev.next=saveNode.next;
	}
	//count node
	public void countNode(){
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