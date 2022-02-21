public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
       try {
           int a = calculator.plus.apply(1, 2);
           int b = calculator.minus.apply(1, 1);
           int c = calculator.division.apply(a, b);
           calculator.println.accept(c);
       } catch (NullDivisionException exception) {
           exception.printStackTrace();
       }
    }
}