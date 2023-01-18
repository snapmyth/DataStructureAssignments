import java.util.*;
class Stack {
    int array[], tos, maxsize;

    public void createStack(int size){
        array = new int[size];
        maxsize = size;
        tos = -1;
    }

    public void push(int data) {
        if(tos == maxsize-1 ){
            System.out.println("Stack Full");
        }
        else{
        tos++;
        array [tos] = data;
        }
    }

    public void pop(){
        if(tos == -1){
            System.out.println("Stack Empty");
        }
        else{
            tos--;
        }
    }

    public void peek() {
        if(tos == -1){
            System.out.println("Stack Empty");
        }
        else{
            System.out.println("@Top: "+array[tos]);
        }
    }

    public void print() {
        for(int i = tos; i>-1; i--){
            System.out.println(array[i]);
        }
    }

    public static void main(String[]args){
        Stack obj = new Stack();
        Scanner in = new Scanner(System.in);
        int data,choice,size;
        System.out.println("Enter Size: ");
        size = in.nextInt();
        obj.createStack(size);
        do{
            
            System.out.println("1.Push\n2.POP\n3.Peek\n4.Print\n0.Exit");
            System.out.println("Enter your choice: ");
            choice = in.nextInt();

            switch(choice){
                case 1: 
                        System.out.println("Enter your data: ");
                        data = in.nextInt();
                        obj.push(data);
                        System.out.println("Data Pushed");
                        break;
                    
                case 2:
                        obj.pop();
                        break;
                
                case 3:
                        obj.peek();
                        break;

                case 4:
                        obj.print();
                        break;
                
                default:
                        System.out.println("Exiting..... ");
            }
          }  while(choice != 0);
         


            }

        
    }