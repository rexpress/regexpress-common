package express.regular.common;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class TestResult {
    public enum Type {
        GROUP,
        STRING,
        MATCH,
    }
    public static final String START_TAG = "##START_RESULT##";
    public static final String END_TAG = "##END_RESULT##";
    private String debugOutput;
    private Type type;
    private BaseResult result;
    private String exception;

    public String getDebugOutput() {
        return debugOutput;
    }

    public void setDebugOutput(String debugOutput) {
        this.debugOutput = debugOutput;
    }


    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public BaseResult getResult() {
        return result;
    }

    public void setResult(BaseResult result) {
        this.result = result;
    }
}
