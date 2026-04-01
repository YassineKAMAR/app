package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class j43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f9483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ k43 f9486d;

    /* synthetic */ j43(k43 k43Var, byte[] bArr, i43 i43Var) {
        this.f9486d = k43Var;
        this.f9483a = bArr;
    }

    public final j43 a(int i8) {
        this.f9485c = i8;
        return this;
    }

    public final j43 b(int i8) {
        this.f9484b = i8;
        return this;
    }

    public final synchronized void c() {
        try {
            k43 k43Var = this.f9486d;
            if (k43Var.f9946b) {
                k43Var.f9945a.q0(this.f9483a);
                this.f9486d.f9945a.i(this.f9484b);
                this.f9486d.f9945a.F(this.f9485c);
                this.f9486d.f9945a.y0(null);
                this.f9486d.f9945a.n();
            }
        } catch (RemoteException e8) {
            Log.d("GASS", "Clearcut log failed", e8);
        }
    }
}
