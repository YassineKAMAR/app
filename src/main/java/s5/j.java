package s5;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26253b;

    public j(String str, Object obj) {
        this.f26252a = str;
        this.f26253b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f26253b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f26253b;
    }

    public boolean c(String str) {
        Object obj = this.f26253b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
