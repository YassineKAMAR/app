package h2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.f10;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.o10;
import com.google.android.gms.internal.ads.qg0;
import com.google.android.gms.internal.ads.s40;
import f2.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z1.v;

/* JADX INFO: loaded from: classes.dex */
public final class j3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static j3 f22201i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n1 f22207f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22202a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22204c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22205d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f22206e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private z1.p f22208g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private z1.v f22209h = new v.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f22203b = new ArrayList();

    private j3() {
    }

    private final void a(Context context) {
        if (this.f22207f == null) {
            this.f22207f = (n1) new p(v.a(), context).d(context, false);
        }
    }

    private final void b(z1.v vVar) {
        try {
            this.f22207f.m1(new f4(vVar));
        } catch (RemoteException e8) {
            qg0.e("Unable to set request configuration parcel.", e8);
        }
    }

    public static j3 g() {
        j3 j3Var;
        synchronized (j3.class) {
            if (f22201i == null) {
                f22201i = new j3();
            }
            j3Var = f22201i;
        }
        return j3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f2.b v(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f10 f10Var = (f10) it.next();
            map.put(f10Var.f7567a, new n10(f10Var.f7568b ? a.EnumC0105a.READY : a.EnumC0105a.NOT_READY, f10Var.f7570d, f10Var.f7569c));
        }
        return new o10(map);
    }

    private final void w(Context context, String str) {
        try {
            s40.a().b(context, null);
            this.f22207f.s();
            this.f22207f.Y2(null, g3.b.k3(null));
        } catch (RemoteException e8) {
            qg0.h("MobileAdsSettingManager initialization failed", e8);
        }
    }

    public final z1.v d() {
        return this.f22209h;
    }

    public final f2.b f() {
        f2.b bVarV;
        synchronized (this.f22206e) {
            a3.o.n(this.f22207f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                bVarV = v(this.f22207f.q());
            } catch (RemoteException unused) {
                qg0.d("Unable to get Initialization status.");
                return new f2.b() { // from class: h2.b3
                    @Override // f2.b
                    public final Map a() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new e3(this.f22166a));
                        return map;
                    }
                };
            }
        }
        return bVarV;
    }

    public final void l(Context context) {
        synchronized (this.f22206e) {
            a(context);
            try {
                this.f22207f.r();
            } catch (RemoteException unused) {
                qg0.d("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(final android.content.Context r3, java.lang.String r4, f2.c r5) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.j3.m(android.content.Context, java.lang.String, f2.c):void");
    }

    final /* synthetic */ void n(Context context, String str) {
        synchronized (this.f22206e) {
            w(context, null);
        }
    }

    final /* synthetic */ void o(Context context, String str) {
        synchronized (this.f22206e) {
            w(context, null);
        }
    }

    public final void p(Context context, z1.p pVar) {
        synchronized (this.f22206e) {
            a(context);
            this.f22208g = pVar;
            try {
                this.f22207f.h3(new g3(null));
            } catch (RemoteException unused) {
                qg0.d("Unable to open the ad inspector.");
                if (pVar != null) {
                    pVar.a(new z1.c(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    public final void q(Context context, String str) {
        synchronized (this.f22206e) {
            a3.o.n(this.f22207f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f22207f.K4(g3.b.k3(context), str);
            } catch (RemoteException e8) {
                qg0.e("Unable to open debug menu.", e8);
            }
        }
    }

    public final void r(boolean z7) {
        synchronized (this.f22206e) {
            a3.o.n(this.f22207f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f22207f.I5(z7);
            } catch (RemoteException e8) {
                qg0.e("Unable to set app mute state.", e8);
            }
        }
    }

    public final void s(float f8) {
        boolean z7 = true;
        a3.o.b(f8 >= 0.0f && f8 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f22206e) {
            if (this.f22207f == null) {
                z7 = false;
            }
            a3.o.n(z7, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f22207f.p3(f8);
            } catch (RemoteException e8) {
                qg0.e("Unable to set app volume.", e8);
            }
        }
    }

    public final void t(String str) {
        synchronized (this.f22206e) {
            a3.o.n(this.f22207f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f22207f.M0(str);
            } catch (RemoteException e8) {
                qg0.e("Unable to set plugin.", e8);
            }
        }
    }

    public final void u(z1.v vVar) {
        a3.o.b(vVar != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f22206e) {
            z1.v vVar2 = this.f22209h;
            this.f22209h = vVar;
            if (this.f22207f == null) {
                return;
            }
            if (vVar2.c() != vVar.c() || vVar2.d() != vVar.d()) {
                b(vVar);
            }
        }
    }
}
