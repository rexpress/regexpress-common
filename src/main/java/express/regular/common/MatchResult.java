package express.regular.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class MatchResult  extends BaseResult<Boolean>{

    public MatchResult() {
        setResultList(new ArrayList<Boolean>());
    }

    public MatchResult(List<Boolean> data) {
        setResultList(data);
    }

    public String toString() {
        int i, j;
        StringBuffer resultBuffer = new StringBuffer();
        for(i=0;i<resultList.size();i++) {
            Boolean row = resultList.get(i);
            resultBuffer.append(String.valueOf(row)).append("\n");
        }

        return resultBuffer.toString();
    }
}
