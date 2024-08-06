public class CircularQueue {
    public static class Queue {
        int arr[];
        int n;
        int rear = -1;
        int front = -1;
        
        Queue(int n) {
            arr = new int[n];
            this.n = n;
        }
        public   boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public  boolean isFull(){
            return (rear+1)%n == front;
        }
        
        
        // Enqueue
        public void add(int data) {
             if(isFull()){
                 System.out.println("Queue Overflow!");
                 return;
            }
            
                rear=(rear+1)%n;
                arr[rear]=data;
            if(front==-1){
                front=0;
                return;
            }

        }
        // Dequeue
        public void delete() {
             if (isEmpty()) {
                System.out.println("Queue is empty.");
                return ;
            }
           
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%n;
            }
           
        }

       
        
        // PrintQueue
        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            for (int i = front; i != rear; i=(i+1)%n) {
                System.out.print(arr[i]);
               if (i < rear) System.out.print(" => ");
            }
            System.out.println(arr[rear]);
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.printQueue();
        q.delete();
        q.printQueue();
        
       
       
       
    }
}
