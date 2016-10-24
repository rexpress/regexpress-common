package express.regular.common;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public class GroupResult extends BaseResult<GroupResult.GroupsList> {
    public static class GroupsList {
        private Map<String, Object> additionalData = new LinkedHashMap<String, Object>();
        private List<List<String>> list = new ArrayList<List<String>>();

        public GroupsList() {
        }

        public GroupsList(List<String> firstGroups) {
            list.add(firstGroups);
        }

        public List<String> getGroups(int i) {
            return list.get(i);
        }

        public void addGroups(List<String> groups) {
            list.add(groups);
        }

        public int size() {
            return list.size();
        }

        public List<List<String>> getList() {
            return list;
        }

        public void setList(List<List<String>> list) {
            this.list = list;
        }

        public Map<String, Object> getAdditionalData() {
            return additionalData;
        }

        public void setAdditionalData(Map<String, Object> additionalData) {
            this.additionalData = additionalData;
        }
    }

    private List<String> columns = new ArrayList<String>();

    public GroupResult() {
        setResultList(new ArrayList<GroupsList>());
    }

    public GroupResult(List<GroupsList> data) {
        setResultList(data);
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    public String toString() {
        int i, j, k;
        StringBuffer resultBuffer = new StringBuffer();
        for(i=0;i<resultList.size();i++) {
            GroupsList groupsList = resultList.get(i);
            if(groupsList != null) {
                for (j = 0; j < groupsList.size(); j++) {
                    List<String> groups = groupsList.getGroups(j);

                    for (k = 0; k < groups.size(); k++) {
                        resultBuffer.append(groups.get(k)).append(" ");
                    }

                    resultBuffer.append("\n");
                }
            }
            resultBuffer.append("\n");
        }

        return resultBuffer.toString();
    }
}
