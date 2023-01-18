package DoublyLinkedList;

public class DoubleLinkList{
    Dnode root;
    // Dnode rooteven;
    // Dnode rootodd;

    public void createDoubleLinkList(){
        root = null;
    }

    public void insertAtRight(int data){
        
        Dnode n = new Dnode(data);
        if(root == null){
            root = n;
        }else{
            Dnode t = root;
            while(t.right != null)
                t.right = t;
            t.right = n;
            n.left = t;    
        }
    }

    public void printTraverse(){
        if(root == null){
            System.out.println("List Empty!!");
        }else{
            Dnode temp;
            temp = root;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.right;
            }
        }
    }

    /*public void insertEven(int data){
        Dnode n = new Dnode(data);
        if(rooteven = null){
            rooteven = n;
        }else{
            Dnode t = rooteven;
            while(t.right != null)
                t = t.right;
            t.right = n;
            n.left = t;    
        }

    }
   
    public void insertOdd(int data){
        Dnode n = new Dnode(data);
        if(rootodd = null){
            rootodd = n;
        }else{
            Dnode temp = rootodd;
            while(temp.right != null)
                temp = temp.right;
            temp.right = n;
            n.left = temp;    
        }

    } */
    
    public void printList(Dnode num){
        Dnode temp = num;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.right;
            }
        } 
    

    public void countNodes(){
        if(root == null){
            System.out.println("List Empty!!");
        }else{
            Dnode t;
            int count = 0;
            t = root;
            while(t != null){
                t = t.right;
                count++;
            }
            System.out.println("Total Nodes in List:"+count);
        }
    }

    /*public void splitList(){
        if(root == null){
            System.out.println("List Empty");
        }else{
            Dnode t;
            t = root;
            int c = 0;
            while(t != null){
                if(c % 2 == 0){
                    insertEven(t.data);
                    c++;
                }else{
                    insertOdd(t.data);
                    c++;
                }
                t = t.right;
            }
        }
    }*/

    public void splitList(){

        Dnode even,odd;
        even = odd = null;
        Dnode teven,todd;
        teven = todd = null;
        Dnode t;
        t = root;
        Dnode current = null;

        while(t.right != null){
            root.data = t.data;
            root.left = null;
            root.right = null;

            if(t.data % 2 == 0){
                if(even == null){
                    even = root;
                    teven = root;
                    t = t.right;
                }else{
                    current = even;
                    while(current.right != null){
                        current = current.right;
                    }
                    current.right = root;
                    teven = root;
                    root.left = current;
                    t = t.right;
                }
            }else{
                if(odd == null){
                    odd = root;
                    todd = root;
                    t = t.right;
                }else{
                    current = odd;

                    while(current.right != null){
                        current = current.right;
                    }
                    current.right = root;
                    todd = root;
                    root.left = current;
                    t = t.right;
                }
            }
        }

        if(t != null){
            root.data = t.data;
            root.left = null;
            root.right = null;

            if(t.data % 2 == 0){
                current = even;
                while(current.right != null){
                    current = current.right;
                }
            }
            current.right = root;
            teven = root;
            root.left = current;
        }else{
            current = odd;

            while(current.right != null){
                current = current.right;
            }
            current.right = root;
            todd = root;
            root.left = current;
        }
    } 
}
