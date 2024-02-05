class LinkedList{


  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      //this.next = null;
    }
 }

 // PRINT REVERSE LIST RECURSIVELY:
public static Node  REVERSE(Node head){
  if( head.next == null){
    return head;
  }
  Node newHead = REVERSE(head.next);
  REVERSE(head.next);//FUCNTION KHATM HONE KE BAAD WHA JATA HAI JAHA SE USKO CALL LGAYI THI, FIR USKE BAAD KI LINE KO EXECUTE KRTA HAI 
  head.next.next = head;//connection interchanging condition:
  return newHead;
  
}

// PRINT NORMAL LIST BY USING RECURSION
public static void printListRc(Node head){
    if(head == null){
        return;
    }
     System.out.println(head.data);
     printListRc(head.next);

}


  public static void main(String[] args) {
  Node a = new Node(1);//null
  Node b = new Node(2);
  Node c = new Node(3);
  Node d = new Node(10); 
  Node e = new Node(5);
  a.next = b; //1-> 2  3  4  5
  b.next = c; //1-> 2-> 3  4  5
  c.next = d; //1-> 2-> 3->  4  5
  d.next = e; //1-> 2-> 3-> 4-> 5
  
 a = REVERSE(a);
  printListRc(a);
  
}
}
