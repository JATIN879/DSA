// import java.util.*;
// public class CopyStackInSameOrder {
//     public static void main(String[] args) {
//         Stack<Integer> s1 = new Stack<>();

//         Scanner sc = new Scanner(System.in);
//         s1.push(12);
//         s1.push(13);
//         s1.push(14);
//         s1.push(15);
//         s1.push(16);
//        System.out.println(s1);

//         //reverse order;
//         Stack<Integer> s2 = new Stack<>();
//         while(s1.size() > 0){
//         //    int x =  s1.peek();
//         //    s2.push(x);
//         //    s1.pop();

//                 // OR //

//             s2.push(s1.pop());
//         }
        

//         //for print in the same order we use another stack and again perform same operation as above....

//         Stack<Integer> copied = new Stack<>();
//         while(s2.size() > 0){
//             copied.push(s2.pop());

//         }
//         System.out.println(copied);
//        // System.out.println(s2);//[]

        
//     }
    
//     }
    

