package express.regular.common;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by bdh92123 on 2016-10-08.
 */
public class GsonCommonType {
    public static final Type MAP_STRING_OBJECT = new TypeToken<Map<String, Object>>(){}.getType();
    public static final Type LIST_STRING = new TypeToken<List<String>>(){}.getType();
}
