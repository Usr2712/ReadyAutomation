package Utilities.GlobalVariables;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    private static Map<String, Object> scenarioContext = new HashMap<>();

    public static void setContext(Context key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public static Object getContext(Context key) {
        return scenarioContext.get(key.toString());
    }
}
