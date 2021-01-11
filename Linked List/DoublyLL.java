import java.util.Scanner;

public class DoublyLL {
    DLLNode headNode;
    int count=0;
    void insert(int newData){
        DLLNode newNode = new DLLNode(newData);
        if(headNode==null){
            headNode = newNode;
            return;
        }
        DLLNode tempNode = headNode;
        while(tempNode.next!=null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        newNode.prev  = tempNode;
    }
    void deleteAtBegin(){
        if(headNode.next==null){
        headNode = null;
        return;
    }
        DLLNode tempNode = headNode;
        headNode = tempNode.next;    
        headNode.prev = null;
    }
    void deleteAtEnd(){
        if(headNode.next==null) {
        headNode = null;
        return;
    }
        DLLNode tempNode = headNode;
        while(tempNode.next!=null){
            tempNode = tempNode.next;
        }
        tempNode = tempNode.prev;
        tempNode.next = null;
    }
    void delete(int deleteData){
        DLLNode tempNode = headNode;
        if(tempNode!=null && tempNode.data==deleteData){
            headNode = tempNode.next;
            headNode.prev = null;
            return;
        }
        while(tempNode.next!=null && tempNode.next.data!=deleteData){
            tempNode = tempNode.next;
        }
        //if last node 
        if(tempNode.next.next==null){
            tempNode.next = null;
        }
        DLLNode nextNode = tempNode.next.next;
        tempNode.next    = nextNode;
        nextNode.prev    = tempNode;
    }
    //Reverse List
    void reverseList(){
        DLLNode currentNode=headNode, prev=null, tempNode=null;
        while(currentNode!=null){
            tempNode            = currentNode.next;
            currentNode.next    = prev;
            prev                = currentNode;
            currentNode         = tempNode;
        }
        headNode    = prev;
        return;
    }
    //Count: number of node is presented!!!
    void length(){
        DLLNode countNode = headNode;
        while(countNode!=null){
            count++;
            countNode = countNode.next;
        }
        System.out.println("Number of LL Node : "+count);
        return;
    }
    void printList(){
        DLLNode tempNode = headNode;
        while(tempNode!=null){
            System.out.print(tempNode.data+"-->");
            tempNode = tempNode.next;
        }
        System.out.println(" ");
    }
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        while(true){
            System.out.println("1. Insert the data");
            System.out.println("2. Delete the data");
            System.out.println("3. Reverse the List");
            System.out.println("4. Length of the List");
            System.out.println("5. Show the List");
            System.out.println("6. Exit");
            System.out.println("Enter any number : ");
            int n = scanner.nextInt();
            if(n==6)
            break;
            else{
            switch(n){
            //Insertion operation
            case 1 :    System.out.println("Enter the number to insert data");
                        int insertData = scanner.nextInt();
                        doublyLL.insert(insertData);
                        doublyLL.printList();
                        break;
            //Deletion operation 
            //case 2:     doublyLL.deleteAtBegin();
            //case 2:     doublyLL.deleteAtEnd();
            //*
            case 2:     System.out.println("Which data, You want to delete");
                        int dData = scanner.nextInt();
                        doublyLL.delete(dData);
                        doublyLL.printList();
                        break;      //*/
            //Reverse of Linked List
            case 3:     doublyLL.reverseList();
                        doublyLL.printList();
                        break;
            //Length of Linked List
            case 4:     doublyLL.length();
                        doublyLL.printList();
                        break;
            //Traversal operation     
            case 5:     doublyLL.printList();
                        break;
        }
       }
     }
    }
}
