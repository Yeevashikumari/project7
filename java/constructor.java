class test{
    void getdata()
    {
        System.out.println("I'm a human being");
    }
}
class subtest extends test{
    void putdata()
    {
        System.out.println("I've common sense");
    }
}
class constructor
{
    public static void main(String[] args) {
        subtest obj=new subtest();
        obj.getdata();
        obj.putdata();
    }
}