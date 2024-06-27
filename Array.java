import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int marks[] = new int[3];
        // marks[0]=97;
        // marks[1]=95;
        // marks[2]=98;

        // OR

        // int marks[] = {97,95,98};


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        // output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
