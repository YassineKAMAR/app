package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class bc4 extends be4 implements ua4 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f5719h0 = 0;
    private final long A;
    private int B;
    private int C;
    private boolean D;
    private int E;
    private wd4 F;
    private hq0 G;
    private ra0 H;
    private ra0 I;
    private nb J;
    private nb K;
    private AudioTrack L;
    private Object M;
    private Surface N;
    private int O;
    private er2 P;
    private ba4 Q;
    private ba4 R;
    private int S;
    private zb4 T;
    private float U;
    private boolean V;
    private tt1 W;
    private boolean X;
    private boolean Y;
    private zr4 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private jj1 f5720a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final pq4 f5721b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private ra0 f5722b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final hq0 f5723c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ld4 f5724c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yx1 f5725d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f5726d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f5727e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f5728e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lu0 f5729f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final va4 f5730f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final sd4[] f5731g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private oo4 f5732g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final oq4 f5733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g62 f5734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lc4 f5735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final mc2 f5736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final CopyOnWriteArraySet f5737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final py0 f5738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f5739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f5740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final sm4 f5741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final de4 f5742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Looper f5743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final wq4 f5744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final vv1 f5745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final wb4 f5746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final yb4 f5747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final u94 f5748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final z94 f5749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ae4 f5750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ce4 f5751z;

    static {
        c60.b("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.de4, com.google.android.gms.internal.ads.vq4, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public bc4(ta4 ta4Var, lu0 lu0Var) {
        Object obj;
        yx1 yx1Var = new yx1(vv1.f16482a);
        this.f5725d = yx1Var;
        try {
            pf2.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-alpha01] [" + nz2.f12304e + "]");
            Context applicationContext = ta4Var.f15024a.getApplicationContext();
            this.f5727e = applicationContext;
            ?? Apply = ta4Var.f15031h.apply(ta4Var.f15025b);
            this.f5742q = Apply;
            this.T = ta4Var.f15033j;
            this.O = ta4Var.f15034k;
            this.V = false;
            this.A = ta4Var.f15038o;
            wb4 wb4Var = new wb4(this, null);
            this.f5746u = wb4Var;
            yb4 yb4Var = new yb4(null);
            this.f5747v = yb4Var;
            Handler handler = new Handler(ta4Var.f15032i);
            sd4[] sd4VarArrA = ((ma4) ta4Var.f15026c).f11220a.a(handler, wb4Var, wb4Var, wb4Var, wb4Var);
            this.f5731g = sd4VarArrA;
            int length = sd4VarArrA.length;
            oq4 oq4Var = (oq4) ta4Var.f15028e.j();
            this.f5733h = oq4Var;
            this.f5741p = ta4.a(((na4) ta4Var.f15027d).f11765a);
            br4 br4VarC = br4.c(((qa4) ta4Var.f15030g).f13383a);
            this.f5744s = br4VarC;
            this.f5740o = ta4Var.f15035l;
            this.F = ta4Var.f15036m;
            Looper looper = ta4Var.f15032i;
            this.f5743r = looper;
            vv1 vv1Var = ta4Var.f15025b;
            this.f5745t = vv1Var;
            this.f5729f = lu0Var;
            mc2 mc2Var = new mc2(looper, vv1Var, new ka2() { // from class: com.google.android.gms.internal.ads.qb4
                @Override // com.google.android.gms.internal.ads.ka2
                public final void a(Object obj2, i6 i6Var) {
                }
            });
            this.f5736k = mc2Var;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f5737l = copyOnWriteArraySet;
            this.f5739n = new ArrayList();
            this.f5732g0 = new oo4(0);
            int length2 = sd4VarArrA.length;
            pq4 pq4Var = new pq4(new vd4[2], new iq4[2], ed1.f7268b, null);
            this.f5721b = pq4Var;
            this.f5738m = new py0();
            fo0 fo0Var = new fo0();
            fo0Var.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 24, 27, 28, 32);
            oq4Var.d();
            fo0Var.d(29, true);
            fo0Var.d(23, false);
            fo0Var.d(25, false);
            fo0Var.d(33, false);
            fo0Var.d(26, false);
            fo0Var.d(34, false);
            hq0 hq0VarE = fo0Var.e();
            this.f5723c = hq0VarE;
            fo0 fo0Var2 = new fo0();
            fo0Var2.b(hq0VarE);
            fo0Var2.a(4);
            fo0Var2.a(10);
            this.G = fo0Var2.e();
            this.f5734i = vv1Var.a(looper, null);
            va4 va4Var = new va4(this);
            this.f5730f0 = va4Var;
            this.f5724c0 = ld4.i(pq4Var);
            Apply.v(lu0Var, looper);
            int i8 = nz2.f12300a;
            this.f5735j = new lc4(sd4VarArrA, oq4Var, pq4Var, (oc4) ta4Var.f15029f.j(), br4VarC, 0, false, Apply, this.F, ta4Var.f15041r, ta4Var.f15037n, false, looper, vv1Var, va4Var, i8 < 31 ? new pg4() : rb4.a(applicationContext, this, ta4Var.f15039p), null);
            this.U = 1.0f;
            ra0 ra0Var = ra0.f14003y;
            this.H = ra0Var;
            this.I = ra0Var;
            this.f5722b0 = ra0Var;
            int iGenerateAudioSessionId = -1;
            this.f5726d0 = -1;
            if (i8 >= 21) {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.S = iGenerateAudioSessionId;
                obj = null;
            } else {
                AudioTrack audioTrack = this.L;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.L.release();
                    obj = null;
                    this.L = null;
                }
                if (this.L == null) {
                    this.L = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.S = this.L.getAudioSessionId();
            }
            this.W = tt1.f15323b;
            this.X = true;
            Apply.getClass();
            mc2Var.b(Apply);
            br4VarC.a(new Handler(looper), Apply);
            copyOnWriteArraySet.add(wb4Var);
            this.f5748w = new u94(ta4Var.f15024a, handler, wb4Var);
            this.f5749x = new z94(ta4Var.f15024a, handler, wb4Var);
            nz2.e(obj, obj);
            this.f5750y = new ae4(ta4Var.f15024a);
            this.f5751z = new ce4(ta4Var.f15024a);
            this.Z = new xp4(0).a();
            this.f5720a0 = jj1.f9649e;
            this.P = er2.f7474c;
            oq4Var.c(this.T);
            h0(1, 10, Integer.valueOf(this.S));
            h0(2, 10, Integer.valueOf(this.S));
            h0(1, 3, this.T);
            h0(2, 4, Integer.valueOf(this.O));
            h0(2, 5, 0);
            h0(1, 9, Boolean.valueOf(this.V));
            h0(2, 7, yb4Var);
            h0(6, 8, yb4Var);
            yx1Var.e();
        } catch (Throwable th) {
            this.f5725d.e();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void P(bc4 bc4Var, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        bc4Var.j0(surface);
        bc4Var.N = surface;
    }

    private final int X(ld4 ld4Var) {
        return ld4Var.f10624a.o() ? this.f5726d0 : ld4Var.f10624a.n(ld4Var.f10625b.f15161a, this.f5738m).f13191c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Y(boolean z7, int i8) {
        return (!z7 || i8 == 1) ? 1 : 2;
    }

    private final long Z(ld4 ld4Var) {
        if (!ld4Var.f10625b.b()) {
            return nz2.E(a0(ld4Var));
        }
        ld4Var.f10624a.n(ld4Var.f10625b.f15161a, this.f5738m);
        long j8 = ld4Var.f10626c;
        if (j8 != -9223372036854775807L) {
            return nz2.E(j8) + nz2.E(0L);
        }
        long j9 = ld4Var.f10624a.e(X(ld4Var), this.f5771a, 0L).f13845l;
        return nz2.E(0L);
    }

    private final long a0(ld4 ld4Var) {
        if (ld4Var.f10624a.o()) {
            return nz2.C(this.f5728e0);
        }
        long jA = ld4Var.f10638o ? ld4Var.a() : ld4Var.f10641r;
        if (ld4Var.f10625b.b()) {
            return jA;
        }
        c0(ld4Var.f10624a, ld4Var.f10625b, jA);
        return jA;
    }

    private static long b0(ld4 ld4Var) {
        r01 r01Var = new r01();
        py0 py0Var = new py0();
        ld4Var.f10624a.n(ld4Var.f10625b.f15161a, py0Var);
        long j8 = ld4Var.f10626c;
        if (j8 != -9223372036854775807L) {
            return j8;
        }
        long j9 = ld4Var.f10624a.e(py0Var.f13191c, r01Var, 0L).f13845l;
        return 0L;
    }

    private final long c0(s11 s11Var, tm4 tm4Var, long j8) {
        s11Var.n(tm4Var.f15161a, this.f5738m);
        return j8;
    }

    private final Pair d0(s11 s11Var, int i8, long j8) {
        if (s11Var.o()) {
            this.f5726d0 = i8;
            if (j8 == -9223372036854775807L) {
                j8 = 0;
            }
            this.f5728e0 = j8;
            return null;
        }
        if (i8 == -1 || i8 >= s11Var.c()) {
            i8 = s11Var.g(false);
            long j9 = s11Var.e(i8, this.f5771a, 0L).f13845l;
            j8 = nz2.E(0L);
        }
        return s11Var.l(this.f5771a, this.f5738m, i8, nz2.C(j8));
    }

    private final ld4 e0(ld4 ld4Var, s11 s11Var, Pair pair) {
        uu1.d(s11Var.o() || pair != null);
        s11 s11Var2 = ld4Var.f10624a;
        long jZ = Z(ld4Var);
        ld4 ld4VarH = ld4Var.h(s11Var);
        if (s11Var.o()) {
            tm4 tm4VarJ = ld4.j();
            long jC = nz2.C(this.f5728e0);
            ld4 ld4VarC = ld4VarH.d(tm4VarJ, jC, jC, jC, 0L, to4.f15200d, this.f5721b, jb3.z()).c(tm4VarJ);
            ld4VarC.f10639p = ld4VarC.f10641r;
            return ld4VarC;
        }
        Object obj = ld4VarH.f10625b.f15161a;
        int i8 = nz2.f12300a;
        boolean z7 = !obj.equals(pair.first);
        tm4 tm4Var = z7 ? new tm4(pair.first, -1L) : ld4VarH.f10625b;
        long jLongValue = ((Long) pair.second).longValue();
        long jC2 = nz2.C(jZ);
        if (!s11Var2.o()) {
            s11Var2.n(obj, this.f5738m);
        }
        if (z7 || jLongValue < jC2) {
            uu1.f(!tm4Var.b());
            ld4 ld4VarC2 = ld4VarH.d(tm4Var, jLongValue, jLongValue, jLongValue, 0L, z7 ? to4.f15200d : ld4VarH.f10631h, z7 ? this.f5721b : ld4VarH.f10632i, z7 ? jb3.z() : ld4VarH.f10633j).c(tm4Var);
            ld4VarC2.f10639p = jLongValue;
            return ld4VarC2;
        }
        if (jLongValue != jC2) {
            uu1.f(!tm4Var.b());
            long jMax = Math.max(0L, ld4VarH.f10640q - (jLongValue - jC2));
            long j8 = ld4VarH.f10639p;
            if (ld4VarH.f10634k.equals(ld4VarH.f10625b)) {
                j8 = jLongValue + jMax;
            }
            ld4 ld4VarD = ld4VarH.d(tm4Var, jLongValue, jLongValue, jLongValue, jMax, ld4VarH.f10631h, ld4VarH.f10632i, ld4VarH.f10633j);
            ld4VarD.f10639p = j8;
            return ld4VarD;
        }
        int iA = s11Var.a(ld4VarH.f10634k.f15161a);
        if (iA != -1 && s11Var.d(iA, this.f5738m, false).f13191c == s11Var.n(tm4Var.f15161a, this.f5738m).f13191c) {
            return ld4VarH;
        }
        s11Var.n(tm4Var.f15161a, this.f5738m);
        long jH = tm4Var.b() ? this.f5738m.h(tm4Var.f15162b, tm4Var.f15163c) : this.f5738m.f13192d;
        ld4 ld4VarC3 = ld4VarH.d(tm4Var, ld4VarH.f10641r, ld4VarH.f10641r, ld4VarH.f10627d, jH - ld4VarH.f10641r, ld4VarH.f10631h, ld4VarH.f10632i, ld4VarH.f10633j).c(tm4Var);
        ld4VarC3.f10639p = jH;
        return ld4VarC3;
    }

    private final od4 f0(nd4 nd4Var) {
        int iX = X(this.f5724c0);
        s11 s11Var = this.f5724c0.f10624a;
        int i8 = iX == -1 ? 0 : iX;
        vv1 vv1Var = this.f5745t;
        lc4 lc4Var = this.f5735j;
        return new od4(lc4Var, nd4Var, s11Var, i8, vv1Var, lc4Var.U());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(final int i8, final int i9) {
        if (i8 == this.P.b() && i9 == this.P.a()) {
            return;
        }
        this.P = new er2(i8, i9);
        mc2 mc2Var = this.f5736k;
        mc2Var.d(24, new j92() { // from class: com.google.android.gms.internal.ads.nb4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                int i10 = bc4.f5719h0;
                ((ir0) obj).B(i8, i9);
            }
        });
        mc2Var.c();
        h0(2, 14, new er2(i8, i9));
    }

    private final void h0(int i8, int i9, Object obj) {
        sd4[] sd4VarArr = this.f5731g;
        int length = sd4VarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            sd4 sd4Var = sd4VarArr[i10];
            if (sd4Var.k() == i8) {
                od4 od4VarF0 = f0(sd4Var);
                od4VarF0.f(i9);
                od4VarF0.e(obj);
                od4VarF0.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        h0(1, 2, Float.valueOf(this.U * this.f5749x.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(Object obj) {
        ArrayList arrayList = new ArrayList();
        sd4[] sd4VarArr = this.f5731g;
        int length = sd4VarArr.length;
        boolean z7 = false;
        for (int i8 = 0; i8 < 2; i8++) {
            sd4 sd4Var = sd4VarArr[i8];
            if (sd4Var.k() == 2) {
                od4 od4VarF0 = f0(sd4Var);
                od4VarF0.f(1);
                od4VarF0.e(obj);
                od4VarF0.d();
                arrayList.add(od4VarF0);
            }
        }
        Object obj2 = this.M;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((od4) it.next()).i(this.A);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z7 = true;
            }
            Object obj3 = this.M;
            Surface surface = this.N;
            if (obj3 == surface) {
                surface.release();
                this.N = null;
            }
        }
        this.M = obj;
        if (z7) {
            k0(ja4.d(new mc4(3), 1003));
        }
    }

    private final void k0(ja4 ja4Var) {
        ld4 ld4Var = this.f5724c0;
        ld4 ld4VarC = ld4Var.c(ld4Var.f10625b);
        ld4VarC.f10639p = ld4VarC.f10641r;
        ld4VarC.f10640q = 0L;
        ld4 ld4VarG = ld4VarC.g(1);
        if (ja4Var != null) {
            ld4VarG = ld4VarG.f(ja4Var);
        }
        this.B++;
        this.f5735j.c0();
        m0(ld4VarG, 0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(boolean z7, int i8, int i9) {
        int i10 = 0;
        boolean z8 = z7 && i8 != -1;
        if (z8 && i8 != 1) {
            i10 = 1;
        }
        ld4 ld4VarB = this.f5724c0;
        if (ld4VarB.f10635l == z8 && ld4VarB.f10636m == i10) {
            return;
        }
        this.B++;
        if (ld4VarB.f10638o) {
            ld4VarB = ld4VarB.b();
        }
        ld4 ld4VarE = ld4VarB.e(z8, i10);
        this.f5735j.b0(z8, i10);
        m0(ld4VarE, 0, i9, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0473 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0503 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m0(final com.google.android.gms.internal.ads.ld4 r44, final int r45, final int r46, boolean r47, int r48, long r49, int r51, boolean r52) {
        /*
            Method dump skipped, instruction units count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bc4.m0(com.google.android.gms.internal.ads.ld4, int, int, boolean, int, long, int, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        int iN = n();
        if (iN == 2 || iN == 3) {
            o0();
            boolean z7 = this.f5724c0.f10638o;
            A();
            A();
        }
    }

    private final void o0() {
        this.f5725d.b();
        if (Thread.currentThread() != this.f5743r.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f5743r.getThread().getName());
            if (this.X) {
                throw new IllegalStateException(str);
            }
            pf2.g("ExoPlayerImpl", str, this.Y ? null : new IllegalStateException());
            this.Y = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final boolean A() {
        o0();
        return this.f5724c0.f10635l;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final boolean D() {
        o0();
        return this.f5724c0.f10625b.b();
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final void E() {
        o0();
        this.f5749x.b(A(), 1);
        k0(null);
        this.W = new tt1(jb3.z(), this.f5724c0.f10641r);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final boolean J() {
        o0();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ua4
    public final int K() {
        o0();
        int length = this.f5731g.length;
        return 2;
    }

    final /* synthetic */ void T(jc4 jc4Var) {
        long j8;
        boolean z7;
        int i8 = this.B - jc4Var.f9567c;
        this.B = i8;
        boolean z8 = true;
        if (jc4Var.f9568d) {
            this.C = jc4Var.f9569e;
            this.D = true;
        }
        if (jc4Var.f9570f) {
            this.E = jc4Var.f9571g;
        }
        if (i8 == 0) {
            s11 s11Var = jc4Var.f9566b.f10624a;
            if (!this.f5724c0.f10624a.o() && s11Var.o()) {
                this.f5726d0 = -1;
                this.f5728e0 = 0L;
            }
            if (!s11Var.o()) {
                List listY = ((qd4) s11Var).y();
                uu1.f(listY.size() == this.f5739n.size());
                for (int i9 = 0; i9 < listY.size(); i9++) {
                    ((ac4) this.f5739n.get(i9)).a((s11) listY.get(i9));
                }
            }
            if (this.D) {
                if (jc4Var.f9566b.f10625b.equals(this.f5724c0.f10625b) && jc4Var.f9566b.f10627d == this.f5724c0.f10641r) {
                    z8 = false;
                }
                if (!z8) {
                    j8 = -9223372036854775807L;
                } else if (s11Var.o() || jc4Var.f9566b.f10625b.b()) {
                    j8 = jc4Var.f9566b.f10627d;
                } else {
                    ld4 ld4Var = jc4Var.f9566b;
                    tm4 tm4Var = ld4Var.f10625b;
                    j8 = ld4Var.f10627d;
                    c0(s11Var, tm4Var, j8);
                }
                z7 = z8;
            } else {
                j8 = -9223372036854775807L;
                z7 = false;
            }
            this.D = false;
            m0(jc4Var.f9566b, 1, this.E, z7, this.C, j8, -1, false);
        }
    }

    final /* synthetic */ void U(final jc4 jc4Var) {
        this.f5734i.h(new Runnable() { // from class: com.google.android.gms.internal.ads.pb4
            @Override // java.lang.Runnable
            public final void run() {
                this.f12812a.T(jc4Var);
            }
        });
    }

    final /* synthetic */ void V(ir0 ir0Var) {
        ir0Var.r(this.G);
    }

    @Override // com.google.android.gms.internal.ads.ua4
    public final void a(vm4 vm4Var) {
        o0();
        List listSingletonList = Collections.singletonList(vm4Var);
        o0();
        o0();
        X(this.f5724c0);
        s();
        this.B++;
        if (!this.f5739n.isEmpty()) {
            int size = this.f5739n.size();
            for (int i8 = size - 1; i8 >= 0; i8--) {
                this.f5739n.remove(i8);
            }
            this.f5732g0 = this.f5732g0.h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < listSingletonList.size(); i9++) {
            id4 id4Var = new id4((vm4) listSingletonList.get(i9), this.f5740o);
            arrayList.add(id4Var);
            this.f5739n.add(i9, new ac4(id4Var.f9161b, id4Var.f9160a));
        }
        this.f5732g0 = this.f5732g0.g(0, arrayList.size());
        qd4 qd4Var = new qd4(this.f5739n, this.f5732g0);
        if (!qd4Var.o() && qd4Var.c() < 0) {
            throw new oc(qd4Var, -1, -9223372036854775807L);
        }
        int iG = qd4Var.g(false);
        ld4 ld4VarE0 = e0(this.f5724c0, qd4Var, d0(qd4Var, iG, -9223372036854775807L));
        int i10 = ld4VarE0.f10628e;
        if (iG != -1 && i10 != 1) {
            i10 = (qd4Var.o() || iG >= qd4Var.c()) ? 4 : 2;
        }
        ld4 ld4VarG = ld4VarE0.g(i10);
        this.f5735j.e0(arrayList, iG, nz2.C(-9223372036854775807L), this.f5732g0);
        m0(ld4VarG, 0, 1, (this.f5724c0.f10625b.f15161a.equals(ld4VarG.f10625b.f15161a) || this.f5724c0.f10624a.o()) ? false : true, 4, a0(ld4VarG), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.ua4
    public final void b(ge4 ge4Var) {
        o0();
        this.f5742q.V(ge4Var);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final void c(float f8) {
        o0();
        final float fMax = Math.max(0.0f, Math.min(f8, 1.0f));
        if (this.U == fMax) {
            return;
        }
        this.U = fMax;
        i0();
        mc2 mc2Var = this.f5736k;
        mc2Var.d(22, new j92() { // from class: com.google.android.gms.internal.ads.eb4
            @Override // com.google.android.gms.internal.ads.j92
            public final void a(Object obj) {
                int i8 = bc4.f5719h0;
                ((ir0) obj).K(fMax);
            }
        });
        mc2Var.c();
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final void d(Surface surface) {
        o0();
        j0(surface);
        int i8 = surface == null ? 0 : -1;
        g0(i8, i8);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final void e(boolean z7) {
        o0();
        int iB = this.f5749x.b(z7, n());
        l0(z7, iB, Y(z7, iB));
    }

    @Override // com.google.android.gms.internal.ads.ua4
    public final void f(ge4 ge4Var) {
        this.f5742q.j(ge4Var);
    }

    @Override // com.google.android.gms.internal.ads.be4
    public final void g(int i8, long j8, int i9, boolean z7) {
        o0();
        uu1.d(i8 >= 0);
        this.f5742q.E();
        s11 s11Var = this.f5724c0.f10624a;
        if (s11Var.o() || i8 < s11Var.c()) {
            this.B++;
            if (D()) {
                pf2.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                jc4 jc4Var = new jc4(this.f5724c0);
                jc4Var.a(1);
                this.f5730f0.f16098a.U(jc4Var);
                return;
            }
            ld4 ld4VarG = this.f5724c0;
            int i10 = ld4VarG.f10628e;
            if (i10 == 3 || (i10 == 4 && !s11Var.o())) {
                ld4VarG = this.f5724c0.g(2);
            }
            int iP = p();
            ld4 ld4VarE0 = e0(ld4VarG, s11Var, d0(s11Var, i8, j8));
            this.f5735j.a0(s11Var, i8, nz2.C(j8));
            m0(ld4VarE0, 0, 1, true, 1, a0(ld4VarE0), iP, false);
        }
    }

    public final ja4 j() {
        o0();
        return this.f5724c0.f10629f;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int k() {
        o0();
        if (D()) {
            return this.f5724c0.f10625b.f15162b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int l() {
        o0();
        if (D()) {
            return this.f5724c0.f10625b.f15163c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int m() {
        o0();
        if (this.f5724c0.f10624a.o()) {
            return 0;
        }
        ld4 ld4Var = this.f5724c0;
        return ld4Var.f10624a.a(ld4Var.f10625b.f15161a);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int n() {
        o0();
        return this.f5724c0.f10628e;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int o() {
        o0();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int p() {
        o0();
        int iX = X(this.f5724c0);
        if (iX == -1) {
            return 0;
        }
        return iX;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final int q() {
        o0();
        return this.f5724c0.f10636m;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final long r() {
        o0();
        if (D()) {
            ld4 ld4Var = this.f5724c0;
            return ld4Var.f10634k.equals(ld4Var.f10625b) ? nz2.E(this.f5724c0.f10639p) : u();
        }
        o0();
        if (this.f5724c0.f10624a.o()) {
            return this.f5728e0;
        }
        ld4 ld4Var2 = this.f5724c0;
        long j8 = 0;
        if (ld4Var2.f10634k.f15164d != ld4Var2.f10625b.f15164d) {
            return nz2.E(ld4Var2.f10624a.e(p(), this.f5771a, 0L).f13846m);
        }
        long j9 = ld4Var2.f10639p;
        if (this.f5724c0.f10634k.b()) {
            ld4 ld4Var3 = this.f5724c0;
            ld4Var3.f10624a.n(ld4Var3.f10634k.f15161a, this.f5738m).i(this.f5724c0.f10634k.f15162b);
        } else {
            j8 = j9;
        }
        ld4 ld4Var4 = this.f5724c0;
        c0(ld4Var4.f10624a, ld4Var4.f10634k, j8);
        return nz2.E(j8);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final long s() {
        o0();
        return nz2.E(a0(this.f5724c0));
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final long t() {
        o0();
        return Z(this.f5724c0);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final long u() {
        long jH;
        o0();
        if (D()) {
            ld4 ld4Var = this.f5724c0;
            tm4 tm4Var = ld4Var.f10625b;
            ld4Var.f10624a.n(tm4Var.f15161a, this.f5738m);
            jH = this.f5738m.h(tm4Var.f15162b, tm4Var.f15163c);
        } else {
            s11 s11VarV = v();
            if (s11VarV.o()) {
                return -9223372036854775807L;
            }
            jH = s11VarV.e(p(), this.f5771a, 0L).f13846m;
        }
        return nz2.E(jH);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final s11 v() {
        o0();
        return this.f5724c0.f10624a;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final ed1 w() {
        o0();
        return this.f5724c0.f10632i.f12998d;
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final long x() {
        o0();
        return nz2.E(this.f5724c0.f10640q);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final void y() {
        o0();
        z94 z94Var = this.f5749x;
        boolean zA = A();
        int iB = z94Var.b(zA, 2);
        l0(zA, iB, Y(zA, iB));
        ld4 ld4Var = this.f5724c0;
        if (ld4Var.f10628e != 1) {
            return;
        }
        ld4 ld4VarF = ld4Var.f(null);
        ld4 ld4VarG = ld4VarF.g(true == ld4VarF.f10624a.o() ? 4 : 2);
        this.B++;
        this.f5735j.Z();
        m0(ld4VarG, 1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.lu0
    public final void z() {
        AudioTrack audioTrack;
        pf2.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.2.0-alpha01] [" + nz2.f12304e + "] [" + c60.a() + "]");
        o0();
        if (nz2.f12300a < 21 && (audioTrack = this.L) != null) {
            audioTrack.release();
            this.L = null;
        }
        this.f5749x.d();
        if (!this.f5735j.d0()) {
            mc2 mc2Var = this.f5736k;
            mc2Var.d(10, new j92() { // from class: com.google.android.gms.internal.ads.ob4
                @Override // com.google.android.gms.internal.ads.j92
                public final void a(Object obj) {
                    ((ir0) obj).w(ja4.d(new mc4(1), 1003));
                }
            });
            mc2Var.c();
        }
        this.f5736k.e();
        this.f5734i.e(null);
        this.f5744s.b(this.f5742q);
        ld4 ld4Var = this.f5724c0;
        if (ld4Var.f10638o) {
            this.f5724c0 = ld4Var.b();
        }
        ld4 ld4VarG = this.f5724c0.g(1);
        this.f5724c0 = ld4VarG;
        ld4 ld4VarC = ld4VarG.c(ld4VarG.f10625b);
        this.f5724c0 = ld4VarC;
        ld4VarC.f10639p = ld4VarC.f10641r;
        this.f5724c0.f10640q = 0L;
        this.f5742q.H();
        this.f5733h.b();
        Surface surface = this.N;
        if (surface != null) {
            surface.release();
            this.N = null;
        }
        this.W = tt1.f15323b;
    }
}
