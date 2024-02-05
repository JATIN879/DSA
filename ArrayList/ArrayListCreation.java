import java.util.*;
public class ArrayListCreation {
    public static void main(String[]args){
        ArrayList<Integer> list =new ArrayList<>();
        

    //ADD AN ELEMENT:
        list.add(5);//5
        list.add(6);//5 6
        list.add(7);//5 6 7
        list.add(8);//5 6 7 8 
        list.add(12);//5 6 7 8 12

        
    //GET or access AN ELEMENT AT INDEX i;
        // int Access =list.get(0);
        // System.out.println(Access);



     //PRINT THE ARRAYLIST BY FOR LOOP:
    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");//5 6 7 8 12
    }
    System.out.println();


    //PRINT THE ARRAYLIST DIRECTLY:[5,6,7,8,12]
    System.out.println(list);



    //ADDING ELEMNT AT SOME INDEX i // [5,100,6,7,8,12]
    list.add(1, 100);
    System.out.println(list);



    //MODIFYING ELEMNT AT INDEX i:
    list.set(1,10);
    System.out.println(list);



    // REMOVING AN ELEMENT AT INDEX i:
    list.remove(1);
    System.out.println(list);


    //REMOVING  AN ELEMENT e(we don't know the index  ):
    System.out.println( list.remove(Integer.valueOf(12)));;
     System.out.println(list);



    //  CHECKING IF ANY ELEMENT EXISTS OR NOT
    Boolean ans =list.contains(Integer.valueOf(5));
    System.out.println(ans);


    // if  you dont specify class, you can put anything inside l:
    ArrayList l =  new ArrayList<>();
    l.add("jatin");
    l.add(4);
    l.add(true);
    System.out.println(l);
    }
}

