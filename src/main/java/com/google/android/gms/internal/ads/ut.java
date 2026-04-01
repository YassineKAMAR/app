package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f15859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15860c;

    protected ut(String str, Object obj, int i8) {
        this.f15858a = str;
        this.f15859b = obj;
        this.f15860c = i8;
    }

    public static ut a(String str, double d8) {
        return new ut(str, Double.valueOf(d8), 3);
    }

    public static ut b(String str, long j8) {
        return new ut(str, Long.valueOf(j8), 2);
    }

    public static ut c(String str, String str2) {
        return new ut(str, str2, 4);
    }

    public static ut d(String str, boolean z7) {
        return new ut(str, Boolean.valueOf(z7), 1);
    }

    public final Object e() {
        zu zuVarA = bv.a();
        if (zuVarA != null) {
            int i8 = this.f15860c - 1;
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? zuVarA.a(this.f15858a, (String) this.f15859b) : zuVarA.b(this.f15858a, ((Double) this.f15859b).doubleValue()) : zuVarA.c(this.f15858a, ((Long) this.f15859b).longValue()) : zuVarA.d(this.f15858a, ((Boolean) this.f15859b).booleanValue());
        }
        if (bv.b() != null) {
            bv.b().j();
        }
        return this.f15859b;
    }
}
