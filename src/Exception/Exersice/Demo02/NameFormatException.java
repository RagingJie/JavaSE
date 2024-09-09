package Exception.Exersice.Demo02;

/**
 * @Author
 * @Date 2024/9/10 0:31
 * @Description:
 */
public class NameFormatException extends RuntimeException {

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
