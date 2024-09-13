class test{
    int m,n;
    test(int x,int y)
    {
        m=x;n=y;
    }
    int largest()
    {
        if(m>=n)
        return(m);
        else
        return(n);
    }
    void display()
    {
        int large=largest();
        System.out.println("largest number ="+large);
    }
}
public class Nest {
    public static void main(String[] args) {
        test nest=new test(50,40);
        nest.display();
    }
}
