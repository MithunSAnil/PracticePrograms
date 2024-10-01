class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    head = None
    def addNode(self, value):
        newNode = Node(value)
        if(self.head == None):
            self.head = newNode
        else:
            temp = self.head
            while(temp.next != None):
                temp = temp.next
            temp.next = newNode

    def display(self):
        temp = self.head
        while(temp != None):
            print(temp.value, end = " -> ")
            temp = temp.next
        print("null")
class Main:
    list1 = LinkedList()
    list1.addNode(5)
    list1.addNode(7)
    list1.addNode(8)
    list1.display()
    
