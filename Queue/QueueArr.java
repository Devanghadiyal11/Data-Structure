public class QueueArr {
    public static class Queue {
        int arr[];
        int n;
        int rear = -1;
        int front = -1;
        
        Queue(int n) {
            arr = new int[n];
            this.n = n;
        }
        
        // Enqueue
        public void add(int data) {
            if (rear >= n - 1) {
                System.out.println("Queue Overflow!");
            } else {
                if (front == -1) front = 0; // set front to 0 when first element is added
                arr[++rear] = data;
            }
        }

        // Dequeue
        public void delete() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow!");
            } else {
                System.out.println("Removed: " + arr[front]);
                front++;
                if (front > rear) { // Reset the queue when it becomes empty
                    front = rear = -1;
                }
            }
        }
        
        // PrintQueue
        public void printQueue() {
            if (front == -1) {
                System.out.println("Queue is empty.");
                return;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i]);
                if (i < rear) System.out.print(" => ");
            }
            System.out.println();
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
