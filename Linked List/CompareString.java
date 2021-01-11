/*
Given two strings, represented as linked lists (every character is a node in a linked list).
Write a function compare() that works similar to strcmp(),
i.e., it returns 0 if both strings are same, 1 if first linked list is lexicographically greater,
and -1 if the second string is lexicographically greater

Input: list1 = g->e->e->k->s->a
       list2 = g->e->e->k->s->b
Output: -1
*/

// Java program to compare two strings represented as a linked list 
public class CompareString {
    
	Node head; // head of list 
	public static Node a, b;     
	static class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{ 
		this.data = data;
	}
}
	public int compare(Node node1, Node node2) { 
		if (node1 == null && node2 == null) { 
			return 1; 
		} 
		while (node1 != null && node2 != null && node1.data == node2.data) { 
			node1 = node1.next; 
			node2 = node2.next; 
		} 

		// if the list are different in size 
		if (node1 != null && node2 != null) { 
			return (node1.data > node2.data ? 1 : -1); 
		} 

		// if either of the list has reached end 
		if (node1 != null && node2 == null) { 
			return 1; 
		} 
		if (node1 == null && node2 != null) { 
			return -1; 
		} 
		return 0; 
	} 

	public static void main(String[] args) { 

		CompareString list = new CompareString(); 
		//Node result = null; 

		a = new Node('g');
		a.next = new Node('e');
		a.next.next = new Node('e');
		a.next.next.next = new Node('k');
		a.next.next.next.next = new Node('s');
		a.next.next.next.next.next = new Node('b');

		b = new Node('g'); 
		b.next = new Node('e'); 
		b.next.next = new Node('e'); 
		b.next.next.next = new Node('k'); 
		b.next.next.next.next = new Node('s'); 
		b.next.next.next.next.next = new Node('a'); 

		int value; 
		value = list.compare(a, b); 
		System.out.println("String Compare in Linked list "+value); 

	} 
} 