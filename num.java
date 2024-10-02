public class num {
    public static void main(String[] args) {
        String st = "sant2ga3g34al9";
        int sum = 0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='0'&& st.charAt(i)<='9'){
                 sum = sum + (st.charAt(i)-'0');
                 

            }
           
        }
        System.out.println(sum);
    }
    
}
