package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class c50 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c50 f6154i = new rg().c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f6155j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f6156k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f6157l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f6158m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f6159n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f6160o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final cf4 f6161p = new cf4() { // from class: com.google.android.gms.internal.ads.pd
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fy f6163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final fy f6164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iv f6165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ra0 f6166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xk f6167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public final zm f6168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y00 f6169h;

    /* synthetic */ c50(String str, zm zmVar, fy fyVar, iv ivVar, ra0 ra0Var, y00 y00Var, b40 b40Var) {
        this.f6162a = str;
        this.f6163b = fyVar;
        this.f6164c = fyVar;
        this.f6165d = ivVar;
        this.f6166e = ra0Var;
        this.f6167f = zmVar;
        this.f6168g = zmVar;
        this.f6169h = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50)) {
            return false;
        }
        c50 c50Var = (c50) obj;
        return nz2.e(this.f6162a, c50Var.f6162a) && this.f6167f.equals(c50Var.f6167f) && nz2.e(this.f6163b, c50Var.f6163b) && nz2.e(this.f6165d, c50Var.f6165d) && nz2.e(this.f6166e, c50Var.f6166e) && nz2.e(this.f6169h, c50Var.f6169h);
    }

    public final int hashCode() {
        int iHashCode = this.f6162a.hashCode() * 31;
        fy fyVar = this.f6163b;
        return (((((((iHashCode + (fyVar != null ? fyVar.hashCode() : 0)) * 31) + this.f6165d.hashCode()) * 31) + this.f6167f.hashCode()) * 31) + this.f6166e.hashCode()) * 31;
    }
}
