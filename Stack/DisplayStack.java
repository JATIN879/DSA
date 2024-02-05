import java.util.*;
public class DisplayStack {



// print  stack using Recursion...
public static void DisplayRec(Stack<Integer> st){

    //base case....
    if(st.size() == 0 || st.isEmpty()){
        return;
    }
    // step-1 sabse pehle top ele ko nikal lenge
int top = st.pop();
DisplayRec(st);
System.out.print(top+ " ");//print in Normal order
st.push(top);

}



// print reverse stack using Recursion...
public static void DispReverseRec(Stack<Integer> st){

        //base case....
        if(st.size() == 0 || st.isEmpty()){
            return;
        }
        // step-1 sabse pehle top ele ko nikal lenge
 int top = st.pop();
 System.out.print(top+" ");
 DispReverseRec(st);
 st.push(top);

}

    public static void main(String[] args) {
      Stack <Integer> st = new Stack<>();
      st.push(12);
      st.push(13);
      st.push(14);
      st.push(15);
      st.push(16);
      DispReverseRec(st);
      System.out.println();
      DisplayRec(st);
      
    //   Stack <Integer> rt = new Stack<>();
      //printing stack without built-in func..
    //   while(st.size() > 0){
    //     rt.push(st.pop());
    //   }

    //   while(rt.size() > 0){
    //       int x =  rt.pop();
    //       System.out.print(x+" ");
    //       st.push(x);
    //   }





    //print stack without built-in func using array..
    // int  n = st.size();
    // int arr[] = new int[n];

    // for(int i=n-1; i>=0; i--){
    //     int x = st.pop();
    //     arr[i]  = x;

    // }

    // for(int i=0; i<n; i++){
    //     System.out.print(arr[i]+" ");
    //     st.push(arr[i]);
    // }



    






    }
}
