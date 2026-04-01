package u1;

import java.util.Iterator;
import java.util.concurrent.Executor;
import w1.b;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f26700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1.d f26701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f26702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.b f26703d;

    v(Executor executor, v1.d dVar, x xVar, w1.b bVar) {
        this.f26700a = executor;
        this.f26701b = dVar;
        this.f26702c = xVar;
        this.f26703d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<n1.o> it = this.f26701b.x().iterator();
        while (it.hasNext()) {
            this.f26702c.b(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f26703d.d(new b.a() { // from class: u1.u
            @Override // w1.b.a
            public final Object a() {
                return this.f26699a.d();
            }
        });
    }

    public void c() {
        this.f26700a.execute(new Runnable() { // from class: u1.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f26698a.e();
            }
        });
    }
}
