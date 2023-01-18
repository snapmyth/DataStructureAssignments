import java.util.*;
public class TwoStack{
    
    int twostack[];
    int tos1,tos2;
    int Maxsize;

    TwoStack(int size) {
        twostack = new int[size];
        Maxsize = size;
        tos1 = -1;
        tos2 = Maxsize;
    }

    void push1(int data) {
        tos1++;
        twostack[tos1] = data;
    }
    void push2(int data) {
        tos2--;
        twostack[tos2] = data;
    }

    boolean isFull() {
        if(tos1 == tos2 -1)
            return true;
        else
            return false;    
    }


    int pop1() {
        int temp = twostack[tos1];
        tos1--;
        return temp;
    }
    int pop2() {
        int temp = twostack[tos2];
        tos2++;
        return temp;
    }

    boolean isEmpty(){
        if(tos2 == -1)
            return true;
        else
            return false;    
    }

    void displayStack1() {
        for (int i = tos1; i > -1; i--)
            System.out.println(twostack[i]);
    }
    void displayStack2() {
        for (int i = tos2; i < Maxsize; i++)
            System.out.println(twostack[i]);
    }

    public static void main(String args[]) {

        
        int choice,e;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int s = in.nextInt();
        TwoStack obj = new TwoStack(s);
        do
        {
            System.out.println("1.PushStack1\n2.PushStack2\n3.PopStack1\n4.PopStack2\n5.DisplayStack1\n6.DisplayStack2\n0.Exit");
            choice = in.nextInt();
            switch(choice){

                    case 1:
                            if(!obj.isFull()){
                                System.out.println("Enter Data:");
                                e = in.nextInt();
                                obj.push1(e);
                                System.out.println("Pushed in Stack1!!");
                            }else
                                System.out.println("Stack1 Full!!");
                    break;
                    
                    case 2:
                            if(!obj.isFull()){
                                System.out.println("Enter Data:");
                                e = in.nextInt();
                                obj.push2(e);
                                System.out.println("Pushed in Stack2!!");
                            }else
                                System.out.println("Stack2 Full!!");
                    break;                       
                    
                    case 3:
                            if(!obj.isEmpty()){
                                e = obj.pop1();
                                System.out.println("Poped from Stack1:"+e);
                            }else
                                System.out.println("Stack Underflow!!");
                    break;
                    
                    case 4:
                            if(!obj.isEmpty()){
                                e = obj.pop2();
                                System.out.println("Poped from Stack2:"+e);
                            }else
                                System.out.println("Stack Underflow!!");
                    break;

                    case 5:
                            if(!obj.isEmpty()){
                                System.out.println("Display Stack1 Elements:");
                                obj.displayStack1();
                            }else
                                System.out.println("Stack1 Empty");
                    break;            
                    
                    case 6:
                            if(!obj.isEmpty()){
                                System.out.println("Display Stack2 Elements:");
                                obj.displayStack2();
                            }else
                                System.out.println("Stack2 Empty");
                    break;
                    
                    case 0:
                            System.out.println("Exiting..");
                    break;
                    
                    default:
                            System.out.println("Wrong Choice Selected");
                    break;                            
            }
        }while(choice != 0);
        
    }

}