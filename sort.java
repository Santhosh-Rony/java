import java.util.Scanner;

class pal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anyname:");
        String inputname = sc.nextLine();
        String name = inputname.toLowerCase();
        
        String reverse="";
        for(int i=0; i < name.length();i++){
          
            reverse = name.charAt(i) + reverse;
           
        }
        
        if(reverse.equals(name)){

            System.out.println("yeah pallindrome");

        }
        else{
            System.out.println("not a pallindrome");
            sc.close();
        }

    }
}