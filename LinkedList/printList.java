// class LinkedList{

//     public static class Node{
//     int data;
//     Node next;
//     public Node(int data){
//       this.data = data;
//       this.next = null;
//     }
//  }

// //PRINT LL BY USING ONLY GIVEN HEAD OF THE LL;
// public static void printList(Node head){
//   while(head!=null){
//     System.out.print(head.data+" ");
//     head=head.next;
//   }
//   // temp ya head node ham isliye banate hain taaki head ka data reserve rahe agr esa nhi karenge to head gayab ho jayega dobara print krne pr  
// }





// //PRINT LIST RECURSIVELY:
// public static void printRecursively(Node head){
//   if(head==null){//base case
//     return;
//   }
  
//   System.out.print(head.data+" "); 
//   printRecursively(head.next);
// }





//   public static void main(String[] args) {
//   Node a = new Node(1);
//   System.out.println(a.next);//null
//   Node b = new Node(2);
//   Node c = new Node(3);
//   Node d = new Node(100);
//   Node e = new Node(5);
//   a.next = b; //1-> 2  3  4  5
//   b.next = c; //1-> 2-> 3  4  5
//   c.next = d; //1-> 2-> 3->  4  5
//   d.next = e; //1-> 2-> 3-> 4-> 5
//    printList(a);
//  // System.out.println();
//   printRecursively(a);
// }
// }
