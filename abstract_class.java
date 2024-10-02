// data abstraction is a data hiding and  it shows only essential features 
// abstraction class is restricted to creating an objects
// abstraction method is only created on abstract class(does not have a body)

abstract class animal{
    public abstract void animalsound();
    public void sleep(){
       System.out.println("dud dud dud");
    }
}
class pig extends animal{
    public void animalsound(){
        System.out.println("dddd ddd ddd");
    }
}

class power{
    public static void main(String[] args) {
        pig suz = new pig();
        suz.animalsound();
        suz.sleep();
    }
}