package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements x3.d<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f3214d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ad));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f3215e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f3216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f3217g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f3219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f3220c;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f3221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f3222d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f3223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f3224b;

        static {
            if (a.f3214d) {
                f3222d = null;
                f3221c = null;
            } else {
                f3222d = new c(false, null);
                f3221c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f3223a = z7;
            this.f3224b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f3225b = new d(new C0050a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f3226a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0050a extends Throwable {
            C0050a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f3226a = (Throwable) a.e(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f3227d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f3228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f3229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f3230c;

        e(Runnable runnable, Executor executor) {
            this.f3228a = runnable;
            this.f3229b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f3231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f3232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f3233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f3234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f3235e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f3231a = atomicReferenceFieldUpdater;
            this.f3232b = atomicReferenceFieldUpdater2;
            this.f3233c = atomicReferenceFieldUpdater3;
            this.f3234d = atomicReferenceFieldUpdater4;
            this.f3235e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f3234d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f3235e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f3233c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f3232b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f3231a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f3236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x3.d<? extends V> f3237b;

        g(a<V> aVar, x3.d<? extends V> dVar) {
            this.f3236a = aVar;
            this.f3237b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3236a.f3218a != this) {
                return;
            }
            if (a.f3216f.b(this.f3236a, this, a.j(this.f3237b))) {
                a.g(this.f3236a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f3219b != eVar) {
                    return false;
                }
                aVar.f3219b = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3218a != obj) {
                    return false;
                }
                aVar.f3218a = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f3220c != iVar) {
                    return false;
                }
                aVar.f3220c = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f3240b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f3239a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f3238c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f3239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f3240b;

        i() {
            a.f3216f.e(this, Thread.currentThread());
        }

        i(boolean z7) {
        }

        void a(i iVar) {
            a.f3216f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f3239a;
            if (thread != null) {
                this.f3239a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f3216f = hVar;
        if (th != null) {
            f3215e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3217g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append(str);
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t7) {
        t7.getClass();
        return t7;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f3219b;
        } while (!f3216f.a(this, eVar2, e.f3227d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f3230c;
            eVar4.f3230c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.b();
            e eVarF = aVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f3230c;
                Runnable runnable = eVarF.f3228a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f3236a;
                    if (aVar.f3218a == gVar) {
                        if (f3216f.b(aVar, gVar, j(gVar.f3237b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarF.f3229b);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f3215e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f3224b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f3226a);
        }
        if (obj == f3217g) {
            return null;
        }
        return obj;
    }

    static Object j(x3.d<?> dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f3218a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f3223a ? cVar.f3224b != null ? new c(false, cVar.f3224b) : c.f3222d : obj;
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f3214d) && zIsCancelled) {
            return c.f3222d;
        }
        try {
            Object objK = k(dVar);
            return objK == null ? f3217g : objK;
        } catch (CancellationException e8) {
            if (zIsCancelled) {
                return new c(false, e8);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e8));
        } catch (ExecutionException e9) {
            return new d(e9.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) {
        V v7;
        boolean z7 = false;
        while (true) {
            try {
                v7 = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return v7;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f3220c;
        } while (!f3216f.c(this, iVar, i.f3238c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f3240b;
        }
    }

    private void o(i iVar) {
        iVar.f3239a = null;
        while (true) {
            i iVar2 = this.f3220c;
            if (iVar2 == i.f3238c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f3240b;
                if (iVar2.f3239a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f3240b = iVar4;
                    if (iVar3.f3239a == null) {
                        break;
                    }
                } else if (!f3216f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // x3.d
    public final void c(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f3219b;
        if (eVar != e.f3227d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f3230c = eVar;
                if (f3216f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f3219b;
                }
            } while (eVar != e.f3227d);
        }
        h(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f3218a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f3214d ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f3221c : c.f3222d;
        boolean z8 = false;
        a<V> aVar = this;
        while (true) {
            if (f3216f.b(aVar, obj, cVar)) {
                if (z7) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                x3.d<? extends V> dVar = ((g) obj).f3237b;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z7);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f3218a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = aVar.f3218a;
                if (!(obj instanceof g)) {
                    return z8;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f3218a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return i(obj2);
        }
        i iVar = this.f3220c;
        if (iVar != i.f3238c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f3216f.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f3218a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return i(obj);
                }
                iVar = this.f3220c;
            } while (iVar != i.f3238c);
        }
        return i(this.f3218a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f3218a;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f3220c;
            if (iVar != i.f3238c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f3216f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f3218a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f3220c;
                    }
                } while (iVar != i.f3238c);
            }
            return i(this.f3218a);
        }
        while (nanos > 0) {
            Object obj3 = this.f3218a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j9 = -nanos;
            long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(jConvert);
            boolean z7 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z7) {
                    str3 = str3 + com.amazon.a.a.o.b.f.f3942a;
                }
                str2 = str3 + " ";
            }
            if (z7) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3218a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f3218a != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f3218a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f3237b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean p(V v7) {
        if (v7 == null) {
            v7 = (V) f3217g;
        }
        if (!f3216f.b(this, null, v7)) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean q(Throwable th) {
        if (!f3216f.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean r(x3.d<? extends V> dVar) {
        d dVar2;
        e(dVar);
        Object obj = this.f3218a;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f3216f.b(this, null, j(dVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, dVar);
            if (f3216f.b(this, null, gVar)) {
                try {
                    dVar.c(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar2 = new d(th);
                    } catch (Throwable unused) {
                        dVar2 = d.f3225b;
                    }
                    f3216f.b(this, gVar, dVar2);
                }
                return true;
            }
            obj = this.f3218a;
        }
        if (obj instanceof c) {
            dVar.cancel(((c) obj).f3223a);
        }
        return false;
    }

    public String toString() {
        String strM;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strM = m();
                } catch (RuntimeException e8) {
                    strM = "Exception thrown from implementation: " + e8.getClass();
                }
                if (strM == null || strM.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strM);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
