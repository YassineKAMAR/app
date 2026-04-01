package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class df3 extends ie3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ze3 f6707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Logger f6708k = Logger.getLogger(df3.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile Set<Throwable> f6709h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile int f6710i;

    static {
        Throwable th;
        ze3 cf3Var;
        bf3 bf3Var = null;
        try {
            cf3Var = new af3(AtomicReferenceFieldUpdater.newUpdater(df3.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(df3.class, "i"));
            th = null;
        } catch (Error | RuntimeException e8) {
            th = e8;
            cf3Var = new cf3(bf3Var);
        }
        f6707j = cf3Var;
        if (th != null) {
            f6708k.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    df3(int i8) {
        this.f6710i = i8;
    }

    final int C() {
        return f6707j.a(this);
    }

    final Set E() {
        Set<Throwable> set = this.f6709h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        I(setNewSetFromMap);
        f6707j.b(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.f6709h;
        set2.getClass();
        return set2;
    }

    final void H() {
        this.f6709h = null;
    }

    abstract void I(Set set);
}
