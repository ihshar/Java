import java.util.Scanner;
public class advanceQuestion {
    public static void printAverage(int n1,int n2,int n3){
        int Average = (n1+n2+n3)/3;
        System.out.println(Average);
    }
    public static void sumOfOdd(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void printGreaterNumber(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is greater than "+ n2);
        }
        else{
            System.out.println(n2+" is greater than "+n1);
        }
    }
    public static void calculateCircumference(int r){
        double C = 2 * 3.14 * r;

        System.out.println(C);
    }
    public static void checkEligliblity(int age){
        if(age>18){
            System.out.println("Eliglible For Vote");
        }
        else{
            System.out.println("Not Eliglible For Vote");
        }
    }
    public static void power(int x,int n){
        double PowerOfX = Math.pow(x, n);

        System.out.println(PowerOfX);
    }
    public static void printFibonacci(int n){
        int a = 0 ,b = 1;
        System.out.print(a+ " ");
        for(int i=2;i<=n;i++){
            System.out.print(b + " ");
            int temp = b;
            b = a + b ;
            a = temp;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        // Print Average
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // printAverage(n1, n2, n3);


        // Sum of Odd number 1 to n
        // int n = sc.nextInt();
        // sumOfOdd(n);

        // greater number
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // printGreaterNumber(n1,n2);


        // circumference
        // int r = sc.nextInt();
        // calculateCircumference(r);


        // Can Vote or not
        // int age = sc.nextInt();
        // checkEligliblity(age);


        // Power of x
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // power(x,n);


        // Fibonacci
        int n = sc.nextInt();
        printFibonacci(n);
        


        sc.close();
    }
}
