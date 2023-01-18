import java.util.*;

class Dnode
{
    int data;
    Dnode left,right;
    Dnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class DoublyLinkedListDemo
{
   Dnode root;    
    void createList()
    {
        root=null;
    }
    void insertLeft(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;
        else
        {
            n.right=root;
            root.left=n;
            root=n;
        }
    }
    void deleteLeft()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
            Dnode t=root;
            root=root.right;
            root.left=null;
            System.out.println("Deleted:"+t.data);
        }
    }
    
    void insertRight(int data)
            
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;
        else
        {
            Dnode t=root;
            while(t.right!=null)
                t=t.right;
            t.right=n;
            n.left=t;
        }
    }
 void deleteRight()
 {
     if(root==null)
     {
         System.out.println("List Empty");
     }
     else
     {
         Dnode t,t2;
         t=t2=root;
         while(t.right!=null)
         {
             t=t.right;
         }
         t2=t.left;
         t2.right=null;
         System.out.println("Deleted:"+t.data);
     }
   }

 void printList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         while(t!=null)
         {
             System.out.println(t.data);
             t=t.right;
         }
     }
   }
  void printRevList()
 {
     if(root==null)
              System.out.println("List Empty");
     else
     {
         Dnode t;
         t=root;
         while(t.right!=null)
         {
            t=t.right;
         }
         while(t!=null) 
         {
             System.out.println(t.data);
             t=t.left;
         }
     }
   }

   public static void main(String args[]){

    int choice,e;
    DoublyLinkedListDemo obj = new DoublyLinkedListDemo();
    Scanner scanner = new Scanner(System.in);
    obj.createList();
    do{
        System.out.println("1.InsertLeft\n2.DeleteLeft\n3.InsertRight\n4.DeleteRight\n5.Print\n6.Print in Reverse Order\n0.Exit");
        choice = scanner.nextInt();
        switch(choice){
                
                case 1:
                        System.out.println("Enter Data");
                        e = scanner.nextInt();
                        obj.insertLeft(e);
                        System.out.println("Data Inserted at Leftmost");
                        break;
                case 2:
                        obj.deleteLeft();
                        System.out.println("Element Deleted From left");
                        break;
                case 3:
                        System.out.println("Enter Data");
                        e = scanner.nextInt();
                        obj.insertRight(e);
                        System.out.println("Data Inserted at Rightmost");
                        break;
                
                case 4:
                        obj.deleteRight();
                        System.out.println("Element Deleted From Right");
                        break;        
                case 5:
                        System.out.println("Elements in List are");
                        obj.printList();
                        break;        
                case 6:
                        System.out.println("Elements in Reverse Order");
                        obj.printRevList();
                        break;        
                case 0:
                        System.out.println("Exiting....");
                        break;
                default:
                        System.out.println("Wrong Choice Selected");
                        break;                
        }
    }while(choice != 0);
    
}

}
