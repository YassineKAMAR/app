package com.google.android.gms.internal.ads;

import b2.a;

/* JADX INFO: loaded from: classes.dex */
public final class jm extends qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.AbstractC0055a f9703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9704b;

    public jm(a.AbstractC0055a abstractC0055a, String str) {
        this.f9703a = abstractC0055a;
        this.f9704b = str;
    }

    @Override // com.google.android.gms.internal.ads.rm
    public final void R4(h2.z2 z2Var) {
        if (this.f9703a != null) {
            this.f9703a.b(z2Var.i());
        }
    }

    @Override // com.google.android.gms.internal.ads.rm
    public final void d(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.rm
    public final void g3(om omVar) {
        if (this.f9703a != null) {
            this.f9703a.c(new km(omVar, this.f9704b));
        }
    }
}
