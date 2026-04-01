package n1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile u f25127e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1.a f25128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x1.a f25129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1.e f25130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u1.r f25131d;

    t(x1.a aVar, x1.a aVar2, t1.e eVar, u1.r rVar, u1.v vVar) {
        this.f25128a = aVar;
        this.f25129b = aVar2;
        this.f25130c = eVar;
        this.f25131d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f25128a.a()).k(this.f25129b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f25127e;
        if (uVar != null) {
            return uVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<l1.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(l1.b.b("proto"));
    }

    public static void f(Context context) {
        if (f25127e == null) {
            synchronized (t.class) {
                if (f25127e == null) {
                    f25127e = e.d().a(context).build();
                }
            }
        }
    }

    @Override // n1.s
    public void a(n nVar, l1.h hVar) {
        this.f25130c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public u1.r e() {
        return this.f25131d;
    }

    public l1.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
