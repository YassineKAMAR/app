package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
final class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f20333a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ lb f20334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f20335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ d f20336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ d f20337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f20338f;

    o9(v8 v8Var, boolean z7, lb lbVar, boolean z8, d dVar, d dVar2) {
        this.f20338f = v8Var;
        this.f20334b = lbVar;
        this.f20335c = z8;
        this.f20336d = dVar;
        this.f20337e = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        p3.i iVar = this.f20338f.f20564d;
        if (iVar == null) {
            this.f20338f.t().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f20333a) {
            a3.o.j(this.f20334b);
            this.f20338f.T(iVar, this.f20335c ? null : this.f20336d, this.f20334b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f20337e.f19877a)) {
                    a3.o.j(this.f20334b);
                    iVar.x5(this.f20336d, this.f20334b);
                } else {
                    iVar.H3(this.f20336d);
                }
            } catch (RemoteException e8) {
                this.f20338f.t().G().b("Failed to send conditional user property to the service", e8);
            }
        }
        this.f20338f.g0();
    }
}
