import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = sc.nextLine();
        StringBuilder now = new StringBuilder();
        now.append(name);
        //System.out.println(now);
        now.reverse();
        System.out.println(now);
        sc.close();
    }
}
