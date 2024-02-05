// class doublyLinkedlist{

//     public static class Node{
//         int val;
//         Node next;
//         Node prev;

//         Node(int val){
//             this.val = val;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     // delete at the starting:
//     public static void deleteAtstart(Node head){
//         head = head.next;
//         head.prev = null;
//     }
    
//     //delete at End or delete the tail:
//     // whenever head is given but tail is not:
// public static void deleteAtEnd(Node head){
//     Node temp = head;
//     while(temp.next.next != null){
//         temp = temp.next;

//     }
//     temp.next = null;
// }

// public static void deleteAtIdx(Node head,int idx){
//     Node temp = head;
//     for(int i=1; i<=idx-1; i++){
//         temp = temp.next;
//     }
//    temp.next = temp.next.next;
//    temp.next.prev = temp;
// }


// public static void display1(Node head){
//     Node temp = head;;
//     while(temp != null){
//         System.out.print(temp.val+" ");
//         temp = temp.next;
//     }
//     System.out.println();
// }


//      public static void main(String[] args) {
//         Node a = new Node(4);
//         Node b= new Node(5);
//         Node c= new Node(6);
//         Node d= new Node(7);
//         Node e = new Node(8);
//         a.prev = null;
//         a.next = b;
//         b.prev = a;
//         b.next = c;
//         c.prev = b;
//         c.next = d;
//         d.prev = c;
//         d.next = e;
//         e.prev = d;
//         e.next = null;

//         display1(a);
//         deleteAtIdx(a,2);
//         // deleteAtEnd(a);
//         display1(a);
     

//     }
    
// }

