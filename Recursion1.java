public class Recursion1{
    public static void printNumber(int n){
        if(n==0)
            return;

        System.out.println(n);
        printNumber(n-1);
    }
    public static void printSumOfNaturalNumb(int n,int sum){
        if(n==6){
            System.out.println(sum);
            return ;
        }
        // System.out.println(n);
        sum = sum+n;
        printSumOfNaturalNumb(n+1,sum);
    }
    public static int factorial(int n,int fact){
        if(n==1){
            System.out.println(fact);
            return 1;
        }
        
        factorial(n-1,fact*n);
        return fact;
    }
    public static void fibonacci(int a,int b,int n){
        if(n==0)
            return ;

        int c = a + b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }
    public static int calPowerWithN(int x,int n){
        if(n==0){
            return 1;
        }

        // if(n==1){
        //     return x;   //you can write this but not necessary to write
        // }
 
        if(x==0){
            return 0;
        }

        int X_n  = x * calPowerWithN(x, n-1);

        return X_n;
    }
    public static int calPowerWithLogN(int x,int n){
        if(n==0){
            return 1;
        }

        // if(n==1){
        //     return x;   //you can write this but not necessary to write
        // }
 
        if(x==0){
            return 0;
        }

        if(n%2==0){
            int x_nb2 = calPowerWithLogN(x, n/2);
            int X_n  = x_nb2 * x_nb2;
            return X_n;
        }else{
            int x_nb2 = calPowerWithLogN(x, n/2);
            int X_n  = x_nb2 * x_nb2 * x;
            return X_n;
        }
        
    }
    public static void main(String[] args){
        // int n = 5;
        // int fact = 1;
        // printNumber(n);


        // int sum = 0;
        // printSumOfNaturalNumb(n,sum);


        // int a = 0,b=1;
        // factorial(n,fact);


        // System.out.println(a);
        // System.out.println(b);
        // fibonacci(0,1,5);


        // int x = 2;
        // int n = 5;
        // int ans = calPowerWithN(x, n);
        // System.out.println(ans);
        
        
        int x = 2;
        int n = 7;
        int ans = calPowerWithLogN(x, n);
        System.out.println(ans);

    }
}