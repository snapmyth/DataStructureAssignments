import java.util.*;
public class EmployeeManagementSystem {

    public static void main(String args[]){
        
        int choice;
        LinkedListLinear obj = new LinkedListLinear();

        do{
            System.out.println("\n1.Add Employee\n2.Delete Employee\n3.Search Employee\n4.Print All Employee info\n5.Exit");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice){

                case 1:
                        System.out.println("1.Add at Start\n2.Add at End\n3. In Between");
                        int add = sc.nextInt();
                        switch(add){
                            case 1: 
                            {
                                    System.out.println("Enter Employee Info");
                                    System.out.println("Enter Employee Id");
                                    int id = sc.nextInt();
                                    System.out.println("Enter Employee Name");
                                    String name = sc.next();
                                    System.out.println("Enter Employee Age");
                                    int age = sc.nextInt();
                                    System.out.println("Enter Employee Salary");
                                    double sal = sc.nextDouble();
                                    System.out.println("Enter Employee Commission");
                                    double comm = sc.nextDouble();
                                    obj.insertLeft(id,name,age,sal,comm);
                                    break;
                            }
                            case 2: 
                            {
                                    System.out.println("Enter Employee Info");
                                    System.out.println("Enter Employee Id");
                                    int id = sc.nextInt();
                                    System.out.println("Enter Employee Name");
                                    String name = sc.next();
                                    System.out.println("Enter Employee Age");
                                    int age = sc.nextInt();
                                    System.out.println("Enter Employee Salary");
                                    double sal = sc.nextDouble();
                                    System.out.println("Enter Employee Commission");
                                    double comm = sc.nextDouble();
                                    obj.insertRight(id,name,age,sal,comm);
                                    break;
                            }
                            case 3:
                            {
                                    System.out.println("Enter Employee ID after which you want to insert the Employee Info");
                                    int e = sc.nextInt();
                                    System.out.println("Enter Employee Info");
                                    System.out.println("Enter Employee Id");
                                    int id = sc.nextInt();
                                    System.out.println("Enter Employee Name");
                                    String name = sc.next();
                                    System.out.println("Enter Employee Age");
                                    int age = sc.nextInt();
                                    System.out.println("Enter Employee Salary");
                                    double sal = sc.nextDouble();
                                    System.out.println("Enter Employee Commission");
                                    double comm = sc.nextDouble();
                                    obj.insertAfter(e,id,name,age,sal,comm);
                                    break;
                            }
                            default:
                                    System.out.println("Wrong Choice Selected");
                                    break;            
                        }
                break;

                case 2:
                        System.out.println("1.Delete Start\n2.Delete End\n3.In Middle");
                        int delete = sc.nextInt();
                        switch(delete){

                            case 1:
                                    obj.deleteLeft();
                                    break;
                            
                            case 2:
                                    obj.deleteRight();
                                    break;
                                    
                            case 3:
                                    System.out.println("Enter Employee id to be deleted");
                                    int id = sc.nextInt();
                                    obj.deleteKeyBased(id);
                                    break;
                            
                            default:
                                    System.out.println("Wrong Choice Selected");
                        }
                break;
                
                case 3:
                        System.out.println("Enter Employee Id");
                        int search = sc.nextInt();
                        obj.searchList(search);
                break;

                case 4:
                        System.out.println("Print Employee\n1.All Employees\n2.Specfic Employee");
                        int c = sc.nextInt();
                        switch(c){
                                
                                case 1:
                                        obj.printList();
                                        break;
                                
                                case 2:
                                {
                                        System.out.println("Enter Specific Employee id");
                                        int key = sc.nextInt();
                                        obj.printSpecificList(key);
                                        break;
                                }
                                
                                default :
                                        System.out.println("Wrong Choice Selected");
                        }
                break;
                
                case 5:
                        System.out.println("Exiting");
                break;

                default:
                        System.out.println("Wrong Choice Selected");

                        }
            }while(choice != 5);
        }

    }
