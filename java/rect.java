//wap to print the sum of two number using constructor.
class rect{
    int a,b;
    rect(int x,int y)
    {
        a=x;b=y;
    }
    int sum()
    {
        return(a+b);
    }
}
class rectangle{
    public static void main()
    {
        rect obj=new rect(78,90);
        obj.sum();
        System.out.println(+obj.sum());
    }
}