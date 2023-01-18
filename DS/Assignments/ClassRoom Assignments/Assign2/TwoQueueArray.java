
import java.util.*;

public class TwoQueueArray {
    int twoqueue[];
    int Maxsize;
    int front1 , front2;
    int rear1 , rear2;

    TwoQueueArray(int size){

        twoqueue = new int[size];
        Maxsize = size;
        front1 = 0;
        rear1 = -1;
        front2 = size;
        rear2 = front2 -1;
    }

    void enqueue1(int e){
        rear1++;
        twoqueue[rear1] = e;
    }
    
    void enqueue2(int e){
       rear2--;
       twoqueue[rear2] = e;
    }

    boolean isFull(){
        if(rear1 == rear2 -1)
            return true;
        else
            return false;
    }

    int dequeue1(){
        int temp = twoqueue[front1];
        front1++;
        return temp;
    }
    
    int dequeue2(){
        int temp = twoqueue[front2];
        front2--;
        return temp;
    }

    boolean isEmpty(){
        if(rear2 == -1)
            return true;
        else
            return false;
    }

    void printQueue1(){
        for (int i = front1; i <= rear1; i++)
            System.out.println(twoqueue[i]);
    }
    
    void printQueue2(){
        for (int i = front2; i <= rear2; i--)
            System.out.println(twoqueue[i]);
    }

    public static void main(String args[]){
        int choice,e;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int s = in.nextInt();
        TwoQueueArray obj = new TwoQueueArray(s);

        do
        {
            System.out.println("1.Enqueue in Queue1\n2.Enqueue in Queue2\n3.Dequeue from Queue1\n4.Dequeue from Queue2\n5.PrintQueue1\n6.PrintQueue2\n0.Exit");
            choice = in.nextInt();
            switch(choice){
                    case 1:
                            if(!obj.isFull()){
                                System.out.println("Enter Data:");
                                e = in.nextInt();
                                obj.enqueue1(e);
                                System.out.println("Data Enqueued in Queue1!!");
                            }else
                                System.out.println("Queue1 Full!!!");
                    break;
                    
                    case 2:
                            if(!obj.isFull()){
                                System.out.println("Enter Data:");
                                e = in.nextInt();
                                obj.enqueue2(e);
                                System.out.println("Data Enqueued in Queue2!!");
                            }else
                                System.out.println("Queue2 Full!!!");
                    break;

                    case 3:
                            if(!obj.isEmpty()){
                                e = obj.dequeue1();
                                System.out.println("Data Dequeued from Queue1:"+e);
                            }else
                                System.out.println("Queue1 Empty");
                    break;
                    
                    case 4:
                            if(!obj.isEmpty()){
                            e = obj.dequeue2();
                            System.out.println("Data Dequeued from Queue2:"+e);
                            }else
                                System.out.println("Queue2 Empty");
                    break;
                    
                    case 5:
                            if(!obj.isEmpty()){
                            System.out.println("Data Stored in Queue1:");
                            obj.printQueue1();
                            }else
                                System.out.println("Queue1 Empty");
                    break;
                    
                    case 6:
                            if(!obj.isEmpty()){
                            System.out.println("Data Stored in Queue2:");
                            obj.printQueue2();
                            }else
                                System.out.println("Queue2 Empty"); 
                    break;
                    
                    case 0:
                            System.out.println("Exiting ..");
                    break;

                    default:
                            System.out.println("Wrong Choice Selected");
                    break;                 
            }       
            
        }while(choice != 0);
    }
    
    
}