public class Car {

    // Fields (attributes)
    private String color;
    private String model;

//    public Car(String color, String model) {
//        this.color = color;
//        this.model = model;
//    }

    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Method
    void start() {
        System.out.println("The car is starting.");
    }

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();


        myCar.setColor("blue");
        myCar.setModel("Toyota");

        System.out.println(myCar.getColor());
        System.out.println(myCar.getModel());



//        // Accessing fields and methods
//        System.out.println("Car model: " + myCar.model);
//        myCar.start();
    }
}
