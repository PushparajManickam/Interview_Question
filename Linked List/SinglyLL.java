import java.util.Scanner;
//Singly Linked List
public class SinglyLL {
    Node headNode;
    int count=0;
    //Insert
    void insert(int newData){
        Node newNode = new Node(newData);
        //newNode.next = null;
        if(headNode==null){
            headNode = newNode;  
            return;
        }
        Node tempNode = headNode;
        while(tempNode.next!=null){
            tempNode=tempNode.next;
        }
        tempNode.next   = newNode;
        return;
    }
    //Insert at Beginning node of the linked list
    void insertAtBegin(int newData){
        Node newNode    = new Node(newData);
        newNode.next    = headNode;
        headNode        = newNode;
        return;
    }
    //Insert at last node of the Linked list
    void insertAtLast(int newData){
        Node newNode    = new Node(newData);
        if(headNode==null){
            headNode    = newNode;
            return;
        }
        //newNode.next=null;
        Node tempNode   = headNode;
        while(tempNode.next!=null){
          tempNode = tempNode.next;  
        }
        tempNode.next   = newNode;
        return;
    }
    //Insert at Specific Position node of the linked list
    void insertAtSpecific(int position, int newData){
        Node newNode    = new Node(newData);
        //Position is less than one like zero!!!
        if(position<1){
            System.out.println("Invaild Position");
            return;
        }
        if(position == 1){
            newNode.next= headNode;
            headNode    = newNode;
            return;
        }
        //Position is greater than one like two, three,...!!!
        Node tempNode = headNode;
        for(int i=1;i<position;i++){
            tempNode = tempNode.next;
        }
        Node preNode    = tempNode.next;
        tempNode.next   = newNode;
        newNode.next    = preNode;
        return;
    }
    //Delete at Beginning node of the linked list
    void deleteAtBegin(){
        headNode = headNode.next;
        return;
    }
    //Delete at last node of the Linked list
    void deleteAtLast(){
        if(headNode.next==null){
            headNode = null;
            return;
        }
        Node temp = headNode;
        while(temp.next!=null){}
        temp = null;
        return;
    }
    //Delete at Specific Position node of the linked list
    void deletetAtSpecific(int position, int newData){
        if(position==1){
            headNode = headNode.next;
            return;
        }
        Node tempNode = headNode;
        for(int i=1; i<position; i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        return;
    }
    //Delete at Specific Position node of the linked list
    void deleteSpecificData(int deleteData){
        if(headNode!=null && headNode.data==deleteData){
            headNode = headNode.next;
            return;
        }
        Node tempNode = headNode;
        while(tempNode.next!=null && tempNode.next.data!=deleteData)
            tempNode = tempNode.next;
        if(tempNode.next==null)
            return ;
        tempNode.next = tempNode.next.next;
        return;
    }
    //If check value is presented or not!!!
    boolean checkValue(int currentData){
        Node tempNode = headNode;
        while(tempNode!=null){
            if(tempNode.data == currentData)
                return true;
            tempNode = tempNode.next;
        }
        return false;
    }
    //Reverse List
    void reverseList(){
        Node currentNode=headNode, prev=null, tempNode=null;
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
        Node countNode = headNode;
        while(countNode!=null){
            count++;
            countNode = countNode.next;
        }
        System.out.println("Number of LL Node : "+count);
        return;
    }
    //Remove the duplicate node
    void removeDuplicate(){

    }
    //Remove Nth from last (method is [Length-nth+1])
    void nThfromLast(){

    }
    //Find Middle of Node
    void middleNode(){

    }
    //Sum of Listed List
    void sumLL(){
        
    }
    //Traversal Linked list
    void printList(){
        Node traversalNode = headNode;
        System.out.println("\nLinked List : ");
        while(traversalNode!=null){
            System.out.print(traversalNode.data+"-->");
            traversalNode = traversalNode.next;
        }
        System.out.println("\n");
        return;
    }
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SinglyLL singlyLL = new SinglyLL();
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
                    singlyLL.insert(insertData);
                    singlyLL.printList();
                    break;
        //Deletion operation 
        case 2:     System.out.println("Which data, You want to delete");
                    int dData = scanner.nextInt();
                    singlyLL.deleteSpecificData(dData);
                    singlyLL.printList();
                    break;
        //Reverse of Linked List
        case 3:     singlyLL.reverseList();
                    singlyLL.printList();
                    break;
        //Length of Linked List
        case 4:     singlyLL.length();
                    singlyLL.printList();
                    break;
        //Traversal operation     
        case 5:     singlyLL.printList();
                    break;
    }
   }
 }
 scanner.close();
}
}