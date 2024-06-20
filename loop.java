import java.util.*;

/**
 * loop
 */
public class loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      print n sum natural number
        // int Sum = 0;
        // int n = sc.nextInt();
        // for(int i=0;i<=n;i++){
        //     Sum = Sum+i;
        // }
        // sc.close();
        // System.out.println(Sum);

//      print table of a number
        int n =sc.nextInt();
        int result = 0;
        for(int i=1;i<=10;i++){
            result = n*i; 
            System.out.println(result);
        }
        sc.close();
    }
}