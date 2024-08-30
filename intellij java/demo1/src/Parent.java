abstract public class Parent {
    public void shows()
    {
        System.out.println("this is example:");
    }
    abstract public void lol();
}
 class Child extends Parent {
    public void lol() {
        System.out.println("child example.");
    }
}
class start{
    public void main(String[] args) {
    Child obj = new Child();
    obj.lol();
    obj.shows() ;
}}