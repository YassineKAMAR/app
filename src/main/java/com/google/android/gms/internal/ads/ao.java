package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class ao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bo f5360c;

    /* synthetic */ ao(bo boVar, byte[] bArr, zn znVar) {
        this.f5360c = boVar;
        this.f5358a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            bo boVar = this.f5360c;
            if (boVar.f5910b) {
                boVar.f5909a.q0(this.f5358a);
                this.f5360c.f5909a.i(0);
                this.f5360c.f5909a.F(this.f5359b);
                this.f5360c.f5909a.y0(null);
                this.f5360c.f5909a.n();
            }
        } catch (RemoteException e8) {
            qg0.c("Clearcut log failed", e8);
        }
    }

    public final ao a(int i8) {
        this.f5359b = i8;
        return this;
    }

    public final synchronized void c() {
        this.f5360c.f5911c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yn
            @Override // java.lang.Runnable
            public final void run() {
                this.f17861a.d();
            }
        });
    }
}
