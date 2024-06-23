import java.util.Scanner;

public class AdvancePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // *      * 
        // **    ** 
        // ***  *** 
        // ******** 
        // ******** 
        // ***  *** 
        // **    ** 
        // *      * 


        // for(int i=1;i<=n;i++){
        //     // Star //
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     // Space //
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println(" ");
        // }

        // for(int i=n;i>=1;i--){
        //     // Star //
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     // Space //
        //     for(int j=1;j<=2*(n-i);j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println(" ");
        // }




    //        ***** 
    //       ***** 
    //      ***** 
    //     ***** 
    //    *****

        // for(int i=1;i<=n;i++){
        //     // Space //
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     //Star //
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }

        //     System.out.println(" ");
        // }

        //     1  
        //    2 2  
        //   3 3 3  
        //  4 4 4 4  
        // 5 5 5 5 5 


        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println(" ");
        // }

        //     1 
        //     212 
        //    32123 
        //   4321234 
        //  543212345 

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }

        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
        //     }

        //     System.out.println(" ");
        // }




        //      * 
        //     *** 
        //    ***** 
        //   ******* 
        //   ******* 
        //    ***** 
        //     *** 
        //      * 

        for(int i=1;i<=n;i++){
            // Space //
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            //Star //
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }


            System.out.println(" ");
        }


        for(int i=n;i>=1;i--){
            // Space //
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            //Star //
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }


            System.out.println(" ");
        }
    }
}
