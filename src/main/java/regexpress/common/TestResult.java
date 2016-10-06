package regexpress.common;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class TestResult {
    private String debugOutput;
    private TestResultType resultType;
    private BaseResult testResult;
    private Throwable exception;

    public String getDebugOutput() {
        return debugOutput;
    }

    public void setDebugOutput(String debugOutput) {
        this.debugOutput = debugOutput;
    }

    public TestResultType getResultType() {
        return resultType;
    }

    public void setResultType(TestResultType resultType) {
        this.resultType = resultType;
    }

    public Throwable getException() {
        return exception;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public BaseResult getTestResult() {
        return testResult;
    }

    public void setTestResult(BaseResult testResult) {
        this.testResult = testResult;
    }
}
