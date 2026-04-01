package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class x8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ lb f20678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ boolean f20679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f20681f;

    x8(v8 v8Var, String str, String str2, lb lbVar, boolean z7, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f20681f = v8Var;
        this.f20676a = str;
        this.f20677b = str2;
        this.f20678c = lbVar;
        this.f20679d = z7;
        this.f20680e = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                p3.i iVar = this.f20681f.f20564d;
                if (iVar == null) {
                    this.f20681f.t().G().c("Failed to get user properties; not connected to service", this.f20676a, this.f20677b);
                } else {
                    a3.o.j(this.f20678c);
                    bundle = ib.F(iVar.B4(this.f20676a, this.f20677b, this.f20679d, this.f20678c));
                    this.f20681f.g0();
                }
            } catch (RemoteException e8) {
                this.f20681f.t().G().c("Failed to get user properties; remote exception", this.f20676a, e8);
            }
        } finally {
            this.f20681f.f().Q(this.f20680e, bundle);
        }
    }
}
