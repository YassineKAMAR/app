package h2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.fc0;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.lc0;
import com.google.android.gms.internal.ads.pc0;
import com.google.android.gms.internal.ads.qc0;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.xc0;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends hc0 {
    private static void P5(final pc0 pc0Var) {
        qg0.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        jg0.f9600b.post(new Runnable() { // from class: h2.b4
            @Override // java.lang.Runnable
            public final void run() {
                pc0 pc0Var2 = pc0Var;
                if (pc0Var2 != null) {
                    try {
                        pc0Var2.g(1);
                    } catch (RemoteException e8) {
                        qg0.i("#007 Could not call remote method.", e8);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void J0(c2 c2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void Q2(xc0 xc0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void Q3(f2 f2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void S2(lc0 lc0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void U2(r4 r4Var, pc0 pc0Var) {
        P5(pc0Var);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void j0(g3.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final Bundle k() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final m2 l() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final String m() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void n2(qc0 qc0Var) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final fc0 p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void u2(g3.a aVar, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final boolean w() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void x2(r4 r4Var, pc0 pc0Var) {
        P5(pc0Var);
    }

    @Override // com.google.android.gms.internal.ads.ic0
    public final void x3(boolean z7) {
    }
}
