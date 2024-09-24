import java.util.Scanner;
class Node //Create a class for each individual node
{
    int data; // Each node contains an element with type int for data
    Node next; // It also contains an element of the type Node for the next node

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
// this keyword used to minimize the ambiguity caused when the instance variable and parameter
// have the same name. Eg data = data will cause ambiguity. // Also can be solved by having
// another name for the parameter.

class LList
{
    Node head; //Used to create a null node for the head. ie empty linked list
    public void addNode(int data)
    {
        Node newNode = new Node(data); //Creates a new node as mentioned above
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode; //Connects the end node to the new node
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        LList linkedlist = new LList();
        do{
            System.out.println("Enter the value of the node. To stop, enter 99");
            value = sc.nextInt();
            linkedlist.addNode(value);
        }while(value != 99);
        System.out.println("The linked list is: ");
        linkedlist.display();
    }
}