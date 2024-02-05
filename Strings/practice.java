// import java.util.*;
// public class practice {
//     public static void main(String []args){
//         String s = "God Ding";
//         String sd = "";
//         String []sb = s.split(" ");
//         for(int i=0; i<sb.length; i++){
//             StringBuilder SB = new StringBuilder(sb[i]);

//             StringBuilder rev = SB.reverse();
//             String fnl = rev.toString();
//             sd +=fnl+ " ";
//             System.out.println(sd);

//         }
//     }
// }




// class dd{
//   public static void main(String[] args) {
//     String s = "the sky is blue";
//     String a = "";
//     String [] ans  = s.split(" ");
//     for(int i=ans.length-1; i>0; i--){
//             a += ans[i] + " ";
//     }
//      a+=ans[0];
// System.out.println(a);
//   }
  
// }





import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());


        for(int i=0; i<sb.length(); i++){
            boolean flag = true;
            char ch = sb.charAt(i);

            if(ch == ' '){
                continue;
            }

            int ascii = (int)ch;
            if(ascii >= 97){
                flag = false;
            }

            if(flag == true){
                ascii += 32;
                char dh = (char)ascii;
                sb.setCharAt(i,dh);
            }
            else{
                ascii -= 32;
                char dh =(char)ascii;
                sb.setCharAt(i,dh);

            }



        }
        System.out.println(sb);
        
    }

}


