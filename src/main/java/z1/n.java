package z1;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f27649e;

    public n(int i8, String str, String str2, a aVar, w wVar) {
        super(i8, str, str2, aVar);
        this.f27649e = wVar;
    }

    @Override // z1.a
    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectE = super.e();
        w wVarF = f();
        jSONObjectE.put("Response Info", wVarF == null ? "null" : wVarF.i());
        return jSONObjectE;
    }

    public w f() {
        return this.f27649e;
    }

    @Override // z1.a
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
