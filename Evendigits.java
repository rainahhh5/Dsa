public class Evendigits {
    public static void main(String[] args) {
        int [] nums ={123,4,56,78,9900,6,45};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int [] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int number =isdigit(num);
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
    static int isdigit(int num){
//        int count=0;
//
//        while(num > 0){
//            count++;
//            num = num /10;
//        }
//        return count;
        if(num<0){
            num=num*-1;

        }
        return (int)(Math.log10(num))+1;
    }

}
