class black{
    public static void main(String[] args) {
        blue myobj = new blue();
        myobj.setname("santhosh");
        myobj.setrollno(3);
        myobj.setattended("present");
        System.out.println(myobj.getname());
        System.out.println(myobj.getrollno());
        System.out.println(myobj.getattended());

    }
}


class blue{
    private String name;
    private int rollno;
    private String attended;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public int getrollno(){
        return rollno;
    }
    public void setrollno(int rollno){
        this.rollno = rollno;
    }

    public String getattended(){
        return attended;

    }
    public void setattended(String attended){
        this.attended = attended;
    }
}