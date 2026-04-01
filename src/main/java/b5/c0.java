package b5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import l5.a;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class c0 implements l5.a, k.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static String f3303h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static o f3307l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s5.k f3309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map<String, Integer> f3298c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    static final Map<Integer, i> f3299d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f3300e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f3301f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f3302g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f3304i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f3305j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f3306k = 0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k.d f3311b;

        a(i iVar, k.d dVar) {
            this.f3310a = iVar;
            this.f3311b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c0.f3301f) {
                c0.this.l(this.f3310a);
            }
            this.f3311b.a(null);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f3313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k.d f3315c;

        b(i iVar, String str, k.d dVar) {
            this.f3313a = iVar;
            this.f3314b = str;
            this.f3315c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c0.f3301f) {
                i iVar = this.f3313a;
                if (iVar != null) {
                    c0.this.l(iVar);
                }
                try {
                    if (r.c(c0.f3302g)) {
                        Log.d("Sqflite", "delete database " + this.f3314b);
                    }
                    i.o(this.f3314b);
                } catch (Exception e8) {
                    Log.e("Sqflite", "error " + e8 + " while closing database " + c0.f3306k);
                }
            }
            this.f3315c.a(null);
        }
    }

    private void A(s5.j jVar, k.d dVar) {
        int iIntValue = ((Integer) jVar.a("id")).intValue();
        i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        if (r.b(iVarN.f3331d)) {
            Log.d("Sqflite", iVarN.A() + "closing " + iIntValue + " " + iVarN.f3329b);
        }
        String str = iVarN.f3329b;
        synchronized (f3300e) {
            f3299d.remove(Integer.valueOf(iIntValue));
            if (iVarN.f3328a) {
                f3298c.remove(str);
            }
        }
        f3307l.a(iVarN, new a(iVarN, dVar));
    }

    private void B(s5.j jVar, k.d dVar) {
        dVar.a(Boolean.valueOf(i.x((String) jVar.a("path"))));
    }

    private void C(s5.j jVar, k.d dVar) {
        String str = (String) jVar.a("cmd");
        HashMap map = new HashMap();
        if (com.amazon.a.a.o.b.ar.equals(str)) {
            int i8 = f3302g;
            if (i8 > 0) {
                map.put("logLevel", Integer.valueOf(i8));
            }
            Map<Integer, i> map2 = f3299d;
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                for (Map.Entry<Integer, i> entry : map2.entrySet()) {
                    i value = entry.getValue();
                    HashMap map4 = new HashMap();
                    map4.put("path", value.f3329b);
                    map4.put("singleInstance", Boolean.valueOf(value.f3328a));
                    int i9 = value.f3331d;
                    if (i9 > 0) {
                        map4.put("logLevel", Integer.valueOf(i9));
                    }
                    map3.put(entry.getKey().toString(), map4);
                }
                map.put("databases", map3);
            }
        }
        dVar.a(map);
    }

    private void D(s5.j jVar, k.d dVar) {
        c5.a.f3472a = Boolean.TRUE.equals(jVar.b());
        c5.a.f3474c = c5.a.f3473b && c5.a.f3472a;
        if (!c5.a.f3472a) {
            f3302g = 0;
        } else if (c5.a.f3474c) {
            f3302g = 2;
        } else if (c5.a.f3472a) {
            f3302g = 1;
        }
        dVar.a(null);
    }

    private void E(s5.j jVar, k.d dVar) {
        i iVar;
        Map<Integer, i> map;
        String str = (String) jVar.a("path");
        synchronized (f3300e) {
            if (r.c(f3302g)) {
                Log.d("Sqflite", "Look for " + str + " in " + f3298c.keySet());
            }
            Map<String, Integer> map2 = f3298c;
            Integer num = map2.get(str);
            if (num == null || (iVar = (map = f3299d).get(num)) == null || !iVar.f3336i.isOpen()) {
                iVar = null;
            } else {
                if (r.c(f3302g)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iVar.A());
                    sb.append("found single instance ");
                    sb.append(iVar.F() ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    Log.d("Sqflite", sb.toString());
                }
                map.remove(num);
                map2.remove(str);
            }
        }
        b bVar = new b(iVar, str, dVar);
        o oVar = f3307l;
        if (oVar != null) {
            oVar.a(iVar, bVar);
        } else {
            bVar.run();
        }
    }

    private void F(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.x
            @Override // java.lang.Runnable
            public final void run() {
                c0.q(jVar, dVar, iVarN);
            }
        });
    }

    private void H(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.u
            @Override // java.lang.Runnable
            public final void run() {
                c0.r(jVar, dVar, iVarN);
            }
        });
    }

    private void I(final s5.j jVar, final k.d dVar) {
        final int i8;
        i iVar;
        final String str = (String) jVar.a("path");
        final Boolean bool = (Boolean) jVar.a("readOnly");
        final boolean zO = o(str);
        boolean z7 = (Boolean.FALSE.equals(jVar.a("singleInstance")) || zO) ? false : true;
        if (z7) {
            synchronized (f3300e) {
                if (r.c(f3302g)) {
                    Log.d("Sqflite", "Look for " + str + " in " + f3298c.keySet());
                }
                Integer num = f3298c.get(str);
                if (num != null && (iVar = f3299d.get(num)) != null) {
                    if (iVar.f3336i.isOpen()) {
                        if (r.c(f3302g)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iVar.A());
                            sb.append("re-opened single instance ");
                            sb.append(iVar.F() ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            Log.d("Sqflite", sb.toString());
                        }
                        dVar.a(x(num.intValue(), true, iVar.F()));
                        return;
                    }
                    if (r.c(f3302g)) {
                        Log.d("Sqflite", iVar.A() + "single instance database of " + str + " not opened");
                    }
                }
            }
        }
        Object obj = f3300e;
        synchronized (obj) {
            i8 = f3306k + 1;
            f3306k = i8;
        }
        final i iVar2 = new i(this.f3308a, str, i8, z7, f3302g);
        synchronized (obj) {
            if (f3307l == null) {
                o oVarB = n.b("Sqflite", f3305j, f3304i);
                f3307l = oVarB;
                oVarB.start();
                if (r.b(iVar2.f3331d)) {
                    Log.d("Sqflite", iVar2.A() + "starting worker pool with priority " + f3304i);
                }
            }
            iVar2.f3335h = f3307l;
            if (r.b(iVar2.f3331d)) {
                Log.d("Sqflite", iVar2.A() + "opened " + i8 + " " + str);
            }
            final boolean z8 = z7;
            f3307l.a(iVar2, new Runnable() { // from class: b5.z
                @Override // java.lang.Runnable
                public final void run() {
                    c0.s(zO, str, dVar, bool, iVar2, jVar, z8, i8);
                }
            });
        }
    }

    private void K(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.y
            @Override // java.lang.Runnable
            public final void run() {
                c0.t(jVar, dVar, iVarN);
            }
        });
    }

    private void L(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.v
            @Override // java.lang.Runnable
            public final void run() {
                c0.u(jVar, dVar, iVarN);
            }
        });
    }

    private void M(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.a0
            @Override // java.lang.Runnable
            public final void run() {
                c0.v(jVar, iVarN, dVar);
            }
        });
    }

    private void N(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.w
            @Override // java.lang.Runnable
            public final void run() {
                c0.w(jVar, dVar, iVarN);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(i iVar) {
        try {
            if (r.b(iVar.f3331d)) {
                Log.d("Sqflite", iVar.A() + "closing database ");
            }
            iVar.k();
        } catch (Exception e8) {
            Log.e("Sqflite", "error " + e8 + " while closing database " + f3306k);
        }
        synchronized (f3300e) {
            if (f3299d.isEmpty() && f3307l != null) {
                if (r.b(iVar.f3331d)) {
                    Log.d("Sqflite", iVar.A() + "stopping thread");
                }
                f3307l.b();
                f3307l = null;
            }
        }
    }

    private i m(int i8) {
        return f3299d.get(Integer.valueOf(i8));
    }

    private i n(s5.j jVar, k.d dVar) {
        int iIntValue = ((Integer) jVar.a("id")).intValue();
        i iVarM = m(iIntValue);
        if (iVarM != null) {
            return iVarM;
        }
        dVar.b("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    static boolean o(String str) {
        return str == null || str.equals(":memory:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(s5.j jVar, k.d dVar, i iVar) {
        iVar.v(new d5.d(jVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(s5.j jVar, k.d dVar, i iVar) {
        iVar.E(new d5.d(jVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(boolean z7, String str, k.d dVar, Boolean bool, i iVar, s5.j jVar, boolean z8, int i8) {
        synchronized (f3301f) {
            if (!z7) {
                try {
                    File file = new File(new File(str).getParent());
                    if (!file.exists() && !file.mkdirs() && !file.exists()) {
                        dVar.b("sqlite_error", "open_failed " + str, null);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                if (Boolean.TRUE.equals(bool)) {
                    iVar.N();
                } else {
                    iVar.M();
                }
                synchronized (f3300e) {
                    if (z8) {
                        f3298c.put(str, Integer.valueOf(i8));
                        f3299d.put(Integer.valueOf(i8), iVar);
                    } else {
                        f3299d.put(Integer.valueOf(i8), iVar);
                    }
                }
                if (r.b(iVar.f3331d)) {
                    Log.d("Sqflite", iVar.A() + "opened " + i8 + " " + str);
                }
                dVar.a(x(i8, false, false));
            } catch (Exception e8) {
                iVar.D(e8, new d5.d(jVar, dVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(s5.j jVar, k.d dVar, i iVar) {
        iVar.O(new d5.d(jVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(s5.j jVar, k.d dVar, i iVar) {
        iVar.P(new d5.d(jVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(s5.j jVar, i iVar, k.d dVar) {
        try {
            iVar.f3336i.setLocale(e0.d((String) jVar.a("locale")));
            dVar.a(null);
        } catch (Exception e8) {
            dVar.b("sqlite_error", "Error calling setLocale: " + e8.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(s5.j jVar, k.d dVar, i iVar) {
        iVar.R(new d5.d(jVar, dVar));
    }

    static Map x(int i8, boolean z7, boolean z8) {
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i8));
        if (z7) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z8) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    private void y(Context context, s5.c cVar) {
        this.f3308a = context;
        s5.k kVar = new s5.k(cVar, "com.tekartik.sqflite", s5.t.f26267b, cVar.b());
        this.f3309b = kVar;
        kVar.e(this);
    }

    private void z(final s5.j jVar, final k.d dVar) {
        final i iVarN = n(jVar, dVar);
        if (iVarN == null) {
            return;
        }
        f3307l.a(iVarN, new Runnable() { // from class: b5.b0
            @Override // java.lang.Runnable
            public final void run() {
                iVarN.h(jVar, dVar);
            }
        });
    }

    void G(s5.j jVar, k.d dVar) {
        if (f3303h == null) {
            f3303h = this.f3308a.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.a(f3303h);
    }

    void J(s5.j jVar, k.d dVar) {
        Object objA = jVar.a("androidThreadPriority");
        if (objA != null) {
            f3304i = ((Integer) objA).intValue();
        }
        Object objA2 = jVar.a("androidThreadCount");
        if (objA2 != null && !objA2.equals(Integer.valueOf(f3305j))) {
            f3305j = ((Integer) objA2).intValue();
            o oVar = f3307l;
            if (oVar != null) {
                oVar.b();
                f3307l = null;
            }
        }
        Integer numA = r.a(jVar);
        if (numA != null) {
            f3302g = numA.intValue();
        }
        dVar.a(null);
    }

    @Override // l5.a
    public void onAttachedToEngine(a.b bVar) {
        y(bVar.a(), bVar.b());
    }

    @Override // l5.a
    public void onDetachedFromEngine(a.b bVar) {
        this.f3308a = null;
        this.f3309b.e(null);
        this.f3309b = null;
    }

    @Override // s5.k.c
    public void onMethodCall(s5.j jVar, k.d dVar) {
        String str = jVar.f26252a;
        str.hashCode();
        switch (str) {
            case "execute":
                F(jVar, dVar);
                break;
            case "closeDatabase":
                A(jVar, dVar);
                break;
            case "options":
                J(jVar, dVar);
                break;
            case "insert":
                H(jVar, dVar);
                break;
            case "update":
                N(jVar, dVar);
                break;
            case "androidSetLocale":
                M(jVar, dVar);
                break;
            case "deleteDatabase":
                E(jVar, dVar);
                break;
            case "debugMode":
                D(jVar, dVar);
                break;
            case "openDatabase":
                I(jVar, dVar);
                break;
            case "batch":
                z(jVar, dVar);
                break;
            case "debug":
                C(jVar, dVar);
                break;
            case "query":
                K(jVar, dVar);
                break;
            case "databaseExists":
                B(jVar, dVar);
                break;
            case "queryCursorNext":
                L(jVar, dVar);
                break;
            case "getPlatformVersion":
                dVar.a("Android " + Build.VERSION.RELEASE);
                break;
            case "getDatabasesPath":
                G(jVar, dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }
}
