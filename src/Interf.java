@FunctionalInterface
interface Calculator {
    int add (int a, int b);
}

public class Interf {
    public static void main (String[] args ){
        Calculator calc = (a, b)->a+b;
        int result = calc.add(2, 3);
        System.out.println(result);
    }
}
