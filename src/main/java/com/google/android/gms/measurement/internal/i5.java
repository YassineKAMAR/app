package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.bh;
import com.google.android.gms.internal.measurement.cc;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.gms.internal.measurement.vg;
import com.google.android.gms.internal.measurement.zg;
import com.google.android.gms.measurement.internal.i5;
import com.google.android.gms.measurement.internal.y6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends ua implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Map<String, String>> f20098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Set<String>> f20099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f20100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f20101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<String, com.google.android.gms.internal.measurement.j4> f20102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f20103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final p.f<String, com.google.android.gms.internal.measurement.b0> f20104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final zg f20105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f20106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, String> f20107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, String> f20108n;

    i5(va vaVar) {
        super(vaVar);
        this.f20098d = new p.a();
        this.f20099e = new p.a();
        this.f20100f = new p.a();
        this.f20101g = new p.a();
        this.f20102h = new p.a();
        this.f20106l = new p.a();
        this.f20107m = new p.a();
        this.f20108n = new p.a();
        this.f20103i = new p.a();
        this.f20104j = new n5(this, 20);
        this.f20105k = new m5(this);
    }

    private final com.google.android.gms.internal.measurement.j4 A(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.j4.O();
        }
        try {
            com.google.android.gms.internal.measurement.j4 j4Var = (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) ((j4.a) db.F(com.google.android.gms.internal.measurement.j4.M(), bArr)).d());
            t().K().c("Parsed config. version, gmp_app_id", j4Var.a0() ? Long.valueOf(j4Var.K()) : null, j4Var.Z() ? j4Var.P() : null);
            return j4Var;
        } catch (com.google.android.gms.internal.measurement.k9 | RuntimeException e8) {
            t().L().c("Unable to merge remote config. appId", n4.v(str), e8);
            return com.google.android.gms.internal.measurement.j4.O();
        }
    }

    private static y6.a B(g4.e eVar) {
        int i8 = o5.f20314b[eVar.ordinal()];
        if (i8 == 1) {
            return y6.a.AD_STORAGE;
        }
        if (i8 == 2) {
            return y6.a.ANALYTICS_STORAGE;
        }
        if (i8 == 3) {
            return y6.a.AD_USER_DATA;
        }
        if (i8 != 4) {
            return null;
        }
        return y6.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> D(com.google.android.gms.internal.measurement.j4 j4Var) {
        p.a aVar = new p.a();
        if (j4Var != null) {
            for (com.google.android.gms.internal.measurement.m4 m4Var : j4Var.W()) {
                aVar.put(m4Var.G(), m4Var.H());
            }
        }
        return aVar;
    }

    private final void F(String str, j4.a aVar) {
        HashSet hashSet = new HashSet();
        p.a aVar2 = new p.a();
        p.a aVar3 = new p.a();
        p.a aVar4 = new p.a();
        if (aVar != null) {
            Iterator<com.google.android.gms.internal.measurement.h4> it = aVar.y().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().G());
            }
            for (int i8 = 0; i8 < aVar.s(); i8++) {
                i4.a aVarX = aVar.t(i8).x();
                if (aVarX.u().isEmpty()) {
                    t().L().a("EventConfig contained null event name");
                } else {
                    String strU = aVarX.u();
                    String strB = p3.r.b(aVarX.u());
                    if (!TextUtils.isEmpty(strB)) {
                        aVarX = aVarX.t(strB);
                        aVar.u(i8, aVarX);
                    }
                    if (aVarX.x() && aVarX.v()) {
                        aVar2.put(strU, Boolean.TRUE);
                    }
                    if (aVarX.y() && aVarX.w()) {
                        aVar3.put(aVarX.u(), Boolean.TRUE);
                    }
                    if (aVarX.z()) {
                        if (aVarX.s() < 2 || aVarX.s() > 65535) {
                            t().L().c("Invalid sampling rate. Event name, sample rate", aVarX.u(), Integer.valueOf(aVarX.s()));
                        } else {
                            aVar4.put(aVarX.u(), Integer.valueOf(aVarX.s()));
                        }
                    }
                }
            }
        }
        this.f20099e.put(str, hashSet);
        this.f20100f.put(str, aVar2);
        this.f20101g.put(str, aVar3);
        this.f20103i.put(str, aVar4);
    }

    private final void G(final String str, com.google.android.gms.internal.measurement.j4 j4Var) {
        if (j4Var.m() == 0) {
            this.f20104j.e(str);
            return;
        }
        t().K().b("EES programs found", Integer.valueOf(j4Var.m()));
        com.google.android.gms.internal.measurement.o5 o5Var = j4Var.V().get(0);
        try {
            com.google.android.gms.internal.measurement.b0 b0Var = new com.google.android.gms.internal.measurement.b0();
            b0Var.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.j5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new cc("internal.remoteConfig", new p5(this.f20150a, str));
                }
            });
            b0Var.c("internal.appMetadata", new Callable() { // from class: p3.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final i5 i5Var = this.f25607a;
                    final String str2 = str;
                    return new bh("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.k5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            i5 i5Var2 = i5Var;
                            String str3 = str2;
                            r5 r5VarD0 = i5Var2.n().D0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 82001L);
                            if (r5VarD0 != null) {
                                String strH = r5VarD0.h();
                                if (strH != null) {
                                    map.put("app_version", strH);
                                }
                                map.put("app_version_int", Long.valueOf(r5VarD0.z()));
                                map.put("dynamite_version", Long.valueOf(r5VarD0.c0()));
                            }
                            return map;
                        }
                    });
                }
            });
            b0Var.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.l5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new vg(this.f20193a.f20105k);
                }
            });
            b0Var.b(o5Var);
            this.f20104j.d(str, b0Var);
            t().K().c("EES program loaded for appId, activities", str, Integer.valueOf(o5Var.F().m()));
            Iterator<com.google.android.gms.internal.measurement.n5> it = o5Var.F().H().iterator();
            while (it.hasNext()) {
                t().K().b("EES program activity", it.next().G());
            }
        } catch (com.google.android.gms.internal.measurement.b1 unused) {
            t().G().b("Failed to load EES program. appId", str);
        }
    }

    private final void g0(String str) {
        s();
        i();
        a3.o.f(str);
        if (this.f20102h.get(str) == null) {
            o oVarE0 = n().E0(str);
            if (oVarE0 != null) {
                j4.a aVarX = A(str, oVarE0.f20306a).x();
                F(str, aVarX);
                this.f20098d.put(str, D((com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d())));
                this.f20102h.put(str, (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
                G(str, (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
                this.f20106l.put(str, aVarX.w());
                this.f20107m.put(str, oVarE0.f20307b);
                this.f20108n.put(str, oVarE0.f20308c);
                return;
            }
            this.f20098d.put(str, null);
            this.f20100f.put(str, null);
            this.f20099e.put(str, null);
            this.f20101g.put(str, null);
            this.f20102h.put(str, null);
            this.f20106l.put(str, null);
            this.f20107m.put(str, null);
            this.f20108n.put(str, null);
            this.f20103i.put(str, null);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.b0 z(i5 i5Var, String str) {
        i5Var.s();
        a3.o.f(str);
        if (!i5Var.W(str)) {
            return null;
        }
        if (!i5Var.f20102h.containsKey(str) || i5Var.f20102h.get(str) == null) {
            i5Var.g0(str);
        } else {
            i5Var.G(str, i5Var.f20102h.get(str));
        }
        return i5Var.f20104j.h().get(str);
    }

    final y6.a C(String str, y6.a aVar) {
        i();
        g0(str);
        com.google.android.gms.internal.measurement.g4 g4VarJ = J(str);
        if (g4VarJ == null) {
            return null;
        }
        for (g4.c cVar : g4VarJ.J()) {
            if (aVar == B(cVar.H())) {
                return B(cVar.G());
            }
        }
        return null;
    }

    protected final boolean H(String str, byte[] bArr, String str2, String str3) {
        s();
        i();
        a3.o.f(str);
        j4.a aVarX = A(str, bArr).x();
        if (aVarX == null) {
            return false;
        }
        F(str, aVarX);
        G(str, (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
        this.f20102h.put(str, (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
        this.f20106l.put(str, aVarX.w());
        this.f20107m.put(str, str2);
        this.f20108n.put(str, str3);
        this.f20098d.put(str, D((com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d())));
        n().Z(str, new ArrayList(aVarX.x()));
        try {
            aVarX.v();
            bArr = ((com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d())).k();
        } catch (RuntimeException e8) {
            t().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", n4.v(str), e8);
        }
        m mVarN = n();
        a3.o.f(str);
        mVarN.i();
        mVarN.s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (mVarN.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                mVarN.t().G().b("Failed to update remote config (got 0). appId", n4.v(str));
            }
        } catch (SQLiteException e9) {
            mVarN.t().G().c("Error storing remote config. appId", n4.v(str), e9);
        }
        this.f20102h.put(str, (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.y8) aVarX.d()));
        return true;
    }

    final int I(String str, String str2) {
        Integer num;
        i();
        g0(str);
        Map<String, Integer> map = this.f20103i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final com.google.android.gms.internal.measurement.g4 J(String str) {
        i();
        g0(str);
        com.google.android.gms.internal.measurement.j4 j4VarL = L(str);
        if (j4VarL == null || !j4VarL.Y()) {
            return null;
        }
        return j4VarL.L();
    }

    final boolean K(String str, y6.a aVar) {
        i();
        g0(str);
        com.google.android.gms.internal.measurement.g4 g4VarJ = J(str);
        if (g4VarJ == null) {
            return false;
        }
        Iterator<g4.b> it = g4VarJ.I().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g4.b next = it.next();
            if (aVar == B(next.H())) {
                if (next.G() == g4.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final com.google.android.gms.internal.measurement.j4 L(String str) {
        s();
        i();
        a3.o.f(str);
        g0(str);
        return this.f20102h.get(str);
    }

    final boolean M(String str, String str2) {
        Boolean bool;
        i();
        g0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f20101g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String N(String str) {
        i();
        return this.f20108n.get(str);
    }

    final boolean O(String str, String str2) {
        Boolean bool;
        i();
        g0(str);
        if (X(str) && ib.H0(str2)) {
            return true;
        }
        if (Z(str) && ib.J0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f20100f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String P(String str) {
        i();
        return this.f20107m.get(str);
    }

    final String Q(String str) {
        i();
        g0(str);
        return this.f20106l.get(str);
    }

    final Set<String> R(String str) {
        i();
        g0(str);
        return this.f20099e.get(str);
    }

    final SortedSet<String> S(String str) {
        i();
        g0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.g4 g4VarJ = J(str);
        if (g4VarJ == null) {
            return treeSet;
        }
        Iterator<g4.f> it = g4VarJ.H().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().G());
        }
        return treeSet;
    }

    protected final void T(String str) {
        i();
        this.f20107m.put(str, null);
    }

    final void U(String str) {
        i();
        this.f20102h.remove(str);
    }

    final boolean V(String str) {
        i();
        com.google.android.gms.internal.measurement.j4 j4VarL = L(str);
        if (j4VarL == null) {
            return false;
        }
        return j4VarL.X();
    }

    public final boolean W(String str) {
        com.google.android.gms.internal.measurement.j4 j4Var;
        return (TextUtils.isEmpty(str) || (j4Var = this.f20102h.get(str)) == null || j4Var.m() == 0) ? false : true;
    }

    final boolean X(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_internal"));
    }

    final boolean Y(String str) {
        i();
        g0(str);
        com.google.android.gms.internal.measurement.g4 g4VarJ = J(str);
        return g4VarJ == null || !g4VarJ.L() || g4VarJ.K();
    }

    final boolean Z(String str) {
        return "1".equals(d(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    final boolean a0(String str) {
        i();
        g0(str);
        return this.f20099e.get(str) != null && this.f20099e.get(str).contains("app_instance_id");
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    final boolean b0(String str) {
        i();
        g0(str);
        if (this.f20099e.get(str) != null) {
            return this.f20099e.get(str).contains("device_model") || this.f20099e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    final boolean c0(String str) {
        i();
        g0(str);
        return this.f20099e.get(str) != null && this.f20099e.get(str).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final String d(String str, String str2) {
        i();
        g0(str);
        Map<String, String> map = this.f20098d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    final boolean d0(String str) {
        i();
        g0(str);
        return this.f20099e.get(str) != null && this.f20099e.get(str).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    final boolean e0(String str) {
        i();
        g0(str);
        if (this.f20099e.get(str) != null) {
            return this.f20099e.get(str).contains("os_version") || this.f20099e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    final boolean f0(String str) {
        i();
        g0(str);
        return this.f20099e.get(str) != null && this.f20099e.get(str).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ db l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ pb m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ m n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ i5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ y9 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.ra
    public final /* bridge */ /* synthetic */ ta r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        return false;
    }

    final long y(String str) {
        String strD = d(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strD)) {
            return 0L;
        }
        try {
            return Long.parseLong(strD);
        } catch (NumberFormatException e8) {
            t().L().c("Unable to parse timezone offset. appId", n4.v(str), e8);
            return 0L;
        }
    }
}
