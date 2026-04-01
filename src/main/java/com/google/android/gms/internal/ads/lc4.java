package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class lc4 implements Handler.Callback, qm4, nq4, jd4, ga4, md4 {
    private boolean B;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private kc4 I;
    private long W;
    private int X;
    private boolean Y;
    private ja4 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sd4[] f10587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f10589b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final va4 f10590b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ud4[] f10591c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ea4 f10592c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final oq4 f10593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pq4 f10594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final oc4 f10595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wq4 f10596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g62 f10597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HandlerThread f10598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Looper f10599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final r01 f10600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final py0 f10601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f10602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ha4 f10603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList f10604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final vv1 f10605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final xc4 f10606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final kd4 f10607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final long f10608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private wd4 f10609t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ld4 f10610u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private jc4 f10611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10612w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10614y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10615z;
    private int C = 0;
    private boolean D = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10613x = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private long f10588a0 = -9223372036854775807L;
    private long A = -9223372036854775807L;

    public lc4(sd4[] sd4VarArr, oq4 oq4Var, pq4 pq4Var, oc4 oc4Var, wq4 wq4Var, int i8, boolean z7, de4 de4Var, wd4 wd4Var, ea4 ea4Var, long j8, boolean z8, Looper looper, vv1 vv1Var, va4 va4Var, pg4 pg4Var, Looper looper2) {
        this.f10590b0 = va4Var;
        this.f10587a = sd4VarArr;
        this.f10593d = oq4Var;
        this.f10594e = pq4Var;
        this.f10595f = oc4Var;
        this.f10596g = wq4Var;
        this.f10609t = wd4Var;
        this.f10592c0 = ea4Var;
        this.f10608s = j8;
        this.f10605p = vv1Var;
        this.f10602m = oc4Var.j();
        oc4Var.n();
        ld4 ld4VarI = ld4.i(pq4Var);
        this.f10610u = ld4VarI;
        this.f10611v = new jc4(ld4VarI);
        int length = sd4VarArr.length;
        this.f10591c = new ud4[2];
        td4 td4VarA = oq4Var.a();
        for (int i9 = 0; i9 < 2; i9++) {
            sd4VarArr[i9].h(i9, pg4Var, vv1Var);
            this.f10591c[i9] = sd4VarArr[i9].u();
            this.f10591c[i9].f(td4VarA);
        }
        this.f10603n = new ha4(this, vv1Var);
        this.f10604o = new ArrayList();
        this.f10589b = Collections.newSetFromMap(new IdentityHashMap());
        this.f10600k = new r01();
        this.f10601l = new py0();
        oq4Var.h(this, wq4Var);
        this.Y = true;
        g62 g62VarA = vv1Var.a(looper, null);
        this.f10606q = new xc4(de4Var, g62VarA);
        this.f10607r = new kd4(this, de4Var, g62VarA, pg4Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f10598i = handlerThread;
        handlerThread.start();
        Looper looper3 = handlerThread.getLooper();
        this.f10599j = looper3;
        this.f10597h = vv1Var.a(looper3, this);
    }

    private final void A(int i8) {
        ld4 ld4Var = this.f10610u;
        if (ld4Var.f10628e != i8) {
            if (i8 != 2) {
                this.f10588a0 = -9223372036854775807L;
            }
            this.f10610u = ld4Var.g(i8);
        }
    }

    private final void B() {
        I(false, false);
        this.f10603n.f();
        sd4[] sd4VarArr = this.f10587a;
        int length = sd4VarArr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            sd4 sd4Var = sd4VarArr[i8];
            if (L(sd4Var)) {
                sd4Var.L();
            }
        }
    }

    private final void C(boolean z7, boolean z8) {
        r(z7 || !this.E, false, true, false);
        this.f10611v.a(z8 ? 1 : 0);
        this.f10595f.p();
        A(1);
    }

    private final void D() {
        this.f10603n.g();
        sd4[] sd4VarArr = this.f10587a;
        int length = sd4VarArr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            sd4 sd4Var = sd4VarArr[i8];
            if (L(sd4Var)) {
                S(sd4Var);
            }
        }
    }

    private final void E() {
        uc4 uc4VarF = this.f10606q.f();
        boolean z7 = this.B || (uc4VarF != null && uc4VarF.f15609a.y());
        ld4 ld4Var = this.f10610u;
        if (z7 != ld4Var.f10630g) {
            this.f10610u = new ld4(ld4Var.f10624a, ld4Var.f10625b, ld4Var.f10626c, ld4Var.f10627d, ld4Var.f10628e, ld4Var.f10629f, z7, ld4Var.f10631h, ld4Var.f10632i, ld4Var.f10633j, ld4Var.f10634k, ld4Var.f10635l, ld4Var.f10636m, ld4Var.f10637n, ld4Var.f10639p, ld4Var.f10640q, ld4Var.f10641r, ld4Var.f10642s, ld4Var.f10638o);
        }
    }

    private final void F(tm4 tm4Var, to4 to4Var, pq4 pq4Var) {
        s11 s11Var = this.f10610u.f10624a;
        iq4[] iq4VarArr = pq4Var.f12997c;
        this.f10595f.a(s11Var, tm4Var, this.f10587a, to4Var, iq4VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r5 > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r7 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r0 < 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r0 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (r3 >= 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r5 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r7 = (com.google.android.gms.internal.ads.ic4) r11.f10604o.get(r5 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if (r5 >= r11.f10604o.size()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r0 = (com.google.android.gms.internal.ads.ic4) r11.f10604o.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r11.X = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        r7 = (com.google.android.gms.internal.ads.ic4) r11.f10604o.get(r5 - 1);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:40:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G() {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc4.G():void");
    }

    private final void H(s11 s11Var, tm4 tm4Var, s11 s11Var2, tm4 tm4Var2, long j8, boolean z7) {
        if (!P(s11Var, tm4Var)) {
            dm0 dm0Var = tm4Var.b() ? dm0.f6807d : this.f10610u.f10637n;
            if (this.f10603n.l().equals(dm0Var)) {
                return;
            }
            y(dm0Var);
            l(this.f10610u.f10637n, dm0Var.f6811a, false, false);
            return;
        }
        s11Var.e(s11Var.n(tm4Var.f15161a, this.f10601l).f13191c, this.f10600k, 0L);
        ea4 ea4Var = this.f10592c0;
        iv ivVar = this.f10600k.f13843j;
        int i8 = nz2.f12300a;
        ea4Var.d(ivVar);
        if (j8 != -9223372036854775807L) {
            this.f10592c0.e(g0(s11Var, tm4Var.f15161a, j8));
            return;
        }
        if (!nz2.e(!s11Var2.o() ? s11Var2.e(s11Var2.n(tm4Var2.f15161a, this.f10601l).f13191c, this.f10600k, 0L).f13834a : null, this.f10600k.f13834a) || z7) {
            this.f10592c0.e(-9223372036854775807L);
        }
    }

    private final void I(boolean z7, boolean z8) {
        this.f10615z = z7;
        this.A = z8 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    private final synchronized void J(c93 c93Var, long j8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j8;
        boolean z7 = false;
        while (!Boolean.valueOf(((cc4) c93Var).f6307a.f10612w).booleanValue() && j8 > 0) {
            try {
                wait(j8);
            } catch (InterruptedException unused) {
                z7 = true;
            }
            j8 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean K() {
        uc4 uc4VarF = this.f10606q.f();
        return (uc4VarF == null || uc4VarF.d() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean L(sd4 sd4Var) {
        return sd4Var.e() != 0;
    }

    private final boolean M() {
        uc4 uc4VarG = this.f10606q.g();
        long j8 = uc4VarG.f15614f.f16108e;
        if (uc4VarG.f15612d) {
            return j8 == -9223372036854775807L || this.f10610u.f10641r < j8 || !O();
        }
        return false;
    }

    private static boolean N(ld4 ld4Var, py0 py0Var) {
        tm4 tm4Var = ld4Var.f10625b;
        s11 s11Var = ld4Var.f10624a;
        return s11Var.o() || s11Var.n(tm4Var.f15161a, py0Var).f13194f;
    }

    private final boolean O() {
        ld4 ld4Var = this.f10610u;
        return ld4Var.f10635l && ld4Var.f10636m == 0;
    }

    private final boolean P(s11 s11Var, tm4 tm4Var) {
        if (!tm4Var.b() && !s11Var.o()) {
            s11Var.e(s11Var.n(tm4Var.f15161a, this.f10601l).f13191c, this.f10600k, 0L);
            if (this.f10600k.b()) {
                r01 r01Var = this.f10600k;
                if (r01Var.f13841h && r01Var.f13838e != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static nb[] Q(iq4 iq4Var) {
        int iL = iq4Var != null ? iq4Var.l() : 0;
        nb[] nbVarArr = new nb[iL];
        for (int i8 = 0; i8 < iL; i8++) {
            nbVarArr[i8] = iq4Var.f(i8);
        }
        return nbVarArr;
    }

    private static final void R(od4 od4Var) {
        od4Var.j();
        try {
            od4Var.c().a(od4Var.a(), od4Var.g());
        } finally {
            od4Var.h(true);
        }
    }

    private static final void S(sd4 sd4Var) {
        if (sd4Var.e() == 2) {
            sd4Var.M();
        }
    }

    private static final void T(sd4 sd4Var, long j8) {
        sd4Var.Q();
        if (sd4Var instanceof yo4) {
            throw null;
        }
    }

    static Object X(r01 r01Var, py0 py0Var, int i8, boolean z7, Object obj, s11 s11Var, s11 s11Var2) {
        int iA = s11Var.a(obj);
        int iB = s11Var.b();
        int i9 = 0;
        int i10 = iA;
        int iA2 = -1;
        while (true) {
            if (i9 >= iB || iA2 != -1) {
                break;
            }
            i10 = s11Var.i(i10, py0Var, r01Var, i8, z7);
            if (i10 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = s11Var2.a(s11Var.f(i10));
            i9++;
        }
        if (iA2 == -1) {
            return null;
        }
        return s11Var2.f(iA2);
    }

    private final void c(sd4 sd4Var) {
        if (L(sd4Var)) {
            this.f10603n.b(sd4Var);
            S(sd4Var);
            sd4Var.z();
            this.H--;
        }
    }

    private final void f() throws ja4 {
        int length = this.f10587a.length;
        g(new boolean[2], this.f10606q.h().f());
    }

    static final /* synthetic */ void f0(od4 od4Var) {
        try {
            R(od4Var);
        } catch (ja4 e8) {
            pf2.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e8);
            throw new RuntimeException(e8);
        }
    }

    private final void g(boolean[] zArr, long j8) throws ja4 {
        uc4 uc4VarH = this.f10606q.h();
        pq4 pq4VarI = uc4VarH.i();
        int i8 = 0;
        while (true) {
            int length = this.f10587a.length;
            if (i8 >= 2) {
                break;
            }
            if (!pq4VarI.b(i8) && this.f10589b.remove(this.f10587a[i8])) {
                this.f10587a[i8].X();
            }
            i8++;
        }
        int i9 = 0;
        while (true) {
            int length2 = this.f10587a.length;
            if (i9 >= 2) {
                uc4VarH.f15615g = true;
                return;
            }
            if (pq4VarI.b(i9)) {
                boolean z7 = zArr[i9];
                sd4 sd4Var = this.f10587a[i9];
                if (!L(sd4Var)) {
                    xc4 xc4Var = this.f10606q;
                    uc4 uc4VarH2 = xc4Var.h();
                    boolean z8 = uc4VarH2 == xc4Var.g();
                    pq4 pq4VarI2 = uc4VarH2.i();
                    vd4 vd4Var = pq4VarI2.f12996b[i9];
                    nb[] nbVarArrQ = Q(pq4VarI2.f12997c[i9]);
                    boolean z9 = O() && this.f10610u.f10628e == 3;
                    boolean z10 = !z7 && z9;
                    this.H++;
                    this.f10589b.add(sd4Var);
                    sd4Var.p(vd4Var, nbVarArrQ, uc4VarH2.f15611c[i9], this.W, z10, z8, j8, uc4VarH2.e());
                    sd4Var.a(11, new ec4(this));
                    this.f10603n.c(sd4Var);
                    if (z9) {
                        sd4Var.L();
                    }
                }
            }
            i9++;
        }
    }

    private final long g0(s11 s11Var, Object obj, long j8) {
        s11Var.e(s11Var.n(obj, this.f10601l).f13191c, this.f10600k, 0L);
        r01 r01Var = this.f10600k;
        if (r01Var.f13838e != -9223372036854775807L && r01Var.b()) {
            r01 r01Var2 = this.f10600k;
            if (r01Var2.f13841h) {
                long j9 = r01Var2.f13839f;
                return nz2.C((j9 == -9223372036854775807L ? System.currentTimeMillis() : j9 + SystemClock.elapsedRealtime()) - this.f10600k.f13838e) - j8;
            }
        }
        return -9223372036854775807L;
    }

    private final void h(IOException iOException, int i8) {
        xc4 xc4Var = this.f10606q;
        ja4 ja4VarC = ja4.c(iOException, i8);
        uc4 uc4VarG = xc4Var.g();
        if (uc4VarG != null) {
            ja4VarC = ja4VarC.a(uc4VarG.f15614f.f16104a);
        }
        pf2.d("ExoPlayerImplInternal", "Playback error", ja4VarC);
        C(false, false);
        this.f10610u = this.f10610u.f(ja4VarC);
    }

    private final long h0() {
        return i0(this.f10610u.f10639p);
    }

    private final void i(boolean z7) {
        uc4 uc4VarF = this.f10606q.f();
        tm4 tm4Var = uc4VarF == null ? this.f10610u.f10625b : uc4VarF.f15614f.f16104a;
        boolean z8 = !this.f10610u.f10634k.equals(tm4Var);
        if (z8) {
            this.f10610u = this.f10610u.c(tm4Var);
        }
        ld4 ld4Var = this.f10610u;
        ld4Var.f10639p = uc4VarF == null ? ld4Var.f10641r : uc4VarF.c();
        this.f10610u.f10640q = h0();
        if ((z8 || z7) && uc4VarF != null && uc4VarF.f15612d) {
            F(uc4VarF.f15614f.f16104a, uc4VarF.h(), uc4VarF.i());
        }
    }

    private final long i0(long j8) {
        uc4 uc4VarF = this.f10606q.f();
        if (uc4VarF == null) {
            return 0L;
        }
        return Math.max(0L, j8 - (this.W - uc4VarF.e()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0377: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:182:0x0376 */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f7  */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.lc4] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(com.google.android.gms.internal.ads.s11 r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc4.j(com.google.android.gms.internal.ads.s11, boolean):void");
    }

    private final long j0(tm4 tm4Var, long j8, boolean z7) {
        xc4 xc4Var = this.f10606q;
        return k0(tm4Var, j8, xc4Var.g() != xc4Var.h(), z7);
    }

    private final void k(dm0 dm0Var, boolean z7) {
        l(dm0Var, dm0Var.f6811a, true, z7);
    }

    private final long k0(tm4 tm4Var, long j8, boolean z7, boolean z8) throws ja4 {
        D();
        I(false, true);
        if (z8 || this.f10610u.f10628e == 3) {
            A(2);
        }
        uc4 uc4VarG = this.f10606q.g();
        uc4 uc4VarG2 = uc4VarG;
        while (uc4VarG2 != null && !tm4Var.equals(uc4VarG2.f15614f.f16104a)) {
            uc4VarG2 = uc4VarG2.g();
        }
        if (z7 || uc4VarG != uc4VarG2 || (uc4VarG2 != null && uc4VarG2.e() + j8 < 0)) {
            sd4[] sd4VarArr = this.f10587a;
            int length = sd4VarArr.length;
            for (int i8 = 0; i8 < 2; i8++) {
                c(sd4VarArr[i8]);
            }
            if (uc4VarG2 != null) {
                while (this.f10606q.g() != uc4VarG2) {
                    this.f10606q.d();
                }
                this.f10606q.p(uc4VarG2);
                uc4VarG2.p(1000000000000L);
                f();
            }
        }
        xc4 xc4Var = this.f10606q;
        if (uc4VarG2 != null) {
            xc4Var.p(uc4VarG2);
            if (!uc4VarG2.f15612d) {
                uc4VarG2.f15614f = uc4VarG2.f15614f.b(j8);
            } else if (uc4VarG2.f15613e) {
                j8 = uc4VarG2.f15609a.b(j8);
                uc4VarG2.f15609a.h(j8 - this.f10602m, false);
            }
            u(j8);
            m();
        } else {
            xc4Var.l();
            u(j8);
        }
        i(false);
        this.f10597h.i(2);
        return j8;
    }

    private final void l(dm0 dm0Var, float f8, boolean z7, boolean z8) {
        int i8;
        lc4 lc4Var = this;
        if (z7) {
            if (z8) {
                lc4Var.f10611v.a(1);
            }
            ld4 ld4Var = lc4Var.f10610u;
            lc4Var = this;
            lc4Var.f10610u = new ld4(ld4Var.f10624a, ld4Var.f10625b, ld4Var.f10626c, ld4Var.f10627d, ld4Var.f10628e, ld4Var.f10629f, ld4Var.f10630g, ld4Var.f10631h, ld4Var.f10632i, ld4Var.f10633j, ld4Var.f10634k, ld4Var.f10635l, ld4Var.f10636m, dm0Var, ld4Var.f10639p, ld4Var.f10640q, ld4Var.f10641r, ld4Var.f10642s, ld4Var.f10638o);
        }
        float f9 = dm0Var.f6811a;
        uc4 uc4VarG = lc4Var.f10606q.g();
        while (true) {
            i8 = 0;
            if (uc4VarG == null) {
                break;
            }
            iq4[] iq4VarArr = uc4VarG.i().f12997c;
            int length = iq4VarArr.length;
            while (i8 < length) {
                iq4 iq4Var = iq4VarArr[i8];
                i8++;
            }
            uc4VarG = uc4VarG.g();
        }
        sd4[] sd4VarArr = lc4Var.f10587a;
        int length2 = sd4VarArr.length;
        while (i8 < 2) {
            sd4 sd4Var = sd4VarArr[i8];
            if (sd4Var != null) {
                sd4Var.b(f8, dm0Var.f6811a);
            }
            i8++;
        }
    }

    private final Pair l0(s11 s11Var) {
        long j8 = 0;
        if (s11Var.o()) {
            return Pair.create(ld4.j(), 0L);
        }
        Pair pairL = s11Var.l(this.f10600k, this.f10601l, s11Var.g(this.D), -9223372036854775807L);
        tm4 tm4VarK = this.f10606q.k(s11Var, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (tm4VarK.b()) {
            s11Var.n(tm4VarK.f15161a, this.f10601l);
            if (tm4VarK.f15163c == this.f10601l.e(tm4VarK.f15162b)) {
                this.f10601l.j();
            }
        } else {
            j8 = jLongValue;
        }
        return Pair.create(tm4VarK, Long.valueOf(j8));
    }

    private final void m() {
        long jE;
        long jE2;
        boolean zB = false;
        if (K()) {
            uc4 uc4VarF = this.f10606q.f();
            long jI0 = i0(uc4VarF.d());
            if (uc4VarF == this.f10606q.g()) {
                jE = this.W;
                jE2 = uc4VarF.e();
            } else {
                jE = this.W - uc4VarF.e();
                jE2 = uc4VarF.f15614f.f16105b;
            }
            long j8 = jE - jE2;
            boolean zB2 = this.f10595f.b(j8, jI0, this.f10603n.l().f6811a);
            if (zB2 || jI0 >= 500000 || this.f10602m <= 0) {
                zB = zB2;
            } else {
                this.f10606q.g().f15609a.h(this.f10610u.f10641r, false);
                zB = this.f10595f.b(j8, jI0, this.f10603n.l().f6811a);
            }
        }
        this.B = zB;
        if (zB) {
            this.f10606q.f().k(this.W, this.f10603n.l().f6811a, this.A);
        }
        E();
    }

    private static Pair m0(s11 s11Var, kc4 kc4Var, boolean z7, int i8, boolean z8, r01 r01Var, py0 py0Var) {
        Pair pairL;
        int i9;
        long j8;
        s11 s11Var2 = kc4Var.f10016a;
        if (s11Var.o()) {
            return null;
        }
        s11 s11Var3 = true == s11Var2.o() ? s11Var : s11Var2;
        try {
            pairL = s11Var3.l(r01Var, py0Var, kc4Var.f10017b, kc4Var.f10018c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (s11Var.equals(s11Var3)) {
            return pairL;
        }
        if (s11Var.a(pairL.first) == -1) {
            Object objX = X(r01Var, py0Var, i8, z8, pairL.first, s11Var3, s11Var);
            if (objX != null) {
                i9 = s11Var.n(objX, py0Var).f13191c;
                j8 = -9223372036854775807L;
            }
            return null;
        }
        if (!s11Var3.n(pairL.first, py0Var).f13194f || s11Var3.e(py0Var.f13191c, r01Var, 0L).f13847n != s11Var3.a(pairL.first)) {
            return pairL;
        }
        i9 = s11Var.n(pairL.first, py0Var).f13191c;
        j8 = kc4Var.f10018c;
        return s11Var.l(r01Var, py0Var, i9, j8);
    }

    private final void n() {
        this.f10611v.c(this.f10610u);
        if (this.f10611v.f9565a) {
            va4 va4Var = this.f10590b0;
            va4Var.f16098a.U(this.f10611v);
            this.f10611v = new jc4(this.f10610u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.internal.ads.ld4 n0(com.google.android.gms.internal.ads.tm4 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc4.n0(com.google.android.gms.internal.ads.tm4, long, long, long, boolean, int):com.google.android.gms.internal.ads.ld4");
    }

    private final void p() throws ja4 {
        int i8;
        float f8 = this.f10603n.l().f6811a;
        xc4 xc4Var = this.f10606q;
        uc4 uc4VarH = xc4Var.h();
        boolean z7 = true;
        for (uc4 uc4VarG = xc4Var.g(); uc4VarG != null && uc4VarG.f15612d; uc4VarG = uc4VarG.g()) {
            pq4 pq4VarJ = uc4VarG.j(f8, this.f10610u.f10624a);
            pq4 pq4VarI = uc4VarG.i();
            boolean z8 = false;
            if (pq4VarI != null) {
                if (pq4VarI.f12997c.length == pq4VarJ.f12997c.length) {
                    for (int i9 = 0; i9 < pq4VarJ.f12997c.length; i9++) {
                        if (pq4VarJ.a(pq4VarI, i9)) {
                        }
                    }
                    if (uc4VarG != uc4VarH) {
                        z8 = true;
                    }
                    z7 &= z8;
                }
            }
            if (z7) {
                xc4 xc4Var2 = this.f10606q;
                uc4 uc4VarG2 = xc4Var2.g();
                boolean zP = xc4Var2.p(uc4VarG2);
                int length = this.f10587a.length;
                boolean[] zArr = new boolean[2];
                long jB = uc4VarG2.b(pq4VarJ, this.f10610u.f10641r, zP, zArr);
                ld4 ld4Var = this.f10610u;
                boolean z9 = (ld4Var.f10628e == 4 || jB == ld4Var.f10641r) ? false : true;
                ld4 ld4Var2 = this.f10610u;
                i8 = 2;
                this.f10610u = n0(ld4Var2.f10625b, jB, ld4Var2.f10626c, ld4Var2.f10627d, z9, 5);
                if (z9) {
                    u(jB);
                }
                int length2 = this.f10587a.length;
                boolean[] zArr2 = new boolean[2];
                int i10 = 0;
                while (true) {
                    sd4[] sd4VarArr = this.f10587a;
                    int length3 = sd4VarArr.length;
                    if (i10 >= 2) {
                        break;
                    }
                    sd4 sd4Var = sd4VarArr[i10];
                    boolean zL = L(sd4Var);
                    zArr2[i10] = zL;
                    lo4 lo4Var = uc4VarG2.f15611c[i10];
                    if (zL) {
                        if (lo4Var != sd4Var.w()) {
                            c(sd4Var);
                        } else if (zArr[i10]) {
                            sd4Var.n(this.W);
                        }
                    }
                    i10++;
                }
                g(zArr2, this.W);
            } else {
                i8 = 2;
                this.f10606q.p(uc4VarG);
                if (uc4VarG.f15612d) {
                    uc4VarG.a(pq4VarJ, Math.max(uc4VarG.f15614f.f16105b, this.W - uc4VarG.e()), false);
                }
            }
            i(true);
            if (this.f10610u.f10628e != 4) {
                m();
                G();
                this.f10597h.i(i8);
                return;
            }
            return;
        }
    }

    private final void q() throws ja4 {
        p();
        x(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1 A[PHI: r0
  0x00f1: PHI (r0v11 com.google.android.gms.internal.ads.s11) = 
  (r0v10 com.google.android.gms.internal.ads.s11)
  (r0v10 com.google.android.gms.internal.ads.s11)
  (r0v15 com.google.android.gms.internal.ads.s11)
  (r0v15 com.google.android.gms.internal.ads.s11)
 binds: [B:38:0x00b5, B:40:0x00b9, B:42:0x00ca, B:44:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void r(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc4.r(boolean, boolean, boolean, boolean):void");
    }

    private final void s() {
        uc4 uc4VarG = this.f10606q.g();
        boolean z7 = false;
        if (uc4VarG != null && uc4VarG.f15614f.f16111h && this.f10613x) {
            z7 = true;
        }
        this.f10614y = z7;
    }

    private final void u(long j8) {
        uc4 uc4VarG = this.f10606q.g();
        long jE = j8 + (uc4VarG == null ? 1000000000000L : uc4VarG.e());
        this.W = jE;
        this.f10603n.e(jE);
        sd4[] sd4VarArr = this.f10587a;
        int length = sd4VarArr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            sd4 sd4Var = sd4VarArr[i8];
            if (L(sd4Var)) {
                sd4Var.n(this.W);
            }
        }
        for (uc4 uc4VarG2 = this.f10606q.g(); uc4VarG2 != null; uc4VarG2 = uc4VarG2.g()) {
            for (iq4 iq4Var : uc4VarG2.i().f12997c) {
            }
        }
    }

    private final void v(s11 s11Var, s11 s11Var2) {
        if (s11Var.o() && s11Var2.o()) {
            return;
        }
        int size = this.f10604o.size() - 1;
        if (size < 0) {
            Collections.sort(this.f10604o);
        } else {
            Object obj = ((ic4) this.f10604o.get(size)).f9140a;
            int i8 = nz2.f12300a;
            throw null;
        }
    }

    private final void w(long j8, long j9) {
        this.f10597h.g(2, j8 + j9);
    }

    private final void x(boolean z7) throws ja4 {
        tm4 tm4Var = this.f10606q.g().f15614f.f16104a;
        long jK0 = k0(tm4Var, this.f10610u.f10641r, true, false);
        if (jK0 != this.f10610u.f10641r) {
            ld4 ld4Var = this.f10610u;
            this.f10610u = n0(tm4Var, jK0, ld4Var.f10626c, ld4Var.f10627d, z7, 5);
        }
    }

    private final void y(dm0 dm0Var) {
        this.f10597h.c(16);
        this.f10603n.d(dm0Var);
    }

    private final void z(boolean z7, int i8, boolean z8, int i9) {
        this.f10611v.a(z8 ? 1 : 0);
        this.f10611v.b(i9);
        this.f10610u = this.f10610u.e(z7, i8);
        I(false, false);
        for (uc4 uc4VarG = this.f10606q.g(); uc4VarG != null; uc4VarG = uc4VarG.g()) {
            for (iq4 iq4Var : uc4VarG.i().f12997c) {
            }
        }
        if (!O()) {
            D();
            G();
            return;
        }
        int i10 = this.f10610u.f10628e;
        if (i10 == 3) {
            B();
            this.f10597h.i(2);
        } else if (i10 == 2) {
            this.f10597h.i(2);
        }
    }

    public final Looper U() {
        return this.f10599j;
    }

    final /* synthetic */ Boolean W() {
        return Boolean.valueOf(this.f10612w);
    }

    public final void Z() {
        this.f10597h.d(0).j();
    }

    @Override // com.google.android.gms.internal.ads.md4
    public final synchronized void a(od4 od4Var) {
        if (!this.f10612w && this.f10599j.getThread().isAlive()) {
            this.f10597h.f(14, od4Var).j();
            return;
        }
        pf2.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        od4Var.h(false);
    }

    public final void a0(s11 s11Var, int i8, long j8) {
        this.f10597h.f(3, new kc4(s11Var, i8, j8)).j();
    }

    @Override // com.google.android.gms.internal.ads.ga4
    public final void b(dm0 dm0Var) {
        this.f10597h.f(16, dm0Var).j();
    }

    public final void b0(boolean z7, int i8) {
        this.f10597h.l(1, z7 ? 1 : 0, i8).j();
    }

    public final void c0() {
        this.f10597h.d(6).j();
    }

    @Override // com.google.android.gms.internal.ads.qm4
    public final void d(rm4 rm4Var) {
        this.f10597h.f(8, rm4Var).j();
    }

    public final synchronized boolean d0() {
        if (!this.f10612w && this.f10599j.getThread().isAlive()) {
            this.f10597h.i(7);
            J(new cc4(this), this.f10608s);
            return this.f10612w;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mo4
    public final /* bridge */ /* synthetic */ void e(no4 no4Var) {
        this.f10597h.f(9, (rm4) no4Var).j();
    }

    public final void e0(List list, int i8, long j8, oo4 oo4Var) {
        this.f10597h.f(17, new gc4(list, oo4Var, i8, j8, null)).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06eb A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07e1 A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x087e A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0882 A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0889 A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08a6 A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x095d A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x09df A[Catch: RuntimeException -> 0x0a29, IOException -> 0x0a54, qp3 -> 0x0a59, yh0 -> 0x0a5e, jj4 -> 0x0a75, ja4 -> 0x0a7f, TryCatch #9 {ja4 -> 0x0a7f, jj4 -> 0x0a75, qp3 -> 0x0a59, yh0 -> 0x0a5e, IOException -> 0x0a54, RuntimeException -> 0x0a29, blocks: (B:3:0x0006, B:4:0x0011, B:7:0x0016, B:8:0x0029, B:9:0x002e, B:10:0x0033, B:14:0x003a, B:16:0x003e, B:18:0x0042, B:20:0x0048, B:21:0x004a, B:22:0x004f, B:26:0x0056, B:28:0x005f, B:30:0x006d, B:31:0x0070, B:32:0x0075, B:33:0x0080, B:34:0x0090, B:35:0x00a4, B:36:0x00b7, B:38:0x00c6, B:39:0x00ca, B:40:0x00d8, B:42:0x00e7, B:43:0x0103, B:44:0x0113, B:45:0x011c, B:47:0x012e, B:48:0x013a, B:49:0x014a, B:51:0x0156, B:54:0x0161, B:55:0x0165, B:56:0x0172, B:60:0x0179, B:62:0x0181, B:64:0x0185, B:66:0x018b, B:68:0x0193, B:70:0x019b, B:71:0x019e, B:73:0x01a3, B:80:0x01b0, B:81:0x01b1, B:85:0x01b8, B:87:0x01c6, B:88:0x01cb, B:90:0x01db, B:91:0x01e0, B:92:0x01e5, B:94:0x01f1, B:95:0x01f8, B:96:0x01fd, B:98:0x0209, B:100:0x0235, B:101:0x0256, B:102:0x025a, B:104:0x025f, B:105:0x0270, B:107:0x027c, B:108:0x027f, B:115:0x028a, B:116:0x028b, B:117:0x0290, B:118:0x0298, B:119:0x02aa, B:121:0x02d1, B:187:0x03e8, B:171:0x03b5, B:170:0x03b1, B:196:0x03f9, B:197:0x0406, B:122:0x02f3, B:126:0x0306, B:128:0x0316, B:130:0x032d, B:132:0x0337, B:198:0x0407, B:200:0x041b, B:203:0x0425, B:205:0x0434, B:207:0x0440, B:209:0x046f, B:210:0x0474, B:211:0x0478, B:213:0x047c, B:215:0x0489, B:287:0x05e5, B:289:0x05ed, B:291:0x05f5, B:294:0x05fa, B:295:0x0606, B:297:0x060c, B:299:0x0614, B:302:0x0624, B:304:0x062a, B:305:0x0644, B:307:0x064a, B:309:0x064f, B:311:0x0654, B:313:0x0658, B:315:0x065e, B:317:0x0662, B:319:0x066a, B:321:0x0670, B:323:0x067a, B:326:0x0680, B:327:0x0683, B:329:0x068c, B:331:0x069e, B:333:0x06a7, B:335:0x06af, B:340:0x06b9, B:341:0x06e5, B:343:0x06eb, B:345:0x06f1, B:346:0x06f8, B:218:0x0498, B:220:0x049e, B:223:0x04a4, B:226:0x04af, B:228:0x04b4, B:231:0x04c2, B:233:0x04c8, B:234:0x04d0, B:235:0x04d3, B:237:0x04db, B:239:0x04e9, B:241:0x0525, B:243:0x052f, B:246:0x053a, B:248:0x0542, B:249:0x0545, B:250:0x0548, B:252:0x054e, B:254:0x055d, B:256:0x0563, B:258:0x056f, B:260:0x0579, B:262:0x058a, B:264:0x0590, B:265:0x059b, B:266:0x05a0, B:268:0x05ab, B:271:0x05b0, B:273:0x05b6, B:275:0x05be, B:277:0x05c4, B:279:0x05ca, B:283:0x05d8, B:285:0x05df, B:286:0x05e2, B:214:0x0486, B:349:0x0704, B:353:0x070f, B:355:0x0719, B:356:0x071e, B:358:0x072c, B:359:0x0744, B:361:0x074a, B:363:0x0752, B:365:0x0759, B:369:0x0762, B:374:0x0771, B:380:0x077e, B:382:0x0784, B:392:0x0797, B:394:0x079c, B:396:0x07a8, B:398:0x07ae, B:402:0x07bb, B:404:0x07c3, B:406:0x07c7, B:407:0x07d2, B:409:0x07d8, B:463:0x08ca, B:466:0x08d2, B:468:0x08d7, B:470:0x08df, B:472:0x08ed, B:473:0x08f4, B:474:0x08f8, B:476:0x08fe, B:478:0x0907, B:480:0x090d, B:482:0x0918, B:483:0x091c, B:490:0x093b, B:492:0x0941, B:496:0x094a, B:498:0x094e, B:503:0x0957, B:505:0x095d, B:507:0x09bd, B:509:0x09c2, B:518:0x09d3, B:520:0x09d7, B:521:0x09df, B:522:0x09e6, B:484:0x091f, B:487:0x092d, B:488:0x0934, B:410:0x07e1, B:412:0x07e8, B:414:0x07ec, B:442:0x0872, B:444:0x087e, B:419:0x07f9, B:421:0x07fd, B:423:0x0811, B:425:0x081f, B:427:0x082b, B:431:0x0834, B:433:0x083e, B:439:0x0849, B:445:0x0882, B:447:0x0889, B:449:0x088d, B:453:0x0896, B:455:0x08a6, B:457:0x08ae, B:459:0x08b8, B:460:0x08bd, B:461:0x08c2, B:462:0x08c7, B:395:0x07a1, B:523:0x09eb, B:527:0x09f2, B:528:0x09fa, B:532:0x0a18), top: B:601:0x0006 }] */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.google.android.gms.internal.ads.g94, com.google.android.gms.internal.ads.wq4] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r54) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lc4.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.jd4
    public final void o() {
        this.f10597h.i(22);
    }

    @Override // com.google.android.gms.internal.ads.nq4
    public final void t() {
        this.f10597h.i(10);
    }
}
