// //ek array ko stack ki trah dikhana hai..
// public class ArrayImplemnt {

//     public static class Stack{
//      int arr[] =  new int[50];
//      int idx  = 0;//vv important
     
//      void push(int x){
//         if(isFull()){
//             System.out.println("stack is full!");
//             return;
//         }
//         arr[idx] = x;
//         idx++;
//     }



//     int peek(int x){
//         if(idx == 0){
//             System.out.println("Stack is Empty!");
//             return -1;
//         }

//         return arr[idx-1];
//     }

       


//     int pop(){
//         if(idx == 0){
//             System.out.println("stack is empty");
//         }
//         int top = arr[idx-1];
//         arr[idx-1] = 0;//arr ki default value zero hoti hai 
//         idx--;//ab idx ko bhi ek peeche kr denge jisse size ek kam bhi ho jaaye kyuki wo 
//               //ele delete hora hai

//         return top;
// }



//     void display(){
//         for(int i=0; i<=idx-1; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }




//     int size(){
//         return idx;
//     }


//     boolean isEmpty(){
//         if(idx == 0){
//             return true;
//         }
//         return false;
//     }

//     boolean isFull(){
//         if(idx == arr.length){
//             return true;
//         }
//         return false;
//     }


//     int Capacity(){
//         return arr.length; 
//     }

// }


//     public static void main(String[] args) {
//         Stack st = new Stack();
//         st.display();
//         st.push(1);
//         st.display();
//         st.push(2);
//         st.display();
//         st.push(3);
//         st.display();
//         st.push(4);
//         st.display();
//         st.push(65);
//         st.display();
// System.out.println(st.isFull());
// System.out.println("capacity of the arrStack is : "+ st.Capacity());

// }
// }

 