package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class p9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f20370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f20371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f20372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f20373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ lb f20374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f20375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ v8 f20376g;

    p9(v8 v8Var, AtomicReference atomicReference, String str, String str2, String str3, lb lbVar, boolean z7) {
        this.f20376g = v8Var;
        this.f20370a = atomicReference;
        this.f20371b = str;
        this.f20372c = str2;
        this.f20373d = str3;
        this.f20374e = lbVar;
        this.f20375f = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        p3.i iVar;
        AtomicReference atomicReference2;
        List<hb> listO1;
        synchronized (this.f20370a) {
            try {
                try {
                    iVar = this.f20376g.f20564d;
                } finally {
                    this.f20370a.notify();
                }
            } catch (RemoteException e8) {
                this.f20376g.t().G().d("(legacy) Failed to get user properties; remote exception", n4.v(this.f20371b), this.f20372c, e8);
                this.f20370a.set(Collections.emptyList());
                atomicReference = this.f20370a;
            }
            if (iVar == null) {
                this.f20376g.t().G().d("(legacy) Failed to get user properties; not connected to service", n4.v(this.f20371b), this.f20372c, this.f20373d);
                this.f20370a.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f20371b)) {
                a3.o.j(this.f20374e);
                atomicReference2 = this.f20370a;
                listO1 = iVar.B4(this.f20372c, this.f20373d, this.f20375f, this.f20374e);
            } else {
                atomicReference2 = this.f20370a;
                listO1 = iVar.o1(this.f20371b, this.f20372c, this.f20373d, this.f20375f);
            }
            atomicReference2.set(listO1);
            this.f20376g.g0();
            atomicReference = this.f20370a;
            atomicReference.notify();
        }
    }
}
