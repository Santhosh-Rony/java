class girl{
    public static void main(String[] args) {
        boy San = new boy();
        San.setname("santhosh");
        San.setage(21);
        San.sethobbies("coding");
        System.out.println(San.getname());
        System.out.println(San.getage());
        System.out.println(San.gethobbies());
        

    }
}



class boy{
    private String name;
    private int age;
    private String hobbies;
  
    public String getname(){
      return name;
    }
  
    public void setname(String newname){
      this.name = newname;
    } 
    
    public int getage(){
      return age;
    }
    public void setage(int newage){
      this.age = newage;
    }
    public String gethobbies(){
      return hobbies;
  
    }
    public void sethobbies(String newhobbies){
      this.hobbies=newhobbies;
    }
  
  
  
  }