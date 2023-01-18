import java.util.*;

class Dnode{
    int data;
    Dnode left,right;

    Dnode(int data){
        this.data = data;
        left = right = null;
    }
}

public class DoublyCircularLinkedList {
    Dnode root,last;

    void createList(){
        root = last = null;
    }

    void insertLeft(int data) {
        
        Dnode n = new Dnode(data);
        if(root == null){
            root = last = n;
        }else{
            n.right = root;
            root.left = n;
            n.left = last;
            root = n;
            last.right = n;
        }
    }

    void deleteLeft(){
        if(root == null){
            System.out.println("List Empty");
        }else{
            Dnode t = root;
            root = root.right;
            root.left = last;
            last.right = root;
            System.out.println("Deleted: " +t.data);
        }
    }

    void insertRight(int data){
        Dnode n = new Dnode(data);
        if(root == null){
            root = last = n;
            last.right = root;
        }else{
            Dnode t = root;
            while(t.right != root)
            t.right = n;
            n.left = t;
            root.left = n;
            last = n;
            n.right = root;
        }
    }

    void deleteRight(){
        if(root == null){
            System.out.println("List Empty");
        }else{
            Dnode t = last;
            last = last.left;
            last.right = root;
            root.left = last;
            System.out.println("Deleted:"+t.data);
        }
    }

    void printList(){
        if(root == null){
            System.out.println("List Empty");
        }else{
            Dnode t;
            t = root;
            do{
                System.out.println(t.data);
                t = t.right;
            }
            while(t != root);
        }
    }

    void printRevList(){
        if(root == null){
            System.out.println("List Empty");
        }else{
            Dnode t;
            t = root;
            do
            {
                System.out.println(t.data);
                t = t.right;
            }
            while(t != root);
        }
    }

    public static void main(String args[]){
        int choice,e;
        var obj = new DoublyCircularLinkedList();
        Scanner in = new Scanner(System.in);
        obj.createList();
        do{
            System.out.println("1.InsertLeft\n2.DeleteLeft\n3.InsertRight\n4.DeleteRight\n5.Print\n6.Print in Reverse Order\n0.Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("Enter Data:");
                        e = in.nextInt();
                        obj.insertLeft(e);
                        System.out.println("Data Inserted at Leftmost.");
                    break;
                case 2:
                        obj.deleteLeft();
                    break;
                case 3:
                        System.out.println("Enter Data:");
                        e = in.nextInt();
                        obj.insertRight(e);
                        System.out.println("Data Inserted at Rightmost.");
                    break;
                case 4:
                        obj.deleteRight();                                    
                    break;
                case 5:
                        System.out.println("Element in lists are:");
                        obj.printList();                    
                    break;
                case 6:
                        System.out.println("Element Prints in Reverse Order:");
                        obj.printRevList();                    
                    break;
                case 0:                        
                        System.out.println("Exiting...");                    
                    break;
    
                default:
                        System.out.println("Wrong Choice Selected");
                    break;
            }
        }
        while(choice != 0);   
    }
}