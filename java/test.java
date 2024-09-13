class sup
{
    int x;
    sup(int x)
{
    this.x=x;
}
void display()
{
    System.out.println("super x="+x);
}
}
class sub extends sup{
    int y;
    sub(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void display()
    {
        System.out.println("super x="+x);
        System.out.println("super y="+y);
    }

}
public class test {
    public static void main(String[] args) {
        sub s=new sub(100,200);
        s.display();
    }
}
