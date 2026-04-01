package androidx.concurrent.futures;

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
    static final boolean f1225d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ad));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f1226e = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final b f1227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f1228g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f1229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile e f1230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile i f1231c;

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
        static final c f1232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c f1233d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f1234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f1235b;

        static {
            if (a.f1225d) {
                f1233d = null;
                f1232c = null;
            } else {
                f1233d = new c(false, null);
                f1232c = new c(true, null);
            }
        }

        c(boolean z7, Throwable th) {
            this.f1234a = z7;
            this.f1235b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final d f1236b = new d(new C0015a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f1237a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0015a extends Throwable {
            C0015a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1237a = (Throwable) a.g(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final e f1238d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f1239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f1240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f1241c;

        e(Runnable runnable, Executor executor) {
            this.f1239a = runnable;
            this.f1240b = executor;
        }
    }

    private static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1245d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1246e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1242a = atomicReferenceFieldUpdater;
            this.f1243b = atomicReferenceFieldUpdater2;
            this.f1244c = atomicReferenceFieldUpdater3;
            this.f1245d = atomicReferenceFieldUpdater4;
            this.f1246e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return androidx.concurrent.futures.b.a(this.f1245d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.b.a(this.f1246e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return androidx.concurrent.futures.b.a(this.f1244c, aVar, iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            this.f1243b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            this.f1242a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<V> f1247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final x3.d<? extends V> f1248b;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1247a.f1229a != this) {
                return;
            }
            if (a.f1227f.b(this.f1247a, this, a.q(this.f1248b))) {
                a.i(this.f1247a);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1230b != eVar) {
                    return false;
                }
                aVar.f1230b = eVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1229a != obj) {
                    return false;
                }
                aVar.f1229a = obj2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1231c != iVar) {
                    return false;
                }
                aVar.f1231c = iVar2;
                return true;
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f1251b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f1250a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f1249c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile Thread f1250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile i f1251b;

        i() {
            a.f1227f.e(this, Thread.currentThread());
        }

        i(boolean z7) {
        }

        void a(i iVar) {
            a.f1227f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f1250a;
            if (thread != null) {
                this.f1250a = null;
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
        f1227f = hVar;
        if (th != null) {
            f1226e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1228g = new Object();
    }

    protected a() {
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objR = r(this);
            sb.append("SUCCESS, result=[");
            sb.append(y(objR));
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

    private static CancellationException e(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T g(T t7) {
        t7.getClass();
        return t7;
    }

    private e h(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1230b;
        } while (!f1227f.a(this, eVar2, e.f1238d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f1241c;
            eVar4.f1241c = eVar3;
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
    static void i(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.u();
            aVar.d();
            e eVarH = aVar.h(eVar);
            while (eVarH != null) {
                eVar = eVarH.f1241c;
                Runnable runnable = eVarH.f1239a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f1247a;
                    if (aVar.f1229a == gVar) {
                        if (f1227f.b(aVar, gVar, q(gVar.f1248b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    n(runnable, eVarH.f1240b);
                }
                eVarH = eVar;
            }
            return;
        }
    }

    private static void n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f1226e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V o(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw e("Task was cancelled.", ((c) obj).f1235b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1237a);
        }
        if (obj == f1228g) {
            return null;
        }
        return obj;
    }

    static Object q(x3.d<?> dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f1229a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f1234a ? cVar.f1235b != null ? new c(false, cVar.f1235b) : c.f1233d : obj;
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f1225d) && zIsCancelled) {
            return c.f1233d;
        }
        try {
            Object objR = r(dVar);
            return objR == null ? f1228g : objR;
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

    static <V> V r(Future<V> future) {
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

    private void u() {
        i iVar;
        do {
            iVar = this.f1231c;
        } while (!f1227f.c(this, iVar, i.f1249c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1251b;
        }
    }

    private void v(i iVar) {
        iVar.f1250a = null;
        while (true) {
            i iVar2 = this.f1231c;
            if (iVar2 == i.f1249c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f1251b;
                if (iVar2.f1250a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f1251b = iVar4;
                    if (iVar3.f1250a == null) {
                        break;
                    }
                } else if (!f1227f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String y(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // x3.d
    public final void c(Runnable runnable, Executor executor) {
        g(runnable);
        g(executor);
        e eVar = this.f1230b;
        if (eVar != e.f1238d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1241c = eVar;
                if (f1227f.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f1230b;
                }
            } while (eVar != e.f1238d);
        }
        n(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        Object obj = this.f1229a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f1225d ? new c(z7, new CancellationException("Future.cancel() was called.")) : z7 ? c.f1232c : c.f1233d;
        boolean z8 = false;
        a<V> aVar = this;
        while (true) {
            if (f1227f.b(aVar, obj, cVar)) {
                if (z7) {
                    aVar.s();
                }
                i(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                x3.d<? extends V> dVar = ((g) obj).f1248b;
                if (!(dVar instanceof a)) {
                    dVar.cancel(z7);
                    return true;
                }
                aVar = (a) dVar;
                obj = aVar.f1229a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z8 = true;
            } else {
                obj = aVar.f1229a;
                if (!(obj instanceof g)) {
                    return z8;
                }
            }
        }
    }

    protected void d() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f1229a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return o(obj2);
        }
        i iVar = this.f1231c;
        if (iVar != i.f1249c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f1227f.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            v(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f1229a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return o(obj);
                }
                iVar = this.f1231c;
            } while (iVar != i.f1249c);
        }
        return o(this.f1229a);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f1229a;
        if ((obj != null) && (!(obj instanceof g))) {
            return o(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f1231c;
            if (iVar != i.f1249c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1227f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                v(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f1229a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return o(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        v(iVar2);
                    } else {
                        iVar = this.f1231c;
                    }
                } while (iVar != i.f1249c);
            }
            return o(this.f1229a);
        }
        while (nanos > 0) {
            Object obj3 = this.f1229a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return o(obj3);
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
        return this.f1229a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f1229a != null);
    }

    protected void s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String t() {
        Object obj = this.f1229a;
        if (obj instanceof g) {
            return "setFuture=[" + y(((g) obj).f1248b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public String toString() {
        String strT;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strT = t();
                } catch (RuntimeException e8) {
                    strT = "Exception thrown from implementation: " + e8.getClass();
                }
                if (strT == null || strT.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strT);
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
    protected boolean w(V v7) {
        if (v7 == null) {
            v7 = (V) f1228g;
        }
        if (!f1227f.b(this, null, v7)) {
            return false;
        }
        i(this);
        return true;
    }

    protected boolean x(Throwable th) {
        if (!f1227f.b(this, null, new d((Throwable) g(th)))) {
            return false;
        }
        i(this);
        return true;
    }

    protected final boolean z() {
        Object obj = this.f1229a;
        return (obj instanceof c) && ((c) obj).f1234a;
    }
}
