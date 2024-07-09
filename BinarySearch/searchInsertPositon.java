package BinarySearch;

public class searchInsertPositon {
    public static void main(String args[]){
        int arr[]={1,3,5,6};
        int target=7;
        System.out.println(searchinsertion(arr,target));

    }
    public static int searchinsertion(int []arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==low) return mid;
            else if(arr[mid]>target) high=mid-1;
            else low=mid+1;          
        }
        return low;
    }
}
