// create parent class and acquring that properties by using child class
 
/*class vehicle{ //parent class 
    protected String brand ="Ferrari";
}

class car extends vehicle{
    private String model ="Gtb";

    public static void main(String[] args) {
        car love = new car();
        System.out.println(love.brand + "  " + love.model);
    }
}*/

// with creating some method in parent class

class vehicle{ //parent class 
    protected String brand ="Ferrari";
    public void moj(){
        System.out.println("THIS IS FERRARI MOTORS");
    }
}

class car extends vehicle{//child class
    private String model ="Gtb";

    public static void main(String[] args) {
        car love = new car();
        love.moj();
        System.out.println(love.brand + "  " + love.model);
    }
}