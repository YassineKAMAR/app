package j2;

import com.google.android.gms.internal.ads.dc;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.yb;

/* JADX INFO: loaded from: classes.dex */
final class l0 implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f24003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ p0 f24004b;

    l0(s0 s0Var, String str, p0 p0Var) {
        this.f24003a = str;
        this.f24004b = p0Var;
    }

    @Override // com.google.android.gms.internal.ads.yb
    public final void a(dc dcVar) {
        qg0.g("Failed to load URL: " + this.f24003a + "\n" + dcVar.toString());
        this.f24004b.a(null);
    }
}
