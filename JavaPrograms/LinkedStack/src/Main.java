import java.util.Scanner;

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedStack
{
    Node head;
    public void push(int data)
    {
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Integer pop()
    {
        if(head == null)
        {
            return null;
        }
        else if(head.next == null)
        {
            int last = head.data;
            head = null;
            return last;
        }
        else
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            int last = temp.next.data;
            temp.next = null;
            return last;
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp.next != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedStack stack = new LinkedStack();
        while(true)
        {
            System.out.println("1:Push    2:Pop    3:Display    4:Stop" );
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element to push");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    Integer last = stack.pop();
                    System.out.println("Element popped : " + last);
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }

    }
}