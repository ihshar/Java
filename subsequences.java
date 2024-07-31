import java.util.*;
class subsequences{
    public static boolean subsequenceSum(int arr[],int index,int result,int sum,ArrayList<Integer> subsequences,int n){
        if(index==n){
            if(result==sum){
                 for(int i=0;i<subsequences.size();i++){
                    System.out.print(subsequences.get(i)+ " ");
                }
                System.out.println();
                return true;
            }
            else return false;
        }
        
        // take it

        subsequences.add(arr[index]);
        result+=arr[index];
        if(subsequenceSum(arr,index+1,result,sum,subsequences,n)==true){
         return true;   
        }
        
        
        // Don't take it
        result-=arr[index];
        subsequences.remove(subsequences.size()-1);
        if(subsequenceSum(arr,index+1,result,sum,subsequences,n)==true){
            return true;
        }
        
        return false;
    }
    public static int subsequencesCount(int arr[],int index,int sum,int n,int result){
        if(index==n){
            if(result == sum){
                return 1;
            }
            return 0;
        }

        result+=arr[index];
        int left = subsequencesCount(arr, index+1, sum, n, result);
        
        result-=arr[index];
        int right = subsequencesCount(arr, index+1,sum, n, result);

        return left + right;
    }
    public static void main(String[] args){
        // int arr[] = {1,2,1};
        // int sum=2;
        // int n=3;
        // ArrayList<Integer> subsequences = new ArrayList<>();
        // subsequenceSum(arr,0,0,sum,subsequences,n);

        int arr[] = {1,2,1,1,1};
        int sum=2;
        int n=3;
        int ans = subsequencesCount(arr,0,sum,n,0);
        System.out.println(ans);
        
       
        
        
    }
}