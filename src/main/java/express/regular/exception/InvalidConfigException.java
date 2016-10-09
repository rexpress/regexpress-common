package express.regular.exception;

/**
 * Created by Baek on 2016-10-08.
 */
public class InvalidConfigException extends Exception {
    public InvalidConfigException() {
    }

    public InvalidConfigException(String message) {
        super(message);
    }
}
