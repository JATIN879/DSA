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

//     //Insertion At Head in DLL:
//     public static Node InsertAtHead(Node head,int x){
//         Node newNode  = new Node(x);
//         newNode.next = head;
//         newNode.prev = null;
//         head.prev = newNode;
//         head = newNode;
//         return head;
//     }


//     //Insertion At Tail in DLL:
//     public static void InsertAtTail(Node head, int x){
//         Node temp = head;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         Node newNode = new Node(x);
//         temp.next = newNode;
//         newNode.prev = temp;
//     }


     
//     //insert At Middle means At any idx;
//     public static void insertAtIdx(Node head,int idx,int val){
//        Node temp = head;
//        for(int i=1; i<=idx-1; i++){
//         temp = temp.next;
//        }
//        Node newNode = new Node(val);
//        temp.next.prev = newNode;
//        newNode.prev = temp;
//        newNode.next = temp.next;
//        temp.next = newNode;
//     }
    

     
//     public static void display1(Node head){
//         Node temp = head;;
//         while(temp != null){
//             System.out.print(temp.val+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

 

//     public static void main(String[] args) {
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
//         // Node newHead = InsertAtHead(a,30);
//         display1(a);
//         // InsertAtTail(a,30);
//         insertAtIdx(a,2,88);
//         display1(a);
     

//     }
    
// }
