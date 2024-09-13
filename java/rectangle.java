public class rectangle {
    int l,b;
    void getdata(int x,int y)
    {
        l=x;
        b=y;
    }
    int Area()
    {
        int Area=l*b;
        return(Area);
    }
}
class Rectarea
    {
        public static void main(String[] args) {
            rectangle rect=new rectangle(10,15);
            int area=rect.Area();
            System.out.println("Area="+area);
        }
    }
