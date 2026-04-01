package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ee4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s11 f7288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tm4 f7290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s11 f7292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tm4 f7294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7296j;

    public ee4(long j8, s11 s11Var, int i8, tm4 tm4Var, long j9, s11 s11Var2, int i9, tm4 tm4Var2, long j10, long j11) {
        this.f7287a = j8;
        this.f7288b = s11Var;
        this.f7289c = i8;
        this.f7290d = tm4Var;
        this.f7291e = j9;
        this.f7292f = s11Var2;
        this.f7293g = i9;
        this.f7294h = tm4Var2;
        this.f7295i = j10;
        this.f7296j = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ee4.class == obj.getClass()) {
            ee4 ee4Var = (ee4) obj;
            if (this.f7287a == ee4Var.f7287a && this.f7289c == ee4Var.f7289c && this.f7291e == ee4Var.f7291e && this.f7293g == ee4Var.f7293g && this.f7295i == ee4Var.f7295i && this.f7296j == ee4Var.f7296j && g83.a(this.f7288b, ee4Var.f7288b) && g83.a(this.f7290d, ee4Var.f7290d) && g83.a(this.f7292f, ee4Var.f7292f) && g83.a(this.f7294h, ee4Var.f7294h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7287a), this.f7288b, Integer.valueOf(this.f7289c), this.f7290d, Long.valueOf(this.f7291e), this.f7292f, Integer.valueOf(this.f7293g), this.f7294h, Long.valueOf(this.f7295i), Long.valueOf(this.f7296j)});
    }
}
