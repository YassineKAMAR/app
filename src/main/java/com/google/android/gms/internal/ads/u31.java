package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u31 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f15462f = Integer.toString(0, 36);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f15463g = Integer.toString(1, 36);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cf4 f15464h = new cf4() { // from class: com.google.android.gms.internal.ads.t21
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15465a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nb[] f15468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15469e;

    public u31(String str, nb... nbVarArr) {
        this.f15466b = str;
        this.f15468d = nbVarArr;
        int iB = xg0.b(nbVarArr[0].f11793l);
        this.f15467c = iB == -1 ? xg0.b(nbVarArr[0].f11792k) : iB;
        d(nbVarArr[0].f11784c);
        int i8 = nbVarArr[0].f11786e;
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final int a(nb nbVar) {
        for (int i8 = 0; i8 <= 0; i8++) {
            if (nbVar == this.f15468d[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public final nb b(int i8) {
        return this.f15468d[i8];
    }

    public final u31 c(String str) {
        return new u31(str, this.f15468d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u31.class == obj.getClass()) {
            u31 u31Var = (u31) obj;
            if (this.f15466b.equals(u31Var.f15466b) && Arrays.equals(this.f15468d, u31Var.f15468d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f15469e;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((this.f15466b.hashCode() + 527) * 31) + Arrays.hashCode(this.f15468d);
        this.f15469e = iHashCode;
        return iHashCode;
    }
}
