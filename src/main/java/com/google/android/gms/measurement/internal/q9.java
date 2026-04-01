package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class q9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ lb f20416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.w1 f20417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ v8 f20418e;

    q9(v8 v8Var, String str, String str2, lb lbVar, com.google.android.gms.internal.measurement.w1 w1Var) {
        this.f20418e = v8Var;
        this.f20414a = str;
        this.f20415b = str2;
        this.f20416c = lbVar;
        this.f20417d = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                p3.i iVar = this.f20418e.f20564d;
                if (iVar == null) {
                    this.f20418e.t().G().c("Failed to get conditional properties; not connected to service", this.f20414a, this.f20415b);
                } else {
                    a3.o.j(this.f20416c);
                    arrayList = ib.t0(iVar.K0(this.f20414a, this.f20415b, this.f20416c));
                    this.f20418e.g0();
                }
            } catch (RemoteException e8) {
                this.f20418e.t().G().d("Failed to get conditional properties; remote exception", this.f20414a, this.f20415b, e8);
            }
        } finally {
            this.f20418e.f().S(this.f20417d, arrayList);
        }
    }
}
