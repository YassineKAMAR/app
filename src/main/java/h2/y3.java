package h2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.z40;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private m10 f22377a;

    @Override // h2.n1
    public final boolean A() {
        return false;
    }

    @Override // h2.n1
    public final void C1(m10 m10Var) {
        this.f22377a = m10Var;
    }

    @Override // h2.n1
    public final void G3(z40 z40Var) {
    }

    @Override // h2.n1
    public final void H4(String str) {
    }

    @Override // h2.n1
    public final void I5(boolean z7) {
    }

    @Override // h2.n1
    public final void K4(g3.a aVar, String str) {
    }

    @Override // h2.n1
    public final void M0(String str) {
    }

    @Override // h2.n1
    public final void Y2(String str, g3.a aVar) {
    }

    @Override // h2.n1
    public final void d0(String str) {
    }

    @Override // h2.n1
    public final void h3(z1 z1Var) {
    }

    final /* synthetic */ void k() {
        m10 m10Var = this.f22377a;
        if (m10Var != null) {
            try {
                m10Var.v4(Collections.emptyList());
            } catch (RemoteException e8) {
                qg0.h("Could not notify onComplete event.", e8);
            }
        }
    }

    @Override // h2.n1
    public final float m() {
        return 1.0f;
    }

    @Override // h2.n1
    public final void m1(f4 f4Var) {
    }

    @Override // h2.n1
    public final String n() {
        return "";
    }

    @Override // h2.n1
    public final void n0(boolean z7) {
    }

    @Override // h2.n1
    public final void p3(float f8) {
    }

    @Override // h2.n1
    public final List q() {
        return Collections.emptyList();
    }

    @Override // h2.n1
    public final void r() {
    }

    @Override // h2.n1
    public final void s() {
        qg0.d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        jg0.f9600b.post(new Runnable() { // from class: h2.x3
            @Override // java.lang.Runnable
            public final void run() {
                this.f22369a.k();
            }
        });
    }
}
