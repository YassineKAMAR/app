package q;

import java.util.Arrays;
import java.util.HashMap;
import q.i;
import t.d;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static boolean f25661r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f25662s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f25663t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f25664u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f25665v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static int f25666w = 1000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static long f25667x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static long f25668y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f25672d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    q.b[] f25675g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final c f25682n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f25685q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25669a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25670b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, i> f25671c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25673e = 32;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25674f = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25676h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25677i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean[] f25678j = new boolean[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f25679k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f25680l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25681m = 32;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private i[] f25683o = new i[f25666w];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25684p = 0;

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends q.b {
        public b(c cVar) {
            this.f25655e = new j(this, cVar);
        }
    }

    public d() {
        this.f25675g = null;
        this.f25675g = new q.b[32];
        C();
        c cVar = new c();
        this.f25682n = cVar;
        this.f25672d = new h(cVar);
        this.f25685q = f25665v ? new b(cVar) : new q.b(cVar);
    }

    private final int B(a aVar, boolean z7) {
        for (int i8 = 0; i8 < this.f25679k; i8++) {
            this.f25678j[i8] = false;
        }
        boolean z8 = false;
        int i9 = 0;
        while (!z8) {
            i9++;
            if (i9 >= this.f25679k * 2) {
                return i9;
            }
            if (aVar.getKey() != null) {
                this.f25678j[aVar.getKey().f25702c] = true;
            }
            i iVarA = aVar.a(this, this.f25678j);
            if (iVarA != null) {
                boolean[] zArr = this.f25678j;
                int i10 = iVarA.f25702c;
                if (zArr[i10]) {
                    return i9;
                }
                zArr[i10] = true;
            }
            if (iVarA != null) {
                float f8 = Float.MAX_VALUE;
                int i11 = -1;
                for (int i12 = 0; i12 < this.f25680l; i12++) {
                    q.b bVar = this.f25675g[i12];
                    if (bVar.f25651a.f25709j != i.a.UNRESTRICTED && !bVar.f25656f && bVar.t(iVarA)) {
                        float fI = bVar.f25655e.i(iVarA);
                        if (fI < 0.0f) {
                            float f9 = (-bVar.f25652b) / fI;
                            if (f9 < f8) {
                                i11 = i12;
                                f8 = f9;
                            }
                        }
                    }
                }
                if (i11 > -1) {
                    q.b bVar2 = this.f25675g[i11];
                    bVar2.f25651a.f25703d = -1;
                    bVar2.x(iVarA);
                    i iVar = bVar2.f25651a;
                    iVar.f25703d = i11;
                    iVar.n(this, bVar2);
                }
            } else {
                z8 = true;
            }
        }
        return i9;
    }

    private void C() {
        int i8 = 0;
        if (f25665v) {
            while (i8 < this.f25680l) {
                q.b bVar = this.f25675g[i8];
                if (bVar != null) {
                    this.f25682n.f25657a.a(bVar);
                }
                this.f25675g[i8] = null;
                i8++;
            }
            return;
        }
        while (i8 < this.f25680l) {
            q.b bVar2 = this.f25675g[i8];
            if (bVar2 != null) {
                this.f25682n.f25658b.a(bVar2);
            }
            this.f25675g[i8] = null;
            i8++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.f25682n.f25659c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
        } else {
            iVarB.g();
        }
        iVarB.i(aVar, str);
        int i8 = this.f25684p;
        int i9 = f25666w;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            f25666w = i10;
            this.f25683o = (i[]) Arrays.copyOf(this.f25683o, i10);
        }
        i[] iVarArr = this.f25683o;
        int i11 = this.f25684p;
        this.f25684p = i11 + 1;
        iVarArr[i11] = iVarB;
        return iVarB;
    }

    private final void l(q.b bVar) {
        int i8;
        if (f25663t && bVar.f25656f) {
            bVar.f25651a.h(this, bVar.f25652b);
        } else {
            q.b[] bVarArr = this.f25675g;
            int i9 = this.f25680l;
            bVarArr[i9] = bVar;
            i iVar = bVar.f25651a;
            iVar.f25703d = i9;
            this.f25680l = i9 + 1;
            iVar.n(this, bVar);
        }
        if (f25663t && this.f25669a) {
            int i10 = 0;
            while (i10 < this.f25680l) {
                if (this.f25675g[i10] == null) {
                    System.out.println("WTF");
                }
                q.b bVar2 = this.f25675g[i10];
                if (bVar2 != null && bVar2.f25656f) {
                    bVar2.f25651a.h(this, bVar2.f25652b);
                    (f25665v ? this.f25682n.f25657a : this.f25682n.f25658b).a(bVar2);
                    this.f25675g[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i8 = this.f25680l;
                        if (i11 >= i8) {
                            break;
                        }
                        q.b[] bVarArr2 = this.f25675g;
                        int i13 = i11 - 1;
                        q.b bVar3 = bVarArr2[i11];
                        bVarArr2[i13] = bVar3;
                        i iVar2 = bVar3.f25651a;
                        if (iVar2.f25703d == i11) {
                            iVar2.f25703d = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i8) {
                        this.f25675g[i12] = null;
                    }
                    this.f25680l = i8 - 1;
                    i10--;
                }
                i10++;
            }
            this.f25669a = false;
        }
    }

    private void n() {
        for (int i8 = 0; i8 < this.f25680l; i8++) {
            q.b bVar = this.f25675g[i8];
            bVar.f25651a.f25705f = bVar.f25652b;
        }
    }

    public static q.b s(d dVar, i iVar, i iVar2, float f8) {
        return dVar.r().j(iVar, iVar2, f8);
    }

    private int u(a aVar) {
        boolean z7;
        int i8 = 0;
        while (true) {
            if (i8 >= this.f25680l) {
                z7 = false;
                break;
            }
            q.b bVar = this.f25675g[i8];
            if (bVar.f25651a.f25709j != i.a.UNRESTRICTED && bVar.f25652b < 0.0f) {
                z7 = true;
                break;
            }
            i8++;
        }
        if (!z7) {
            return 0;
        }
        boolean z8 = false;
        int i9 = 0;
        while (!z8) {
            i9++;
            float f8 = Float.MAX_VALUE;
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f25680l; i13++) {
                q.b bVar2 = this.f25675g[i13];
                if (bVar2.f25651a.f25709j != i.a.UNRESTRICTED && !bVar2.f25656f && bVar2.f25652b < 0.0f) {
                    int i14 = 9;
                    if (f25664u) {
                        int iB = bVar2.f25655e.b();
                        int i15 = 0;
                        while (i15 < iB) {
                            i iVarC = bVar2.f25655e.c(i15);
                            float fI = bVar2.f25655e.i(iVarC);
                            if (fI > 0.0f) {
                                int i16 = 0;
                                while (i16 < i14) {
                                    float f9 = iVarC.f25707h[i16] / fI;
                                    if ((f9 < f8 && i16 == i12) || i16 > i12) {
                                        i11 = iVarC.f25702c;
                                        i12 = i16;
                                        i10 = i13;
                                        f8 = f9;
                                    }
                                    i16++;
                                    i14 = 9;
                                }
                            }
                            i15++;
                            i14 = 9;
                        }
                    } else {
                        for (int i17 = 1; i17 < this.f25679k; i17++) {
                            i iVar = this.f25682n.f25660d[i17];
                            float fI2 = bVar2.f25655e.i(iVar);
                            if (fI2 > 0.0f) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f10 = iVar.f25707h[i18] / fI2;
                                    if ((f10 < f8 && i18 == i12) || i18 > i12) {
                                        i11 = i17;
                                        i10 = i13;
                                        i12 = i18;
                                        f8 = f10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i10 != -1) {
                q.b bVar3 = this.f25675g[i10];
                bVar3.f25651a.f25703d = -1;
                bVar3.x(this.f25682n.f25660d[i11]);
                i iVar2 = bVar3.f25651a;
                iVar2.f25703d = i10;
                iVar2.n(this, bVar3);
            } else {
                z8 = true;
            }
            if (i9 > this.f25679k / 2) {
                z8 = true;
            }
        }
        return i9;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i8 = this.f25673e * 2;
        this.f25673e = i8;
        this.f25675g = (q.b[]) Arrays.copyOf(this.f25675g, i8);
        c cVar = this.f25682n;
        cVar.f25660d = (i[]) Arrays.copyOf(cVar.f25660d, this.f25673e);
        int i9 = this.f25673e;
        this.f25678j = new boolean[i9];
        this.f25674f = i9;
        this.f25681m = i9;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i8 = 0;
        while (true) {
            cVar = this.f25682n;
            i[] iVarArr = cVar.f25660d;
            if (i8 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i8];
            if (iVar != null) {
                iVar.g();
            }
            i8++;
        }
        cVar.f25659c.c(this.f25683o, this.f25684p);
        this.f25684p = 0;
        Arrays.fill(this.f25682n.f25660d, (Object) null);
        HashMap<String, i> map = this.f25671c;
        if (map != null) {
            map.clear();
        }
        this.f25670b = 0;
        this.f25672d.clear();
        this.f25679k = 1;
        for (int i9 = 0; i9 < this.f25680l; i9++) {
            q.b bVar = this.f25675g[i9];
            if (bVar != null) {
                bVar.f25653c = false;
            }
        }
        C();
        this.f25680l = 0;
        this.f25685q = f25665v ? new b(this.f25682n) : new q.b(this.f25682n);
    }

    public void b(t.e eVar, t.e eVar2, float f8, int i8) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        q.b bVarR = r();
        double d8 = f8;
        double d9 = i8;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d8) * d9));
        d(bVarR);
        q.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d8) * d9));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i8, float f8, i iVar3, i iVar4, int i9, int i10) {
        q.b bVarR = r();
        bVarR.h(iVar, iVar2, i8, f8, iVar3, iVar4, i9);
        if (i10 != 8) {
            bVarR.d(this, i10);
        }
        d(bVarR);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(q.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f25680l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f25681m
            if (r0 >= r2) goto L12
            int r0 = r5.f25679k
            int r0 = r0 + r1
            int r2 = r5.f25674f
            if (r0 < r2) goto L15
        L12:
            r5.y()
        L15:
            r0 = 0
            boolean r2 = r6.f25656f
            if (r2 != 0) goto L81
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L78
            q.i r2 = r5.p()
            r6.f25651a = r2
            int r3 = r5.f25680l
            r5.l(r6)
            int r4 = r5.f25680l
            int r3 = r3 + r1
            if (r4 != r3) goto L78
            q.d$a r0 = r5.f25685q
            r0.b(r6)
            q.d$a r0 = r5.f25685q
            r5.B(r0, r1)
            int r0 = r2.f25703d
            r3 = -1
            if (r0 != r3) goto L79
            q.i r0 = r6.f25651a
            if (r0 != r2) goto L59
            q.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f25656f
            if (r0 != 0) goto L62
            q.i r0 = r6.f25651a
            r0.n(r5, r6)
        L62:
            boolean r0 = q.d.f25665v
            if (r0 == 0) goto L6b
            q.c r0 = r5.f25682n
            q.f<q.b> r0 = r0.f25657a
            goto L6f
        L6b:
            q.c r0 = r5.f25682n
            q.f<q.b> r0 = r0.f25658b
        L6f:
            r0.a(r6)
            int r0 = r5.f25680l
            int r0 = r0 - r1
            r5.f25680l = r0
            goto L79
        L78:
            r1 = 0
        L79:
            boolean r0 = r6.s()
            if (r0 != 0) goto L80
            return
        L80:
            r0 = r1
        L81:
            if (r0 != 0) goto L86
            r5.l(r6)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.d(q.b):void");
    }

    public q.b e(i iVar, i iVar2, int i8, int i9) {
        if (f25662s && i9 == 8 && iVar2.f25706g && iVar.f25703d == -1) {
            iVar.h(this, iVar2.f25705f + i8);
            return null;
        }
        q.b bVarR = r();
        bVarR.n(iVar, iVar2, i8);
        if (i9 != 8) {
            bVarR.d(this, i9);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i8) {
        q.b bVarR;
        if (f25662s && iVar.f25703d == -1) {
            float f8 = i8;
            iVar.h(this, f8);
            for (int i9 = 0; i9 < this.f25670b + 1; i9++) {
                i iVar2 = this.f25682n.f25660d[i9];
                if (iVar2 != null && iVar2.f25713n && iVar2.f25714o == iVar.f25702c) {
                    iVar2.h(this, iVar2.f25715p + f8);
                }
            }
            return;
        }
        int i10 = iVar.f25703d;
        if (i10 != -1) {
            q.b bVar = this.f25675g[i10];
            if (!bVar.f25656f) {
                if (bVar.f25655e.b() == 0) {
                    bVar.f25656f = true;
                } else {
                    bVarR = r();
                    bVarR.m(iVar, i8);
                }
            }
            bVar.f25652b = i8;
            return;
        }
        bVarR = r();
        bVarR.i(iVar, i8);
        d(bVarR);
    }

    public void g(i iVar, i iVar2, int i8, boolean z7) {
        q.b bVarR = r();
        i iVarT = t();
        iVarT.f25704e = 0;
        bVarR.o(iVar, iVar2, iVarT, i8);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i8, int i9) {
        q.b bVarR = r();
        i iVarT = t();
        iVarT.f25704e = 0;
        bVarR.o(iVar, iVar2, iVarT, i8);
        if (i9 != 8) {
            m(bVarR, (int) (bVarR.f25655e.i(iVarT) * (-1.0f)), i9);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i8, boolean z7) {
        q.b bVarR = r();
        i iVarT = t();
        iVarT.f25704e = 0;
        bVarR.p(iVar, iVar2, iVarT, i8);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i8, int i9) {
        q.b bVarR = r();
        i iVarT = t();
        iVarT.f25704e = 0;
        bVarR.p(iVar, iVar2, iVarT, i8);
        if (i9 != 8) {
            m(bVarR, (int) (bVarR.f25655e.i(iVarT) * (-1.0f)), i9);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f8, int i8) {
        q.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f8);
        if (i8 != 8) {
            bVarR.d(this, i8);
        }
        d(bVarR);
    }

    void m(q.b bVar, int i8, int i9) {
        bVar.e(o(i9, null), i8);
    }

    public i o(int i8, String str) {
        if (this.f25679k + 1 >= this.f25674f) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i9 = this.f25670b + 1;
        this.f25670b = i9;
        this.f25679k++;
        iVarA.f25702c = i9;
        iVarA.f25704e = i8;
        this.f25682n.f25660d[i9] = iVarA;
        this.f25672d.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f25679k + 1 >= this.f25674f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i8 = this.f25670b + 1;
        this.f25670b = i8;
        this.f25679k++;
        iVarA.f25702c = i8;
        this.f25682n.f25660d[i8] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarH = null;
        if (obj == null) {
            return null;
        }
        if (this.f25679k + 1 >= this.f25674f) {
            y();
        }
        if (obj instanceof t.d) {
            t.d dVar = (t.d) obj;
            iVarH = dVar.h();
            if (iVarH == null) {
                dVar.r(this.f25682n);
                iVarH = dVar.h();
            }
            int i8 = iVarH.f25702c;
            if (i8 == -1 || i8 > this.f25670b || this.f25682n.f25660d[i8] == null) {
                if (i8 != -1) {
                    iVarH.g();
                }
                int i9 = this.f25670b + 1;
                this.f25670b = i9;
                this.f25679k++;
                iVarH.f25702c = i9;
                iVarH.f25709j = i.a.UNRESTRICTED;
                this.f25682n.f25660d[i9] = iVarH;
            }
        }
        return iVarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r0
  0x0038: PHI (r0v6 q.b) = (r0v4 q.b), (r0v11 q.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q.b r() {
        /*
            r5 = this;
            boolean r0 = q.d.f25665v
            r1 = 1
            if (r0 == 0) goto L1f
            q.c r0 = r5.f25682n
            q.f<q.b> r0 = r0.f25657a
            java.lang.Object r0 = r0.b()
            q.b r0 = (q.b) r0
            if (r0 != 0) goto L38
            q.d$b r0 = new q.d$b
            q.c r3 = r5.f25682n
            r0.<init>(r3)
            long r3 = q.d.f25668y
            long r3 = r3 + r1
            q.d.f25668y = r3
            goto L3b
        L1f:
            q.c r0 = r5.f25682n
            q.f<q.b> r0 = r0.f25658b
            java.lang.Object r0 = r0.b()
            q.b r0 = (q.b) r0
            if (r0 != 0) goto L38
            q.b r0 = new q.b
            q.c r3 = r5.f25682n
            r0.<init>(r3)
            long r3 = q.d.f25667x
            long r3 = r3 + r1
            q.d.f25667x = r3
            goto L3b
        L38:
            r0.y()
        L3b:
            q.i.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.r():q.b");
    }

    public i t() {
        if (this.f25679k + 1 >= this.f25674f) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i8 = this.f25670b + 1;
        this.f25670b = i8;
        this.f25679k++;
        iVarA.f25702c = i8;
        this.f25682n.f25660d[i8] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.f25682n;
    }

    public int x(Object obj) {
        i iVarH = ((t.d) obj).h();
        if (iVarH != null) {
            return (int) (iVarH.f25705f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f25672d.isEmpty()) {
            n();
            return;
        }
        if (this.f25676h || this.f25677i) {
            boolean z7 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= this.f25680l) {
                    z7 = true;
                    break;
                } else if (!this.f25675g[i8].f25656f) {
                    break;
                } else {
                    i8++;
                }
            }
            if (z7) {
                n();
                return;
            }
        }
        A(this.f25672d);
    }
}
