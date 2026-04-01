package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class kt0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f10329j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f10330k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10331l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f10332m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f10333n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f10334o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f10335p = Integer.toString(6, 36);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final cf4 f10336q = new cf4() { // from class: com.google.android.gms.internal.ads.js0
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c50 f10339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10345i;

    public kt0(Object obj, int i8, c50 c50Var, Object obj2, int i9, long j8, long j9, int i10, int i11) {
        this.f10337a = obj;
        this.f10338b = i8;
        this.f10339c = c50Var;
        this.f10340d = obj2;
        this.f10341e = i9;
        this.f10342f = j8;
        this.f10343g = j9;
        this.f10344h = i10;
        this.f10345i = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kt0.class == obj.getClass()) {
            kt0 kt0Var = (kt0) obj;
            if (this.f10338b == kt0Var.f10338b && this.f10341e == kt0Var.f10341e && this.f10342f == kt0Var.f10342f && this.f10343g == kt0Var.f10343g && this.f10344h == kt0Var.f10344h && this.f10345i == kt0Var.f10345i && g83.a(this.f10337a, kt0Var.f10337a) && g83.a(this.f10340d, kt0Var.f10340d) && g83.a(this.f10339c, kt0Var.f10339c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10337a, Integer.valueOf(this.f10338b), this.f10339c, this.f10340d, Integer.valueOf(this.f10341e), Long.valueOf(this.f10342f), Long.valueOf(this.f10343g), Integer.valueOf(this.f10344h), Integer.valueOf(this.f10345i)});
    }
}
