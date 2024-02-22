public class infinitArray {
    public static void main(String[] args) {
          int[] arr = {3,5,7,10,90,100,130,150,170,200};
          int target=10;

        System.out.println(ans(arr,target));
    }
    static int ans( int[] arr , int target ){
          int start =0;
          int end=1;

          //condition for target to lie in range
        while ( target>arr[end]){
            int newStart=end+1;
            //box ko double krte rho//
            //new end joh hoga = previous end +box size *2////
            end = end + (end-start+1)*2;
            start=newStart;
//            end=newEnd;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr ,int target,int start,int end){
//        int start = 0 ;
//        int end = arr.length -1;
//        int mid = start +(end-start)/2;
        while(start<=end){
            int mid = start +(end-start)/2;
            if (target <arr[mid]){
                end= mid - 1;
            }
            else if (target > arr[mid]) {
                start=mid+1;
            }else
            {
                return mid;

            }
        }
        return -1;
    }
}
