package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class jg4 implements ng4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c93 f9614i = new c93() { // from class: com.google.android.gms.internal.ads.hg4
        @Override // com.google.android.gms.internal.ads.c93
        public final Object j() {
            return jg4.n();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f9615j = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c93 f9619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private mg4 f9620e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9622g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r01 f9616a = new r01();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final py0 f9617b = new py0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f9618c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s11 f9621f = s11.f14453a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9623h = -1;

    public jg4(c93 c93Var) {
        this.f9619d = c93Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k() {
        ig4 ig4Var = (ig4) this.f9618c.get(this.f9622g);
        return (ig4Var == null || ig4Var.f9183c == -1) ? this.f9623h + 1 : ig4Var.f9183c;
    }

    private final ig4 l(int i8, tm4 tm4Var) {
        long j8 = Long.MAX_VALUE;
        ig4 ig4Var = null;
        for (ig4 ig4Var2 : this.f9618c.values()) {
            ig4Var2.g(i8, tm4Var);
            if (ig4Var2.j(i8, tm4Var)) {
                long j9 = ig4Var2.f9183c;
                if (j9 == -1 || j9 < j8) {
                    ig4Var = ig4Var2;
                    j8 = j9;
                } else if (j9 == j8) {
                    int i9 = nz2.f12300a;
                    if (ig4Var.f9184d != null && ig4Var2.f9184d != null) {
                        ig4Var = ig4Var2;
                    }
                }
            }
        }
        if (ig4Var != null) {
            return ig4Var;
        }
        String strN = n();
        ig4 ig4Var3 = new ig4(this, strN, i8, tm4Var);
        this.f9618c.put(strN, ig4Var3);
        return ig4Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n() {
        byte[] bArr = new byte[12];
        f9615j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void o(ig4 ig4Var) {
        if (ig4Var.f9183c != -1) {
            this.f9623h = ig4Var.f9183c;
        }
        this.f9622g = null;
    }

    private final void p(ee4 ee4Var) {
        if (ee4Var.f7288b.o()) {
            String str = this.f9622g;
            if (str != null) {
                ig4 ig4Var = (ig4) this.f9618c.get(str);
                ig4Var.getClass();
                o(ig4Var);
                return;
            }
            return;
        }
        ig4 ig4Var2 = (ig4) this.f9618c.get(this.f9622g);
        ig4 ig4VarL = l(ee4Var.f7289c, ee4Var.f7290d);
        this.f9622g = ig4VarL.f9181a;
        c(ee4Var);
        tm4 tm4Var = ee4Var.f7290d;
        if (tm4Var == null || !tm4Var.b()) {
            return;
        }
        if (ig4Var2 != null) {
            if (ig4Var2.f9183c == tm4Var.f15164d && ig4Var2.f9184d != null && ig4Var2.f9184d.f15162b == ee4Var.f7290d.f15162b && ig4Var2.f9184d.f15163c == ee4Var.f7290d.f15163c) {
                return;
            }
        }
        tm4 tm4Var2 = ee4Var.f7290d;
        String unused = l(ee4Var.f7289c, new tm4(tm4Var2.f15161a, tm4Var2.f15164d)).f9181a;
        String unused2 = ig4VarL.f9181a;
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final synchronized void a(ee4 ee4Var) {
        mg4 mg4Var;
        String str = this.f9622g;
        if (str != null) {
            ig4 ig4Var = (ig4) this.f9618c.get(str);
            ig4Var.getClass();
            o(ig4Var);
        }
        Iterator it = this.f9618c.values().iterator();
        while (it.hasNext()) {
            ig4 ig4Var2 = (ig4) it.next();
            it.remove();
            if (ig4Var2.f9185e && (mg4Var = this.f9620e) != null) {
                mg4Var.i(ee4Var, ig4Var2.f9181a, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final synchronized void b(ee4 ee4Var, int i8) {
        this.f9620e.getClass();
        Iterator it = this.f9618c.values().iterator();
        while (it.hasNext()) {
            ig4 ig4Var = (ig4) it.next();
            if (ig4Var.k(ee4Var)) {
                it.remove();
                if (ig4Var.f9185e) {
                    boolean zEquals = ig4Var.f9181a.equals(this.f9622g);
                    boolean z7 = false;
                    if (i8 == 0 && zEquals && ig4Var.f9186f) {
                        z7 = true;
                    }
                    if (zEquals) {
                        o(ig4Var);
                    }
                    this.f9620e.i(ee4Var, ig4Var.f9181a, z7);
                }
            }
        }
        p(ee4Var);
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final synchronized void c(ee4 ee4Var) {
        this.f9620e.getClass();
        if (ee4Var.f7288b.o()) {
            return;
        }
        tm4 tm4Var = ee4Var.f7290d;
        if (tm4Var != null) {
            if (tm4Var.f15164d < k()) {
                return;
            }
            ig4 ig4Var = (ig4) this.f9618c.get(this.f9622g);
            if (ig4Var != null && ig4Var.f9183c == -1 && ig4Var.f9182b != ee4Var.f7289c) {
                return;
            }
        }
        ig4 ig4VarL = l(ee4Var.f7289c, ee4Var.f7290d);
        if (this.f9622g == null) {
            this.f9622g = ig4VarL.f9181a;
        }
        tm4 tm4Var2 = ee4Var.f7290d;
        if (tm4Var2 != null && tm4Var2.b()) {
            ig4 ig4VarL2 = l(ee4Var.f7289c, new tm4(tm4Var2.f15161a, tm4Var2.f15164d, tm4Var2.f15162b));
            if (!ig4VarL2.f9185e) {
                ig4VarL2.f9185e = true;
                s11 s11Var = ee4Var.f7288b;
                tm4 tm4Var3 = ee4Var.f7290d;
                s11Var.n(tm4Var3.f15161a, this.f9617b);
                this.f9617b.i(ee4Var.f7290d.f15162b);
                Math.max(0L, nz2.E(0L) + nz2.E(0L));
                String unused = ig4VarL2.f9181a;
            }
        }
        if (!ig4VarL.f9185e) {
            ig4VarL.f9185e = true;
            String unused2 = ig4VarL.f9181a;
        }
        if (!ig4VarL.f9181a.equals(this.f9622g) || ig4VarL.f9186f) {
            return;
        }
        ig4VarL.f9186f = true;
        this.f9620e.e(ee4Var, ig4VarL.f9181a);
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final synchronized String d(s11 s11Var, tm4 tm4Var) {
        return l(s11Var.n(tm4Var.f15161a, this.f9617b).f13191c, tm4Var).f9181a;
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final void e(mg4 mg4Var) {
        this.f9620e = mg4Var;
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final synchronized void f(ee4 ee4Var) {
        this.f9620e.getClass();
        s11 s11Var = this.f9621f;
        this.f9621f = ee4Var.f7288b;
        Iterator it = this.f9618c.values().iterator();
        while (it.hasNext()) {
            ig4 ig4Var = (ig4) it.next();
            if (!ig4Var.l(s11Var, this.f9621f) || ig4Var.k(ee4Var)) {
                it.remove();
                if (ig4Var.f9185e) {
                    if (ig4Var.f9181a.equals(this.f9622g)) {
                        o(ig4Var);
                    }
                    this.f9620e.i(ee4Var, ig4Var.f9181a, false);
                }
            }
        }
        p(ee4Var);
    }

    @Override // com.google.android.gms.internal.ads.ng4
    public final synchronized String m() {
        return this.f9622g;
    }
}
