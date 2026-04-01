package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ig4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tm4 f9184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ jg4 f9187g;

    public ig4(jg4 jg4Var, String str, int i8, tm4 tm4Var) {
        this.f9187g = jg4Var;
        this.f9181a = str;
        this.f9182b = i8;
        this.f9183c = tm4Var == null ? -1L : tm4Var.f15164d;
        if (tm4Var == null || !tm4Var.b()) {
            return;
        }
        this.f9184d = tm4Var;
    }

    public final void g(int i8, tm4 tm4Var) {
        if (this.f9183c == -1 && i8 == this.f9182b && tm4Var != null) {
            jg4 jg4Var = this.f9187g;
            long j8 = tm4Var.f15164d;
            if (j8 >= jg4Var.k()) {
                this.f9183c = j8;
            }
        }
    }

    public final boolean j(int i8, tm4 tm4Var) {
        if (tm4Var == null) {
            return i8 == this.f9182b;
        }
        tm4 tm4Var2 = this.f9184d;
        return tm4Var2 == null ? !tm4Var.b() && tm4Var.f15164d == this.f9183c : tm4Var.f15164d == tm4Var2.f15164d && tm4Var.f15162b == tm4Var2.f15162b && tm4Var.f15163c == tm4Var2.f15163c;
    }

    public final boolean k(ee4 ee4Var) {
        tm4 tm4Var = ee4Var.f7290d;
        if (tm4Var == null) {
            return this.f9182b != ee4Var.f7289c;
        }
        long j8 = this.f9183c;
        if (j8 == -1) {
            return false;
        }
        if (tm4Var.f15164d > j8) {
            return true;
        }
        if (this.f9184d == null) {
            return false;
        }
        s11 s11Var = ee4Var.f7288b;
        int iA = s11Var.a(tm4Var.f15161a);
        int iA2 = s11Var.a(this.f9184d.f15161a);
        tm4 tm4Var2 = ee4Var.f7290d;
        if (tm4Var2.f15164d < this.f9184d.f15164d || iA < iA2) {
            return false;
        }
        if (iA > iA2) {
            return true;
        }
        boolean zB = tm4Var2.b();
        tm4 tm4Var3 = ee4Var.f7290d;
        if (!zB) {
            int i8 = tm4Var3.f15165e;
            return i8 == -1 || i8 > this.f9184d.f15162b;
        }
        int i9 = tm4Var3.f15162b;
        int i10 = tm4Var3.f15163c;
        tm4 tm4Var4 = this.f9184d;
        int i11 = tm4Var4.f15162b;
        if (i9 <= i11) {
            return i9 == i11 && i10 > tm4Var4.f15163c;
        }
        return true;
    }

    public final boolean l(s11 s11Var, s11 s11Var2) {
        int i8 = this.f9182b;
        if (i8 < s11Var.c()) {
            s11Var.e(i8, this.f9187g.f9616a, 0L);
            for (int i9 = this.f9187g.f9616a.f13847n; i9 <= this.f9187g.f9616a.f13848o; i9++) {
                int iA = s11Var2.a(s11Var.f(i9));
                if (iA != -1) {
                    i8 = s11Var2.d(iA, this.f9187g.f9617b, false).f13191c;
                    break;
                }
            }
            i8 = -1;
        } else if (i8 >= s11Var2.c()) {
            i8 = -1;
        }
        this.f9182b = i8;
        if (i8 == -1) {
            return false;
        }
        tm4 tm4Var = this.f9184d;
        return tm4Var == null || s11Var2.a(tm4Var.f15161a) != -1;
    }
}
