@FunctionalInterface
interface A{
    void display();
    default void speak(){
        System.out.println("Default function ");
    }
}

class B implements A{
    public void display(){
        System.out.println("display funcion called ");
    }
}
public class Default {
    public static void main (String[] args ){
        B b = new B();
        b.display();
        b.speak();
    }
}