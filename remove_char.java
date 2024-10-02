public class remove_char {
    public static void main(String[] args) {
        String naam = "absgdw5345@13$$%fjhouoi3409-@#$0980";
        String naan = "";
        naan = naam.replaceAll("[^a-zA-Z]","");
        System.out.println(naan);
    }
    
}
