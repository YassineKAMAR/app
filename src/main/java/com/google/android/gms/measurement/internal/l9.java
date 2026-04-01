package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class l9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f20203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f20204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f20205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ d0 f20206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f20207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f20208f;

    l9(v8 v8Var, boolean z7, lb lbVar, boolean z8, d0 d0Var, String str) {
        this.f20208f = v8Var;
        this.f20203a = z7;
        this.f20204b = lbVar;
        this.f20205c = z8;
        this.f20206d = d0Var;
        this.f20207e = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        p3.i iVar = this.f20208f.f20564d;
        if (iVar == null) {
            this.f20208f.t().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f20203a) {
            a3.o.j(this.f20204b);
            this.f20208f.T(iVar, this.f20205c ? null : this.f20206d, this.f20204b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f20207e)) {
                    a3.o.j(this.f20204b);
                    iVar.k2(this.f20206d, this.f20204b);
                } else {
                    iVar.P4(this.f20206d, this.f20207e, this.f20208f.t().O());
                }
            } catch (RemoteException e8) {
                this.f20208f.t().G().b("Failed to send event to the service", e8);
            }
        }
        this.f20208f.g0();
    }
}
