public class count {
    public static void main(String[] args) {
        String name = "santhosh";
        int acount =0;
        for(int i=0; i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
              acount++;
            }
        }
        System.out.println("vowels : "+acount);
    }
}
