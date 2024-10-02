import java.util.Scanner;

class rony{
    public static void main(String[]args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter the cars");
        String cars =myobj.nextLine();
        for(int i=0; i<cars.length();i++){
            System.out.println(cars);
            myobj.close();
        }
    }
}
