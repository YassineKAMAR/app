package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f94 implements po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final po3 f7676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f7678c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f7679d = Collections.emptyMap();

    public f94(po3 po3Var) {
        this.f7676a = po3Var;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        int iH = this.f7676a.H(bArr, i8, i9);
        if (iH != -1) {
            this.f7677b += (long) iH;
        }
        return iH;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void a(g94 g94Var) {
        g94Var.getClass();
        this.f7676a.a(g94Var);
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) {
        this.f7678c = ut3Var.f15867a;
        this.f7679d = Collections.emptyMap();
        long jB = this.f7676a.b(ut3Var);
        Uri uriL = l();
        uriL.getClass();
        this.f7678c = uriL;
        this.f7679d = m();
        return jB;
    }

    public final long c() {
        return this.f7677b;
    }

    public final Uri d() {
        return this.f7678c;
    }

    public final Map e() {
        return this.f7679d;
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f7676a.l();
    }

    @Override // com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final Map m() {
        return this.f7676a.m();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        this.f7676a.p();
    }
}
