public class StringCompression {
    //isme hame ek to presnt and ek past character maintain karna hai:
    public static void main(String[] args) {
        
    
    String str = "aaabbbccddde";
    String ans =""+str.charAt(0);//a
    int count = 1;

    for(int i=1; i<str.length(); i++){
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);
        if(curr == prev){
            count++;
        }
        else{
            if(count>1){
             ans += count;
            }
            // count should be refreshed
            count = 1;
            ans += curr;
        }
    }
    if(count>1)
    ans +=count;

    System.out.println(ans.length());
}
}














// // import java.util.*;
// // class ff{

    
// //     public static int compress(char[] ch) {
// //         String str = new String(ch);
// //         String ans = ""+str.charAt(0);
// //         int count =1;
        
        
// //         for(int i=1; i<str.length(); i++){
// //             char curr = str.charAt(i);
// //             char prev = str.charAt(i-1);
// //             if(curr == prev){
// //                 count++;
// //             }
// //             else{
// //                 ans+= count;
// //                 count = 1;
// //                 ans += curr;
// //             }
// //         }
// //         ans +=count;
// //         if(ans.length() == 1) 
// //         return 1;
// //         else 
// //             return ans.length()-1; 
        
        
// //     }

// //     public static void main(String[] args) {
// //        char[] ch ={'a','b','b','b','b','b','b','b','b','b','b','b','b','b'};
// //        System.out.println(compress(ch));
// //        System.out.println(ch);
       
    

       
        
// //     }
// // }















