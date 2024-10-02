// the methods having same name but they having different parameters is called compile time polymorphism
// the process of overriding the same methods either child or parentclass(depends on constructor) Runtime



// it having same methods but it depends on which class should we call;

class cake{
    public void fav(){
     System.out.println("golden fantasy");   
    }
}

class cake1 extends cake{
    public void fav(){
        System.out.println("red valet");
    }
}

class cake2 extends cake{
    public void fav(){
        System.out.println("black forest");
    }
}

class cake3 extends cake{
    public void fav(){
        System.out.println("oreo");
    }
}

class cake4 extends cake{
    public void fav(){
        System.out.println("black current");
    }
}


class cakes{
    public static void main(String[] args) {
        cake mycake = new cake1();
        mycake.fav();
        System.out.println(mycake);
        cake mybake = new cake2();
        mybake.fav();
        System.out.println(mybake);
    }
}