package d5;

import b5.d0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static Map<String, Object> a(e eVar) {
        d0 d0VarD = eVar.d();
        if (d0VarD == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("sql", d0VarD.c());
        map.put("arguments", d0VarD.b());
        return map;
    }
}
