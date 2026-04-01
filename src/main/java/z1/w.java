package z1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qg0;
import h2.a5;
import h2.m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2 f27672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27673b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f27674c;

    private w(m2 m2Var) {
        this.f27672a = m2Var;
        if (m2Var != null) {
            try {
                List listT = m2Var.t();
                if (listT != null) {
                    Iterator it = listT.iterator();
                    while (it.hasNext()) {
                        k kVarI = k.i((a5) it.next());
                        if (kVarI != null) {
                            this.f27673b.add(kVarI);
                        }
                    }
                }
            } catch (RemoteException e8) {
                qg0.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e8);
            }
        }
        m2 m2Var2 = this.f27672a;
        if (m2Var2 == null) {
            return;
        }
        try {
            a5 a5VarN = m2Var2.n();
            if (a5VarN != null) {
                this.f27674c = k.i(a5VarN);
            }
        } catch (RemoteException e9) {
            qg0.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e9);
        }
    }

    public static w f(m2 m2Var) {
        if (m2Var != null) {
            return new w(m2Var);
        }
        return null;
    }

    public static w g(m2 m2Var) {
        return new w(m2Var);
    }

    public List<k> a() {
        return this.f27673b;
    }

    public k b() {
        return this.f27674c;
    }

    public String c() {
        try {
            m2 m2Var = this.f27672a;
            if (m2Var != null) {
                return m2Var.q();
            }
            return null;
        } catch (RemoteException e8) {
            qg0.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
            return null;
        }
    }

    public Bundle d() {
        try {
            m2 m2Var = this.f27672a;
            if (m2Var != null) {
                return m2Var.m();
            }
        } catch (RemoteException e8) {
            qg0.e("Could not forward getResponseExtras to ResponseInfo.", e8);
        }
        return new Bundle();
    }

    public String e() {
        try {
            m2 m2Var = this.f27672a;
            if (m2Var != null) {
                return m2Var.r();
            }
            return null;
        } catch (RemoteException e8) {
            qg0.e("Could not forward getResponseId to ResponseInfo.", e8);
            return null;
        }
    }

    public final m2 h() {
        return this.f27672a;
    }

    public final JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strE = e();
        if (strE == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strE);
        }
        String strC = c();
        if (strC == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strC);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f27673b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((k) it.next()).j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k kVar = this.f27674c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.j());
        }
        Bundle bundleD = d();
        if (bundleD != null) {
            jSONObject.put("Response Extras", h2.v.b().l(bundleD));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return i().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
