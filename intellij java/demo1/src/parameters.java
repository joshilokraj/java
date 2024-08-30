public class parameters {
    String name;
    int age;
    float salary;

    public parameters(String name, int age, float salary) {
        this.name = "joshi";
        this.age = age;
        this.salary = salary;
    }
public void display()
{
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.salary);
}
    public static void main(String[] args) {
   parameters obj=new parameters("loki",11,99.999f);
    obj.display();
    }
}
