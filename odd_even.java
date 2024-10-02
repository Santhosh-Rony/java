import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers : ");
        int num = sc.nextInt();
        int odd =0;
        int even =0;
        int digit;
        while(num>0){
            digit = num%10;
            if(digit%2==0){
                even = even + digit;
            }
            else{
                odd = odd + digit;
            }
            num = num/10;
        }
        int result = even - odd;
        System.out.println(even);
        System.out.println(odd);
        System.out.println(result);
        sc.close();
        
    }
    
}
