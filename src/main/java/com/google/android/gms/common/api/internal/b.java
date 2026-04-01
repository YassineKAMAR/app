package com.google.android.gms.common.api.internal;

import a3.g0;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import y2.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements Handler.Callback {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f4821r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Status f4822s = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f4823t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static b f4824u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a3.s f4829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a3.u f4830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f4831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x2.e f4832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g0 f4833i;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f4840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f4841q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f4825a = 5000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4826b = 120000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4827c = 10000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4828d = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f4834j = new AtomicInteger(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f4835k = new AtomicInteger(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<z2.b<?>, m<?>> f4836l = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private f f4837m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<z2.b<?>> f4838n = new p.b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<z2.b<?>> f4839o = new p.b();

    private b(Context context, Looper looper, x2.e eVar) {
        this.f4841q = true;
        this.f4831g = context;
        k3.f fVar = new k3.f(looper, this);
        this.f4840p = fVar;
        this.f4832h = eVar;
        this.f4833i = new g0(eVar);
        if (e3.i.a(context)) {
            this.f4841q = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status h(z2.b<?> bVar, x2.b bVar2) {
        String strB = bVar.b();
        String strValueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strB);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(bVar2, sb.toString());
    }

    private final m<?> i(y2.e<?> eVar) {
        Object objF = eVar.f();
        m<?> mVar = this.f4836l.get(objF);
        if (mVar == null) {
            mVar = new m<>(this, eVar);
            this.f4836l.put((z2.b<?>) objF, mVar);
        }
        if (mVar.M()) {
            this.f4839o.add((z2.b<?>) objF);
        }
        mVar.B();
        return mVar;
    }

    private final a3.u j() {
        if (this.f4830f == null) {
            this.f4830f = a3.t.a(this.f4831g);
        }
        return this.f4830f;
    }

    private final void k() {
        a3.s sVar = this.f4829e;
        if (sVar != null) {
            if (sVar.g() > 0 || f()) {
                j().b(sVar);
            }
            this.f4829e = null;
        }
    }

    private final <T> void l(s3.i<T> iVar, int i8, y2.e eVar) {
        q qVarB;
        if (i8 == 0 || (qVarB = q.b(this, i8, eVar.f())) == null) {
            return;
        }
        s3.h<T> hVarA = iVar.a();
        final Handler handler = this.f4840p;
        handler.getClass();
        hVarA.b(new Executor() { // from class: z2.m
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, qVarB);
    }

    public static b x(Context context) {
        b bVar;
        synchronized (f4823t) {
            if (f4824u == null) {
                f4824u = new b(context.getApplicationContext(), a3.h.c().getLooper(), x2.e.m());
            }
            bVar = f4824u;
        }
        return bVar;
    }

    public final <O extends a.d, ResultT> void D(y2.e<O> eVar, int i8, c<a.b, ResultT> cVar, s3.i<ResultT> iVar, z2.j jVar) {
        l(iVar, cVar.d(), eVar);
        v vVar = new v(i8, cVar, iVar, jVar);
        Handler handler = this.f4840p;
        handler.sendMessage(handler.obtainMessage(4, new z2.u(vVar, this.f4835k.get(), eVar)));
    }

    final void E(a3.m mVar, int i8, long j8, int i9) {
        Handler handler = this.f4840p;
        handler.sendMessage(handler.obtainMessage(18, new r(mVar, i8, j8, i9)));
    }

    public final void F(x2.b bVar, int i8) {
        if (g(bVar, i8)) {
            return;
        }
        Handler handler = this.f4840p;
        handler.sendMessage(handler.obtainMessage(5, i8, 0, bVar));
    }

    public final void a() {
        Handler handler = this.f4840p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(y2.e<?> eVar) {
        Handler handler = this.f4840p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void c(f fVar) {
        synchronized (f4823t) {
            if (this.f4837m != fVar) {
                this.f4837m = fVar;
                this.f4838n.clear();
            }
            this.f4838n.addAll(fVar.t());
        }
    }

    final void d(f fVar) {
        synchronized (f4823t) {
            if (this.f4837m == fVar) {
                this.f4837m = null;
                this.f4838n.clear();
            }
        }
    }

    final boolean f() {
        if (this.f4828d) {
            return false;
        }
        a3.q qVarA = a3.p.b().a();
        if (qVarA != null && !qVarA.n()) {
            return false;
        }
        int iA = this.f4833i.a(this.f4831g, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean g(x2.b bVar, int i8) {
        return this.f4832h.w(this.f4831g, bVar, i8);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        s3.i<Boolean> iVarB;
        Boolean boolValueOf;
        int i8 = message.what;
        m<?> mVar = null;
        switch (i8) {
            case 1:
                this.f4827c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f4840p.removeMessages(12);
                for (z2.b<?> bVar : this.f4836l.keySet()) {
                    Handler handler = this.f4840p;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f4827c);
                }
                return true;
            case 2:
                z2.b0 b0Var = (z2.b0) message.obj;
                Iterator<z2.b<?>> it = b0Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        z2.b<?> next = it.next();
                        m<?> mVar2 = this.f4836l.get(next);
                        if (mVar2 == null) {
                            b0Var.b(next, new x2.b(13), null);
                        } else if (mVar2.L()) {
                            b0Var.b(next, x2.b.f27239e, mVar2.s().e());
                        } else {
                            x2.b bVarQ = mVar2.q();
                            if (bVarQ != null) {
                                b0Var.b(next, bVarQ, null);
                            } else {
                                mVar2.G(b0Var);
                                mVar2.B();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (m<?> mVar3 : this.f4836l.values()) {
                    mVar3.A();
                    mVar3.B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                z2.u uVar = (z2.u) message.obj;
                m<?> mVarI = this.f4836l.get(uVar.f27735c.f());
                if (mVarI == null) {
                    mVarI = i(uVar.f27735c);
                }
                if (!mVarI.M() || this.f4835k.get() == uVar.f27734b) {
                    mVarI.C(uVar.f27733a);
                } else {
                    uVar.f27733a.a(f4821r);
                    mVarI.I();
                }
                return true;
            case 5:
                int i9 = message.arg1;
                x2.b bVar2 = (x2.b) message.obj;
                Iterator<m<?>> it2 = this.f4836l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        m<?> next2 = it2.next();
                        if (next2.o() == i9) {
                            mVar = next2;
                        }
                    }
                }
                if (mVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i9);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (bVar2.g() == 13) {
                    String strE = this.f4832h.e(bVar2.g());
                    String strI = bVar2.i();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strE).length() + 69 + String.valueOf(strI).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(strE);
                    sb2.append(": ");
                    sb2.append(strI);
                    mVar.d(new Status(17, sb2.toString()));
                } else {
                    mVar.d(h(((m) mVar).f4870c, bVar2));
                }
                return true;
            case 6:
                if (this.f4831g.getApplicationContext() instanceof Application) {
                    a.c((Application) this.f4831g.getApplicationContext());
                    a.b().a(new h(this));
                    if (!a.b().e(true)) {
                        this.f4827c = 300000L;
                    }
                }
                return true;
            case 7:
                i((y2.e) message.obj);
                return true;
            case 9:
                if (this.f4836l.containsKey(message.obj)) {
                    this.f4836l.get(message.obj).H();
                }
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                Iterator<z2.b<?>> it3 = this.f4839o.iterator();
                while (it3.hasNext()) {
                    m<?> mVarRemove = this.f4836l.remove(it3.next());
                    if (mVarRemove != null) {
                        mVarRemove.I();
                    }
                }
                this.f4839o.clear();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                if (this.f4836l.containsKey(message.obj)) {
                    this.f4836l.get(message.obj).J();
                }
                return true;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                if (this.f4836l.containsKey(message.obj)) {
                    this.f4836l.get(message.obj).a();
                }
                return true;
            case 14:
                g gVar = (g) message.obj;
                z2.b<?> bVarA = gVar.a();
                if (this.f4836l.containsKey(bVarA)) {
                    boolean zN = this.f4836l.get(bVarA).n(false);
                    iVarB = gVar.b();
                    boolValueOf = Boolean.valueOf(zN);
                } else {
                    iVarB = gVar.b();
                    boolValueOf = Boolean.FALSE;
                }
                iVarB.c(boolValueOf);
                return true;
            case 15:
                n nVar = (n) message.obj;
                if (this.f4836l.containsKey(nVar.f4881a)) {
                    m.y(this.f4836l.get(nVar.f4881a), nVar);
                }
                return true;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                n nVar2 = (n) message.obj;
                if (this.f4836l.containsKey(nVar2.f4881a)) {
                    m.z(this.f4836l.get(nVar2.f4881a), nVar2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                r rVar = (r) message.obj;
                if (rVar.f4898c == 0) {
                    j().b(new a3.s(rVar.f4897b, Arrays.asList(rVar.f4896a)));
                } else {
                    a3.s sVar = this.f4829e;
                    if (sVar != null) {
                        List<a3.m> listI = sVar.i();
                        if (sVar.g() != rVar.f4897b || (listI != null && listI.size() >= rVar.f4899d)) {
                            this.f4840p.removeMessages(17);
                            k();
                        } else {
                            this.f4829e.n(rVar.f4896a);
                        }
                    }
                    if (this.f4829e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(rVar.f4896a);
                        this.f4829e = new a3.s(rVar.f4897b, arrayList);
                        Handler handler2 = this.f4840p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), rVar.f4898c);
                    }
                }
                return true;
            case 19:
                this.f4828d = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i8);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final int m() {
        return this.f4834j.getAndIncrement();
    }

    final m w(z2.b<?> bVar) {
        return this.f4836l.get(bVar);
    }
}
