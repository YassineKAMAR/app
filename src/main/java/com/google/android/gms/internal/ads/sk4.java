package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class sk4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sk4 f14744f = new sk4(1, 2, 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final sk4 f14745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f14746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f14747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f14748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f14749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final cf4 f14750l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14755e;

    static {
        oj4 oj4Var = new oj4();
        oj4Var.b(1);
        oj4Var.a(1);
        oj4Var.c(2);
        f14745g = oj4Var.d();
        f14746h = Integer.toString(0, 36);
        f14747i = Integer.toString(1, 36);
        f14748j = Integer.toString(2, 36);
        f14749k = Integer.toString(3, 36);
        f14750l = new cf4() { // from class: com.google.android.gms.internal.ads.fh4
        };
    }

    @Deprecated
    public sk4(int i8, int i9, int i10, byte[] bArr) {
        this.f14751a = i8;
        this.f14752b = i9;
        this.f14753c = i10;
        this.f14754d = bArr;
    }

    public static int a(int i8) {
        if (i8 == 1) {
            return 1;
        }
        if (i8 != 9) {
            return (i8 == 4 || i8 == 5 || i8 == 6 || i8 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i8) {
        if (i8 == 1) {
            return 3;
        }
        if (i8 == 4) {
            return 10;
        }
        if (i8 == 13) {
            return 2;
        }
        if (i8 == 16) {
            return 6;
        }
        if (i8 != 18) {
            return (i8 == 6 || i8 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String f(int i8) {
        return i8 != -1 ? i8 != 1 ? i8 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
    }

    private static String g(int i8) {
        return i8 != -1 ? i8 != 6 ? i8 != 1 ? i8 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String h(int i8) {
        return i8 != -1 ? i8 != 10 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 6 ? i8 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final oj4 c() {
        return new oj4(this, null);
    }

    public final String d() {
        return !e() ? "NA" : String.format(Locale.US, "%s/%s/%s", g(this.f14751a), f(this.f14752b), h(this.f14753c));
    }

    public final boolean e() {
        return (this.f14751a == -1 || this.f14752b == -1 || this.f14753c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sk4.class == obj.getClass()) {
            sk4 sk4Var = (sk4) obj;
            if (this.f14751a == sk4Var.f14751a && this.f14752b == sk4Var.f14752b && this.f14753c == sk4Var.f14753c && Arrays.equals(this.f14754d, sk4Var.f14754d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f14755e;
        if (i8 != 0) {
            return i8;
        }
        int iHashCode = ((((((this.f14751a + 527) * 31) + this.f14752b) * 31) + this.f14753c) * 31) + Arrays.hashCode(this.f14754d);
        this.f14755e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(g(this.f14751a));
        sb.append(", ");
        sb.append(f(this.f14752b));
        sb.append(", ");
        sb.append(h(this.f14753c));
        sb.append(", ");
        sb.append(this.f14754d != null);
        sb.append(")");
        return sb.toString();
    }
}
