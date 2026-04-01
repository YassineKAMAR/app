package a3;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f176b;

    public y0(c cVar, int i8) {
        this.f175a = cVar;
        this.f176b = i8;
    }

    @Override // a3.k
    public final void D4(int i8, IBinder iBinder, c1 c1Var) {
        c cVar = this.f175a;
        o.k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.j(c1Var);
        c.c0(cVar, c1Var);
        j3(i8, iBinder, c1Var.f53a);
    }

    @Override // a3.k
    public final void b2(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // a3.k
    public final void j3(int i8, IBinder iBinder, Bundle bundle) {
        o.k(this.f175a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f175a.N(i8, iBinder, bundle, this.f176b);
        this.f175a = null;
    }
}
