package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y8 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r9 f17621a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f17625e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f17627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w1 f17628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x8 f17629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17630j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17632l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean[] f17626f = new boolean[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e9 f17622b = new e9(7, 128);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e9 f17623c = new e9(8, 128);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e9 f17624d = new e9(6, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f17631k = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final dq2 f17633m = new dq2();

    public y8(r9 r9Var, boolean z7, boolean z8) {
        this.f17621a = r9Var;
    }

    private final void e(byte[] bArr, int i8, int i9) {
        if (!this.f17630j) {
            this.f17622b.a(bArr, i8, i9);
            this.f17623c.a(bArr, i8, i9);
        }
        this.f17624d.a(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) {
        int i8;
        int i9;
        e9 e9Var;
        uu1.b(this.f17628h);
        int i10 = nz2.f12300a;
        int iL = dq2Var.l();
        int iM = dq2Var.m();
        byte[] bArrI = dq2Var.i();
        this.f17625e += (long) dq2Var.j();
        this.f17628h.d(dq2Var, dq2Var.j());
        while (true) {
            int iA = sd3.a(bArrI, iL, iM, this.f17626f);
            if (iA == iM) {
                e(bArrI, iL, iM);
                return;
            }
            int i11 = iA + 3;
            int i12 = bArrI[i11] & 31;
            int i13 = iA - iL;
            if (i13 > 0) {
                e(bArrI, iL, iA);
            }
            int i14 = iM - iA;
            long j8 = this.f17625e - ((long) i14);
            int i15 = i13 < 0 ? -i13 : 0;
            long j9 = this.f17631k;
            if (this.f17630j) {
                i8 = iM;
                i9 = i11;
            } else {
                this.f17622b.d(i15);
                this.f17623c.d(i15);
                if (this.f17630j) {
                    i8 = iM;
                    i9 = i11;
                    e9 e9Var2 = this.f17622b;
                    if (e9Var2.e()) {
                        this.f17629i.c(sd3.e(e9Var2.f7196d, 4, e9Var2.f7197e));
                        e9Var = this.f17622b;
                        e9Var.b();
                    } else {
                        e9 e9Var3 = this.f17623c;
                        if (e9Var3.e()) {
                            this.f17629i.b(sd3.d(e9Var3.f7196d, 4, e9Var3.f7197e));
                        }
                    }
                } else {
                    if (this.f17622b.e() && this.f17623c.e()) {
                        ArrayList arrayList = new ArrayList();
                        e9 e9Var4 = this.f17622b;
                        arrayList.add(Arrays.copyOf(e9Var4.f7196d, e9Var4.f7197e));
                        e9 e9Var5 = this.f17623c;
                        arrayList.add(Arrays.copyOf(e9Var5.f7196d, e9Var5.f7197e));
                        e9 e9Var6 = this.f17622b;
                        rc3 rc3VarE = sd3.e(e9Var6.f7196d, 4, e9Var6.f7197e);
                        e9 e9Var7 = this.f17623c;
                        rb3 rb3VarD = sd3.d(e9Var7.f7196d, 4, e9Var7.f7197e);
                        i9 = i11;
                        String strA = ww1.a(rc3VarE.f14053a, rc3VarE.f14054b, rc3VarE.f14055c);
                        w1 w1Var = this.f17628h;
                        l9 l9Var = new l9();
                        i8 = iM;
                        l9Var.j(this.f17627g);
                        l9Var.u("video/avc");
                        l9Var.l0(strA);
                        l9Var.C(rc3VarE.f14057e);
                        l9Var.h(rc3VarE.f14058f);
                        l9Var.r(rc3VarE.f14059g);
                        l9Var.k(arrayList);
                        w1Var.e(l9Var.D());
                        this.f17630j = true;
                        this.f17629i.c(rc3VarE);
                        this.f17629i.b(rb3VarD);
                        this.f17622b.b();
                    }
                    i8 = iM;
                    i9 = i11;
                }
                e9Var = this.f17623c;
                e9Var.b();
            }
            if (this.f17624d.d(i15)) {
                e9 e9Var8 = this.f17624d;
                this.f17633m.e(this.f17624d.f7196d, sd3.b(e9Var8.f7196d, e9Var8.f7197e));
                this.f17633m.g(4);
                this.f17621a.a(j9, this.f17633m);
            }
            if (this.f17629i.f(j8, i14, this.f17630j, this.f17632l)) {
                this.f17632l = false;
            }
            long j10 = this.f17631k;
            if (!this.f17630j) {
                this.f17622b.c(i12);
                this.f17623c.c(i12);
            }
            this.f17624d.c(i12);
            this.f17629i.e(j8, i12, j10);
            iL = i9;
            iM = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
        uu1.b(this.f17628h);
        int i8 = nz2.f12300a;
        if (z7) {
            this.f17629i.a(this.f17625e);
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f17627g = caVar.b();
        w1 w1VarF = s0Var.f(caVar.a(), 2);
        this.f17628h = w1VarF;
        this.f17629i = new x8(w1VarF, false, false);
        this.f17621a.b(s0Var, caVar);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f17631k = j8;
        }
        this.f17632l |= (i8 & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f17625e = 0L;
        this.f17632l = false;
        this.f17631k = -9223372036854775807L;
        sd3.f(this.f17626f);
        this.f17622b.b();
        this.f17623c.b();
        this.f17624d.b();
        x8 x8Var = this.f17629i;
        if (x8Var != null) {
            x8Var.d();
        }
    }
}
