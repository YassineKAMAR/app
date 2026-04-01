package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wv3 implements po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f16958b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final po3 f16959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private po3 f16960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private po3 f16961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private po3 f16962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private po3 f16963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private po3 f16964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private po3 f16965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private po3 f16966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private po3 f16967k;

    public wv3(Context context, po3 po3Var) {
        this.f16957a = context.getApplicationContext();
        this.f16959c = po3Var;
    }

    private final po3 c() {
        if (this.f16961e == null) {
            ih3 ih3Var = new ih3(this.f16957a);
            this.f16961e = ih3Var;
            d(ih3Var);
        }
        return this.f16961e;
    }

    private final void d(po3 po3Var) {
        for (int i8 = 0; i8 < this.f16958b.size(); i8++) {
            po3Var.a((g94) this.f16958b.get(i8));
        }
    }

    private static final void e(po3 po3Var, g94 g94Var) {
        if (po3Var != null) {
            po3Var.a(g94Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) {
        po3 po3Var = this.f16967k;
        po3Var.getClass();
        return po3Var.H(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void a(g94 g94Var) {
        g94Var.getClass();
        this.f16959c.a(g94Var);
        this.f16958b.add(g94Var);
        e(this.f16960d, g94Var);
        e(this.f16961e, g94Var);
        e(this.f16962f, g94Var);
        e(this.f16963g, g94Var);
        e(this.f16964h, g94Var);
        e(this.f16965i, g94Var);
        e(this.f16966j, g94Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    @Override // com.google.android.gms.internal.ads.po3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(com.google.android.gms.internal.ads.ut3 r5) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wv3.b(com.google.android.gms.internal.ads.ut3):long");
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        po3 po3Var = this.f16967k;
        if (po3Var == null) {
            return null;
        }
        return po3Var.l();
    }

    @Override // com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final Map m() {
        po3 po3Var = this.f16967k;
        return po3Var == null ? Collections.emptyMap() : po3Var.m();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() {
        po3 po3Var = this.f16967k;
        if (po3Var != null) {
            try {
                po3Var.p();
            } finally {
                this.f16967k = null;
            }
        }
    }
}
