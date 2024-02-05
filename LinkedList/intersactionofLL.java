public class intersactionofLL{

        
       public static Node intersaction(Node head1,Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int size1 =0;
        while(temp1 != null){
          size1++;
          temp1 = temp1.next;
        }

        int size2 = 0;
        while(temp2 != null){
          size2++;
          temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;
        

        if(size1 > size2){
          int steps = size1 - size2;
          for(int i=1; i<=steps; i++){
            temp1 = temp1.next;
          }
        }

        
        if(size2 > size1){
          int steps = size2 - size1;
          for(int i=1; i<=steps; i++){
            temp2 = temp2.next;
          }
        }

        while(temp1 !=  temp2){
          temp1 = temp1.next;
          temp2 = temp2.next;
        }
        return temp1;

        
       }

       







  public static void display(Node head){
    Node curr = head;
    while(curr!=null){
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
  }





    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =  null;
        }
    }


    public static void main(String[] args) {
    Node a = new Node(100);
    Node b = new Node(13);
    Node c = new Node(4);
    Node d = new Node(5);
    Node e = new Node(12);
    Node f = new Node(10);
    Node g = new Node(87);
 
    a.next = b; //1-> 2  3  4  5
    b.next = c; //1-> 2-> 3  4  5
    c.next = d; //1-> 2-> 3->  4  5
    d.next = e; //1-> 2-> 3-> 4-> 5
    e.next = f;
    f.next = g;
   
    Node l1= new Node(90);
    Node l2= new Node(9);
    Node l3= new Node(5);
    Node l4= new Node(12);
    Node l5= new Node(10);
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;
    l4.next = l5;
    intersaction(a, l1);
    


    

}
}