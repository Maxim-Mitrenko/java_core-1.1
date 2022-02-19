import java.util.function.*;

public class Calculator {

    public static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> division = (x, y) -> x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x < 0 ? x * -1 : x;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println= System.out::println;
}