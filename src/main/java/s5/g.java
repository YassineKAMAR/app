package s5;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f26251a = new g();

    private g() {
    }

    @Override // s5.l
    public ByteBuffer a(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f26252a);
            jSONObject.put("args", h.a(jVar.f26253b));
            return f.f26250a.a(jSONObject);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    @Override // s5.l
    public j b(ByteBuffer byteBuffer) {
        try {
            Object objB = f.f26250a.b(byteBuffer);
            if (objB instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objB;
                Object obj = jSONObject.get("method");
                Object objG = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, objG);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objB);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    @Override // s5.l
    public ByteBuffer c(Object obj) {
        return f.f26250a.a(new JSONArray().put(h.a(obj)));
    }

    @Override // s5.l
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        return f.f26250a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    @Override // s5.l
    public ByteBuffer e(String str, String str2, Object obj) {
        return f.f26250a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    @Override // s5.l
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object objB = f.f26250a.b(byteBuffer);
            if (objB instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objB;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object objG = g(jSONArray.opt(1));
                    Object objG2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (objG == null || (objG instanceof String))) {
                        throw new e((String) obj, (String) objG, objG2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + objB);
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
