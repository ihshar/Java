import java.util.Scanner;

/**
 * Pattern
 */
public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();

        // ****
        // ****
        // ****
        // ****
        // ****
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }





        // *****
        // *   *
        // *   *
        // *****


        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=m;j++){
        //         if((i==0 || j==0) || (i==n || j==m)){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // * 
        // ** 
        // *** 
        // **** 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }



        // **** 
        // *** 
        // ** 
        // * 

        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }


        //      * 
        //     ** 
        //    *** 
        //   **** 

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }


        // 1 
        // 1 2
        // 1 2 3
        // 1 2 3 4 

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }




        // 1 2 3 4  
        // 1 2 3  
        // 1 2  
        // 1  

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }

        // OR 

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println(" ");
        // }



        // 1  
        // 2 3  
        // 4 5 6  
        // 7 8 9 10  
        // 11 12 13 14 15  


        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println(" ");
        // }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }


        




    }
}