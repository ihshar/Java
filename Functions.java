import java.util.Scanner;

public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int sumOfTwo(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public static int multiplicationOfTwo(int c,int d){
        int mulitple = c*d;
        System.out.println(mulitple);
        return mulitple;
    }
    public static void printFactorial(int n){

        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;    
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // String name = sc.next();
        // printMyName(name);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // sumOfTwo(a,b);


        // int c = sc.nextInt();
        // int d = sc.nextInt();
        // multiplicationOfTwo(c,d);

        int n = sc.nextInt();
        printFactorial(n);
        
        sc.close();
    }
}
