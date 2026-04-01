package p2;

import android.util.Pair;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.vf3;

/* JADX INFO: loaded from: classes.dex */
final class s0 implements vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f25585a;

    s0(c cVar) {
        this.f25585a = cVar;
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final void a(Throwable th) {
        g2.t.q().u(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        c cVar = this.f25585a;
        y.c(cVar.f25500m, cVar.f25492e, "sgf", new Pair("sgf_reason", th.getMessage()));
        qg0.e("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.vf3
    public final /* synthetic */ void b(Object obj) {
        qg0.b("Initialized webview successfully for SDKCore.");
    }
}
