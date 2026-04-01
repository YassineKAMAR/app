package z2;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p.a<b<?>, x2.b> f27691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p.a<b<?>, String> f27692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s3.i<Map<b<?>, String>> f27693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27695e;

    public final Set<b<?>> a() {
        return this.f27691a.keySet();
    }

    public final void b(b<?> bVar, x2.b bVar2, String str) {
        this.f27691a.put(bVar, bVar2);
        this.f27692b.put(bVar, str);
        this.f27694d--;
        if (!bVar2.u()) {
            this.f27695e = true;
        }
        if (this.f27694d == 0) {
            if (!this.f27695e) {
                this.f27693c.c(this.f27692b);
            } else {
                this.f27693c.b(new y2.c(this.f27691a));
            }
        }
    }
}
