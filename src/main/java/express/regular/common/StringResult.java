package express.regular.common;

import java.util.ArrayList;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class StringResult extends BaseResult<String> {

    public StringResult() {
        setResultList(new ArrayList<String>());
    }

    public String toString() {
        int i;
        StringBuffer resultBuffer = new StringBuffer();
        for(i=0;i<resultList.size();i++) {
            resultBuffer.append(String.valueOf(resultList.get(i))).append("\n");
        }
        return resultBuffer.toString();
    }
}
