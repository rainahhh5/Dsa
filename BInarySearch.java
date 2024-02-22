public class BInarySearch {
    public static void main(String[] args) {
     int[] arr ={1,2,3,4,5,6,7,8,23,45,75,87,90};
//     int target=45;
     int ans=binarysearch(arr,60);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr,int target){
        int start = 0 ;
        int end = arr.length -1;
//        int mid = start +(end-start)/2;
        while(end>=start){
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
        return arr[end+1];
    }
}
//***********************Binsary Search********************