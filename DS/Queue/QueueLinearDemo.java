/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amart
 */
import java.util.*;
public class QueueLinearDemo 
{
     int front,rear,MaxSize,q[];
     
     void createQueue(int size)
     {
         front=0;
         rear=-1;
         MaxSize=size;
         q=new int[MaxSize];
     }
      void enqueue(int e)
      {
          rear++;
          q[rear]=e;
          //q[++rear]=e
      }
  
  boolean isFull()
  {
      if(rear==MaxSize-1)
          return true;
      else
          return false;
  }
  int dequeue()
  {
      int temp=q[front];
      front++;
      return(temp);
  }
  boolean isEmpty()
  {
      if(front>rear)
          return true;
      else
          return false;
  }
  
  void printQueue()
  {
      for(int i=front   ;i  <=rear   ; i++)
          System.out.println(q[i]);
  }

  public static void main(String args[]){
    int ch,e;
    QueueLinearDemo obj =new QueueLinearDemo();
    Scanner in =new Scanner(System.in);
    System.out.println("enter size of Queue:");
    int s =in.nextInt();
    obj.createQueue(s);
    do 
    {
        System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.print\n0.exit");
        ch=in.nextint();
       
        switch(ch)
        {
            case 1:
            if(!obj.isFull())
            {
                System.out.println("Enter Data:");
              e=in.nextint();
                obj.enqueue(e);
                System.out.println("enqueue");
        }
        else 
        System.out.println(" Queue full");
        break;
        case 2:
          if( !obj.isEmpty())
          {
            e=obj.dequeue();
            System.out.println("dequeued:"+e);

          }
          else
          System.out.println("Queue Empty");
          break;

       case 3: 
       if(!obj .isEmpty())
       {
        e =obj.peek();
        System.out.println("@ peek : " +e);
       }   
       else 
       System.out.println("Queue Empty");
       break;
       case 4:
       if(!obj.isEmpty())
       {
        System.out.println("Queue has:");
        obj.printQueue();
       }
       else
       System.out.println("Exiting");
       break;
       case 0:
        System.out.println("Queue isEmpty");
        break;
       default:
         System.out.println("wrong option selected ");
         break;
    }
  }while(ch!=0);
}
}







