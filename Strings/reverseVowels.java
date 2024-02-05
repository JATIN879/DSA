// import java.util.Scanner;
// class gg {

//       public  static boolean isVowel(char ch ){
//         if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
//             return true;
//         }
//         return false;
//       }


//       public static String rev(String s){
//         int i =0;
//         int j = s.length()-1;
//         char ch[] = s.toCharArray();
//         while(i<j){
//             if(!isVowel(ch[i])){
//                 i++;
//                 continue;
//             }
        
//             if(!isVowel(ch[j])){
//                 j--;
//                 continue;
//             }

//             char temp  = ch[i];
//             ch[i] = ch[j];
//             ch[j] = temp;
//             i++;
//             j--;
//         }
//         String ans = new String(ch);
//         return ans;



//       }

//     public static void main(String[]  args ){
//        Scanner sc  = new Scanner (System.in);
//        String s = sc.nextLine();
//        System.out.println(rev(s)); 
//     }
// }
