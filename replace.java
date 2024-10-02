import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter the string");
        String san = sc.nextLine();
        System.out.println("enter the replaced");
        String old = sc.nextLine();
        System.out.println("enter the new string");
        String newString = sc.nextLine();

        String rep = san.replace(old,newString);
        System.out.println(rep);
        sc.close();
    }
}
