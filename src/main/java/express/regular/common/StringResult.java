package express.regular.common;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class StringResult extends BaseResult<String> {

    public String toString() {
        int i;
        StringBuffer resultBuffer = new StringBuffer();
        for(i=0;i<resultList.size();i++) {
            resultBuffer.append(resultList.get(i)).append("\n");
        }
        return resultBuffer.toString();
    }
}
