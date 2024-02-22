public class RBS {
    public static void main(String[] args) {
    int [] arr ={3,34,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    static int Search(int[] nums ,int target ){
        int pivot= findPivot(nums);
        if(pivot==-1){
            return binarysearch(nums ,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target>=nums[0]){
            return binarysearch(nums ,target,0,pivot-1);
        }
        return binarysearch(nums ,target,pivot+1,nums.length-1);
    }
    static int binarysearch(int [] nums ,int target,int start ,int end){
        // int start =0;
        // int end =nums.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            // case 1
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;

    }


    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid=start + (end - start) / 2;
            //4 cases
            if (mid <end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if (mid> start && arr[mid] < arr[mid -1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end =mid -1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
}
