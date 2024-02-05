// public class nthNodeFromEnd{

//     public static Node nthNodeFromLast(Node head,int n) {
//         int size = 0;
//         Node temp =  head;
//         while(temp!=null){
//             size++;
//             temp  = temp.next;
//         }

//         if(n > size){
//         System.out.println("node does't exist ");
//         }
//         //nth Node from last  = starting se (size-n+1)th node
//         int m = (size - n + 1);
//         // ab simple starting se mth node nikal denge:
//         temp = head; //temp again on head;
//       for(int i=1; i<=m-1; i++){
//         temp = temp.next;
//       }
//         return temp;
//     }




// // nth Node from end using slow and fast pointer 
//   public static Node nthNode2(Node head, int n){
//    Node slow = head;
//    Node fast = head;

//    for(int i=1; i<=n; i++){
//     fast = fast.next;
//    }
//    while(fast!=null){
//     slow = slow.next;
//     fast = fast.next;
//    }
//    return slow;
    
//   }




//     public static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next =  null;
//         }
//     }


//     public static void main(String[] args) {
//     Node a = new Node(100);
//     Node b = new Node(13);
//     Node c = new Node(4);
//     Node d = new Node(5);
//     Node e = new Node(12);
//     Node f = new Node(10);
 
//     a.next = b; //1-> 2  3  4  5
//     b.next = c; //1-> 2-> 3  4  5
//     c.next = d; //1-> 2-> 3->  4  5
//     d.next = e; //1-> 2-> 3-> 4-> 5
//     e.next = f;
//     Node q = nthNode2(a,4);

    
    

// }
// }