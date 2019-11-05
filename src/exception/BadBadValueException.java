package exception;

public class BadBadValueException implements RuntimeException {

    public BadBadValueException(){
        super("Duration must not be negative");
    }
}
