public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 4, b = 0;
        System.out.println(calc.Add(a, b));
        System.out.println(calc.Subtract(a, b));
        System.out.println(calc.Multiply(a, b));
        System.out.println(calc.Divide(a, b));
    }
}