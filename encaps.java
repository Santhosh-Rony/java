public class encaps {

    private String name;
    private int age;

    public String getname(){
        return name;
    }
    public  void setname(String name){
        this.name = name;
    }

    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    
}

 class roll{
    public static void main(String[] args) {
        encaps puppy = new encaps();
        puppy.setname("santhosh");
        puppy.setage(20);
        System.out.println("name is : "+ puppy.getname() + " and his age is : " + puppy.getage());
    }
}