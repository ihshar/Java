public class QuickSort {
        public static int quickSorting(int nums[],int low,int high){
            int pivot = nums[low];
            int i = low;
            int j = high;
    
            while(i<j){
                while(nums[i]<=pivot && i<=high-1){
                    i++;
                }
                while(nums[j]>pivot && j>=low+1){
                    j--;
                }
    
                if(i<j){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
    
            int temp = nums[j];
            nums[j] = nums[low];
            nums[low] = temp;
    
            return j;
        }
        public static void quickSort(int nums[],int low ,int high ){
            if(low<high){
                int partitionIdx = quickSorting(nums,low,high);
                quickSort(nums,low,partitionIdx-1);
                quickSort(nums,partitionIdx+1,high);
            }
        }
        public static void main(String[] args) {
            int nums[] = {3,2,1,5,6,4};
            int k=2;
            int low = 0;
            int high = nums.length-1;
            quickSort(nums,low,high);
    
            // this code is for finding k largest element in array
            int result = 0;
            for(int i=0;i<=nums.length-1;i++){
                if(nums.length-i==k){
                    result = nums[i];
                    System.out.println(result);
                }
            }
        }
}
