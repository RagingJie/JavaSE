package Exception.Exersice.Demo02;

/**
 * @Author
 * @Date 2024/9/10 0:32
 * @Description:
 */
public class AgeOutOfBoundsException extends RuntimeException {

    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
