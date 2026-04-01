package p2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.b93;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.dy2;
import com.google.android.gms.internal.ads.ef0;
import com.google.android.gms.internal.ads.ef3;
import com.google.android.gms.internal.ads.eh0;
import com.google.android.gms.internal.ads.ey2;
import com.google.android.gms.internal.ads.fs;
import com.google.android.gms.internal.ads.g90;
import com.google.android.gms.internal.ads.gf3;
import com.google.android.gms.internal.ads.gh;
import com.google.android.gms.internal.ads.hh;
import com.google.android.gms.internal.ads.j90;
import com.google.android.gms.internal.ads.jf0;
import com.google.android.gms.internal.ads.jq1;
import com.google.android.gms.internal.ads.jz2;
import com.google.android.gms.internal.ads.lg3;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qf3;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.qy2;
import com.google.android.gms.internal.ads.rt2;
import com.google.android.gms.internal.ads.ty2;
import com.google.android.gms.internal.ads.ul1;
import com.google.android.gms.internal.ads.wg0;
import com.google.android.gms.internal.ads.z73;
import com.google.android.gms.internal.ads.zf3;
import com.google.android.gms.internal.ads.zp1;
import h2.r4;
import j2.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ef0 {
    protected static final List C = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List D = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List E = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List F = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private final List A;
    private final List B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo0 f25488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gh f25490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt2 f25491d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lg3 f25493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f25494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private j90 f25495h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v f25499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final jq1 f25500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final jz2 f25501n;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final wg0 f25509v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f25510w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f25512y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f25513z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zp1 f25492e = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Point f25496i = new Point();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Point f25497j = new Point();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f25498k = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final AtomicInteger f25508u = new AtomicInteger(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f25502o = ((Boolean) h2.y.c().b(ns.f12101i7)).booleanValue();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f25503p = ((Boolean) h2.y.c().b(ns.f12092h7)).booleanValue();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f25504q = ((Boolean) h2.y.c().b(ns.f12119k7)).booleanValue();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f25505r = ((Boolean) h2.y.c().b(ns.f12137m7)).booleanValue();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f25506s = (String) h2.y.c().b(ns.f12128l7);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f25507t = (String) h2.y.c().b(ns.f12146n7);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f25511x = (String) h2.y.c().b(ns.f12155o7);

    public c(bo0 bo0Var, Context context, gh ghVar, rt2 rt2Var, lg3 lg3Var, ScheduledExecutorService scheduledExecutorService, jq1 jq1Var, jz2 jz2Var, wg0 wg0Var) {
        List listN6;
        this.f25488a = bo0Var;
        this.f25489b = context;
        this.f25490c = ghVar;
        this.f25491d = rt2Var;
        this.f25493f = lg3Var;
        this.f25494g = scheduledExecutorService;
        this.f25499l = bo0Var.s();
        this.f25500m = jq1Var;
        this.f25501n = jz2Var;
        this.f25509v = wg0Var;
        if (((Boolean) h2.y.c().b(ns.f12164p7)).booleanValue()) {
            this.f25512y = n6((String) h2.y.c().b(ns.f12173q7));
            this.f25513z = n6((String) h2.y.c().b(ns.f12182r7));
            this.A = n6((String) h2.y.c().b(ns.f12191s7));
            listN6 = n6((String) h2.y.c().b(ns.t7));
        } else {
            this.f25512y = C;
            this.f25513z = D;
            this.A = E;
            listN6 = F;
        }
        this.B = listN6;
    }

    static /* bridge */ /* synthetic */ void U5(c cVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar.c6((Uri) it.next())) {
                cVar.f25508u.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void V5(final c cVar, final String str, final String str2, final zp1 zp1Var) {
        if (((Boolean) h2.y.c().b(ns.T6)).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.Z6)).booleanValue()) {
                eh0.f7322a.execute(new Runnable() { // from class: p2.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25525a.X5(str, str2, zp1Var);
                    }
                });
            } else {
                cVar.f25499l.d(str, str2, zp1Var);
            }
        }
    }

    static final /* synthetic */ Uri e6(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m6(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p2.a0 f6(android.content.Context r8, java.lang.String r9, java.lang.String r10, h2.w4 r11, h2.r4 r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.f6(android.content.Context, java.lang.String, java.lang.String, h2.w4, h2.r4):p2.a0");
    }

    private final x3.d g6(final String str) {
        final ul1[] ul1VarArr = new ul1[1];
        x3.d dVarN = zf3.n(this.f25491d.a(), new gf3() { // from class: p2.e0
            @Override // com.google.android.gms.internal.ads.gf3
            public final x3.d a(Object obj) {
                return this.f25530a.z6(ul1VarArr, str, (ul1) obj);
            }
        }, this.f25493f);
        dVarN.c(new Runnable() { // from class: p2.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25533a.W5(ul1VarArr);
            }
        }, this.f25493f);
        return zf3.e(zf3.m((qf3) zf3.o(qf3.C(dVarN), ((Integer) h2.y.c().b(ns.A7)).intValue(), TimeUnit.MILLISECONDS, this.f25494g), new z73() { // from class: p2.l0
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                List list = c.C;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.f25493f), Exception.class, new z73() { // from class: p2.m0
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                List list = c.C;
                qg0.e("", (Exception) obj);
                return null;
            }
        }, this.f25493f);
    }

    private final void h6() {
        if (((Boolean) h2.y.c().b(ns.h9)).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.k9)).booleanValue()) {
                return;
            }
            zf3.r(((Boolean) h2.y.c().b(ns.ha)).booleanValue() ? zf3.k(new ef3() { // from class: p2.b0
                @Override // com.google.android.gms.internal.ads.ef3
                public final x3.d j() {
                    return this.f25487a.y6();
                }
            }, eh0.f7322a) : f6(this.f25489b, null, z1.b.BANNER.name(), null, null).c(), new s0(this), this.f25488a.c());
        }
    }

    private final void i6(List list, final g3.a aVar, g90 g90Var, boolean z7) {
        x3.d dVarZ;
        if (!((Boolean) h2.y.c().b(ns.z7)).booleanValue()) {
            qg0.g("The updating URL feature is not enabled.");
            try {
                g90Var.b("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                qg0.e("", e8);
                return;
            }
        }
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            if (c6((Uri) it.next())) {
                i8++;
            }
        }
        if (i8 > 1) {
            qg0.g("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (c6(uri)) {
                dVarZ = this.f25493f.Z(new Callable() { // from class: p2.g0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f25536a.q6(uri, aVar);
                    }
                });
                if (l6()) {
                    dVarZ = zf3.n(dVarZ, new gf3() { // from class: p2.h0
                        @Override // com.google.android.gms.internal.ads.gf3
                        public final x3.d a(Object obj) {
                            c cVar = this.f25540a;
                            return zf3.m(cVar.g6("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new z73() { // from class: p2.i0
                                @Override // com.google.android.gms.internal.ads.z73
                                public final Object apply(Object obj2) {
                                    return c.e6(uri, (String) obj2);
                                }
                            }, cVar.f25493f);
                        }
                    }, this.f25493f);
                } else {
                    qg0.f("Asset view map is empty.");
                }
            } else {
                qg0.g("Not a Google URL: ".concat(String.valueOf(uri)));
                dVarZ = zf3.h(uri);
            }
            arrayList.add(dVarZ);
        }
        zf3.r(zf3.d(arrayList), new r0(this, g90Var, z7), this.f25488a.c());
    }

    private final void j6(final List list, final g3.a aVar, g90 g90Var, boolean z7) {
        if (!((Boolean) h2.y.c().b(ns.z7)).booleanValue()) {
            try {
                g90Var.b("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e8) {
                qg0.e("", e8);
                return;
            }
        }
        x3.d dVarZ = this.f25493f.Z(new Callable() { // from class: p2.n0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25558a.R5(list, aVar);
            }
        });
        if (l6()) {
            dVarZ = zf3.n(dVarZ, new gf3() { // from class: p2.o0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return this.f25564a.A6((ArrayList) obj);
                }
            }, this.f25493f);
        } else {
            qg0.f("Asset view map is empty.");
        }
        zf3.r(dVarZ, new q0(this, g90Var, z7), this.f25488a.c());
    }

    private static boolean k6(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean l6() {
        Map map;
        j90 j90Var = this.f25495h;
        return (j90Var == null || (map = j90Var.f9527b) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri m6(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i8 = iIndexOf + 1;
        return Uri.parse(string.substring(0, i8) + str + com.amazon.a.a.o.b.f.f3943b + str2 + "&" + string.substring(i8));
    }

    private static final List n6(String str) {
        String[] strArrSplit = TextUtils.split(str, com.amazon.a.a.o.b.f.f3942a);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!b93.d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ qy2 v6(x3.d dVar, jf0 jf0Var) {
        if (!ty2.a() || !((Boolean) bu.f6043e.e()).booleanValue()) {
            return null;
        }
        try {
            qy2 qy2VarB = ((a0) zf3.p(dVar)).b();
            qy2VarB.d(new ArrayList(Collections.singletonList(jf0Var.f9591b)));
            r4 r4Var = jf0Var.f9593d;
            qy2VarB.b(r4Var == null ? "" : r4Var.f22267p);
            return qy2VarB;
        } catch (ExecutionException e8) {
            g2.t.q().u(e8, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ x3.d A6(final ArrayList arrayList) {
        return zf3.m(g6("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new z73() { // from class: p2.c0
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return this.f25514a.Q5(arrayList, (String) obj);
            }
        }, this.f25493f);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void K3(List list, g3.a aVar, g90 g90Var) {
        j6(list, aVar, g90Var, true);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void O4(j90 j90Var) {
        this.f25495h = j90Var;
        this.f25491d.c(1);
    }

    final /* synthetic */ ArrayList Q5(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriM6 = (Uri) it.next();
            if (d6(uriM6) && !TextUtils.isEmpty(str)) {
                uriM6 = m6(uriM6, "nas", str);
            }
            arrayList.add(uriM6);
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList R5(List list, g3.a aVar) throws Exception {
        this.f25490c.c();
        String strG = this.f25490c.c().g(this.f25489b, (View) g3.b.H0(aVar), null);
        if (TextUtils.isEmpty(strG)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uriM6 = (Uri) it.next();
            if (d6(uriM6)) {
                uriM6 = m6(uriM6, "ms", strG);
            } else {
                qg0.g("Not a Google URL: ".concat(String.valueOf(uriM6)));
            }
            arrayList.add(uriM6);
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void W5(ul1[] ul1VarArr) {
        ul1 ul1Var = ul1VarArr[0];
        if (ul1Var != null) {
            this.f25491d.b(zf3.h(ul1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void X2(List list, g3.a aVar, g90 g90Var) {
        i6(list, aVar, g90Var, false);
    }

    final /* synthetic */ void X5(String str, String str2, zp1 zp1Var) {
        this.f25499l.d(str, str2, zp1Var);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void b0(g3.a aVar) {
        if (((Boolean) h2.y.c().b(ns.z7)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) g3.b.H0(aVar);
            j90 j90Var = this.f25495h;
            this.f25496i = b1.a(motionEvent, j90Var == null ? null : j90Var.f9526a);
            if (motionEvent.getAction() == 0) {
                this.f25497j = this.f25496i;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.f25496i;
            motionEventObtain.setLocation(point.x, point.y);
            this.f25490c.d(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    final boolean c6(Uri uri) {
        return k6(uri, this.f25512y, this.f25513z);
    }

    final boolean d6(Uri uri) {
        return k6(uri, this.A, this.B);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    @SuppressLint({"AddJavascriptInterface"})
    public final void e0(g3.a aVar) {
        if (((Boolean) h2.y.c().b(ns.g9)).booleanValue()) {
            fs fsVar = ns.y7;
            if (!((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                h6();
            }
            WebView webView = (WebView) g3.b.H0(aVar);
            if (webView == null) {
                qg0.d("The webView cannot be null.");
                return;
            }
            if (this.f25498k.contains(webView)) {
                qg0.f("This webview has already been registered.");
                return;
            }
            this.f25498k.add(webView);
            webView.addJavascriptInterface(new a(webView, this.f25490c, this.f25500m, this.f25501n), "gmaSdk");
            if (((Boolean) h2.y.c().b(fsVar)).booleanValue()) {
                h6();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void g5(g3.a aVar, final jf0 jf0Var, cf0 cf0Var) {
        x3.d dVarH;
        x3.d dVarC;
        Context context = (Context) g3.b.H0(aVar);
        this.f25489b = context;
        ey2 ey2VarA = dy2.a(context, 22);
        ey2VarA.o();
        if (((Boolean) h2.y.c().b(ns.ha)).booleanValue()) {
            lg3 lg3Var = eh0.f7322a;
            dVarH = lg3Var.Z(new Callable() { // from class: p2.j0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f25545a.u6(jf0Var);
                }
            });
            dVarC = zf3.n(dVarH, new gf3() { // from class: p2.k0
                @Override // com.google.android.gms.internal.ads.gf3
                public final x3.d a(Object obj) {
                    return ((a0) obj).c();
                }
            }, lg3Var);
        } else {
            a0 a0VarF6 = f6(this.f25489b, jf0Var.f9590a, jf0Var.f9591b, jf0Var.f9592c, jf0Var.f9593d);
            dVarH = zf3.h(a0VarF6);
            dVarC = a0VarF6.c();
        }
        zf3.r(dVarC, new p0(this, dVarH, jf0Var, cf0Var, ey2VarA, g2.t.b().a()), this.f25488a.c());
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void j1(List list, g3.a aVar, g90 g90Var) {
        j6(list, aVar, g90Var, false);
    }

    @Override // com.google.android.gms.internal.ads.ff0
    public final void q5(List list, g3.a aVar, g90 g90Var) {
        i6(list, aVar, g90Var, true);
    }

    final /* synthetic */ Uri q6(Uri uri, g3.a aVar) throws Exception {
        try {
            uri = this.f25490c.a(uri, this.f25489b, (View) g3.b.H0(aVar), null);
        } catch (hh e8) {
            qg0.h("", e8);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ a0 u6(jf0 jf0Var) {
        return f6(this.f25489b, jf0Var.f9590a, jf0Var.f9591b, jf0Var.f9592c, jf0Var.f9593d);
    }

    final /* synthetic */ x3.d y6() {
        return f6(this.f25489b, null, z1.b.BANNER.name(), null, null).c();
    }

    final /* synthetic */ x3.d z6(ul1[] ul1VarArr, String str, ul1 ul1Var) throws JSONException {
        ul1VarArr[0] = ul1Var;
        Context context = this.f25489b;
        j90 j90Var = this.f25495h;
        Map map = j90Var.f9527b;
        JSONObject jSONObjectD = b1.d(context, map, map, j90Var.f9526a, null);
        JSONObject jSONObjectG = b1.g(this.f25489b, this.f25495h.f9526a);
        JSONObject jSONObjectF = b1.f(this.f25495h.f9526a);
        JSONObject jSONObjectE = b1.e(this.f25489b, this.f25495h.f9526a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectD);
        jSONObject.put("ad_view_signal", jSONObjectG);
        jSONObject.put("scroll_view_signal", jSONObjectF);
        jSONObject.put("lock_screen_signal", jSONObjectE);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", b1.c(null, this.f25489b, this.f25497j, this.f25496i));
        }
        return ul1Var.d(str, jSONObject);
    }
}
