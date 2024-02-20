package cubecart.utils;

import java.util.HashMap;
import java.util.Map;

public class SessionUtil {
    Map<String, Object> sessionData = new HashMap<>();
    private static SessionUtil instance;
    private SessionUtil(){
    }
    public static SessionUtil getInstance(){
        if(SessionUtil.instance == null){
            SessionUtil.instance = new SessionUtil();
        }
        return SessionUtil.instance;
    }
    public void setItem(String key, Object value){
        sessionData.put(key,value);
    }
    public Object getItem(String key){
        return sessionData.get(key);
    }
}