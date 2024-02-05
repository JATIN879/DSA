class doublyLinkedlist{

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

// Ques: Critical point, max and min distance
// kisi bhi critical points k pair ke beech main distance find karna hai... 
//ex given LL: 1 2 5 3 2 7 8 9 1 10 n
//5,2,1 are the critical points..
//maxDist. 6 (between 5 & 1);
//minDist. 2 (between 5 & 2);
 
// local maxima -> if(a1 < a > a2)
// local minima -> if(a1 > a < a2)
public static void CriticalPoint(Node head){
    Node temp =  head;
    while(temp.next != null){
        if((temp.val > temp.prev.val &&  temp.val > temp.next.val) 
           || (temp.val < temp.prev.val &&  temp.val < temp.next.val)){
            break;
        }
        Node c1 = temp;
        while(c1 != null){
            if((c1.val > c1.prev.val &&  c1.val > c1.next.val) 
           || (c1.val < c1.prev.val &&  c1.val < c1.next.val)){
            break;
        }
        Node c2 = c1;

        }

        
        
    }
};
  



public static void display(Node head){
    Node temp = head;;
    while(temp != null){
        System.out.print(temp.val+" <-> ");
        temp = temp.next;
    }
    System.out.println();
}


     public static void main(String[] args) {
        Node a = new Node(4);
        Node b= new Node(5);
        Node c= new Node(6);
        Node d= new Node(7);
        Node e = new Node(8);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        display(a);
        
     

    }
    
}

