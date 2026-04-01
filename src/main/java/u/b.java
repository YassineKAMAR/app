package u;

import java.util.ArrayList;
import t.d;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<t.e> f26540a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f26541b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t.f f26542c;

    public static class a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f26543k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f26544l = 1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f26545m = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b f26546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e.b f26547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f26548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f26549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f26550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f26551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f26552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f26553h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f26554i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26555j;
    }

    /* JADX INFO: renamed from: u.b$b, reason: collision with other inner class name */
    public interface InterfaceC0178b {
        void a(t.e eVar, a aVar);

        void b();
    }

    public b(t.f fVar) {
        this.f26542c = fVar;
    }

    private boolean a(InterfaceC0178b interfaceC0178b, t.e eVar, int i8) {
        this.f26541b.f26546a = eVar.y();
        this.f26541b.f26547b = eVar.R();
        this.f26541b.f26548c = eVar.U();
        this.f26541b.f26549d = eVar.v();
        a aVar = this.f26541b;
        aVar.f26554i = false;
        aVar.f26555j = i8;
        e.b bVar = aVar.f26546a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z7 = bVar == bVar2;
        boolean z8 = aVar.f26547b == bVar2;
        boolean z9 = z7 && eVar.f26389d0 > 0.0f;
        boolean z10 = z8 && eVar.f26389d0 > 0.0f;
        if (z9 && eVar.f26430y[0] == 4) {
            aVar.f26546a = e.b.FIXED;
        }
        if (z10 && eVar.f26430y[1] == 4) {
            aVar.f26547b = e.b.FIXED;
        }
        interfaceC0178b.a(eVar, aVar);
        eVar.h1(this.f26541b.f26550e);
        eVar.I0(this.f26541b.f26551f);
        eVar.H0(this.f26541b.f26553h);
        eVar.x0(this.f26541b.f26552g);
        a aVar2 = this.f26541b;
        aVar2.f26555j = a.f26543k;
        return aVar2.f26554i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(t.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<t.e> r0 = r13.L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.P1(r1)
            u.b$b r2 = r13.F1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<t.e> r5 = r13.L0
            java.lang.Object r5 = r5.get(r4)
            t.e r5 = (t.e) r5
            boolean r6 = r5 instanceof t.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof t.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.j0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            u.l r6 = r5.f26390e
            if (r6 == 0) goto L47
            u.n r7 = r5.f26392f
            if (r7 == 0) goto L47
            u.g r6 = r6.f26624e
            boolean r6 = r6.f26576j
            if (r6 == 0) goto L47
            u.g r6 = r7.f26624e
            boolean r6 = r6.f26576j
            if (r6 == 0) goto L47
            goto La0
        L47:
            t.e$b r6 = r5.s(r3)
            r7 = 1
            t.e$b r8 = r5.s(r7)
            t.e$b r9 = t.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f26426w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f26428x
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.P1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof t.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f26426w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.g0()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f26428x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.g0()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f26389d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = u.b.a.f26543k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.b.b(t.f):void");
    }

    private void c(t.f fVar, String str, int i8, int i9, int i10) {
        int iG = fVar.G();
        int iF = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i9);
        fVar.I0(i10);
        fVar.X0(iG);
        fVar.W0(iF);
        this.f26542c.T1(i8);
        this.f26542c.p1();
    }

    public long d(t.f fVar, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean zE1;
        int i17;
        t.f fVar2;
        int i18;
        boolean z7;
        int i19;
        int i20;
        boolean z8;
        b bVar = this;
        InterfaceC0178b interfaceC0178bF1 = fVar.F1();
        int size = fVar.L0.size();
        int iU = fVar.U();
        int iV = fVar.v();
        boolean zB = t.j.b(i8, 128);
        boolean z9 = zB || t.j.b(i8, 64);
        if (z9) {
            for (int i21 = 0; i21 < size; i21++) {
                t.e eVar = fVar.L0.get(i21);
                e.b bVarY = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z10 = (bVarY == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z10) || ((eVar.i0() && z10) || (eVar instanceof t.k) || eVar.g0() || eVar.i0())) {
                    z9 = false;
                    break;
                }
            }
        }
        if (z9) {
            boolean z11 = q.d.f25661r;
        }
        boolean z12 = z9 & ((i11 == 1073741824 && i13 == 1073741824) || zB);
        if (z12) {
            int iMin = Math.min(fVar.E(), i12);
            int iMin2 = Math.min(fVar.D(), i14);
            if (i11 == 1073741824 && fVar.U() != iMin) {
                fVar.h1(iMin);
                fVar.I1();
            }
            if (i13 == 1073741824 && fVar.v() != iMin2) {
                fVar.I0(iMin2);
                fVar.I1();
            }
            if (i11 == 1073741824 && i13 == 1073741824) {
                zE1 = fVar.C1(zB);
                i17 = 2;
            } else {
                boolean zD1 = fVar.D1(zB);
                if (i11 == 1073741824) {
                    zD1 &= fVar.E1(zB, 0);
                    i17 = 1;
                } else {
                    i17 = 0;
                }
                if (i13 == 1073741824) {
                    zE1 = fVar.E1(zB, 1) & zD1;
                    i17++;
                } else {
                    zE1 = zD1;
                }
            }
            if (zE1) {
                fVar.m1(i11 == 1073741824, i13 == 1073741824);
            }
        } else {
            zE1 = false;
            i17 = 0;
        }
        if (zE1 && i17 == 2) {
            return 0L;
        }
        int iG1 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f26540a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, iU, iV);
        }
        if (size2 > 0) {
            e.b bVarY2 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z13 = bVarY2 == bVar3;
            boolean z14 = fVar.R() == bVar3;
            int iMax = Math.max(fVar.U(), bVar.f26542c.G());
            int iMax2 = Math.max(fVar.v(), bVar.f26542c.F());
            int i22 = 0;
            boolean zS1 = false;
            while (i22 < size2) {
                t.e eVar2 = bVar.f26540a.get(i22);
                if (eVar2 instanceof t.k) {
                    int iU2 = eVar2.U();
                    int iV2 = eVar2.v();
                    i20 = iG1;
                    boolean zA = bVar.a(interfaceC0178bF1, eVar2, a.f26544l) | zS1;
                    int iU3 = eVar2.U();
                    int iV3 = eVar2.v();
                    if (iU3 != iU2) {
                        eVar2.h1(iU3);
                        if (z13 && eVar2.K() > iMax) {
                            iMax = Math.max(iMax, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                        }
                        z8 = true;
                    } else {
                        z8 = zA;
                    }
                    if (iV3 != iV2) {
                        eVar2.I0(iV3);
                        if (z14 && eVar2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                        }
                        z8 = true;
                    }
                    zS1 = z8 | ((t.k) eVar2).s1();
                } else {
                    i20 = iG1;
                }
                i22++;
                iG1 = i20;
            }
            int i23 = iG1;
            int i24 = 0;
            int i25 = 2;
            while (i24 < i25) {
                int i26 = 0;
                while (i26 < size2) {
                    t.e eVar3 = bVar.f26540a.get(i26);
                    if (((eVar3 instanceof t.h) && !(eVar3 instanceof t.k)) || (eVar3 instanceof t.g) || eVar3.T() == 8 || ((z12 && eVar3.f26390e.f26624e.f26576j && eVar3.f26392f.f26624e.f26576j) || (eVar3 instanceof t.k))) {
                        z7 = z12;
                        i19 = size2;
                    } else {
                        int iU4 = eVar3.U();
                        int iV4 = eVar3.v();
                        z7 = z12;
                        int iN = eVar3.n();
                        int i27 = a.f26544l;
                        i19 = size2;
                        if (i24 == 1) {
                            i27 = a.f26545m;
                        }
                        boolean zA2 = bVar.a(interfaceC0178bF1, eVar3, i27) | zS1;
                        int iU5 = eVar3.U();
                        int iV5 = eVar3.v();
                        if (iU5 != iU4) {
                            eVar3.h1(iU5);
                            if (z13 && eVar3.K() > iMax) {
                                iMax = Math.max(iMax, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                            }
                            zA2 = true;
                        }
                        if (iV5 != iV4) {
                            eVar3.I0(iV5);
                            if (z14 && eVar3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                            }
                            zA2 = true;
                        }
                        zS1 = (!eVar3.X() || iN == eVar3.n()) ? zA2 : true;
                    }
                    i26++;
                    bVar = this;
                    z12 = z7;
                    size2 = i19;
                }
                boolean z15 = z12;
                int i28 = size2;
                if (!zS1) {
                    break;
                }
                i24++;
                c(fVar, "intermediate pass", i24, iU, iV);
                bVar = this;
                z12 = z15;
                size2 = i28;
                i25 = 2;
                zS1 = false;
            }
            fVar2 = fVar;
            i18 = i23;
        } else {
            fVar2 = fVar;
            i18 = iG1;
        }
        fVar2.S1(i18);
        return 0L;
    }

    public void e(t.f fVar) {
        this.f26540a.clear();
        int size = fVar.L0.size();
        for (int i8 = 0; i8 < size; i8++) {
            t.e eVar = fVar.L0.get(i8);
            e.b bVarY = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarY == bVar || eVar.R() == bVar) {
                this.f26540a.add(eVar);
            }
        }
        fVar.I1();
    }
}
