import java.util.Scanner;
import DoublyLinkedList.Dnode;
import DoublyLinkedList.DoubleLinkList;

class Program{
    public static void main(String args[]){
        int choice,e,c;
        Dnode even,odd;
        even = odd = null;
        DoubleLinkList obj = new DoubleLinkList();
        Scanner scanner = new Scanner(System.in);
        obj.createDoubleLinkList();
        do{
            System.out.println("1.InsertAtRight\n2.PrintTraverse\n3.SplitList\n4.CountNodes\n0.Exit");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                        System.out.println("Enter Data:");
                        e = scanner.nextInt();
                        obj.insertAtRight(e);
                        System.out.println("Element Inserted at Right");
                        break;
                
                case 2:
                        obj.printTraverse();
                        break;

                case 3:
                        System.out.println("SpiltList\n1.Even\n2.Odd\n0.Exit");
                        c = scanner.nextInt();
                        switch(c){
                            case 1:
                                    System.out.println("SplitListEven:");
                                    obj.splitList();
                                    obj.printList(even);
                            break;        
                            case 2:
                                    System.out.println("SplitListOdd:");
                                    obj.splitList();
                                    obj.printList(odd);
                            break;

                            case 0:
                                    System.out.println("Exit..");
                            break;        
                            default:
                                    System.out.println("Wrong Choice!!");
                            break;        
                        }
                        break;
                
                case 4:
                        obj.countNodes();
                        break;        
                
                case 0:
                        System.out.println("Exiting...");
                        break;
                
                default:
                        System.out.println("Wrong Choice Selected");
                        break;        
            }

        }while(choice != 0);
    }
}