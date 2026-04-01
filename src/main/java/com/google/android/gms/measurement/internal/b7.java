package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.me;
import com.google.android.gms.internal.measurement.mf;
import com.google.android.gms.internal.measurement.ne;
import com.google.android.gms.internal.measurement.td;
import com.google.android.gms.internal.measurement.yf;
import com.google.android.gms.internal.measurement.zd;
import com.google.android.gms.measurement.internal.na;
import com.google.android.gms.measurement.internal.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class b7 extends y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected f8 f19819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p3.v f19820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<p3.u> f19821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<String> f19823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f19824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PriorityQueue<na> f19826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private y6 f19827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicLong f19828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final qb f19830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f19831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private u f19832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final kb f19833q;

    protected b7(w5 w5Var) {
        super(w5Var);
        this.f19821e = new CopyOnWriteArraySet();
        this.f19824h = new Object();
        this.f19825i = false;
        this.f19831o = true;
        this.f19833q = new x7(this);
        this.f19823g = new AtomicReference<>();
        this.f19827k = y6.f20721c;
        this.f19829m = -1L;
        this.f19828l = new AtomicLong(0L);
        this.f19830n = new qb(w5Var);
    }

    static /* synthetic */ void L(b7 b7Var, y6 y6Var, long j8, boolean z7, boolean z8) {
        b7Var.i();
        b7Var.v();
        y6 y6VarJ = b7Var.e().J();
        if (j8 <= b7Var.f19829m && y6.k(y6VarJ.b(), y6Var.b())) {
            b7Var.t().J().b("Dropped out-of-date consent setting, proposed settings", y6Var);
            return;
        }
        if (!b7Var.e().A(y6Var)) {
            b7Var.t().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(y6Var.b()));
            return;
        }
        b7Var.f19829m = j8;
        b7Var.r().U(z7);
        if (z8) {
            b7Var.r().O(new AtomicReference<>());
        }
    }

    static /* synthetic */ void M(b7 b7Var, y6 y6Var, y6 y6Var2) {
        y6.a aVar = y6.a.ANALYTICS_STORAGE;
        y6.a aVar2 = y6.a.AD_STORAGE;
        boolean zM = y6Var.m(y6Var2, aVar, aVar2);
        boolean zR = y6Var.r(y6Var2, aVar, aVar2);
        if (zM || zR) {
            b7Var.m().I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(Boolean bool, boolean z7) {
        i();
        v();
        t().F().b("Setting app measurement enabled (FE)", bool);
        e().v(bool);
        if (z7) {
            e().C(bool);
        }
        if (this.f20556a.n() || !(bool == null || bool.booleanValue())) {
            t0();
        }
    }

    private final void U(String str, String str2, long j8, Object obj) {
        u().D(new o7(this, str, str2, obj, j8));
    }

    @TargetApi(30)
    private final PriorityQueue<na> s0() {
        if (this.f19826j == null) {
            this.f19826j = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: p3.w
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((na) obj).f20303b);
                }
            }, new Comparator() { // from class: p3.y
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
                }
            }));
        }
        return this.f19826j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        Long lValueOf;
        i();
        String strA = e().f20707m.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(com.amazon.a.a.o.b.ac.equals(strA) ? 1L : 0L);
            }
            Y("app", "_npa", lValueOf, k().a());
        }
        if (!this.f20556a.m() || !this.f19831o) {
            t().F().a("Updating Scion state (FE)");
            r().b0();
            return;
        }
        t().F().a("Recording app launch after enabling measurement for the first time (FE)");
        n0();
        if (me.a() && a().q(e0.f19956q0)) {
            s().f19917e.a();
        }
        u().D(new n7(this));
    }

    private final void w0(String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        u().D(new p7(this, str, str2, j8, ib.D(bundle), z7, z8, z9, str3));
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean A() {
        return false;
    }

    public final ArrayList<Bundle> C(String str, String str2) {
        if (u().J()) {
            t().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (e.a()) {
            t().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f20556a.u().v(atomicReference, 5000L, "get conditional user properties", new w7(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ib.t0(list);
        }
        t().G().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    public final Map<String, Object> D(String str, String str2, boolean z7) {
        p4 p4VarG;
        String str3;
        if (u().J()) {
            p4VarG = t().G();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!e.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f20556a.u().v(atomicReference, 5000L, "get user properties", new v7(this, atomicReference, null, str, str2, z7));
                List<hb> list = (List) atomicReference.get();
                if (list == null) {
                    t().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
                    return Collections.emptyMap();
                }
                p.a aVar = new p.a(list.size());
                for (hb hbVar : list) {
                    Object objG = hbVar.g();
                    if (objG != null) {
                        aVar.put(hbVar.f20071b, objG);
                    }
                }
                return aVar;
            }
            p4VarG = t().G();
            str3 = "Cannot get user properties from main thread";
        }
        p4VarG.a(str3);
        return Collections.emptyMap();
    }

    final void E(long j8, boolean z7) {
        i();
        v();
        t().F().a("Resetting analytics data (FE)");
        da daVarS = s();
        daVarS.i();
        daVarS.f19918f.b();
        if (yf.a() && a().q(e0.f19970x0)) {
            m().I();
        }
        boolean zM = this.f20556a.m();
        y4 y4VarE = e();
        y4VarE.f20699e.b(j8);
        if (!TextUtils.isEmpty(y4VarE.e().f20716v.a())) {
            y4VarE.f20716v.b(null);
        }
        if (me.a() && y4VarE.a().q(e0.f19956q0)) {
            y4VarE.f20710p.b(0L);
        }
        y4VarE.f20711q.b(0L);
        if (!y4VarE.a().R()) {
            y4VarE.E(!zM);
        }
        y4VarE.f20717w.b(null);
        y4VarE.f20718x.b(0L);
        y4VarE.f20719y.b(null);
        if (z7) {
            r().a0();
        }
        if (me.a() && a().q(e0.f19956q0)) {
            s().f19917e.a();
        }
        this.f19831o = !zM;
    }

    final /* synthetic */ void F(Bundle bundle) {
        if (bundle == null) {
            e().f20719y.b(new Bundle());
            return;
        }
        Bundle bundleA = e().f20719y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                f();
                if (ib.g0(obj)) {
                    f();
                    ib.X(this.f19833q, 27, null, null, 0);
                }
                t().M().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (ib.H0(str)) {
                t().M().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleA.remove(str);
            } else if (f().k0("param", str, a().r(this.f20556a.B().F()), obj)) {
                f().N(bundleA, str, obj);
            }
        }
        f();
        if (ib.f0(bundleA, a().E())) {
            f();
            ib.X(this.f19833q, 26, null, null, 0);
            t().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        e().f20719y.b(bundleA);
        r().C(bundleA);
    }

    final void G(Bundle bundle, int i8, long j8) {
        v();
        String strI = y6.i(bundle);
        if (strI != null) {
            t().M().b("Ignoring invalid consent setting", strI);
            t().M().a("Valid consent values are 'granted', 'denied'");
        }
        y6 y6VarC = y6.c(bundle, i8);
        if (!td.a() || !a().q(e0.S0)) {
            K(y6VarC, j8);
            return;
        }
        if (y6VarC.z()) {
            K(y6VarC, j8);
        }
        v vVarB = v.b(bundle, i8);
        if (vVarB.j()) {
            I(vVarB);
        }
        Boolean boolD = v.d(bundle);
        if (boolD != null) {
            Z("app", "allow_personalized_ads", boolD.toString(), false);
        }
    }

    public final void H(Bundle bundle, long j8) {
        a3.o.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            t().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        a3.o.j(bundle2);
        p3.q.a(bundle2, "app_id", String.class, null);
        p3.q.a(bundle2, "origin", String.class, null);
        p3.q.a(bundle2, "name", String.class, null);
        p3.q.a(bundle2, "value", Object.class, null);
        p3.q.a(bundle2, "trigger_event_name", String.class, null);
        p3.q.a(bundle2, "trigger_timeout", Long.class, 0L);
        p3.q.a(bundle2, "timed_out_event_name", String.class, null);
        p3.q.a(bundle2, "timed_out_event_params", Bundle.class, null);
        p3.q.a(bundle2, "triggered_event_name", String.class, null);
        p3.q.a(bundle2, "triggered_event_params", Bundle.class, null);
        p3.q.a(bundle2, "time_to_live", Long.class, 0L);
        p3.q.a(bundle2, "expired_event_name", String.class, null);
        p3.q.a(bundle2, "expired_event_params", Bundle.class, null);
        a3.o.f(bundle2.getString("name"));
        a3.o.f(bundle2.getString("origin"));
        a3.o.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j8);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (f().q0(string) != 0) {
            t().G().b("Invalid conditional user property name", c().g(string));
            return;
        }
        if (f().w(string, obj) != 0) {
            t().G().c("Invalid conditional user property value", c().g(string), obj);
            return;
        }
        Object objA0 = f().A0(string, obj);
        if (objA0 == null) {
            t().G().c("Unable to normalize conditional user property value", c().g(string), obj);
            return;
        }
        p3.q.b(bundle2, objA0);
        long j9 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j9 > 15552000000L || j9 < 1)) {
            t().G().c("Invalid conditional user property timeout", c().g(string), Long.valueOf(j9));
            return;
        }
        long j10 = bundle2.getLong("time_to_live");
        if (j10 > 15552000000L || j10 < 1) {
            t().G().c("Invalid conditional user property time to live", c().g(string), Long.valueOf(j10));
        } else {
            u().D(new u7(this, bundle2));
        }
    }

    final void I(v vVar) {
        u().D(new e8(this, vVar));
    }

    final void J(y6 y6Var) {
        i();
        boolean z7 = (y6Var.y() && y6Var.x()) || r().e0();
        if (z7 != this.f20556a.n()) {
            this.f20556a.w(z7);
            Boolean boolL = e().L();
            if (!z7 || boolL == null || boolL.booleanValue()) {
                Q(Boolean.valueOf(z7), false);
            }
        }
    }

    public final void K(y6 y6Var, long j8) {
        y6 y6Var2;
        boolean z7;
        boolean z8;
        boolean z9;
        y6 y6VarP = y6Var;
        v();
        int iB = y6Var.b();
        if (iB != -10 && y6Var.s() == null && y6Var.u() == null) {
            t().M().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f19824h) {
            y6Var2 = this.f19827k;
            z7 = true;
            z8 = false;
            if (y6.k(iB, y6Var2.b())) {
                boolean zT = y6VarP.t(this.f19827k);
                if (y6Var.y() && !this.f19827k.y()) {
                    z8 = true;
                }
                y6VarP = y6VarP.p(this.f19827k);
                this.f19827k = y6VarP;
                z9 = z8;
                z8 = zT;
            } else {
                z7 = false;
                z9 = false;
            }
        }
        if (!z7) {
            t().J().b("Ignoring lower-priority consent settings, proposed settings", y6VarP);
            return;
        }
        long andIncrement = this.f19828l.getAndIncrement();
        if (z8) {
            R(null);
            u().G(new d8(this, y6VarP, j8, andIncrement, z9, y6Var2));
            return;
        }
        g8 g8Var = new g8(this, y6VarP, andIncrement, z9, y6Var2);
        if (iB == 30 || iB == -10) {
            u().G(g8Var);
        } else {
            u().D(g8Var);
        }
    }

    public final void P(Boolean bool) {
        v();
        u().D(new b8(this, bool));
    }

    final void R(String str) {
        this.f19823g.set(str);
    }

    final void S(String str, String str2, long j8, Bundle bundle) {
        i();
        T(str, str2, j8, bundle, true, this.f19820d == null || ib.H0(str2), true, null);
    }

    protected final void T(String str, String str2, long j8, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        long j9;
        String str4;
        b7 b7Var;
        String str5;
        String str6;
        boolean z10;
        int length;
        a3.o.f(str);
        a3.o.j(bundle);
        i();
        v();
        if (!this.f20556a.m()) {
            t().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listH = m().H();
        if (listH != null && !listH.contains(str2)) {
            t().F().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f19822f) {
            this.f19822f = true;
            try {
                try {
                    (!this.f20556a.r() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, j().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, j());
                } catch (Exception e8) {
                    t().L().b("Failed to invoke Tag Manager's initialize() method", e8);
                }
            } catch (ClassNotFoundException unused) {
                t().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                Y("auto", "_lgclid", bundle.getString("gclid"), k().a());
            }
            if (ne.a() && a().q(e0.Z0) && bundle.containsKey("gbraid")) {
                Y("auto", "_gbraid", bundle.getString("gbraid"), k().a());
            }
        }
        if (z7 && ib.L0(str2)) {
            f().M(bundle, e().f20719y.a());
        }
        if (!z9 && !"_iap".equals(str2)) {
            ib ibVarL = this.f20556a.L();
            int i8 = 2;
            if (ibVarL.C0("event", str2)) {
                if (!ibVarL.o0("event", p3.r.f25611a, p3.r.f25612b, str2)) {
                    i8 = 13;
                } else if (ibVarL.i0("event", 40, str2)) {
                    i8 = 0;
                }
            }
            if (i8 != 0) {
                t().H().b("Invalid public event name. Event will not be logged (FE)", c().c(str2));
                this.f20556a.L();
                String strI = ib.I(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f20556a.L();
                ib.X(this.f19833q, i8, "_ev", strI, length);
                return;
            }
        }
        p8 p8VarC = q().C(false);
        if (p8VarC != null && !bundle.containsKey("_sc")) {
            p8VarC.f20367d = true;
        }
        ib.W(p8VarC, bundle, z7 && !z9);
        boolean zEquals = "am".equals(str);
        boolean zH0 = ib.H0(str2);
        if (z7 && this.f19820d != null && !zH0 && !zEquals) {
            t().F().c("Passing event to registered event handler (FE)", c().c(str2), c().a(bundle));
            a3.o.j(this.f19820d);
            this.f19820d.a(str, str2, bundle, j8);
            return;
        }
        if (this.f20556a.q()) {
            int iV = f().v(str2);
            if (iV != 0) {
                t().H().b("Invalid event name. Event will not be logged (FE)", c().c(str2));
                f();
                String strI2 = ib.I(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f20556a.L();
                ib.Y(this.f19833q, str3, iV, "_ev", strI2, length);
                return;
            }
            Bundle bundleE = f().E(str3, str2, bundle, e3.f.b("_o", "_sn", "_sc", "_si"), z9);
            a3.o.j(bundleE);
            if (q().C(false) != null && "_ae".equals(str2)) {
                ja jaVar = s().f19918f;
                long jB = jaVar.f20161d.k().b();
                long j10 = jB - jaVar.f20159b;
                jaVar.f20159b = jB;
                if (j10 > 0) {
                    f().L(bundleE, j10);
                }
            }
            if (zd.a() && a().q(e0.f19954p0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    ib ibVarF = f();
                    String string = bundleE.getString("_ffr");
                    String strTrim = e3.q.a(string) ? null : string != null ? string.trim() : string;
                    if (p3.i0.a(strTrim, ibVarF.e().f20716v.a())) {
                        ibVarF.t().F().a("Not logging duplicate session_start_with_rollout event");
                        z10 = false;
                    } else {
                        ibVarF.e().f20716v.b(strTrim);
                        z10 = true;
                    }
                    if (!z10) {
                        return;
                    }
                } else if ("_ae".equals(str2)) {
                    String strA = f().e().f20716v.a();
                    if (!TextUtils.isEmpty(strA)) {
                        bundleE.putString("_ffr", strA);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleE);
            boolean zF = a().q(e0.Q0) ? s().F() : e().f20713s.b();
            if (e().f20710p.a() > 0 && e().y(j8) && zF) {
                t().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j9 = 0;
                str4 = "_ae";
                Y("auto", "_sid", null, k().a());
                Y("auto", "_sno", null, k().a());
                Y("auto", "_se", null, k().a());
                e().f20711q.b(0L);
            } else {
                j9 = 0;
                str4 = "_ae";
            }
            if (bundleE.getLong("extend_session", j9) == 1) {
                t().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                b7Var = this;
                b7Var.f20556a.K().f19917e.b(j8, true);
            } else {
                b7Var = this;
            }
            ArrayList arrayList2 = new ArrayList(bundleE.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                String str7 = (String) obj;
                if (str7 != null) {
                    f();
                    Bundle[] bundleArrX0 = ib.x0(bundleE.get(str7));
                    if (bundleArrX0 != null) {
                        bundleE.putParcelableArray(str7, bundleArrX0);
                    }
                }
            }
            int i10 = 0;
            while (i10 < arrayList.size()) {
                Bundle bundleR0 = (Bundle) arrayList.get(i10);
                if (i10 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundleR0.putString("_o", str5);
                if (z8) {
                    bundleR0 = f().r0(bundleR0);
                }
                Bundle bundle2 = bundleR0;
                r().I(new d0(str6, new z(bundle2), str, j8), str3);
                if (!zEquals) {
                    Iterator<p3.u> it = b7Var.f19821e.iterator();
                    while (it.hasNext()) {
                        it.next().a(str, str2, new Bundle(bundle2), j8);
                    }
                }
                i10++;
            }
            if (q().C(false) == null || !str4.equals(str2)) {
                return;
            }
            s().E(true, true, k().b());
        }
    }

    public final void V(String str, String str2, Bundle bundle) {
        long jA = k().a();
        a3.o.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        u().D(new t7(this, bundle2));
    }

    public final void W(String str, String str2, Bundle bundle, String str3) {
        h();
        w0(str, str2, k().a(), bundle, false, true, true, str3);
    }

    public final void X(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            q().I(bundle2, j8);
        } else {
            w0(str3, str2, j8, bundle2, z8, !z8 || this.f19820d == null || ib.H0(str2), z7, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void Y(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            a3.o.f(r9)
            a3.o.f(r10)
            r8.i()
            r8.v()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.y4 r0 = r8.e()
            com.google.android.gms.measurement.internal.e5 r0 = r0.f20707m
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
            goto L5e
        L50:
            if (r11 != 0) goto L60
            com.google.android.gms.measurement.internal.y4 r10 = r8.e()
            com.google.android.gms.measurement.internal.e5 r10 = r10.f20707m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L5e:
            r3 = r1
            goto L62
        L60:
            r3 = r10
            r6 = r11
        L62:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f20556a
            boolean r10 = r10.m()
            if (r10 != 0) goto L78
            com.google.android.gms.measurement.internal.n4 r9 = r8.t()
            com.google.android.gms.measurement.internal.p4 r9 = r9.K()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            com.google.android.gms.measurement.internal.w5 r10 = r8.f20556a
            boolean r10 = r10.q()
            if (r10 != 0) goto L81
            return
        L81:
            com.google.android.gms.measurement.internal.hb r10 = new com.google.android.gms.measurement.internal.hb
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.v8 r9 = r8.r()
            r9.M(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b7.Y(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void Z(String str, String str2, Object obj, boolean z7) {
        a0(str, str2, obj, z7, k().a());
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final void a0(String str, String str2, Object obj, boolean z7, long j8) {
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int iQ0 = 6;
        if (z7) {
            iQ0 = f().q0(str2);
        } else {
            ib ibVarF = f();
            if (ibVarF.C0("user property", str2)) {
                if (!ibVarF.n0("user property", p3.s.f25615a, str2)) {
                    iQ0 = 15;
                } else if (ibVarF.i0("user property", 24, str2)) {
                    iQ0 = 0;
                }
            }
        }
        if (iQ0 != 0) {
            f();
            String strI = ib.I(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f20556a.L();
            ib.X(this.f19833q, iQ0, "_ev", strI, length);
            return;
        }
        if (obj == null) {
            U(str3, str2, j8, null);
            return;
        }
        int iW = f().w(str2, obj);
        if (iW == 0) {
            Object objA0 = f().A0(str2, obj);
            if (objA0 != null) {
                U(str3, str2, j8, objA0);
                return;
            }
            return;
        }
        f();
        String strI2 = ib.I(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f20556a.L();
        ib.X(this.f19833q, iW, "_ev", strI2, length);
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y b() {
        return super.b();
    }

    final /* synthetic */ void b0(List list) {
        i();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayH = e().H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                na naVar = (na) it.next();
                if (!sparseArrayH.contains(naVar.f20304c) || sparseArrayH.get(naVar.f20304c).longValue() < naVar.f20303b) {
                    s0().add(naVar);
                }
            }
            r0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 c() {
        return super.c();
    }

    public final void c0(p3.u uVar) {
        v();
        a3.o.j(uVar);
        if (this.f19821e.add(uVar)) {
            return;
        }
        t().L().a("OnEventListener already registered");
    }

    public final void d0(p3.v vVar) {
        p3.v vVar2;
        i();
        v();
        if (vVar != null && vVar != (vVar2 = this.f19820d)) {
            a3.o.n(vVar2 == null, "EventInterceptor already set.");
        }
        this.f19820d = vVar;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final Boolean e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) u().v(atomicReference, 15000L, "boolean test flag value", new j7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final Double f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) u().v(atomicReference, 15000L, "double test flag value", new c8(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final Integer g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) u().v(atomicReference, 15000L, "int test flag value", new z7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final Long h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) u().v(atomicReference, 15000L, "long test flag value", new a8(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final String i0() {
        return this.f19823g.get();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context j() {
        return super.j();
    }

    public final String j0() {
        p8 p8VarP = this.f20556a.I().P();
        if (p8VarP != null) {
            return p8VarP.f20365b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e3.e k() {
        return super.k();
    }

    public final String k0() {
        p8 p8VarP = this.f20556a.I().P();
        if (p8VarP != null) {
            return p8VarP.f20364a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x l() {
        return super.l();
    }

    public final String l0() {
        if (this.f20556a.M() != null) {
            return this.f20556a.M();
        }
        try {
            return new p3.p(j(), this.f20556a.P()).b("google_app_id");
        } catch (IllegalStateException e8) {
            this.f20556a.t().G().b("getGoogleAppId failed with exception", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 m() {
        return super.m();
    }

    public final String m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) u().v(atomicReference, 15000L, "String test flag value", new r7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 n() {
        return super.n();
    }

    public final void n0() {
        i();
        v();
        if (this.f20556a.q()) {
            if (a().q(e0.f19944k0)) {
                Boolean boolF = a().F("google_analytics_deferred_deep_link_enabled");
                if (boolF != null && boolF.booleanValue()) {
                    t().F().a("Deferred Deep Link feature enabled.");
                    u().D(new Runnable() { // from class: p3.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25623a.q0();
                        }
                    });
                }
            }
            r().X();
            this.f19831o = false;
            String strN = e().N();
            if (TextUtils.isEmpty(strN)) {
                return;
            }
            b().l();
            if (strN.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strN);
            z0("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 o() {
        return super.o();
    }

    public final void o0() {
        if (!(j().getApplicationContext() instanceof Application) || this.f19819c == null) {
            return;
        }
        ((Application) j().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f19819c);
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    final void p0() {
        if (mf.a() && a().q(e0.M0)) {
            if (u().J()) {
                t().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (e.a()) {
                t().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            v();
            t().K().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            u().v(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.c7
                @Override // java.lang.Runnable
                public final void run() {
                    b7 b7Var = this.f19865a;
                    AtomicReference<List<na>> atomicReference2 = atomicReference;
                    Bundle bundleA = b7Var.e().f20708n.a();
                    v8 v8VarR = b7Var.r();
                    if (bundleA == null) {
                        bundleA = new Bundle();
                    }
                    v8VarR.P(atomicReference2, bundleA);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                t().G().a("Timed out waiting for get trigger URIs");
            } else {
                u().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.e7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19989a.b0(list);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 q() {
        return super.q();
    }

    public final void q0() {
        i();
        if (e().f20714t.b()) {
            t().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = e().f20715u.a();
        e().f20715u.b(1 + jA);
        if (jA >= 5) {
            t().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            e().f20714t.a(true);
        } else {
            if (!td.a() || !a().q(e0.U0)) {
                this.f20556a.s();
                return;
            }
            if (this.f19832p == null) {
                this.f19832p = new q7(this, this.f20556a);
            }
            this.f19832p.b(0L);
        }
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 r() {
        return super.r();
    }

    @TargetApi(30)
    final void r0() {
        na naVarPoll;
        j0.a aVarQ0;
        i();
        if (s0().isEmpty() || this.f19825i || (naVarPoll = s0().poll()) == null || (aVarQ0 = f().Q0()) == null) {
            return;
        }
        this.f19825i = true;
        t().K().b("Registering trigger URI", naVarPoll.f20302a);
        x3.d<e6.i0> dVarD = aVarQ0.d(Uri.parse(naVarPoll.f20302a));
        if (dVarD == null) {
            this.f19825i = false;
            s0().add(naVarPoll);
            return;
        }
        SparseArray<Long> sparseArrayH = e().H();
        sparseArrayH.put(naVarPoll.f20304c, Long.valueOf(naVarPoll.f20303b));
        y4 y4VarE = e();
        int[] iArr = new int[sparseArrayH.size()];
        long[] jArr = new long[sparseArrayH.size()];
        for (int i8 = 0; i8 < sparseArrayH.size(); i8++) {
            iArr[i8] = sparseArrayH.keyAt(i8);
            jArr[i8] = sparseArrayH.valueAt(i8).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        y4VarE.f20708n.b(bundle);
        x3.b.a(dVarD, new l7(this, naVarPoll), new h7(this));
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 u() {
        return super.u();
    }

    public final void u0(Bundle bundle) {
        H(bundle, k().a());
    }

    public final void x0(String str, String str2, Bundle bundle) {
        X(str, str2, bundle, true, true, k().a());
    }

    public final void y0(p3.u uVar) {
        v();
        a3.o.j(uVar);
        if (this.f19821e.remove(uVar)) {
            return;
        }
        t().L().a("OnEventListener had not been registered");
    }

    final void z0(String str, String str2, Bundle bundle) {
        i();
        S(str, str2, k().a(), bundle);
    }
}
