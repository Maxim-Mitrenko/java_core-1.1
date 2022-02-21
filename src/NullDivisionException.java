public class NullDivisionException extends ArithmeticException {

    public NullDivisionException(int x) {
        super("Деление на 0 невозможно! Ошибка в операции: " + x + " / 0.");
    }
}