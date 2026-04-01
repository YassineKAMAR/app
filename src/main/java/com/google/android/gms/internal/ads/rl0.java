package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rl0 extends ti0 implements g94, ge4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f14189w = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bl0 f14191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final gq4 f14192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cj0 f14193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final WeakReference f14194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ao4 f14195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ua4 f14196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ByteBuffer f14197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private si0 f14199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f14202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f14203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f14204q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Integer f14206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f14207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile el0 f14208u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f14205r = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Set f14209v = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rl0(android.content.Context r4, com.google.android.gms.internal.ads.cj0 r5, com.google.android.gms.internal.ads.dj0 r6, java.lang.Integer r7) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rl0.<init>(android.content.Context, com.google.android.gms.internal.ads.cj0, com.google.android.gms.internal.ads.dj0, java.lang.Integer):void");
    }

    private final boolean d0() {
        return this.f14208u != null && this.f14208u.o();
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void A(int i8) {
        this.f14191d.e(i8);
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void B(int i8) {
        this.f14191d.f(i8);
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void C(si0 si0Var) {
        this.f14199l = si0Var;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void D(int i8) {
        this.f14191d.g(i8);
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void E(int i8) {
        this.f14191d.h(i8);
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void F(boolean z7) {
        this.f14196i.e(z7);
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void G(Integer num) {
        this.f14206s = num;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void H(boolean z7) {
        if (this.f14196i == null) {
            return;
        }
        int i8 = 0;
        while (true) {
            this.f14196i.K();
            if (i8 >= 2) {
                return;
            }
            gq4 gq4Var = this.f14192e;
            rp4 rp4VarC = gq4Var.l().c();
            rp4VarC.o(i8, !z7);
            gq4Var.q(rp4VarC);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void I(int i8) {
        Iterator it = this.f14209v.iterator();
        while (it.hasNext()) {
            al0 al0Var = (al0) ((WeakReference) it.next()).get();
            if (al0Var != null) {
                al0Var.h(i8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void J(Surface surface, boolean z7) {
        ua4 ua4Var = this.f14196i;
        if (ua4Var != null) {
            ua4Var.d(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void K(float f8, boolean z7) {
        ua4 ua4Var = this.f14196i;
        if (ua4Var != null) {
            ua4Var.c(f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void L() {
        this.f14196i.E();
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final boolean M() {
        return this.f14196i != null;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final int N() {
        return this.f14201n;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final int P() {
        return this.f14196i.n();
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long R() {
        return this.f14196i.r();
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long S() {
        return this.f14200m;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long T() {
        if (d0() && this.f14208u.k()) {
            return Math.min(this.f14200m, this.f14208u.f());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long U() {
        return this.f14196i.s();
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long V() {
        return this.f14196i.u();
    }

    final /* synthetic */ po3 W(String str, boolean z7) {
        rl0 rl0Var = true != z7 ? null : this;
        cj0 cj0Var = this.f14193f;
        return new ul0(str, rl0Var, cj0Var.f6361d, cj0Var.f6363f, cj0Var.f6371n, cj0Var.f6372o);
    }

    final /* synthetic */ po3 X(String str, boolean z7) {
        rl0 rl0Var = true != z7 ? null : this;
        cj0 cj0Var = this.f14193f;
        al0 al0Var = new al0(str, rl0Var, cj0Var.f6361d, cj0Var.f6363f, cj0Var.f6366i);
        this.f14209v.add(new WeakReference(al0Var));
        return al0Var;
    }

    final /* synthetic */ po3 Y(String str, boolean z7) {
        xw3 xw3Var = new xw3();
        xw3Var.e(str);
        xw3Var.d(true != z7 ? null : this);
        xw3Var.b(this.f14193f.f6361d);
        xw3Var.c(this.f14193f.f6363f);
        xw3Var.a(true);
        return xw3Var.j();
    }

    final /* synthetic */ po3 Z(on3 on3Var) {
        po3 po3VarJ = on3Var.j();
        pl0 pl0Var = new pl0(this);
        return new el0(this.f14190c, po3VarJ, this.f14203p, this.f14204q, this, pl0Var);
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void a(ee4 ee4Var, nb nbVar, ca4 ca4Var) {
        dj0 dj0Var = (dj0) this.f14194g.get();
        if (!((Boolean) h2.y.c().b(ns.O1)).booleanValue() || dj0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = nbVar.f11792k;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = nbVar.f11793l;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = nbVar.f11790i;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        dj0Var.U("onMetadataEvent", map);
    }

    final vm4 a0(Uri uri) {
        rg rgVar = new rg();
        rgVar.b(uri);
        c50 c50VarC = rgVar.c();
        ao4 ao4Var = this.f14195h;
        ao4Var.a(this.f14193f.f6364g);
        return ao4Var.b(c50VarC);
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void b(ee4 ee4Var, int i8, long j8, long j9) {
    }

    final /* synthetic */ void b0(boolean z7, long j8) {
        si0 si0Var = this.f14199l;
        if (si0Var != null) {
            si0Var.c(z7, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void c(ee4 ee4Var, int i8) {
        si0 si0Var = this.f14199l;
        if (si0Var != null) {
            si0Var.a(i8);
        }
    }

    final /* synthetic */ sd4[] c0(Handler handler, f fVar, ih4 ih4Var, xo4 xo4Var, tl4 tl4Var) {
        zk4 zk4Var = zk4.f18273a;
        sg4 sg4Var = sg4.f14656c;
        nn1[] nn1VarArr = new nn1[0];
        gi4 gi4Var = new gi4();
        if (sg4Var == null && sg4Var == null) {
            throw new NullPointerException("Both parameters are null");
        }
        Context context = this.f14190c;
        gi4Var.c(sg4Var);
        gi4Var.d(nn1VarArr);
        xi4 xi4VarE = gi4Var.e();
        mk4 mk4Var = mk4.f11362a;
        return new sd4[]{new dj4(context, mk4Var, zk4Var, false, handler, ih4Var, xi4VarE), new hs4(this.f14190c, mk4Var, zk4Var, 0L, false, handler, fVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void d(ee4 ee4Var, ba4 ba4Var) {
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void e(po3 po3Var, ut3 ut3Var, boolean z7) {
        if (po3Var instanceof b94) {
            synchronized (this.f14205r) {
                this.f14207t.add((b94) po3Var);
            }
        } else if (po3Var instanceof el0) {
            this.f14208u = (el0) po3Var;
            final dj0 dj0Var = (dj0) this.f14194g.get();
            if (((Boolean) h2.y.c().b(ns.O1)).booleanValue() && dj0Var != null && this.f14208u.i()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.f14208u.k()));
                map.put("gcacheDownloaded", String.valueOf(this.f14208u.j()));
                j2.k2.f23991k.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nl0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i8 = rl0.f14189w;
                        dj0Var.U("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void f(ee4 ee4Var, km4 km4Var, pm4 pm4Var, IOException iOException, boolean z7) {
        si0 si0Var = this.f14199l;
        if (si0Var != null) {
            if (this.f14193f.f6368k) {
                si0Var.b("onLoadException", iOException);
            } else {
                si0Var.d("onLoadError", iOException);
            }
        }
    }

    public final void finalize() {
        ti0.u().decrementAndGet();
        if (j2.v1.m()) {
            j2.v1.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void g(ee4 ee4Var, jj1 jj1Var) {
        si0 si0Var = this.f14199l;
        if (si0Var != null) {
            si0Var.f(jj1Var.f9655a, jj1Var.f9656b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void h(lu0 lu0Var, fe4 fe4Var) {
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void i(po3 po3Var, ut3 ut3Var, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void j(po3 po3Var, ut3 ut3Var, boolean z7, int i8) {
        this.f14200m += i8;
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void k(ee4 ee4Var, pm4 pm4Var) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void l(ee4 ee4Var, nb nbVar, ca4 ca4Var) {
        dj0 dj0Var = (dj0) this.f14194g.get();
        if (!((Boolean) h2.y.c().b(ns.O1)).booleanValue() || dj0Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(nbVar.f11800s));
        map.put("bitRate", String.valueOf(nbVar.f11789h));
        map.put("resolution", nbVar.f11798q + "x" + nbVar.f11799r);
        String str = nbVar.f11792k;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = nbVar.f11793l;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = nbVar.f11790i;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        dj0Var.U("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.g94
    public final void m(po3 po3Var, ut3 ut3Var, boolean z7) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void n(ee4 ee4Var, bk0 bk0Var) {
        si0 si0Var = this.f14199l;
        if (si0Var != null) {
            si0Var.d("onPlayerError", bk0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void o(ee4 ee4Var, Object obj, long j8) {
        si0 si0Var = this.f14199l;
        if (si0Var != null) {
            si0Var.A();
        }
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final /* synthetic */ void p(ee4 ee4Var, kt0 kt0Var, kt0 kt0Var2, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.ge4
    public final void q(ee4 ee4Var, int i8, long j8) {
        this.f14201n += i8;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long r() {
        if (d0()) {
            return 0L;
        }
        return this.f14200m;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final long s() {
        if (d0()) {
            return this.f14208u.g();
        }
        synchronized (this.f14205r) {
            while (!this.f14207t.isEmpty()) {
                long j8 = this.f14202o;
                Map mapM = ((b94) this.f14207t.remove(0)).m();
                long j9 = 0;
                if (mapM != null) {
                    Iterator it = mapM.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && r73.c("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j9 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f14202o = j8 + j9;
            }
        }
        return this.f14202o;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final Integer t() {
        return this.f14206s;
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void w(Uri[] uriArr, String str) {
        x(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z7) {
        vm4 kn4Var;
        if (this.f14196i != null) {
            this.f14197j = byteBuffer;
            this.f14198k = z7;
            int length = uriArr.length;
            if (length == 1) {
                kn4Var = a0(uriArr[0]);
            } else {
                vm4[] vm4VarArr = new vm4[length];
                for (int i8 = 0; i8 < uriArr.length; i8++) {
                    vm4VarArr[i8] = a0(uriArr[i8]);
                }
                kn4Var = new kn4(false, false, vm4VarArr);
            }
            this.f14196i.a(kn4Var);
            this.f14196i.y();
            ti0.v().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void y() {
        ua4 ua4Var = this.f14196i;
        if (ua4Var != null) {
            ua4Var.b(this);
            this.f14196i.z();
            this.f14196i = null;
            ti0.v().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.ti0
    public final void z(long j8) {
        be4 be4Var = (be4) this.f14196i;
        be4Var.g(be4Var.p(), j8, 5, false);
    }
}
