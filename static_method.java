public class static_method { // static method

    

    static void fury(){
        int x = 10;
        System.out.println("x value is:" + x);
    }

    public static void main(String[] args) {
        fury();
    }
    
}

///////////////////

/*public class static_method{

    
    public static void main(String[] args) {//direct method (or) general method
        int x = 10;
        System.out.println(x);
        
    }
}
*/

/*public class static_method{

    int x= 10;

    public static void main(String[] args) { // class and object method
        
        static_method  off = new static_method();
        System.out.println(off.x);
    }
}*/