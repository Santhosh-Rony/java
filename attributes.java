// variable and attributes are similar but attributes are used as a constructor whereas variable can't.
public class attributes
{
    int x = 30;
    public static void main(String[] args) 
    {
        attributes myobj = new attributes();
        myobj.x = 40;//override
        System.out.println(myobj.x);
        
    }
}
// we use final keyword before int,for overriding the value.