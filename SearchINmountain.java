public class SearchINmountain {
    public static void main(String[] args) {

    }
    public int findPeakElement(int[] arr) {
        int start =  0;
        int end = arr.length-1;
        int mid = start +(end - start)/2;
        while(start<end){
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end=mid;
            }
            mid= start + (end-start)/2;
        }
        return start;
    }
}
