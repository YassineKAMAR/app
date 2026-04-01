package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class xv extends c2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wv f17471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f17472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f17473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f17474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17476f;

    public xv(wv wvVar) {
        double dK;
        int iP;
        g3.a aVarN;
        this.f17471a = wvVar;
        Uri uriM = null;
        try {
            aVarN = wvVar.n();
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
        Drawable drawable = aVarN != null ? (Drawable) g3.b.H0(aVarN) : null;
        this.f17472b = drawable;
        try {
            uriM = this.f17471a.m();
        } catch (RemoteException e9) {
            qg0.e("", e9);
        }
        this.f17473c = uriM;
        try {
            dK = this.f17471a.k();
        } catch (RemoteException e10) {
            qg0.e("", e10);
            dK = 1.0d;
        }
        this.f17474d = dK;
        int iL = -1;
        try {
            iP = this.f17471a.p();
        } catch (RemoteException e11) {
            qg0.e("", e11);
            iP = -1;
        }
        this.f17475e = iP;
        try {
            iL = this.f17471a.l();
        } catch (RemoteException e12) {
            qg0.e("", e12);
        }
        this.f17476f = iL;
    }

    @Override // c2.d
    public final Drawable a() {
        return this.f17472b;
    }

    @Override // c2.d
    public final double b() {
        return this.f17474d;
    }

    @Override // c2.d
    public final Uri c() {
        return this.f17473c;
    }

    @Override // c2.d
    public final int d() {
        return this.f17476f;
    }

    @Override // c2.d
    public final int e() {
        return this.f17475e;
    }
}
