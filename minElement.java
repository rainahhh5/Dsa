import java.util.Arrays;
//****************ways to find minimum****************
public class minElement {
    public static void main(String[] args) {
        int[] arr ={7,2,4,5,-7,9,1,0,-9};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(min(arr));
    }
//    **********method 1***********************
    static int min(int[]arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;
    }
}
//    **********method 2***********************

