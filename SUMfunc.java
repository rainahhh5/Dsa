import java.util.Scanner;

public class SUMfunc {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
          int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num1 :");
        int num1 = in.nextInt();
        System.out.println("enter the num2 :");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of the numbers is :" );
        return sum;
    }
}
