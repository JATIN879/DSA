// SUM OF RACTANGLE USING BRUTE FORCE APPROACH (WORSE APPROACH):
 import java.util.Scanner;
 class PrefixSum{
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
              System.out.print(arr[i][j]+" ");  
            }
            System.out.println( );
        }
    }
 

    static int FindSum1(int matrix[][] ,int l1, int r1, int l2, int r2){
        int sum = 0;
         for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=  r2; j++){
                sum+=matrix[i][j];
                
            }
         }

        return sum;
    }





    // BASED ON NO OF QUERIES SUM GOOD APPROACH:
    static void findPrefixSumMatrix(int[][] matrix){
        int r= matrix.length;
        int c= matrix[0].length;
        
        //calculate row wise and column wise sum:
        
        //traverse horizontally to calculate row-wise prefix sum:
        for(int i=0; i<r; i++){

            // j starts from 1, bcoz previous element will be added
            for(int j=1; j<c; j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        // traverse vertically to calculate column wise sum:
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }





//PREFIX SUM OVER COLUMN AND ROWS:

static int findSum3(int[][]matrix,int l1,int r1,int l2,int r2){
    int ans = 0;
    findPrefixSumMatrix(matrix);
    int sum=0, up=0, left=0, leftUp=0;
    ans = sum - up - left + leftUp;
    sum  = matrix[l2][r2];
    if (r1>=1){
    left =  matrix[l2][r1-1];
    }
   
    if(l1>=1){
    up = matrix[l1-1][r2];
    }

    if(l1>=1 && r1>=1){
    leftUp = matrix[l1-1][r1-1];
    }

    return ans;
}



    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of rows and Columns:");
        int r = sc.nextInt();
        int c =sc.nextInt();
         int totalEle = r*c;
        int[][] matrix = new int[r][c];//total ele= r*c

        System.out.println("enter "+r*c+" elements");
        for(int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();

            }
        }

        System.out.println("Enter Ractangle boundries :");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
       System.out.println("Ractangle sum 1 :"+FindSum1(matrix,l1,r1,l2,r2));
        System.out.println("Ractangle sum 1 :"+findSum3(matrix,l1,r1,l2,r2));

    }
}







