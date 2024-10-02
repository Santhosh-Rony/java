public class toggle {
    public static void main(String[] args) {
        String name = "sAnTHosH";
        String san ="";
        for(int i=0; i<name.length();i++){
            if(Character.isUpperCase(name.charAt(i))){
                san = san+Character.toLowerCase(name.charAt(i));
            }
            else{
                san = san+Character.toUpperCase(name.charAt(i));
            }
            
        }
        System.out.println(name +" converted into "+ san);
    }
    
}
