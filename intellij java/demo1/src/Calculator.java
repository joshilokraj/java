public class Calculator {
    // Method with one parameter
    public int add(int a) {
        return a + a;
    }
    // Method with two parameters
    public int add(int a, int b) {
        return a + b;
    }
    // Method with different parameter types
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(11));          // Calls method with one int parameter
        System.out.println(calc.add(10, 20));      // Calls method with two int parameters
        System.out.println(calc.add(10.5, 20.5));  // Calls method with two double parameters
    }
}