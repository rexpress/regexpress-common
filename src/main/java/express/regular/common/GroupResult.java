package express.regular.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class GroupResult extends BaseResult<List<String>> {
    private List<String> columns = new ArrayList<String>();

    public GroupResult() {
        setResultList(new ArrayList<List<String>>());
    }

    public GroupResult(List<List<String>> data) {
        setResultList(data);
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String toString() {
        int i, j;
        StringBuffer resultBuffer = new StringBuffer();
        for(i=0;i<resultList.size();i++) {
            List<String> row = resultList.get(i);
            for(j=0;j<row.size();j++) {
                resultBuffer.append(row.get(j)).append(" ");
            }
            resultBuffer.append("\n");
        }

        return resultBuffer.toString();
    }
}
