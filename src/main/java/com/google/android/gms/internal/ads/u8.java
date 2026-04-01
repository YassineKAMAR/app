package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class u8 implements p8 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f15546l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fa f15547a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t8 f15552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f15554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private w1 f15555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f15556j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean[] f15549c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s8 f15550d = new s8(128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f15557k = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e9 f15551e = new e9(178, 128);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f15548b = new dq2();

    u8(fa faVar) {
        this.f15547a = faVar;
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) {
        int i8;
        float f8;
        float f9;
        uu1.b(this.f15552f);
        uu1.b(this.f15555i);
        int iL = dq2Var.l();
        int iM = dq2Var.m();
        byte[] bArrI = dq2Var.i();
        this.f15553g += (long) dq2Var.j();
        this.f15555i.d(dq2Var, dq2Var.j());
        while (true) {
            int iA = sd3.a(bArrI, iL, iM, this.f15549c);
            if (iA == iM) {
                break;
            }
            int i9 = iA + 3;
            int i10 = dq2Var.i()[i9] & 255;
            int i11 = iA - iL;
            if (!this.f15556j) {
                if (i11 > 0) {
                    this.f15550d.a(bArrI, iL, iA);
                }
                if (this.f15550d.c(i10, i11 < 0 ? -i11 : 0)) {
                    w1 w1Var = this.f15555i;
                    s8 s8Var = this.f15550d;
                    int i12 = s8Var.f14558d;
                    String str = this.f15554h;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(s8Var.f14559e, s8Var.f14557c);
                    cp2 cp2Var = new cp2(bArrCopyOf, bArrCopyOf.length);
                    cp2Var.m(i12);
                    cp2Var.m(4);
                    cp2Var.k();
                    cp2Var.l(8);
                    if (cp2Var.n()) {
                        cp2Var.l(4);
                        cp2Var.l(3);
                    }
                    int iD = cp2Var.d(4);
                    if (iD == 15) {
                        int iD2 = cp2Var.d(8);
                        int iD3 = cp2Var.d(8);
                        if (iD3 != 0) {
                            f8 = iD2 / iD3;
                            f9 = f8;
                        }
                        pf2.f("H263Reader", "Invalid aspect ratio");
                        f9 = 1.0f;
                    } else {
                        if (iD < 7) {
                            f8 = f15546l[iD];
                            f9 = f8;
                        }
                        pf2.f("H263Reader", "Invalid aspect ratio");
                        f9 = 1.0f;
                    }
                    if (cp2Var.n()) {
                        cp2Var.l(2);
                        cp2Var.l(1);
                        if (cp2Var.n()) {
                            cp2Var.l(15);
                            cp2Var.k();
                            cp2Var.l(15);
                            cp2Var.k();
                            cp2Var.l(15);
                            cp2Var.k();
                            cp2Var.l(3);
                            cp2Var.l(11);
                            cp2Var.k();
                            cp2Var.l(15);
                            cp2Var.k();
                        }
                    }
                    if (cp2Var.d(2) != 0) {
                        pf2.f("H263Reader", "Unhandled video object layer shape");
                    }
                    cp2Var.k();
                    int iD4 = cp2Var.d(16);
                    cp2Var.k();
                    if (cp2Var.n()) {
                        if (iD4 == 0) {
                            pf2.f("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i13 = iD4 - 1;
                            int i14 = 0;
                            while (i13 > 0) {
                                i13 >>= 1;
                                i14++;
                            }
                            cp2Var.l(i14);
                        }
                    }
                    cp2Var.k();
                    int iD5 = cp2Var.d(13);
                    cp2Var.k();
                    int iD6 = cp2Var.d(13);
                    cp2Var.k();
                    cp2Var.k();
                    l9 l9Var = new l9();
                    l9Var.j(str);
                    l9Var.u("video/mp4v-es");
                    l9Var.C(iD5);
                    l9Var.h(iD6);
                    l9Var.r(f9);
                    l9Var.k(Collections.singletonList(bArrCopyOf));
                    w1Var.e(l9Var.D());
                    this.f15556j = true;
                }
            }
            this.f15552f.a(bArrI, iL, iA);
            e9 e9Var = this.f15551e;
            if (i11 > 0) {
                e9Var.a(bArrI, iL, iA);
                i8 = 0;
            } else {
                i8 = -i11;
            }
            if (this.f15551e.d(i8)) {
                e9 e9Var2 = this.f15551e;
                int iB = sd3.b(e9Var2.f7196d, e9Var2.f7197e);
                dq2 dq2Var2 = this.f15548b;
                int i15 = nz2.f12300a;
                dq2Var2.e(this.f15551e.f7196d, iB);
                this.f15547a.a(this.f15557k, this.f15548b);
            }
            if (i10 == 178) {
                if (dq2Var.i()[iA + 2] == 1) {
                    this.f15551e.c(178);
                }
                i10 = 178;
            }
            int i16 = iM - iA;
            this.f15552f.b(this.f15553g - ((long) i16), i16, this.f15556j);
            this.f15552f.c(i10, this.f15557k);
            iL = i9;
        }
        if (!this.f15556j) {
            this.f15550d.a(bArrI, iL, iM);
        }
        this.f15552f.a(bArrI, iL, iM);
        this.f15551e.a(bArrI, iL, iM);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
        uu1.b(this.f15552f);
        if (z7) {
            this.f15552f.b(this.f15553g, 0, this.f15556j);
            this.f15552f.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f15554h = caVar.b();
        w1 w1VarF = s0Var.f(caVar.a(), 2);
        this.f15555i = w1VarF;
        this.f15552f = new t8(w1VarF);
        this.f15547a.b(s0Var, caVar);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f15557k = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        sd3.f(this.f15549c);
        this.f15550d.b();
        t8 t8Var = this.f15552f;
        if (t8Var != null) {
            t8Var.d();
        }
        this.f15551e.b();
        this.f15553g = 0L;
        this.f15557k = -9223372036854775807L;
    }
}
