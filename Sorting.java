/**
 * Sorting
 */
import java.util.*;
public class Sorting {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        // int arr[] = {7,8,3,1,2};
        // Bubble Sort
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1]= temp;
        //         }
        //     }
        // }

        // Selection Sort
        // for(int i=0;i<arr.length-1;i++){
        //     int smallestEle = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[smallestEle] > arr[j]){
        //             smallestEle = j;
        //         }
        //     }
        //     int temp = arr[smallestEle];
        //     arr[smallestEle] = arr[i];
        //     arr[i] = temp;
        // }

        // Insertion Sort
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        printArr(arr);
    }
}