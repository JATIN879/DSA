// COUNT NUMBER OF PALINDROMIC SUBSTRINGS IN STR.:
// Palindrome means -- if we reverse a string and found again same str then it is called palindrome:

// One char string is always palindrome
// import java.util.*;
// class palindrome{


// public static boolean isPalindrome(String s){
//      int st =0;
//      int end = s.length()-1;
//      while(st<end){
//         if(s.charAt(st) !=s.charAt(end))
//             return false;
//            st++;
//            end--;
//     }
//     return true;
     
//}



//     public static void main(String[] args) {
//         String str = "abcba";
//        int count =0 ; 

//     for(int i=0;  i<str.length(); i++){
//     for(int j=i+1; j<str.length()+1; j++){
//     if(isPalindrome(str.substring(i,j))==true){
//     System.out.print(str.substring(i,j)+" ");
//         count++;
//     }

//     }
// }
//     System.out.println();
//     System.out.println("total palindromic substrings :"+count);
// }

//     }

































// Sasta tareeka for palindrome:
// import java.util.*;
// class Palindromic{
//     public static void main(String args[]){
//     String str = "abcddbxcba";
//     StringBuilder gtr = new StringBuilder(str);
//     gtr.reverse();

//     String s = gtr + "";
//     if(str.equals(s)){
//         System.out.println("palindrome");

//     }
//     else{
//         System.out.println("not-palindrome");
//     }

//     }
// }





// SWAP WALA TAREEKA:
// class ss{
//     public static void main(String[] args) {
//         String  s = "jahaj";
//         int i  = 0;
//         int j = s.length()-1;
//         boolean flag =  true;
//         while(i<j){
//             if(s.charAt(i)!=s.charAt(j)){
//                 flag  = false;

//             }
//             i++;
//             j--;
//         }
//         if(flag == true){
//             System.out.println("palindrome");

//         }
//         else{
//             System.out.println("not--palindrome");
//         }
//     }
// }