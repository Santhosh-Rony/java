import java.util.Scanner;
class pallindrome {
    public static void main(String[] args) {
        Scanner hell = new Scanner(System.in);
        System.out.println("enter the name");
        String name = hell.nextLine();
        String rev="";
        
        for(int i=0;i<name.length();i++){

           rev = name.charAt(i) + rev;

        }
        
        if(name.equals(rev)){
            System.out.println("yeah it is pallindrome");
        }
        else{
            System.out.println("not ");
            hell.close();
        }
       
        
    }
    
}
