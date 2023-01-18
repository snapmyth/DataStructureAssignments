class NodeEmployee {
		
    int id;
    String name;
    int age;
    double salary;
    double comm;
    NodeEmployee next;
   
   public NodeEmployee(int id ,String name , int age , double salary , double comm) {
       this.id = id;
       this.name = name;
       this.age = age;
       this.salary = salary;
       this.comm = comm;
       next = null;
   }
   
   public class LinkedListLinear
   {
       NodeEmployee root;
       
       void createLinkedList() {
           root = null;
       }
       
       void insertLeft(int id,String name,int age,double salary,double comm) {
       
           NodeEmployee emp = new NodeEmployee(id,name,age,salary,comm);
           
           if(root == null) {
               root = emp;
           }else {
               emp.next = root;
               root = emp;					
           }
       }
       
       void deleteLeft() {
           
           if(root == null) {
               System.out.println("No Employees were Added!");
           }else {
               
               NodeEmployee t = root;
               root = root.next;
               System.out.println("Employee Details Deleted at start"+t.id);
           }
       }
       
       void insertRight(int id,String name,int age,double salary,double comm) {
           
           NodeEmployee emp = new NodeEmployee(id,name,age,salary,comm);
           
           if(root == null) {
               
               root = emp;
           }else {
               NodeEmployee t = root; //use t to search the list from left to right most
               while(t.next != null) { 
                   t = t.next;
               }
               t.next =emp; // adds the element at end of the list
           }
       }
       
       void deleteRight() {
           
           if(root == null) {
               System.out.println("No Employees were Added!");
           }else {
               
               NodeEmployee t,t2;
               t = t2 = root;
               while(t.next != null) {
                   t2 = t;
                   t = t.next;
               }
               t2.next = null;
               System.out.println("Employee Details Deleted at end");
           }
       }
       
       void printList() {
           if(root == null) {
               System.out.println("No Employees were Added!");
           }else {
               NodeEmployee t;
               t = root;
               System.out.println("Id/tName/tAge/tSalary/tCommission");
               while(t != null) {
                   System.out.printf("%d/t%s/t%d/t%.2f/t%.2f/t",t.id,t.name,t.age,t.salary,t.comm);
                   t = t.next;
               }
           }
       }
       
       void countNodes() {
           
           if(root == null){
               System.out.println("No Employees were Added!");
           }else {
               
               NodeEmployee t;
               int c = 0;
               t = root;
               while(t != null) {
                   t = t.next;
                   ++c;
               }
               System.out.println("Total Employees in list are:"+c);
           }
       }
       
       void searchList(int key) {
           
           if(root == null) {
               System.out.println("No Employees were Added!");
           }else {
               NodeEmployee t;
               int c = 0;
               t = root;
               while(t != null && t.id != key) {
                   t = t.next;
                   ++c;
               }
               if(t != null)
                   System.out.println("Found at "+c+"from the root");
               else
                   System.out.println("Not found");
           }
       }

       void printSpecificList(int key) {
        if(root == null){
            System.out.println("No Employees were Added!");
        }else{
            NodeEmployee t;
            t = root;
            int found = 0;
            while(t != null){
                t = t.next;
                if(t.id == key){
                    found = 1;
                    System.out.println("Employee id"+t.id+",Name"+t.name+", Age "+t.age+", Salary "+t.salary+", Commission "+t.comm);
                    break;
                }
            }
            if(found != 1){
                System.out.println("Not Found");
            }
        }

       }
       
       void deleteKeyBased(int key) {
           
           if(root == null) {
               System.out.println("No Employees were Added!");
           }else {
               NodeEmployee t,t2;
               t = t2 = root;
               while(t != null && t.id != key) {
                   t2 = t;
                   t = t.next;
               }
               if(t == null)
                   System.out.println("Not found");
               else {
                   if(t == root) {
                       root = root.next;
                   }
                   else if(t.next == null) {
                       t2.next = null;
                   }
                   else {
                       t2.next = t.next;
                   }
                   System.out.println("Specfic Employee Detials Deleted");
               }
           }	
       }
       
       void insertAfter(int key , int id,String name,int age,double salary,double comm) {
           
           if(root == null) {
               System.out.println("No Employees were Added!");
           }else {
               NodeEmployee t;
               t = root;
               while(t != null && t.id != key) {
                   t = t.next;
               }
               if(t == null)
                   System.out.println("Element not found");
               else {
                   NodeEmployee emp = new NodeEmployee(id,name,age,salary,comm);
                   emp.next = t.next;
                   t.next = emp;
               }
           }
       }
   }
   
   
   
}