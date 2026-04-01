package com.google.firebase.installations;

import a3.o;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.firebase.installations.c;
import f4.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import n4.i;
import s3.h;
import s3.k;
import s4.d;
import s4.f;

/* JADX INFO: loaded from: classes.dex */
public class b implements p4.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f20836m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f20837n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c4.e f20838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s4.c f20839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r4.c f20840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f20841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x<r4.b> f20842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p4.f f20843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f20844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f20845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f20846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f20847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set<q4.a> f20848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<e> f20849l;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f20850a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f20850a.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0076b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f20852b;

        static {
            int[] iArr = new int[f.b.values().length];
            f20852b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20852b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20852b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f20851a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20851a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    b(final c4.e eVar, o4.b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new s4.c(eVar.l(), bVar), new r4.c(eVar), f.c(), new x(new o4.b() { // from class: p4.b
            @Override // o4.b
            public final Object get() {
                return com.google.firebase.installations.b.v(eVar);
            }
        }), new p4.f());
    }

    @SuppressLint({"ThreadPoolCreation"})
    b(ExecutorService executorService, Executor executor, c4.e eVar, s4.c cVar, r4.c cVar2, f fVar, x<r4.b> xVar, p4.f fVar2) {
        this.f20844g = new Object();
        this.f20848k = new HashSet();
        this.f20849l = new ArrayList();
        this.f20838a = eVar;
        this.f20839b = cVar;
        this.f20840c = cVar2;
        this.f20841d = fVar;
        this.f20842e = xVar;
        this.f20843f = fVar2;
        this.f20845h = executorService;
        this.f20846i = executor;
    }

    private void A(r4.d dVar) {
        synchronized (this.f20844g) {
            Iterator<e> it = this.f20849l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void B(String str) {
        this.f20847j = str;
    }

    private synchronized void C(r4.d dVar, r4.d dVar2) {
        if (this.f20848k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<q4.a> it = this.f20848k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private h<String> d() {
        s3.i iVar = new s3.i();
        e(new d(iVar));
        return iVar.a();
    }

    private void e(e eVar) {
        synchronized (this.f20844g) {
            this.f20849l.add(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void t(boolean z7) {
        r4.d dVarY;
        Exception iOException;
        r4.d dVarP = p();
        try {
            if (dVarP.i() || dVarP.l()) {
                dVarY = y(dVarP);
            } else {
                if (!z7 && !this.f20841d.f(dVarP)) {
                    return;
                }
                dVarY = h(dVarP);
            }
            s(dVarY);
            C(dVarP, dVarY);
            if (dVarY.k()) {
                B(dVarY.d());
            }
            if (dVarY.i()) {
                iOException = new c(c.a.BAD_CONFIG);
            } else {
                if (!dVarY.j()) {
                    A(dVarY);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            z(iOException);
        } catch (c e8) {
            z(e8);
        }
    }

    private final void g(final boolean z7) {
        r4.d dVarQ = q();
        if (z7) {
            dVarQ = dVarQ.p();
        }
        A(dVarQ);
        this.f20846i.execute(new Runnable() { // from class: p4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f25626a.t(z7);
            }
        });
    }

    private r4.d h(r4.d dVar) throws c {
        s4.f fVarE = this.f20839b.e(i(), dVar.d(), r(), dVar.f());
        int i8 = C0076b.f20852b[fVarE.b().ordinal()];
        if (i8 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f20841d.b());
        }
        if (i8 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i8 != 3) {
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        B(null);
        return dVar.r();
    }

    private synchronized String k() {
        return this.f20847j;
    }

    private r4.b m() {
        return this.f20842e.get();
    }

    public static b n() {
        return o(c4.e.n());
    }

    public static b o(c4.e eVar) {
        o.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (b) eVar.j(p4.d.class);
    }

    private r4.d p() {
        r4.d dVarD;
        synchronized (f20836m) {
            com.google.firebase.installations.a aVarA = com.google.firebase.installations.a.a(this.f20838a.l(), "generatefid.lock");
            try {
                dVarD = this.f20840c.d();
            } finally {
                if (aVarA != null) {
                    aVarA.b();
                }
            }
        }
        return dVarD;
    }

    private r4.d q() {
        r4.d dVarD;
        synchronized (f20836m) {
            com.google.firebase.installations.a aVarA = com.google.firebase.installations.a.a(this.f20838a.l(), "generatefid.lock");
            try {
                dVarD = this.f20840c.d();
                if (dVarD.j()) {
                    dVarD = this.f20840c.b(dVarD.t(x(dVarD)));
                }
            } finally {
                if (aVarA != null) {
                    aVarA.b();
                }
            }
        }
        return dVarD;
    }

    private void s(r4.d dVar) {
        synchronized (f20836m) {
            com.google.firebase.installations.a aVarA = com.google.firebase.installations.a.a(this.f20838a.l(), "generatefid.lock");
            try {
                this.f20840c.b(dVar);
            } finally {
                if (aVarA != null) {
                    aVarA.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        g(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r4.b v(c4.e eVar) {
        return new r4.b(eVar);
    }

    private void w() {
        o.g(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.g(r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.g(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(f.h(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(f.g(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(r4.d dVar) {
        if ((!this.f20838a.p().equals("CHIME_ANDROID_SDK") && !this.f20838a.x()) || !dVar.m()) {
            return this.f20843f.a();
        }
        String strF = m().f();
        return TextUtils.isEmpty(strF) ? this.f20843f.a() : strF;
    }

    private r4.d y(r4.d dVar) throws c {
        s4.d dVarD = this.f20839b.d(i(), dVar.d(), r(), j(), (dVar.d() == null || dVar.d().length() != 11) ? null : m().i());
        int i8 = C0076b.f20851a[dVarD.e().ordinal()];
        if (i8 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f20841d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i8 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
    }

    private void z(Exception exc) {
        synchronized (this.f20844g) {
            Iterator<e> it = this.f20849l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    String i() {
        return this.f20838a.q().b();
    }

    String j() {
        return this.f20838a.q().c();
    }

    public h<String> l() {
        w();
        String strK = k();
        if (strK != null) {
            return k.e(strK);
        }
        h<String> hVarD = d();
        this.f20845h.execute(new Runnable() { // from class: p4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f25624a.u();
            }
        });
        return hVarD;
    }

    String r() {
        return this.f20838a.q().g();
    }
}
