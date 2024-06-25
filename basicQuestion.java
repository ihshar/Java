import java.util.Scanner;

public class basicQuestion {
    public static void CheckPrime(int n){
        for(int i=2;i<n;){
            if(n%i==0){
                System.out.println("It's not a Prime number");
                break;
            }
            else{
                System.out.println("It's a Prime number");
                break;
            }
        }
    }
    public static void checkEven(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void printTable(int n){
        int result = 0;
        for(int i=1;i<=10;i++){
            result = n*i;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // prime or not 
        // CheckPrime(n);


        // even or not
        // checkEven(n);

        // table
        printTable(n);


        sc.close();
    }
}
