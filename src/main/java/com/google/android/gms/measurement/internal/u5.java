package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
final class u5<V> extends FutureTask<V> implements Comparable<u5<V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f20525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f20526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ q5 f20528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u5(q5 q5Var, Runnable runnable, boolean z7, String str) {
        super(com.google.android.gms.internal.measurement.n1.a().d(runnable), null);
        this.f20528d = q5Var;
        a3.o.j(str);
        long andIncrement = q5.f20395l.getAndIncrement();
        this.f20525a = andIncrement;
        this.f20527c = str;
        this.f20526b = z7;
        if (andIncrement == Long.MAX_VALUE) {
            q5Var.t().G().a("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u5(q5 q5Var, Callable<V> callable, boolean z7, String str) {
        super(com.google.android.gms.internal.measurement.n1.a().a(callable));
        this.f20528d = q5Var;
        a3.o.j(str);
        long andIncrement = q5.f20395l.getAndIncrement();
        this.f20525a = andIncrement;
        this.f20527c = str;
        this.f20526b = z7;
        if (andIncrement == Long.MAX_VALUE) {
            q5Var.t().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        u5 u5Var = (u5) obj;
        boolean z7 = this.f20526b;
        if (z7 != u5Var.f20526b) {
            return z7 ? -1 : 1;
        }
        long j8 = this.f20525a;
        long j9 = u5Var.f20525a;
        if (j8 < j9) {
            return -1;
        }
        if (j8 > j9) {
            return 1;
        }
        this.f20528d.t().I().b("Two tasks share the same index. index", Long.valueOf(this.f20525a));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f20528d.t().G().b(this.f20527c, th);
        super.setException(th);
    }
}
