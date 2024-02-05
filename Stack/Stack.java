import java.util.*;
class stack{
  
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();//built in stack..

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(34);

    //peek() : return topMost value of stack..
   // System.out.println(st.peek());
   System.out.println(st);
//    st.pop();
//    System.out.println(st);
//    st.pop();
//    System.out.println(st);
   System.out.println("size is "+st.size());


    } 
}