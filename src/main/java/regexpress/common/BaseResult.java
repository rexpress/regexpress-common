package regexpress.common;

import java.util.List;

/**
 * Created by bdh92123 on 2016-09-26.
 */
public abstract class BaseResult<T> {
    protected List<T> resultList;

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }

    public abstract String toString();
}
