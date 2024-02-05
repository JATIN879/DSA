class implementaion{


    public static void display1(Node head){
        Node temp = head;;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
   

    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
 
    }


    // this is for kisi bhi node se poori list printing from start
    public static void dispRandom(Node randomNode){
        Node temp = randomNode;

        //move this temp backwords to the head
        while(temp.prev != null){
            temp = temp.prev;

        }//ab temp head pr aa chuka hai;
        //ab list print krenge
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
       

    }


    


    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev =  null;
        }
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
        
    // display1(a);
    // displayrev(e);
    dispRandom(e);

        
        
    }
}