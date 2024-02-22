import java.util.Arrays;

public class linearSearch2darray {
    public static void main(String[] args) {
        int[][] arr ={
                {11,12,43},
                {13,24,36},
                {33,94,29}
        };
        int target =36;
        int [] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                int element=arr[i][j];
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[] {-1,1};
    }
    static int max( int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }

        }
        return max;
    }
}
//**********TO PRINT MAXMUM IN 2D****************