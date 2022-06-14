package linkedList;

//Java program to detect
//and remove loop in linked list

class DetectAndRemoveLoop {

 static Node head;

 static class Node {

     int data;
     Node next;

     Node(int d)
     {
         data = d;
         next = null;
     }
 }

 // Function that detects loop in the list
 void detectAndRemoveLoop(Node head)
 {
	 if(head == null || head.next == null) {
		 return;
	 }
	 
	 Node hare = head;
	 Node turtle = head;
	 boolean cycleExist = false;
	 while(hare.next != null && hare.next.next != null) {
		 hare = hare.next.next;
		 turtle = turtle.next;
		 
		 if(hare == turtle) {
			 cycleExist = true;
			 break;
		 }
	 }
	 
	 if(cycleExist) {
		 turtle = head;
		 if(hare != turtle) {
			 while(hare.next != turtle.next) {
				 hare = hare.next;
				 turtle = turtle.next;
			 }
			 
			 hare.next = null;
		 }else {
			 while(hare.next != turtle) {
				 hare = hare.next;
			 }
			 hare.next = null;
		 }
	 }
	 
 }

 // Function to print the linked list
 void printList(Node node)
 {
     while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
     }
 }

 // Driver code
 public static void main(String[] args)
 {
	 DetectAndRemoveLoop list = new DetectAndRemoveLoop();
     list.head = new Node(50);
     list.head.next = new Node(20);
     list.head.next.next = new Node(15);
     list.head.next.next.next = new Node(4);
     list.head.next.next.next.next = new Node(10);

     // Creating a loop for testing
     head.next.next.next.next.next = head.next.next;
     list.detectAndRemoveLoop(head);
     System.out.println("Linked List after removing loop : ");
     list.printList(head);
 }
}
