package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected volatile q0.b f2863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f2864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f2865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private q0.c f2866d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f2869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    protected List<b> f2870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ReentrantReadWriteLock f2871i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ThreadLocal<Integer> f2872j = new ThreadLocal<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f2873k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f2867e = e();

    public static class a<T extends h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f2874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f2875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f2876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList<b> f2877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f2878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f2879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c.InterfaceC0159c f2880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2881h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f2883j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f2885l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Set<Integer> f2887n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Set<Integer> f2888o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f2889p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private File f2890q;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c f2882i = c.AUTOMATIC;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f2884k = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final d f2886m = new d();

        a(Context context, Class<T> cls, String str) {
            this.f2876c = context;
            this.f2874a = cls;
            this.f2875b = str;
        }

        public a<T> a(b bVar) {
            if (this.f2877d == null) {
                this.f2877d = new ArrayList<>();
            }
            this.f2877d.add(bVar);
            return this;
        }

        public a<T> b(n0.a... aVarArr) {
            if (this.f2888o == null) {
                this.f2888o = new HashSet();
            }
            for (n0.a aVar : aVarArr) {
                this.f2888o.add(Integer.valueOf(aVar.f25047a));
                this.f2888o.add(Integer.valueOf(aVar.f25048b));
            }
            this.f2886m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f2881h = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
        @android.annotation.SuppressLint({"RestrictedApi"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public T d() {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.a.d():androidx.room.h");
        }

        public a<T> e() {
            this.f2884k = false;
            this.f2885l = true;
            return this;
        }

        public a<T> f(c.InterfaceC0159c interfaceC0159c) {
            this.f2880g = interfaceC0159c;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f2878e = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(q0.b bVar) {
        }

        public void b(q0.b bVar) {
        }

        public void c(q0.b bVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        c c(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || a(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, n0.a>> f2895a = new HashMap<>();

        private void a(n0.a aVar) {
            int i8 = aVar.f25047a;
            int i9 = aVar.f25048b;
            TreeMap<Integer, n0.a> treeMap = this.f2895a.get(Integer.valueOf(i8));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f2895a.put(Integer.valueOf(i8), treeMap);
            }
            n0.a aVar2 = treeMap.get(Integer.valueOf(i9));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i9), aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0047 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:13:0x0026->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private java.util.List<n0.a> d(java.util.List<n0.a> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, n0.a>> r0 = r6.f2895a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = 0
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.h.d.d(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(n0.a... aVarArr) {
            for (n0.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<n0.a> c(int i8, int i9) {
            if (i8 == i9) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i9 > i8, i8, i9);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f2868f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f2872j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        q0.b bVarH = this.f2866d.H();
        this.f2867e.m(bVarH);
        bVarH.f();
    }

    public q0.f d(String str) {
        a();
        b();
        return this.f2866d.H().s(str);
    }

    protected abstract e e();

    protected abstract q0.c f(androidx.room.a aVar);

    @Deprecated
    public void g() {
        this.f2866d.H().L();
        if (k()) {
            return;
        }
        this.f2867e.f();
    }

    Lock h() {
        return this.f2871i.readLock();
    }

    public q0.c i() {
        return this.f2866d;
    }

    public Executor j() {
        return this.f2864b;
    }

    public boolean k() {
        return this.f2866d.H().V();
    }

    public void l(androidx.room.a aVar) {
        q0.c cVarF = f(aVar);
        this.f2866d = cVarF;
        if (cVarF instanceof j) {
            ((j) cVarF).c(aVar);
        }
        boolean z7 = aVar.f2805g == c.WRITE_AHEAD_LOGGING;
        this.f2866d.setWriteAheadLoggingEnabled(z7);
        this.f2870h = aVar.f2803e;
        this.f2864b = aVar.f2806h;
        this.f2865c = new l(aVar.f2807i);
        this.f2868f = aVar.f2804f;
        this.f2869g = z7;
        if (aVar.f2808j) {
            this.f2867e.i(aVar.f2800b, aVar.f2801c);
        }
    }

    protected void m(q0.b bVar) {
        this.f2867e.d(bVar);
    }

    public boolean o() {
        q0.b bVar = this.f2863a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(q0.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(q0.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f2866d.H().O(eVar, cancellationSignal) : this.f2866d.H().T(eVar);
    }

    @Deprecated
    public void r() {
        this.f2866d.H().B();
    }
}
