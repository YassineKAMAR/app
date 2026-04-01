package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class c9 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dq2 f6214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cp2 f6215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w1 f6216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private nb f6218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f6221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f6222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f6223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f6224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f6225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f6226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f6227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f6228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f6229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f6231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f6232t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f6233u;

    public c9(String str) {
        this.f6213a = str;
        dq2 dq2Var = new dq2(1024);
        this.f6214b = dq2Var;
        byte[] bArrI = dq2Var.i();
        this.f6215c = new cp2(bArrI, bArrI.length);
        this.f6223k = -9223372036854775807L;
    }

    private final int e(cp2 cp2Var) throws yh0 {
        int iA = cp2Var.a();
        l lVarB = m.b(cp2Var, true);
        this.f6233u = lVarB.f10398c;
        this.f6230r = lVarB.f10396a;
        this.f6232t = lVarB.f10397b;
        return iA - cp2Var.a();
    }

    private static long f(cp2 cp2Var) {
        return cp2Var.d((cp2Var.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void a(dq2 dq2Var) throws yh0 {
        int i8;
        int i9;
        int iD;
        boolean zN;
        uu1.b(this.f6216d);
        while (dq2Var.j() > 0) {
            int i10 = this.f6219g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iU = dq2Var.u();
                    if ((iU & 224) == 224) {
                        this.f6222j = iU;
                        this.f6219g = 2;
                    } else if (iU != 86) {
                        this.f6219g = 0;
                    }
                } else if (i10 != 2) {
                    int iMin = Math.min(dq2Var.j(), this.f6221i - this.f6220h);
                    dq2Var.c(this.f6215c.f6432a, this.f6220h, iMin);
                    int i11 = this.f6220h + iMin;
                    this.f6220h = i11;
                    if (i11 == this.f6221i) {
                        this.f6215c.j(0);
                        cp2 cp2Var = this.f6215c;
                        if (cp2Var.n()) {
                            if (this.f6224l) {
                            }
                            this.f6219g = 0;
                        } else {
                            this.f6224l = true;
                            int iD2 = cp2Var.d(1);
                            if (iD2 == 1) {
                                iD = cp2Var.d(1);
                                i9 = 1;
                            } else {
                                i9 = iD2;
                                iD = 0;
                            }
                            this.f6225m = iD;
                            if (iD != 0) {
                                throw yh0.a(null, null);
                            }
                            if (i9 == 1) {
                                f(cp2Var);
                                i9 = 1;
                            }
                            if (!cp2Var.n()) {
                                throw yh0.a(null, null);
                            }
                            this.f6226n = cp2Var.d(6);
                            int iD3 = cp2Var.d(4);
                            int iD4 = cp2Var.d(3);
                            if (iD3 != 0 || iD4 != 0) {
                                throw yh0.a(null, null);
                            }
                            if (i9 == 0) {
                                int iC = cp2Var.c();
                                int iE = e(cp2Var);
                                cp2Var.j(iC);
                                byte[] bArr = new byte[(iE + 7) / 8];
                                cp2Var.g(bArr, 0, iE);
                                l9 l9Var = new l9();
                                l9Var.j(this.f6217e);
                                l9Var.u("audio/mp4a-latm");
                                l9Var.l0(this.f6233u);
                                l9Var.k0(this.f6232t);
                                l9Var.v(this.f6230r);
                                l9Var.k(Collections.singletonList(bArr));
                                l9Var.m(this.f6213a);
                                nb nbVarD = l9Var.D();
                                if (!nbVarD.equals(this.f6218f)) {
                                    this.f6218f = nbVarD;
                                    this.f6231s = 1024000000 / ((long) nbVarD.f11807z);
                                    this.f6216d.e(nbVarD);
                                }
                            } else {
                                cp2Var.l(((int) f(cp2Var)) - e(cp2Var));
                            }
                            int iD5 = cp2Var.d(3);
                            this.f6227o = iD5;
                            if (iD5 == 0) {
                                cp2Var.l(8);
                            } else if (iD5 == 1) {
                                cp2Var.l(9);
                            } else if (iD5 == 3 || iD5 == 4 || iD5 == 5) {
                                cp2Var.l(6);
                            } else {
                                if (iD5 != 6 && iD5 != 7) {
                                    throw new IllegalStateException();
                                }
                                cp2Var.l(1);
                            }
                            boolean zN2 = cp2Var.n();
                            this.f6228p = zN2;
                            this.f6229q = 0L;
                            if (zN2) {
                                if (i9 != 1) {
                                    do {
                                        zN = cp2Var.n();
                                        this.f6229q = (this.f6229q << 8) + ((long) cp2Var.d(8));
                                    } while (zN);
                                } else {
                                    this.f6229q = f(cp2Var);
                                }
                            }
                            if (cp2Var.n()) {
                                cp2Var.l(8);
                            }
                        }
                        if (this.f6225m != 0) {
                            throw yh0.a(null, null);
                        }
                        if (this.f6226n != 0) {
                            throw yh0.a(null, null);
                        }
                        if (this.f6227o != 0) {
                            throw yh0.a(null, null);
                        }
                        int i12 = 0;
                        while (true) {
                            int iD6 = cp2Var.d(8);
                            i8 = i12 + iD6;
                            if (iD6 != 255) {
                                break;
                            } else {
                                i12 = i8;
                            }
                        }
                        int iC2 = cp2Var.c();
                        if ((iC2 & 7) == 0) {
                            this.f6214b.g(iC2 >> 3);
                        } else {
                            cp2Var.g(this.f6214b.i(), 0, i8 * 8);
                            this.f6214b.g(0);
                        }
                        this.f6216d.d(this.f6214b, i8);
                        long j8 = this.f6223k;
                        if (j8 != -9223372036854775807L) {
                            this.f6216d.a(j8, 1, i8, 0, null);
                            this.f6223k += this.f6231s;
                        }
                        if (this.f6228p) {
                            cp2Var.l((int) this.f6229q);
                        }
                        this.f6219g = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iU2 = ((this.f6222j & (-225)) << 8) | dq2Var.u();
                    this.f6221i = iU2;
                    dq2 dq2Var2 = this.f6214b;
                    if (iU2 > dq2Var2.i().length) {
                        dq2Var2.d(iU2);
                        cp2 cp2Var2 = this.f6215c;
                        byte[] bArrI = this.f6214b.i();
                        cp2Var2.i(bArrI, bArrI.length);
                    }
                    this.f6220h = 0;
                    this.f6219g = 3;
                }
            } else if (dq2Var.u() == 86) {
                this.f6219g = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void b(boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void c(s0 s0Var, ca caVar) {
        caVar.c();
        this.f6216d = s0Var.f(caVar.a(), 1);
        this.f6217e = caVar.b();
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void d(long j8, int i8) {
        if (j8 != -9223372036854775807L) {
            this.f6223k = j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.p8
    public final void m() {
        this.f6219g = 0;
        this.f6223k = -9223372036854775807L;
        this.f6224l = false;
    }
}
