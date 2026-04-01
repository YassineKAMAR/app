package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zl f9685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final hm f9686f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f9694n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9687g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f9688h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList f9689i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ArrayList f9690j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9691k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f9692l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f9693m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f9695o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f9696p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f9697q = "";

    public jl(int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7) {
        this.f9681a = i8;
        this.f9682b = i9;
        this.f9683c = i10;
        this.f9684d = z7;
        this.f9685e = new zl(i11);
        this.f9686f = new hm(i12, i13, i14);
    }

    private final void p(String str, boolean z7, float f8, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f9683c) {
                return;
            }
            synchronized (this.f9687g) {
                this.f9688h.add(str);
                this.f9691k += str.length();
                if (z7) {
                    this.f9689i.add(str);
                    this.f9690j.add(new ul(f8, f9, f10, f11, this.f9689i.size() - 1));
                }
            }
        }
    }

    private static final String q(ArrayList arrayList, int i8) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            sb.append((String) arrayList.get(i9));
            sb.append(' ');
            i9++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    final int a(int i8, int i9) {
        return this.f9684d ? this.f9682b : (i8 * this.f9681a) + (i9 * this.f9682b);
    }

    public final int b() {
        return this.f9694n;
    }

    final int c() {
        return this.f9691k;
    }

    public final String d() {
        return this.f9695o;
    }

    public final String e() {
        return this.f9696p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((jl) obj).f9695o;
        return str != null && str.equals(this.f9695o);
    }

    public final String f() {
        return this.f9697q;
    }

    public final void g() {
        synchronized (this.f9687g) {
            this.f9693m--;
        }
    }

    public final void h() {
        synchronized (this.f9687g) {
            this.f9693m++;
        }
    }

    public final int hashCode() {
        return this.f9695o.hashCode();
    }

    public final void i() {
        synchronized (this.f9687g) {
            this.f9694n -= 100;
        }
    }

    public final void j(int i8) {
        this.f9692l = i8;
    }

    public final void k(String str, boolean z7, float f8, float f9, float f10, float f11) {
        p(str, z7, f8, f9, f10, f11);
    }

    public final void l(String str, boolean z7, float f8, float f9, float f10, float f11) {
        p(str, z7, f8, f9, f10, f11);
        synchronized (this.f9687g) {
            if (this.f9693m < 0) {
                qg0.b("ActivityContent: negative number of WebViews.");
            }
            m();
        }
    }

    public final void m() {
        synchronized (this.f9687g) {
            int iA = a(this.f9691k, this.f9692l);
            if (iA > this.f9694n) {
                this.f9694n = iA;
                if (!g2.t.q().h().H()) {
                    this.f9695o = this.f9685e.a(this.f9688h);
                    this.f9696p = this.f9685e.a(this.f9689i);
                }
                if (!g2.t.q().h().I()) {
                    this.f9697q = this.f9686f.a(this.f9689i, this.f9690j);
                }
            }
        }
    }

    public final void n() {
        synchronized (this.f9687g) {
            int iA = a(this.f9691k, this.f9692l);
            if (iA > this.f9694n) {
                this.f9694n = iA;
            }
        }
    }

    public final boolean o() {
        boolean z7;
        synchronized (this.f9687g) {
            z7 = this.f9693m == 0;
        }
        return z7;
    }

    public final String toString() {
        ArrayList arrayList = this.f9688h;
        return "ActivityContent fetchId: " + this.f9692l + " score:" + this.f9694n + " total_length:" + this.f9691k + "\n text: " + q(arrayList, 100) + "\n viewableText" + q(this.f9689i, 100) + "\n signture: " + this.f9695o + "\n viewableSignture: " + this.f9696p + "\n viewableSignatureForVertical: " + this.f9697q;
    }
}
