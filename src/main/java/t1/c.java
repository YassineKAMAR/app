package t1;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import n1.o;
import n1.t;
import o1.m;
import u1.x;
import w1.b;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f26470f = Logger.getLogger(t.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f26471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f26472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o1.e f26473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v1.d f26474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w1.b f26475e;

    public c(Executor executor, o1.e eVar, x xVar, v1.d dVar, w1.b bVar) {
        this.f26472b = executor;
        this.f26473c = eVar;
        this.f26471a = xVar;
        this.f26474d = dVar;
        this.f26475e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, n1.i iVar) {
        this.f26474d.D(oVar, iVar);
        this.f26471a.b(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, l1.h hVar, n1.i iVar) {
        try {
            m mVarA = this.f26473c.a(oVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", oVar.b());
                f26470f.warning(str);
                hVar.a(new IllegalArgumentException(str));
            } else {
                final n1.i iVarA = mVarA.a(iVar);
                this.f26475e.d(new b.a() { // from class: t1.b
                    @Override // w1.b.a
                    public final Object a() {
                        return this.f26467a.d(oVar, iVarA);
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e8) {
            f26470f.warning("Error scheduling event " + e8.getMessage());
            hVar.a(e8);
        }
    }

    @Override // t1.e
    public void a(final o oVar, final n1.i iVar, final l1.h hVar) {
        this.f26472b.execute(new Runnable() { // from class: t1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f26463a.e(oVar, hVar, iVar);
            }
        });
    }
}
