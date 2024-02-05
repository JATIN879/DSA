class LinkedList{


  public static class Node{
    int data;//value
    Node next;//address of next node
    // ye agle ka address store krta hai
    public Node(int data){
      this.data = data;
      this.next = null;
    }
 }

/*NOTE : **jis bhi node ka address agar null hai 
to use tail kahenge and wha ll kahatm ho jayegi 
*/




//PRINT LL BY USING ONLY GIVEN HEAD OF THE LL;
public static void printList(Node head){
  while(head!=null){
    System.out.print(head.data+" ");
    head=head.next;
  }
  // temp ya head node ha isliye banate hain taaki head ka data reserve rahe agr esa nhi karenge to head gayab ho jayega dobara print krne pr  

  
}


//PRINT LIST RECURSIVELY:
public static void printRecursively(Node head){
  if(head==null){//base case
    return;
  }
  System.out.print(head.data+" "); 
  printRecursively(head.next);
  
}


// PRINT REVERSE LIST RECURSIVELY:
public static void REVERSE(Node head){
  if(head==null){//base case
    return;
  }
  REVERSE(head.next);//FUCNTION KHATM HONE KE BAAD WHA JATA HAI JAHA SE USKO CALL LGAYI THI, FIR USKE BAAD KI LINE KO EXECUTE KRTA HAI 
  System.out.print(head.data+" "); 
  
}









  public static void main(String[] args) {
  Node a = new Node(1);
  System.out.println(a.next);//null
  Node b = new Node(2);
  Node c = new Node(3);
  Node d = new Node(100);
  // Node e = new Node(5);
  a.next = b; //1-> 2  3  4  5
  b.next = c; //1-> 2-> 3  4  5
  c.next = d; //1-> 2-> 3->  4  5
  //d.next = e; //1-> 2-> 3-> 4-> 5
  printList(a);
  System.out.println();
  printRecursively(a);
  System.out.println();
  REVERSE(a);

  


  //DISPLAY LL USING LOOPS:
  //Node temp =  a;
  // for(int i=1; i<=5; i++){
  //   System.out.print(temp.data + " ");
  //   temp = temp.next; //ye 'b' ke poore node ko point kr rha hai
                        //not just 'b' ki value'
  //   // OR
  //   // temp = b;
  // }
  




//DISPLAY A LL RECURSIVELY:




  
}
}