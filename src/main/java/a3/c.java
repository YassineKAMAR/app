package a3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    private boolean A;
    private volatile c1 B;
    protected AtomicInteger C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f26c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f28e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f29f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    n1 f30g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f31h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f32i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f33j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final x2.f f34k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f35l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f36m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f37n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f38o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected InterfaceC0001c f39p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IInterface f40q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f41r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z0 f42s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f43t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a f44u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f45v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f46w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f47x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile String f48y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private x2.b f49z;
    private static final x2.d[] E = new x2.d[0];
    public static final String[] D = {"service_esmobile", "service_googleme"};

    public interface a {
        void H0(Bundle bundle);

        void v0(int i8);
    }

    public interface b {
        void k0(x2.b bVar);
    }

    /* JADX INFO: renamed from: a3.c$c, reason: collision with other inner class name */
    public interface InterfaceC0001c {
        void c(x2.b bVar);
    }

    protected class d implements InterfaceC0001c {
        public d() {
        }

        @Override // a3.c.InterfaceC0001c
        public final void c(x2.b bVar) {
            if (bVar.u()) {
                c cVar = c.this;
                cVar.a(null, cVar.C());
            } else if (c.this.f45v != null) {
                c.this.f45v.k0(bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected c(Context context, Looper looper, int i8, a aVar, b bVar, String str) {
        h hVarB = h.b(context);
        x2.f fVarF = x2.f.f();
        o.j(aVar);
        o.j(bVar);
        this(context, looper, hVarB, fVarF, i8, aVar, bVar, str);
    }

    protected c(Context context, Looper looper, h hVar, x2.f fVar, int i8, a aVar, b bVar, String str) {
        this.f29f = null;
        this.f36m = new Object();
        this.f37n = new Object();
        this.f41r = new ArrayList();
        this.f43t = 1;
        this.f49z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        o.k(context, "Context must not be null");
        this.f31h = context;
        o.k(looper, "Looper must not be null");
        this.f32i = looper;
        o.k(hVar, "Supervisor must not be null");
        this.f33j = hVar;
        o.k(fVar, "API availability must not be null");
        this.f34k = fVar;
        this.f35l = new w0(this, looper);
        this.f46w = i8;
        this.f44u = aVar;
        this.f45v = bVar;
        this.f47x = str;
    }

    static /* bridge */ /* synthetic */ void c0(c cVar, c1 c1Var) {
        cVar.B = c1Var;
        if (cVar.S()) {
            a3.e eVar = c1Var.f56d;
            p.b().c(eVar == null ? null : eVar.v());
        }
    }

    static /* bridge */ /* synthetic */ void d0(c cVar, int i8) {
        int i9;
        int i10;
        synchronized (cVar.f36m) {
            i9 = cVar.f43t;
        }
        if (i9 == 3) {
            cVar.A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        Handler handler = cVar.f35l;
        handler.sendMessage(handler.obtainMessage(i10, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean g0(c cVar, int i8, int i9, IInterface iInterface) {
        synchronized (cVar.f36m) {
            if (cVar.f43t != i8) {
                return false;
            }
            cVar.i0(i9, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean h0(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.E()) || TextUtils.isEmpty(cVar.B())) {
            return false;
        }
        try {
            Class.forName(cVar.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(int i8, IInterface iInterface) {
        n1 n1Var;
        o.a((i8 == 4) == (iInterface != null));
        synchronized (this.f36m) {
            this.f43t = i8;
            this.f40q = iInterface;
            if (i8 == 1) {
                z0 z0Var = this.f42s;
                if (z0Var != null) {
                    h hVar = this.f33j;
                    String strB = this.f30g.b();
                    o.j(strB);
                    hVar.e(strB, this.f30g.a(), 4225, z0Var, X(), this.f30g.c());
                    this.f42s = null;
                }
            } else if (i8 == 2 || i8 == 3) {
                z0 z0Var2 = this.f42s;
                if (z0Var2 != null && (n1Var = this.f30g) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + n1Var.b() + " on " + n1Var.a());
                    h hVar2 = this.f33j;
                    String strB2 = this.f30g.b();
                    o.j(strB2);
                    hVar2.e(strB2, this.f30g.a(), 4225, z0Var2, X(), this.f30g.c());
                    this.C.incrementAndGet();
                }
                z0 z0Var3 = new z0(this, this.C.get());
                this.f42s = z0Var3;
                n1 n1Var2 = (this.f43t != 3 || B() == null) ? new n1(G(), F(), false, 4225, I()) : new n1(y().getPackageName(), B(), true, 4225, false);
                this.f30g = n1Var2;
                if (n1Var2.c() && k() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f30g.b())));
                }
                h hVar3 = this.f33j;
                String strB3 = this.f30g.b();
                o.j(strB3);
                if (!hVar3.f(new g1(strB3, this.f30g.a(), 4225, this.f30g.c()), z0Var3, X(), w())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.f30g.b() + " on " + this.f30g.a());
                    e0(16, null, this.C.get());
                }
            } else if (i8 == 4) {
                o.j(iInterface);
                K(iInterface);
            }
        }
    }

    protected Bundle A() {
        return new Bundle();
    }

    protected String B() {
        return null;
    }

    protected Set<Scope> C() {
        return Collections.emptySet();
    }

    public final T D() {
        T t7;
        synchronized (this.f36m) {
            if (this.f43t == 5) {
                throw new DeadObjectException();
            }
            r();
            t7 = (T) this.f40q;
            o.k(t7, "Client is connected but service is null");
        }
        return t7;
    }

    protected abstract String E();

    protected abstract String F();

    protected String G() {
        return "com.google.android.gms";
    }

    public a3.e H() {
        c1 c1Var = this.B;
        if (c1Var == null) {
            return null;
        }
        return c1Var.f56d;
    }

    protected boolean I() {
        return k() >= 211700000;
    }

    public boolean J() {
        return this.B != null;
    }

    protected void K(T t7) {
        this.f26c = System.currentTimeMillis();
    }

    protected void L(x2.b bVar) {
        this.f27d = bVar.g();
        this.f28e = System.currentTimeMillis();
    }

    protected void M(int i8) {
        this.f24a = i8;
        this.f25b = System.currentTimeMillis();
    }

    protected void N(int i8, IBinder iBinder, Bundle bundle, int i9) {
        Handler handler = this.f35l;
        handler.sendMessage(handler.obtainMessage(1, i9, -1, new a1(this, i8, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f48y = str;
    }

    public void Q(int i8) {
        Handler handler = this.f35l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), i8));
    }

    protected void R(InterfaceC0001c interfaceC0001c, int i8, PendingIntent pendingIntent) {
        o.k(interfaceC0001c, "Connection progress callbacks cannot be null.");
        this.f39p = interfaceC0001c;
        Handler handler = this.f35l;
        handler.sendMessage(handler.obtainMessage(3, this.C.get(), i8, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    protected final String X() {
        String str = this.f47x;
        return str == null ? this.f31h.getClass().getName() : str;
    }

    public void a(i iVar, Set<Scope> set) {
        Bundle bundleA = A();
        int i8 = this.f46w;
        String str = this.f48y;
        int i9 = x2.f.f27262a;
        Scope[] scopeArr = f.f79o;
        Bundle bundle = new Bundle();
        x2.d[] dVarArr = f.f80p;
        f fVar = new f(6, i8, i9, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        fVar.f84d = this.f31h.getPackageName();
        fVar.f87g = bundleA;
        if (set != null) {
            fVar.f86f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountU = u();
            if (accountU == null) {
                accountU = new Account("<<default account>>", "com.google");
            }
            fVar.f88h = accountU;
            if (iVar != null) {
                fVar.f85e = iVar.asBinder();
            }
        } else if (O()) {
            fVar.f88h = u();
        }
        fVar.f89i = E;
        fVar.f90j = v();
        if (S()) {
            fVar.f93m = true;
        }
        try {
            synchronized (this.f37n) {
                l lVar = this.f38o;
                if (lVar != null) {
                    lVar.V3(new y0(this, this.C.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            Q(3);
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.C.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.C.get());
        }
    }

    public void c(String str) {
        this.f29f = str;
        f();
    }

    public boolean d() {
        boolean z7;
        synchronized (this.f36m) {
            int i8 = this.f43t;
            z7 = true;
            if (i8 != 2 && i8 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public String e() {
        n1 n1Var;
        if (!g() || (n1Var = this.f30g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return n1Var.a();
    }

    protected final void e0(int i8, Bundle bundle, int i9) {
        Handler handler = this.f35l;
        handler.sendMessage(handler.obtainMessage(7, i9, -1, new b1(this, i8, null)));
    }

    public void f() {
        this.C.incrementAndGet();
        synchronized (this.f41r) {
            int size = this.f41r.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((x0) this.f41r.get(i8)).d();
            }
            this.f41r.clear();
        }
        synchronized (this.f37n) {
            this.f38o = null;
        }
        i0(1, null);
    }

    public boolean g() {
        boolean z7;
        synchronized (this.f36m) {
            z7 = this.f43t == 4;
        }
        return z7;
    }

    public void h(InterfaceC0001c interfaceC0001c) {
        o.k(interfaceC0001c, "Connection progress callbacks cannot be null.");
        this.f39p = interfaceC0001c;
        i0(2, null);
    }

    public void i(e eVar) {
        eVar.a();
    }

    public boolean j() {
        return true;
    }

    public int k() {
        return x2.f.f27262a;
    }

    public final x2.d[] l() {
        c1 c1Var = this.B;
        if (c1Var == null) {
            return null;
        }
        return c1Var.f54b;
    }

    public String m() {
        return this.f29f;
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int iH = this.f34k.h(this.f31h, k());
        if (iH == 0) {
            h(new d());
        } else {
            i0(1, null);
            R(new d(), iH, null);
        }
    }

    protected final void r() {
        if (!g()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T s(IBinder iBinder);

    protected boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public x2.d[] v() {
        return E;
    }

    protected Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f31h;
    }

    public int z() {
        return this.f46w;
    }
}
