package regexpress.common;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public interface Tester {
    TestResult testRegex(String configJsonString, String testJsonString);
}
