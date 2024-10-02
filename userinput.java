class dark{
    public static void main(String[] args) {
        marvel myobj = new marvel();
        myobj.setname("santhosh");
        System.out.println(myobj.getname());
        
        
    }
}



class marvel{
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name= name;
    }
}