import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=obj.nextFloat();
        b=obj.nextFloat();
        if (a > b) {            System.out.println("print a is greater");
        } else if (a == b)
        {
            System.out.println("a is equal to b");
        }
        else {
            System.out.println("b is greater");
        }
    }
}