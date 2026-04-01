package p2;

import com.google.android.gms.internal.ads.qg0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class t extends q2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f25587b;

    t(a aVar, String str) {
        this.f25587b = aVar;
        this.f25586a = str;
    }

    @Override // q2.b
    public final void a(String str) {
        qg0.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f25587b.f25476b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.f25586a, str), null);
    }

    @Override // q2.b
    public final void b(q2.a aVar) {
        String str;
        String strB = aVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f25586a);
            jSONObject.put("signal", strB);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", this.f25586a, aVar.b());
        }
        this.f25587b.f25476b.evaluateJavascript(str, null);
    }
}
