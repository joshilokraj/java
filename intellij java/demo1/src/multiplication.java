import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the table:");
        int a= obj.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println("multiplication of " + a + " * "+i+  " = " +i*a);
            if(i==5)
            {
                break;
            }
        }
    }
}
