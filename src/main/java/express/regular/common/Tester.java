package express.regular.common;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public abstract class Tester {
    private Gson gson = new Gson();

    protected static ByteArrayOutputStream debugOutputStream = new ByteArrayOutputStream();
    protected static PrintStream debugStream = new PrintStream(debugOutputStream);

    public abstract TestResult testRegex(Map<String, Object> configMap, List<String> testStrings) throws Exception;

    public TestResult testMain(String configJsonString, String testJsonString) {
        TestResult result = null;
        Map<String, Object> configMap = null;
        List<String> testStrings = null;

        try {
            System.setErr(debugStream);
            debugOutputStream.reset();
            configMap = gson.fromJson(configJsonString, GsonCommonType.MAP_STRING_OBJECT);
            testStrings = gson.fromJson(testJsonString, GsonCommonType.LIST_STRING);
            result = testRegex(configMap, testStrings);
        } catch (Throwable e) {
            result = new TestResult();
            result.setException(e.getClass().getName() + ": " +e.getLocalizedMessage());
        } finally {
            debugStream.flush();
            result.setDebugOutput(debugOutputStream.toString());
        }

        if(result != null) {
            System.out.println(TestResult.START_TAG + "\n" + gson.toJson(result) + "\n" + TestResult.END_TAG);
        }

        return result;
    }
}
