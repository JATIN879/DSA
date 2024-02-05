import java.util.*;



public class RevrseStack {

    //RECURSIVE SOLUTION....
    public static void RevStackRec(Stack<Integer> s1){
       if (s1.size() == 1)
       return ;
        int top = s1.pop();
        RevStackRec(s1);
        pushAtBottom(top,s1);
    }


    public static void pushAtBottom(int x ,Stack<Integer> s1){
        if(s1.size() ==0){
            s1.push(x);
            return;
        }
        int top  = s1.pop();
        pushAtBottom(x, s1);
        s1.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println("old stack: " + s1);
        RevStackRec(s1);
        System.out.println(s1);
        



        //ITERATIVE SOLUTION....
        // Stack<Integer> s2 = new Stack<>();
        // while(s1.size() > 0){
        //     s2.push(s1.pop());
        // }
        // Stack<Integer> s3 = new Stack<>();
        // while(s2.size() > 0){
        //     s3.push(s2.pop());
        // }
        // while(!s3.isEmpty()){
        //     s1.push(s3.pop());
        // }
        // System.out.print("rev stack: "+s1);
        RevStackRec(s1);
    


    }
}
