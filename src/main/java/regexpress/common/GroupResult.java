package regexpress.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class GroupResult extends BaseResult<List<Object>> {
    public GroupResult() {
        setResultList(new ArrayList<List<Object>>());
    }

    public GroupResult(List<List<Object>> data) {
        setResultList(data);
    }

    public String toString() {
        int i, j;
        StringBuffer resultBuffer = new StringBuffer();
        for(i=0;i<resultList.size();i++) {
            List<Object> row = resultList.get(i);
            for(j=0;j<row.size();j++) {
                resultBuffer.append(row.get(j)).append(" ");
            }
            resultBuffer.append("\n");
        }

        return resultBuffer.toString();
    }
}
