package y0;

import androidx.lifecycle.o;
import x0.m;

/* JADX INFO: loaded from: classes.dex */
public class c implements m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o<m.b> f27342c = new o<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<m.b.c> f27343d = androidx.work.impl.utils.futures.c.t();

    public c() {
        a(m.f27207b);
    }

    public void a(m.b bVar) {
        this.f27342c.g(bVar);
        if (bVar instanceof m.b.c) {
            this.f27343d.p((m.b.c) bVar);
        } else if (bVar instanceof m.b.a) {
            this.f27343d.q(((m.b.a) bVar).a());
        }
    }
}
