import java.util.Scanner;

public class palind {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = sc.nextLine();
        String res ="";
        for(int i=0;i<name.length();i++){

            res = name.charAt(i)+res;

        }
        if(res.equals(name)){
            System.out.println("pallind");
        }
        else{
            System.out.println("not");
        }
        sc.close();
    }
    
}
