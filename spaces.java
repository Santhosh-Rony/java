public class spaces {
    public static void main(String[] args) {
        String name = "sant os h";
        StringBuilder sc = new StringBuilder();
        String[] kya = name.split("[\\s]");
        for(String baby:kya){
            sc.append(baby);
        }
        System.out.println(sc);
        
    }
}
