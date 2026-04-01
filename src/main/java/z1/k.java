package z1;

import android.os.Bundle;
import h2.a5;
import h2.z2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a5 f27646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f27647b;

    private k(a5 a5Var) {
        this.f27646a = a5Var;
        z2 z2Var = a5Var.f22158c;
        this.f27647b = z2Var == null ? null : z2Var.g();
    }

    public static k i(a5 a5Var) {
        if (a5Var != null) {
            return new k(a5Var);
        }
        return null;
    }

    public a a() {
        return this.f27647b;
    }

    public String b() {
        return this.f27646a.f22161f;
    }

    public String c() {
        return this.f27646a.f22163h;
    }

    public String d() {
        return this.f27646a.f22162g;
    }

    public String e() {
        return this.f27646a.f22160e;
    }

    public String f() {
        return this.f27646a.f22156a;
    }

    public Bundle g() {
        return this.f27646a.f22159d;
    }

    public long h() {
        return this.f27646a.f22157b;
    }

    public final JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f27646a.f22156a);
        jSONObject.put("Latency", this.f27646a.f22157b);
        String strE = e();
        if (strE == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strE);
        }
        String strB = b();
        if (strB == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strB);
        }
        String strD = d();
        if (strD == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strD);
        }
        String strC = c();
        if (strC == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strC);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f27646a.f22159d.keySet()) {
            jSONObject2.put(str, this.f27646a.f22159d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f27647b;
        if (aVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", aVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
