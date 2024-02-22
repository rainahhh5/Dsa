public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 4, 5, 7, 8, 9, 678, 789, 876, 56, 34};
        int target = 23;
//        int start=0;
//        int end=5;
        int ans = linearSearch(arr, target,1,4);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start ,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}