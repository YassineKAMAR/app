package x0;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f27220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f1.p f27221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f27222c;

    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        f1.p f27225c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Class<? extends ListenableWorker> f27227e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f27223a = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Set<String> f27226d = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        UUID f27224b = UUID.randomUUID();

        a(Class<? extends ListenableWorker> cls) {
            this.f27227e = cls;
            this.f27225c = new f1.p(this.f27224b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f27226d.add(str);
            return (B) d();
        }

        public final W b() {
            W w7 = (W) c();
            b bVar = this.f27225c.f21660j;
            int i8 = Build.VERSION.SDK_INT;
            boolean z7 = (i8 >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i8 >= 23 && bVar.h());
            if (this.f27225c.f21667q && z7) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f27224b = UUID.randomUUID();
            f1.p pVar = new f1.p(this.f27225c);
            this.f27225c = pVar;
            pVar.f21651a = this.f27224b.toString();
            return w7;
        }

        abstract W c();

        abstract B d();

        public final B e(b bVar) {
            this.f27225c.f21660j = bVar;
            return (B) d();
        }

        public final B f(androidx.work.b bVar) {
            this.f27225c.f21655e = bVar;
            return (B) d();
        }
    }

    protected u(UUID uuid, f1.p pVar, Set<String> set) {
        this.f27220a = uuid;
        this.f27221b = pVar;
        this.f27222c = set;
    }

    public String a() {
        return this.f27220a.toString();
    }

    public Set<String> b() {
        return this.f27222c;
    }

    public f1.p c() {
        return this.f27221b;
    }
}
