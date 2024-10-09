
import java.util.*;

class Queue {

    static int que[] = new int[5];
    static int size;
    static int rear = -1;
    static int front = -1;
    static int n = 5;

    public static void enqueuq(int y) {
        if (rear >= n - 1) {
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        rear = rear + 1;
        que[rear] = y;
        if (front == -1) {
            front = 0;
            return;
        }
    }

    public static int dequeue() {
        int y;
        if (front == -1) {
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        }
        y = que[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return y;
    }

    public void display() {
        if (front == -1) {
            System.out.println("QUEUE UNDERFLOW");
            return;
        } else {
            for (int j = front; j <= rear; j++) {
                System.out.println("que[" + j + "]: " + que[j]);
            }
        }
    }
}

public class P50_Queue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        q.enqueuq(1);
        q.enqueuq(2);
        q.enqueuq(3);
        q.enqueuq(4);
        q.dequeue();
        q.dequeue();
        q.display();
    }
}
