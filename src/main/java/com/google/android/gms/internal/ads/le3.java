package com.google.android.gms.internal.ads;

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
public abstract class le3<V> extends dh3 implements x3.d<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f10651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f10652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ae3 f10653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f10654g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f10655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile de3 f10656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ke3 f10657c;

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        ae3 ge3Var;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", com.amazon.a.a.o.b.ad));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f10651d = z7;
        f10652e = Logger.getLogger(le3.class.getName());
        byte b8 = 0;
        try {
            ge3Var = new je3(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e8) {
            try {
                th2 = e8;
                ge3Var = new ee3(AtomicReferenceFieldUpdater.newUpdater(ke3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ke3.class, ke3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(le3.class, ke3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(le3.class, de3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(le3.class, Object.class, "a"));
                th = null;
            } catch (Error | RuntimeException e9) {
                th = e9;
                th2 = e8;
                ge3Var = new ge3(b8 == true ? 1 : 0);
            }
        }
        f10653f = ge3Var;
        if (th != null) {
            Logger logger = f10652e;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f10654g = new Object();
    }

    protected le3() {
    }

    private static void A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f10652e.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    private final void B(ke3 ke3Var) {
        ke3Var.f10056a = null;
        while (true) {
            ke3 ke3Var2 = this.f10657c;
            if (ke3Var2 != ke3.f10055c) {
                ke3 ke3Var3 = null;
                while (ke3Var2 != null) {
                    ke3 ke3Var4 = ke3Var2.f10057b;
                    if (ke3Var2.f10056a != null) {
                        ke3Var3 = ke3Var2;
                    } else if (ke3Var3 != null) {
                        ke3Var3.f10057b = ke3Var4;
                        if (ke3Var3.f10056a == null) {
                            break;
                        }
                    } else if (!f10653f.g(this, ke3Var2, ke3Var4)) {
                        break;
                    }
                    ke3Var2 = ke3Var4;
                }
                return;
            }
            return;
        }
    }

    private static final Object b(Object obj) throws ExecutionException {
        if (obj instanceof be3) {
            Throwable th = ((be3) obj).f5770b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof ce3) {
            throw new ExecutionException(((ce3) obj).f6328a);
        }
        if (obj == f10654g) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(x3.d dVar) {
        Throwable thA;
        if (dVar instanceof he3) {
            Object be3Var = ((le3) dVar).f10655a;
            if (be3Var instanceof be3) {
                be3 be3Var2 = (be3) be3Var;
                if (be3Var2.f5769a) {
                    Throwable th = be3Var2.f5770b;
                    be3Var = th != null ? new be3(false, th) : be3.f5768d;
                }
            }
            be3Var.getClass();
            return be3Var;
        }
        if ((dVar instanceof dh3) && (thA = ((dh3) dVar).a()) != null) {
            return new ce3(thA);
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f10651d) && zIsCancelled) {
            be3 be3Var3 = be3.f5768d;
            be3Var3.getClass();
            return be3Var3;
        }
        try {
            Object objI = i(dVar);
            if (!zIsCancelled) {
                return objI == null ? f10654g : objI;
            }
            return new be3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(dVar)));
        } catch (Error e8) {
            e = e8;
            return new ce3(e);
        } catch (CancellationException e9) {
            return !zIsCancelled ? new ce3(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(dVar)), e9)) : new be3(false, e9);
        } catch (RuntimeException e10) {
            e = e10;
            return new ce3(e);
        } catch (ExecutionException e11) {
            return zIsCancelled ? new be3(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(dVar)), e11)) : new ce3(e11.getCause());
        }
    }

    private static Object i(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    private final void w(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            if (objI == null) {
                hexString = "null";
            } else if (objI == this) {
                hexString = "this future";
            } else {
                sb.append(objI.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(objI));
            }
            sb.append(hexString);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.f10655a
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.fe3
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.android.gms.internal.ads.fe3 r1 = (com.google.android.gms.internal.ads.fe3) r1
            x3.d<? extends V> r1 = r1.f7736b
            r4.y(r5, r1)
        L1d:
            r5.append(r3)
            goto L46
        L21:
            java.lang.String r1 = r4.d()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.android.gms.internal.ads.b93.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L3b
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3b:
            if (r1 == 0) goto L46
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L46:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L56
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.w(r5)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.le3.x(java.lang.StringBuilder):void");
    }

    private final void y(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e8) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e8.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(le3 le3Var, boolean z7) {
        de3 de3Var = null;
        while (true) {
            for (ke3 ke3VarB = f10653f.b(le3Var, ke3.f10055c); ke3VarB != null; ke3VarB = ke3VarB.f10057b) {
                Thread thread = ke3VarB.f10056a;
                if (thread != null) {
                    ke3VarB.f10056a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z7) {
                le3Var.s();
            }
            le3Var.e();
            de3 de3Var2 = de3Var;
            de3 de3VarA = f10653f.a(le3Var, de3.f6702d);
            de3 de3Var3 = de3Var2;
            while (de3VarA != null) {
                de3 de3Var4 = de3VarA.f6705c;
                de3VarA.f6705c = de3Var3;
                de3Var3 = de3VarA;
                de3VarA = de3Var4;
            }
            while (de3Var3 != null) {
                de3Var = de3Var3.f6705c;
                Runnable runnable = de3Var3.f6703a;
                runnable.getClass();
                if (runnable instanceof fe3) {
                    fe3 fe3Var = (fe3) runnable;
                    le3Var = fe3Var.f7735a;
                    if (le3Var.f10655a == fe3Var) {
                        if (f10653f.f(le3Var, fe3Var, h(fe3Var.f7736b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = de3Var3.f6704b;
                    executor.getClass();
                    A(runnable, executor);
                }
                de3Var3 = de3Var;
            }
            return;
            z7 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.dh3
    protected final Throwable a() {
        if (!(this instanceof he3)) {
            return null;
        }
        Object obj = this.f10655a;
        if (obj instanceof ce3) {
            return ((ce3) obj).f6328a;
        }
        return null;
    }

    @Override // x3.d
    public void c(Runnable runnable, Executor executor) {
        de3 de3Var;
        l83.c(runnable, "Runnable was null.");
        l83.c(executor, "Executor was null.");
        if (!isDone() && (de3Var = this.f10656b) != de3.f6702d) {
            de3 de3Var2 = new de3(runnable, executor);
            do {
                de3Var2.f6705c = de3Var;
                if (f10653f.e(this, de3Var, de3Var2)) {
                    return;
                } else {
                    de3Var = this.f10656b;
                }
            } while (de3Var != de3.f6702d);
        }
        A(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z7) {
        be3 be3Var;
        Object obj = this.f10655a;
        if (!(obj instanceof fe3) && !(obj == null)) {
            return false;
        }
        if (f10651d) {
            be3Var = new be3(z7, new CancellationException("Future.cancel() was called."));
        } else {
            be3Var = z7 ? be3.f5767c : be3.f5768d;
            be3Var.getClass();
        }
        boolean z8 = false;
        le3<V> le3Var = this;
        while (true) {
            if (f10653f.f(le3Var, obj, be3Var)) {
                z(le3Var, z7);
                if (!(obj instanceof fe3)) {
                    break;
                }
                x3.d<? extends V> dVar = ((fe3) obj).f7736b;
                if (!(dVar instanceof he3)) {
                    dVar.cancel(z7);
                    break;
                }
                le3Var = (le3) dVar;
                obj = le3Var.f10655a;
                if (!(obj == null) && !(obj instanceof fe3)) {
                    break;
                }
                z8 = true;
            } else {
                obj = le3Var.f10655a;
                if (!(obj instanceof fe3)) {
                    return z8;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void e() {
    }

    protected boolean f(Object obj) {
        if (obj == null) {
            obj = f10654g;
        }
        if (!f10653f.f(this, null, obj)) {
            return false;
        }
        z(this, false);
        return true;
    }

    protected boolean g(Throwable th) {
        th.getClass();
        if (!f10653f.f(this, null, new ce3(th))) {
            return false;
        }
        z(this, false);
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f10655a;
        if ((obj2 != null) && (!(obj2 instanceof fe3))) {
            return b(obj2);
        }
        ke3 ke3Var = this.f10657c;
        if (ke3Var != ke3.f10055c) {
            ke3 ke3Var2 = new ke3();
            do {
                ae3 ae3Var = f10653f;
                ae3Var.c(ke3Var2, ke3Var);
                if (ae3Var.g(this, ke3Var, ke3Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            B(ke3Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f10655a;
                    } while (!((obj != null) & (!(obj instanceof fe3))));
                    return b(obj);
                }
                ke3Var = this.f10657c;
            } while (ke3Var != ke3.f10055c);
        }
        Object obj3 = this.f10655a;
        obj3.getClass();
        return b(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10655a;
        boolean z7 = true;
        if ((obj != null) && (!(obj instanceof fe3))) {
            return b(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            ke3 ke3Var = this.f10657c;
            if (ke3Var != ke3.f10055c) {
                ke3 ke3Var2 = new ke3();
                do {
                    ae3 ae3Var = f10653f;
                    ae3Var.c(ke3Var2, ke3Var);
                    if (ae3Var.g(this, ke3Var, ke3Var2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                B(ke3Var2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10655a;
                            if ((obj2 != null) && (!(obj2 instanceof fe3))) {
                                return b(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        B(ke3Var2);
                    } else {
                        ke3Var = this.f10657c;
                    }
                } while (ke3Var != ke3.f10055c);
            }
            Object obj3 = this.f10655a;
            obj3.getClass();
            return b(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f10655a;
            if ((obj4 != null) && (!(obj4 instanceof fe3))) {
                return b(obj4);
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
        String strConcat = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j9 = -nanos;
            long jConvert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
            long nanos2 = j9 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z7 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z7) {
                    strConcat3 = strConcat3.concat(com.amazon.a.a.o.b.f.f3942a);
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z7) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10655a instanceof be3;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.f10655a != null) & (!(r0 instanceof fe3));
    }

    protected void s() {
    }

    final void t(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(v());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            w(sb);
        } else {
            x(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    protected final boolean u(x3.d dVar) {
        ce3 ce3Var;
        dVar.getClass();
        Object obj = this.f10655a;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f10653f.f(this, null, h(dVar))) {
                    return false;
                }
                z(this, false);
                return true;
            }
            fe3 fe3Var = new fe3(this, dVar);
            if (f10653f.f(this, null, fe3Var)) {
                try {
                    dVar.c(fe3Var, nf3.INSTANCE);
                } catch (Error | RuntimeException e8) {
                    try {
                        ce3Var = new ce3(e8);
                    } catch (Error | RuntimeException unused) {
                        ce3Var = ce3.f6327b;
                    }
                    f10653f.f(this, fe3Var, ce3Var);
                }
                return true;
            }
            obj = this.f10655a;
        }
        if (obj instanceof be3) {
            dVar.cancel(((be3) obj).f5769a);
        }
        return false;
    }

    protected final boolean v() {
        Object obj = this.f10655a;
        return (obj instanceof be3) && ((be3) obj).f5769a;
    }
}
