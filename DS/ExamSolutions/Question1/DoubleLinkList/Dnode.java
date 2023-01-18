package DoublyLinkedList;

//Creating a Dnode 
public class Dnode
{
    int data;
    Dnode left,right;
    //Constructor Dnode initailization
    public Dnode(int data)
    {
        this.data=data;
        left=right=null;
    }
}