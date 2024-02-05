// class kvjn{
//     public static void main(String[] args) {
//     String str ="I am an online Educator";
//     String ans = "";
//     StringBuilder sb = new StringBuilder("");
//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch != ' '){
//            sb.append(ch);
//         }
//         else{
//             sb.reverse();
//             ans += sb;
//             ans +=' ';
//             //ab sb ko khali karna hai
//             sb.delete(0,sb.length());
//             //or
//             //sb = new StringBuilder("");

//         }
//     }
//     // for the last word:
//     sb.append("");
//     sb.reverse();
//     System.out.println(ans+sb);

     

//    } 
// }

import java.util.Scanner;
class ss{
    public static void main(String[] args) {
        
      int a1[] =  {4,5,6,7,8};
      int a2[] = {9,6,7,8,6};
      int i = a1.length-1;
      int j = a2.length-1;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a3[] = new int[n+1];

      for(int k=n+1; k>0; k--){
        int sum = (a1[i]+a2[j]) % 10;
        a3[k] = sum;
        int carry = sum/10;
        i--;
        j--;
        a3[k-1] =  carry + sum;

         
    }
    for(int h=0; h<n+1; h++){
        System.out.println(a3[h]);
    }
}
}