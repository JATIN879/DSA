
// Reverse Arraylist 
import java.util.Collections;
import java.util.*;
public class SortStringsList {

    public static void main(String[]args){
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("welcome");
        list2.add("to");
        list2.add("physics");
        list2.add("wallah");
        
        System.out.println("Original List :"+list2);
        Collections.sort(list2,Collections.reverseOrder());
         System.out.println(" Descending sorted list :"+list2);
        
       


        }
    }
    
    