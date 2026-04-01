package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import f1.e;
import f1.k;
import f1.n;
import f1.q;
import f1.t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f3108l = TimeUnit.DAYS.toMillis(1);

    class a implements c.InterfaceC0159c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f3109a;

        a(Context context) {
            this.f3109a = context;
        }

        @Override // q0.c.InterfaceC0159c
        public c a(c.b bVar) {
            c.b.a aVarA = c.b.a(this.f3109a);
            aVarA.c(bVar.f25741b).b(bVar.f25742c).d(true);
            return new r0.c().a(aVarA.a());
        }
    }

    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(q0.b bVar) {
            super.c(bVar);
            bVar.f();
            try {
                bVar.n(WorkDatabase.w());
                bVar.B();
            } finally {
                bVar.L();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z7) {
        h.a aVarA;
        if (z7) {
            aVarA = g.c(context, WorkDatabase.class).c();
        } else {
            aVarA = g.a(context, WorkDatabase.class, y0.h.d());
            aVarA.f(new a(context));
        }
        return (WorkDatabase) aVarA.g(executor).a(u()).b(androidx.work.impl.a.f3118a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f3119b).b(androidx.work.impl.a.f3120c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f3121d).b(androidx.work.impl.a.f3122e).b(androidx.work.impl.a.f3123f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f3124g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f3108l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract f1.b t();

    public abstract e x();

    public abstract f1.h y();

    public abstract k z();
}
