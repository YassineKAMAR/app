package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
abstract class kg3 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f10070a = new jg3(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f10071b = new jg3(null);

    kg3() {
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        fg3 fg3Var = null;
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (!(runnable instanceof fg3)) {
                if (runnable != f10071b) {
                    break;
                }
            } else {
                fg3Var = (fg3) runnable;
            }
            i8++;
            if (i8 > 1000) {
                Runnable runnable2 = f10071b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z7 = Thread.interrupted() || z7;
                    LockSupport.park(fg3Var);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z7) {
            thread.interrupt();
        }
    }

    abstract Object a();

    abstract String b();

    abstract void d(Throwable th);

    abstract void e(Object obj);

    abstract boolean f();

    final void g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            fg3 fg3Var = new fg3(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, fg3Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f10070a)) == f10071b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f10070a)) == f10071b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z7 = !f();
            if (z7) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        sg3.a(th);
                        if (!compareAndSet(threadCurrentThread, f10070a)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, f10070a)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f10070a)) {
                c(threadCurrentThread);
            }
            if (z7) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f10070a) {
            str = "running=[DONE]";
        } else if (runnable instanceof fg3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + b();
    }
}
