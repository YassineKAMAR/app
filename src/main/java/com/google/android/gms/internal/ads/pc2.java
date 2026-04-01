package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class pc2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oi2 f12817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ts2 f12818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f12819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zf0 f12820d;

    public pc2(ke2 ke2Var, ts2 ts2Var, Context context, zf0 zf0Var) {
        this.f12817a = ke2Var;
        this.f12818b = ts2Var;
        this.f12819c = context;
        this.f12820d = zf0Var;
    }

    final /* synthetic */ qc2 a(ui2 ui2Var) {
        String str;
        boolean z7;
        String strX;
        int i8;
        float f8;
        int i9;
        int i10;
        DisplayMetrics displayMetrics;
        h2.w4 w4Var = this.f12818b.f15303e;
        h2.w4[] w4VarArr = w4Var.f22357g;
        if (w4VarArr != null) {
            str = null;
            boolean z8 = false;
            boolean z9 = false;
            z7 = false;
            for (h2.w4 w4Var2 : w4VarArr) {
                boolean z10 = w4Var2.f22359i;
                if (!z10 && !z8) {
                    str = w4Var2.f22351a;
                    z8 = true;
                }
                if (z10) {
                    if (z9) {
                        z9 = true;
                    } else {
                        z9 = true;
                        z7 = true;
                    }
                }
                if (z8 && z9) {
                    break;
                }
            }
        } else {
            str = w4Var.f22351a;
            z7 = w4Var.f22359i;
        }
        Resources resources = this.f12819c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strX = null;
            i8 = 0;
            f8 = 0.0f;
            i9 = 0;
        } else {
            zf0 zf0Var = this.f12820d;
            f8 = displayMetrics.density;
            i9 = displayMetrics.widthPixels;
            i8 = displayMetrics.heightPixels;
            strX = zf0Var.h().x();
        }
        StringBuilder sb = new StringBuilder();
        h2.w4[] w4VarArr2 = w4Var.f22357g;
        if (w4VarArr2 != null) {
            boolean z11 = false;
            for (h2.w4 w4Var3 : w4VarArr2) {
                if (w4Var3.f22359i) {
                    z11 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append(com.amazon.a.a.o.b.f.f3944c);
                    }
                    int i11 = w4Var3.f22355e;
                    if (i11 == -1) {
                        i11 = f8 != 0.0f ? (int) (w4Var3.f22356f / f8) : -1;
                    }
                    sb.append(i11);
                    sb.append("x");
                    int i12 = w4Var3.f22352b;
                    if (i12 == -2) {
                        i12 = f8 != 0.0f ? (int) (w4Var3.f22353c / f8) : -2;
                    }
                    sb.append(i12);
                }
            }
            if (z11) {
                if (sb.length() != 0) {
                    i10 = 0;
                    sb.insert(0, com.amazon.a.a.o.b.f.f3944c);
                } else {
                    i10 = 0;
                }
                sb.insert(i10, "320x50");
            }
        }
        return new qc2(w4Var, str, z7, sb.toString(), f8, i9, i8, strX, this.f12818b.f15314p);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return zf3.m(this.f12817a.k(), new z73() { // from class: com.google.android.gms.internal.ads.oc2
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f12443a.a((ui2) obj);
            }
        }, eh0.f7327f);
    }
}
