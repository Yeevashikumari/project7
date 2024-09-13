class rectangle{
    int l,b;
    void getdata(int x,int y)
    {
        l=x; b=y;
    }
    int area()
    {
        return(l*b);
    }
}
public class demo
{
    public static void main(String args[])
    {
        rectangle obj1=new rectangle();
        obj1.getdata(2,6);
        int Area1=obj1.area();
        System.out.println(+Area1);
        rectangle obj2=new retangle();
        obj2.getdata(3,6);
        int Area2=obj2.area();
        System.out.println(+Area2);   
    }
}