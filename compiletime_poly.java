//same methods but passing diff parameters is calle compile time polymorphism
class polymorphism{
    public void don(int a , int b){
        System.out.println(a+b);
    }

    public void don(int a,int b , int c){
        System.out.println(a+b+c);
    }
}

class min{
    public static void main(String[] args) {
        polymorphism dam = new polymorphism();
        dam.don(2, 2);
        dam.don(2, 2, 2);
        //poly mad = new poly();
        //mad.don(5, 5,5);
    }
}