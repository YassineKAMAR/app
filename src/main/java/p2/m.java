package p2;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.fv1;
import com.google.android.gms.internal.ads.gf3;
import com.google.android.gms.internal.ads.ya0;
import com.google.android.gms.internal.ads.zf3;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements gf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f25553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fv1 f25554b;

    public m(Executor executor, fv1 fv1Var) {
        this.f25553a = executor;
        this.f25554b = fv1Var;
    }

    @Override // com.google.android.gms.internal.ads.gf3
    public final /* bridge */ /* synthetic */ x3.d a(Object obj) {
        final ya0 ya0Var = (ya0) obj;
        return zf3.n(this.f25554b.b(ya0Var), new gf3() { // from class: p2.l
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj2) {
                o oVar = new o(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    oVar.f25562b = h2.v.b().l(ya0Var.f17708a).toString();
                } catch (JSONException unused) {
                    oVar.f25562b = "{}";
                }
                return zf3.h(oVar);
            }
        }, this.f25553a);
    }
}
