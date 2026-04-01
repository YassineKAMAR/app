package s5;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f26250a = new f();

    private f() {
    }

    @Override // s5.i
    public ByteBuffer a(Object obj) {
        u uVar;
        String string;
        if (obj == null) {
            return null;
        }
        Object objA = h.a(obj);
        if (objA instanceof String) {
            uVar = u.f26270b;
            string = JSONObject.quote((String) objA);
        } else {
            uVar = u.f26270b;
            string = objA.toString();
        }
        return uVar.a(string);
    }

    @Override // s5.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(u.f26270b.b(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e8) {
            throw new IllegalArgumentException("Invalid JSON", e8);
        }
    }
}
