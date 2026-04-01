package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import y2.g;
import y2.j;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends y2.j> extends y2.g<R> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final ThreadLocal<Boolean> f4798o = new c0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y2.k<? super R> f4804f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private R f4806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Status f4807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f4808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f4809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a3.j f4811m;

    @KeepName
    private d0 mResultGuardian;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4799a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CountDownLatch f4802d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<g.a> f4803e = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference<u> f4805g = new AtomicReference<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4812n = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a<R> f4800b = new a<>(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WeakReference<y2.f> f4801c = new WeakReference<>(null);

    public static class a<R extends y2.j> extends k3.f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(y2.k<? super R> kVar, R r8) {
            ThreadLocal<Boolean> threadLocal = BasePendingResult.f4798o;
            sendMessage(obtainMessage(1, new Pair((y2.k) a3.o.j(kVar), r8)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                Pair pair = (Pair) message.obj;
                y2.k kVar = (y2.k) pair.first;
                y2.j jVar = (y2.j) pair.second;
                try {
                    kVar.a(jVar);
                    return;
                } catch (RuntimeException e8) {
                    BasePendingResult.h(jVar);
                    throw e8;
                }
            }
            if (i8 == 2) {
                ((BasePendingResult) message.obj).b(Status.f4789j);
                return;
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i8);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final R e() {
        R r8;
        synchronized (this.f4799a) {
            a3.o.n(!this.f4808j, "Result has already been consumed.");
            a3.o.n(c(), "Result is not ready.");
            r8 = this.f4806h;
            this.f4806h = null;
            this.f4804f = null;
            this.f4808j = true;
        }
        if (this.f4805g.getAndSet(null) == null) {
            return (R) a3.o.j(r8);
        }
        throw null;
    }

    private final void f(R r8) {
        this.f4806h = r8;
        this.f4807i = r8.e();
        z2.c0 c0Var = null;
        this.f4811m = null;
        this.f4802d.countDown();
        if (this.f4809k) {
            this.f4804f = null;
        } else {
            y2.k<? super R> kVar = this.f4804f;
            if (kVar != null) {
                this.f4800b.removeMessages(2);
                this.f4800b.a(kVar, e());
            } else if (this.f4806h instanceof y2.h) {
                this.mResultGuardian = new d0(this, c0Var);
            }
        }
        ArrayList<g.a> arrayList = this.f4803e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).a(this.f4807i);
        }
        this.f4803e.clear();
    }

    public static void h(y2.j jVar) {
        if (jVar instanceof y2.h) {
            try {
                ((y2.h) jVar).release();
            } catch (RuntimeException e8) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(jVar)), e8);
            }
        }
    }

    protected abstract R a(Status status);

    @Deprecated
    public final void b(Status status) {
        synchronized (this.f4799a) {
            if (!c()) {
                d(a(status));
                this.f4810l = true;
            }
        }
    }

    public final boolean c() {
        return this.f4802d.getCount() == 0;
    }

    public final void d(R r8) {
        synchronized (this.f4799a) {
            if (this.f4810l || this.f4809k) {
                h(r8);
                return;
            }
            c();
            a3.o.n(!c(), "Results have already been set");
            a3.o.n(!this.f4808j, "Result has already been consumed");
            f(r8);
        }
    }
}
