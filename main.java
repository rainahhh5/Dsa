import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit =in.next();

        if (fruit.equals("mango")) {
            System.out.println("king of fruits");

        }
        else if (fruit.equals("apple")) {
            System.out.println("a sweet red fruit");

        }
        else{
            System.out.println("normal fruits");
        }
//        System.out.println(fruit);
    }
}
