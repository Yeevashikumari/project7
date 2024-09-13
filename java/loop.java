class Rectangle
{
    int l,b;
    void getdata(int x,int y)
    {
        int area()
        {
            int area=l*b;
            return(area);
        }
    }
}
public class loop {
    public static void main(String[] args) {
        int area1,area2;
        Rectangle rect1=new Rectangle();
        Rectangle rect2=new Rectangle();
        rect1.l=15;
        rect1.b=2;
        area1=rect1.l*rect1.b;
        rect2.l=3;
        rect2.b=4;
        area2=rect2.l*rect2.b;
        System.out.println(+area1);
        System.out.println(+area1);
    }
}
