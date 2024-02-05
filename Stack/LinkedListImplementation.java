//stack implementation using linkedlist
public class LinkedListImplementation {

    public static class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    


    public static class LLStack{//user defined Data Structure:
       Node head = null;
       int size = 0;
    
    void push(int x){

      Node temp = new Node(x);
      temp.next = head;
      head = temp;
      size++; //bcoz we are adding one ele at a time:

}




  void displayRevStack(){
   Node temp = head;
   while(temp != null){
   System.out.print(temp.val+ " ");
   temp = temp.next;

   } 
   System.out.println();
}



//this is the helper function for doing recursion of the display function
void displayRec(Node head){
   if (head == null){
    return;
   }
   displayRec(head.next);
   System.out.print(head.val+" ");
}


//we cant pass head here if we pass then whole ll changes occured thats why we using that helper function
void display(){
    displayRec(head);
}



int pop(){
    if(head == null){
      System.out.println("Stack is Empty!"); 
      return -1; 
    }
   int x=  head.val;
   head = head.next;
   return x;

}



int peek(){
    if(head == null){
        System.out.println("stack is empty!");
        return -1;
    }
    return head.val;
}



int size(){    //getter
    return size;
}

boolean isEmpty(){
    if(size == 0){
       return true;
    }
    return false;
}


    public static void main(String[] args) {
        LLStack st =  new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        
}
       

    }
}
