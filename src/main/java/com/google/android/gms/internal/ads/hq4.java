package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hq4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u31 f8892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f8893b;

    public hq4(u31 u31Var, int[] iArr, int i8) {
        if (iArr.length == 0) {
            pf2.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f8892a = u31Var;
        this.f8893b = iArr;
    }
}
