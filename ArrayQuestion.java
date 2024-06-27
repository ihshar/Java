import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        
        // // taking input
        // for(int i=0;i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }

        // // Searching for the number in array
        // int searchNumber = sc.nextInt();
        // for(int i=0;i<numbers.length;i++){ //here we can numbers.length or size variable 
        //     if(searchNumber == numbers[i]){ // if we dont have size variable then we use numbers.length
        //         System.out.print("Number found at index "+i);
        //         return;
        //     }
        // }



        // Take an array of names as input from the user and print them on the screen.


        // int size = sc.nextInt();    
        // String names[] = new String[size];
        

        // // taking input
        // for(int i=0;i<size;i++){
        //     names[i] = sc.next();
        // }

        // for(int i=0;i<names.length;i++){
        //     System.out.println(names[i]);
        // }


        





        // Find the maximum & minimum number in an array of integers. 

        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // // taking input
        // for(int i=0;i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }

        // int maxi = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // // output for max and min
        // for(int i=0;i<numbers.length;i++){
        //     if(maxi<numbers[i]){
        //         maxi = numbers[i];
        //     }

        //     if(min>numbers[i]){
        //         min = numbers[i];
        //     }
        // }


        // System.out.println("maximum of array is " + maxi +" minimum of array is " + min);




        // Take an array of numbers as input and check if it is an array sorted in ascending order.
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // taking input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("Sorted in Ascending Order");
        }
        else{
            System.out.println("Not Sorted in Ascending Order");
        }
        sc.close();
    }
}
