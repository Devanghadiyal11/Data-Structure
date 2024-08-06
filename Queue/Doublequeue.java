// 52. Write a menu driven program to implement following operations on the Doubled Ended arrueue- 


import java.util.*;

class Doublequeue{
    int length;
    int arr[];
    int front;
    int rear;

    public Doublequeue(int length){
        this.length = length;
        this.arr = new int[length];
        this.front = -1;
        this.rear = -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an arry:");
        int len = sc.nextInt();
        Doublequeue q = new Doublequeue(len);
        q.DQInsert_front(1);
        q.DQInsert_rear(2);
        q.DQInsert_front(0);
        q.DQInsert_rear(3);
        q.display();
        q.DQDelete_front();
        q.DQDelete_rear();
         q.display();
    }

    public void DQInsert_front(int data){
        if(front == 0){
            System.out.println("Overflow");
            return;
        }

        if(front == -1){
            front++;
            rear++;
        }
        else{
            front--;
        }
        arr[front] = data;
        System.out.println("Inserted");
    }

    public void DQInsert_rear(int data){
        if(rear >= (length-1)){
            System.out.println("Overflow");
            return;
        }

        if(front == -1){
            front++;
        }
        rear++;
        arr[rear] = data;
        System.out.println("Inserted");
    }

    public int DQDelete_front(){
        if(front == -1){
            System.out.println("Underflow");
            return -1;
        }
        int dnum = arr[front];
        
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        return dnum;
    }

    public int DQDelete_rear(){
        if(rear == -1){
            System.out.println("Underflow");
            return -1;
        }

        int dnum = arr[rear];

        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            rear--;
        }
        return dnum;
    }

    public void display(){
        if(front == -1){
            System.out.println("Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}