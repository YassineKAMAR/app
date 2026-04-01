package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.a;

/* JADX INFO: loaded from: classes.dex */
public final class e80 extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wv f7181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f7182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f7183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f7184d;

    public e80(wv wvVar) {
        double dK;
        g3.a aVarN;
        this.f7181a = wvVar;
        Uri uriM = null;
        try {
            aVarN = wvVar.n();
        } catch (RemoteException e8) {
            qg0.e("", e8);
        }
        Drawable drawable = aVarN != null ? (Drawable) g3.b.H0(aVarN) : null;
        this.f7182b = drawable;
        try {
            uriM = this.f7181a.m();
        } catch (RemoteException e9) {
            qg0.e("", e9);
        }
        this.f7183c = uriM;
        try {
            dK = this.f7181a.k();
        } catch (RemoteException e10) {
            qg0.e("", e10);
            dK = 1.0d;
        }
        this.f7184d = dK;
        try {
            this.f7181a.p();
        } catch (RemoteException e11) {
            qg0.e("", e11);
        }
        try {
            this.f7181a.l();
        } catch (RemoteException e12) {
            qg0.e("", e12);
        }
    }

    @Override // com.google.android.gms.ads.nativead.a.b
    public final Drawable a() {
        return this.f7182b;
    }
}
