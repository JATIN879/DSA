
// //toggle-- Convert upperCase to lowerCase and vice versa:

import java.lang.*;
import java.util.*;
public class SB {

    class dd{
        public static void main(String[]args){
            Scanner sc= new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        //toggle
        //PHysiCs -> phYSIcS

        for(int i=0; i<sb.length(); i++){
            //check -> alphabet- small or capital
            boolean flag = true;//capital
            char ch = sb.charAt(i);//A
            if(ch == ' ') continue;

            // typecast-- ch to ascii value
            int asci = (int)ch;///65

            if(asci >= 97){
                flag =  false;//small
            }

            if(flag == true){///capital
              asci +=32;
              char dh = (char)asci;//a
              sb.setCharAt(i,dh);
            }

            else{
                asci -= 32;
                char dh =(char)asci;
                sb.setCharAt(i,dh);

            }
         }

         System.out.println(sb);


            
        }
    }
}
    


//toogle string using STRING NOT STRINGBUILDER
