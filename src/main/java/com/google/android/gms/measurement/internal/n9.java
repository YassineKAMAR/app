package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class n9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f20299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ lb f20300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ v8 f20301f;

    n9(v8 v8Var, AtomicReference atomicReference, String str, String str2, String str3, lb lbVar) {
        this.f20301f = v8Var;
        this.f20296a = atomicReference;
        this.f20297b = str;
        this.f20298c = str2;
        this.f20299d = str3;
        this.f20300e = lbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3.i iVar;
        AtomicReference atomicReference2;
        List<d> listP2;
        synchronized (this.f20296a) {
            try {
                try {
                    iVar = this.f20301f.f20564d;
                } catch (RemoteException e8) {
                    this.f20301f.t().G().d("(legacy) Failed to get conditional properties; remote exception", n4.v(this.f20297b), this.f20298c, e8);
                    this.f20296a.set(Collections.emptyList());
                    atomicReference = this.f20296a;
                }
                if (iVar == null) {
                    this.f20301f.t().G().d("(legacy) Failed to get conditional properties; not connected to service", n4.v(this.f20297b), this.f20298c, this.f20299d);
                    this.f20296a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f20297b)) {
                    a3.o.j(this.f20300e);
                    atomicReference2 = this.f20296a;
                    listP2 = iVar.K0(this.f20298c, this.f20299d, this.f20300e);
                } else {
                    atomicReference2 = this.f20296a;
                    listP2 = iVar.P2(this.f20297b, this.f20298c, this.f20299d);
                }
                atomicReference2.set(listP2);
                this.f20301f.g0();
                atomicReference = this.f20296a;
                atomicReference.notify();
            } finally {
                this.f20296a.notify();
            }
        }
    }
}
