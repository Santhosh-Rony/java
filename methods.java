// static method is used to call without creating an object example given below
public class methods {

    static void car(){ // static method
        System.out.println("the car was so faster than u think");
    }
    public void speed(){
        System.out.println("its about to 250kmph");
    }
    public static void main(String[] args) {
        car();
        methods hola = new methods();
        hola.speed();
        
    }

     
    
}
