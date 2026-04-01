package h2;

import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.qg0;

/* JADX INFO: loaded from: classes.dex */
final class t3 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ u3 f22302a;

    /* synthetic */ t3(u3 u3Var, s3 s3Var) {
        this.f22302a = u3Var;
    }

    @Override // h2.l0
    public final void k1(r4 r4Var) {
        o5(r4Var, 1);
    }

    @Override // h2.l0
    public final String m() {
        return null;
    }

    @Override // h2.l0
    public final String n() {
        return null;
    }

    @Override // h2.l0
    public final void o5(r4 r4Var, int i8) {
        qg0.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        jg0.f9600b.post(new r3(this));
    }

    @Override // h2.l0
    public final boolean r() {
        return false;
    }
}
