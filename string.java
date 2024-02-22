import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        System.out.println("enter your name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "hello " + name;
        return message;
    }
}
