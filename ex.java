import java.util.Scanner;
class end{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter th word");
        String word = myobj.nextLine();
        System.out.println("enter a letter in that word");
        char letter = myobj.next().charAt(0);

        int acount = 0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==letter){
                acount++;
            }
        }
        if(acount==0){
            System.out.println("there is nothing broo");

        }
        else{
            String newword="";
            for(int i=0; i<word.length();i++){
                if(word.charAt(i)!=letter){
                    newword = newword+word.charAt(i);
                }
            }
            System.out.println(newword);

            for(int i=0;i<acount;i++){
                newword += letter;
            }
            System.out.println(newword);
            myobj.close();
    
        }
        

        

    }
}