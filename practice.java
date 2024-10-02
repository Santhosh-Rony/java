

//classes and objects 

// class is blueprint for creating an object.(or) template
// object is a instance of class. (or) copy entity

/*class objects{ //multiple objects
    String name = "santhosh";
    int age = 20;
}

class handle{
    public static void main(String[] args) {
        objects eww = new objects();
        objects bow = new objects();
        System.out.println(eww.name + " " + bow.age);
    }
} */


/*class attributes{ //attributes
    int a = 20;
    public static void main(String[] args) {
        attributes gare = new attributes();
        gare.a = 40;
        System.out.println(gare.a);
    }
}*/


 /*class practice{ //methods
    public void bold(){
        System.out.println("Hello bold boy");
    }
    static void italy(){
        System.out.println("Hello italy");
    }

    public static void main(String[] args) {
        practice glad = new practice();
        glad.bold();
        italy();
        
    }

}*/


/*class constructor1{//constructor is used to pass the values

    int a;
    constructor1(int b){
        a = b;
        
    }
    public static void main(String[] args) {
        constructor1 oola = new constructor1(5);
        System.out.println(oola.a);

    }

}*/

/*class capsule{
    private String name ;
    private String movies ;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getmovies(){
        return movies;
    }
    public void setmovies(String movies){
        this.movies = movies;
    }
}

class hii{
    public static void main(String[] args) {
        capsule encaps = new capsule();
        encaps.setname("James cameroon");
        encaps.setmovies("Avatar");
        System.out.println("His name is " + encaps.getname() + " and his movie is " + encaps.getmovies());
    }
}*/

/*class parent{
   protected String brand = "bru";
   public void man(){
    System.out.println("coffee is good for health");
   }
}

class child extends parent{
    private String cost = "three";
    public static void main(String[] args) {
        child myobj = new child();
        myobj.man();
        System.out.println(myobj.brand + " " + myobj.cost);
        
    }
}*/

/*class animal{ // run  time polymorphism
    public void sound(){
        System.out.println("kaw kaw");
    }
}

class cat extends animal{
    public void sound(){
        System.out.println("wee wee");
    }
}

class dog extends animal{
    public void sound(){
        System.out.println("bow bow");
    }
}

class frog extends animal{
    public void sound(){
        System.out.println("back back");
    }
}


class taking{
    public static void main(String[] args) {
        animal horn = new cat();
        horn.sound();
        animal drone = new dog();
        drone.sound();
    }
}*/

/*class math{
    public void max(int a, int b){
        System.out.println(a+b);
    }
    public void max(String name){
        System.out.println(name);
    }
}

class done{
    public static void main(String[] args) {
        math mine = new math();
        //mine.max("santhosh");
        mine.max(25, 25);
    }
}*/

/*class out{
    int x = 10;
    class in{
        String name ="steven spilberg";
    }
}

class out_in{
    public static void main(String[] args) {
        out getout = new out();
        out.in getin = getout. new in();
        System.out.println(getout.x + " " + getin.name);
    }
    
}*/

abstract class animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("derrr derrr");
    }
}

class pig extends animal{
    public void animalsound(){
        System.out.println("he he he he");
    }
}

class hello{
    public static void main(String[] args) {
        pig mypig = new pig();
        mypig.animalsound();
        mypig.sleep();
    }
}