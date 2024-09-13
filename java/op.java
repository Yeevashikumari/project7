import java.util.Scanner;
public class op {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the a value=");
        int a=scanner.nextInt();
        System.out.println("enter b=");
        int b=scanner.nextInt();
        System.out.println("enter c=");
        int c=scanner.nextInt();
        int x=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("the greatest no among a,b&c=" +x);
        scanner.close();
    }
}
