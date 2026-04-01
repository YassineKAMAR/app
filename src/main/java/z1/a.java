package z1;

import h2.z2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f27599d;

    public a(int i8, String str, String str2) {
        this(i8, str, str2, null);
    }

    public a(int i8, String str, String str2, a aVar) {
        this.f27596a = i8;
        this.f27597b = str;
        this.f27598c = str2;
        this.f27599d = aVar;
    }

    public int a() {
        return this.f27596a;
    }

    public String b() {
        return this.f27598c;
    }

    public String c() {
        return this.f27597b;
    }

    public final z2 d() {
        z2 z2Var;
        a aVar = this.f27599d;
        if (aVar == null) {
            z2Var = null;
        } else {
            String str = aVar.f27598c;
            z2Var = new z2(aVar.f27596a, aVar.f27597b, str, null, null);
        }
        return new z2(this.f27596a, this.f27597b, this.f27598c, z2Var, null);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f27596a);
        jSONObject.put("Message", this.f27597b);
        jSONObject.put("Domain", this.f27598c);
        a aVar = this.f27599d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
