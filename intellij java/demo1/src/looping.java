public class looping {
    public static void main(String[] args) {
        int i = 5;
        while (i > 0) {
            System.out.println("Value of i: " + i--); // Outputs: Value of i: 5
            System.out.println("Value of i after post-decrement: " + i);
        }
        }
}