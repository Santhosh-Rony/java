public class constructor {
    
    int x = 22;
    constructor(){//override
         x = 2334;
    }
    public static void main(String[] args) {
        constructor horn = new constructor();
        System.out.println(horn.x);
    }
}


// constructor paranthesis is used to intialize attributes that is given below

/*public class constructor {
    
    int x;
    constructor(int y){
    x = y;
     
    }
    public static void main(String[] args) {
        constructor horn = new constructor(6666);
        System.out.println(horn.x);
    }
}*/