public class implementation{

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            // this.next =  null;
        }
    }



public static class linkedList{
        Node head = null;
        Node tail = null;
        int size = 0;


 //LINKEDLIST INSERT AT END FUNCTION:       
void insertAtEnd(int data){
    Node newnode = new Node(data);

    //if list is empty::
    if(head == null){
        head = newnode;
    }

//ye tabhi valid hoga jab ll pehle se exist karegi
    else{
        tail.next = newnode;//yahan tail newnode  se connect ho jayegi or usi ko point karegi:
}
tail = newnode ;//ab tail new node jo add hua hai uspr point krega:
size++;
} 



// LINKEDLIST INSERT NODE AT BEGGiNING:
void insertAtBegg(int data){
    Node stNode = new Node(data);
    if(head == null){  //empty list
        head = tail = stNode;
    }
    else{     //non-empty list
    stNode.next = head;
    head  = stNode;
    
    }
    size++;
}



// INSERT NODE AT ANY INDEX IN LINKEDLIST
void insertAtIdx(int idx, int data){
     Node nayaNode = new Node(data);
     Node temp = head;

    //  for insert at end position::
     if(idx == size){
        insertAtEnd(data);
        return;
     }

    //  in case of 0th index:
     else if(idx < 0 || idx > size){
        System.out.println("wrong idx");
        insertAtBegg(data);
        return;

     }

    
    //  insert at any idx:
     for(int i=1; i<=idx-1; i++){
        temp = temp.next;
        nayaNode.next = temp.next;
        temp.next = nayaNode;
        size++;

     }

}


//GET ELEMENT FROM ANY INDEX::
int getAtidx(int idx){

    //  in case of 0th index:
    if(idx < 0 || idx > size){
    System.out.println("wrong idx");
    return -1;
    }

    Node temp = head;
    for(int i=1; i<=idx; i++){
     temp = temp.next;
    }
    return temp.data;
}


//LINKEDLIST DISPLAY:
void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+" ");
       temp  = temp.next;
    }
}


//lINKEDLIST SIZE:
// int size(){      //O(n)
//     int size =0;
//     Node curr = head;
//     while(curr!=null){
//         size++;
//     curr = curr.next;
// }
//     return size;
// }
// }




//DELETION IN LINKEDLIST AT ANY IDX:
void deleteAtIdx(int idx){
 Node currNode = head;
if(idx==0){
    head = head.next;
    size--;
    return;
}

 for(int i=1; i<=idx-1; i++){
    currNode =  currNode.next;
}
currNode.next = currNode.next.next;
tail = currNode;
size--;

}


    public static  void main(String[] args){
        linkedList ll = new linkedList();
       ll.insertAtEnd(30);
       ll.insertAtEnd(35);
       ll.insertAtEnd(40);
       ll.insertAtEnd(45);
       ll.insertAtEnd(50);
       ll.insertAtEnd(12);
       ll.insertAtBegg(5);
       // ll.insertAtIdx(7,77);
       ll.display();
       System.out.println();
      //System.out.println( ll.size());
      //System.out.println(ll.getAtidx(5));


//  System.out.println(ll.tail.data);
//  System.out.println(ll.head.data);


ll.deleteAtIdx(0);
 ll.display();
 System.out.println();
System.out.println(ll.tail.data);
// jab abhi kabhi last idx ko delete kr  rahe hain so it is very very important jo mera last  se pehle wala ek idx haina usko hame tail se again update krna pdega becoz wo ab naya tail ban chuka hai:

 }
}
}
    
