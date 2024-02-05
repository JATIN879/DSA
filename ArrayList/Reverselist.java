
// Reverse Arraylist 
import java.util.Collections;
import java.util.*;
public class Reverselist {

static void Reverselist(ArrayList<Integer> list1){
    int st=0;
        int end= list1.size()-1;
        while(st<end){
            Integer temp = Integer.valueOf(list1.get(st));
             list1.set(st,list1.get(end));
              list1.set(end,temp);

             st++;
             end--;
        }
    }
    public static void main(String[]args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(10);
        list1.add(3);
        list1.add(5);
        list1.add(22);
        list1.add(10);
        System.out.println("Original List :"+list1);
        // Collections.reverse(list);
        // System.out.println(list);
         Reverselist(list1);
         System.out.println("Reverse list :"+list1);

         Collections.sort(list1);
         System.out.println("Sort in Ascending"+list1);

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("Decending Order"+list1);
       


        }
    }
    