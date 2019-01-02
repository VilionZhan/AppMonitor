package appMonitor.shiro.domain;

import java.util.HashMap;
import java.util.Map;

public class ResultDomain extends HashMap<String, Object>{
    private static final long serialVersionUID = 1L;

    public ResultDomain() {
        put("code", 0);
        put("msg", "操作成功");
    }

    public static ResultDomain error() {
        return error(1, "操作失败");
    }

    public static ResultDomain error(String msg) {
        return error(500, msg);
    }

    public static ResultDomain error(int code, String msg) {
        ResultDomain domain = new ResultDomain();
        domain.put("code", code);
        domain.put("msg", msg);
        return domain;
    }

    public static ResultDomain ok(String msg) {
        ResultDomain domain = new ResultDomain();
        domain.put("msg", msg);
        return domain;
    }

    public static ResultDomain ok(Map<String, Object> map) {
        ResultDomain domain = new ResultDomain();
        domain.putAll(map);
        return domain;
    }

    public static ResultDomain ok() {
        return new ResultDomain();
    }

    @Override
    public ResultDomain put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
