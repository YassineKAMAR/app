package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class k9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d0 f20181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ v8 f20184d;

    k9(v8 v8Var, d0 d0Var, String str, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f20184d = v8Var;
        this.f20181a = d0Var;
        this.f20182b = str;
        this.f20183c = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrL2 = null;
        try {
            try {
                p3.i iVar = this.f20184d.f20564d;
                if (iVar == null) {
                    this.f20184d.t().G().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrL2 = iVar.L2(this.f20181a, this.f20182b);
                    this.f20184d.g0();
                }
            } catch (RemoteException e8) {
                this.f20184d.t().G().b("Failed to send event to the service to bundle", e8);
            }
        } finally {
            this.f20184d.f().U(this.f20183c, bArrL2);
        }
    }
}
