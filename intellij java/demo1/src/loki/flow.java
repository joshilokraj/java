import javax.swing.text.html.HTMLDocument;
import java.util.Scanner;
public class flow {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the day:");
        int day=obj.nextInt();// Example day of the week (1 = Monday, 2 = Tuesday, etc.)
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
        obj.close();
    }
}