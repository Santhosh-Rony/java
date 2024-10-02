public class remoalgebric {
    public static void main(String[] args) {
        String name = "santhosh";
        String firstchar = name.substring(0,1).toUpperCase();
        String lastchar  = name.substring(name.length()-1).toUpperCase();
        String middlechar = name.substring(1,name.length()-1);
        System.out.println(firstchar+middlechar+lastchar);
       
    }
    
}
