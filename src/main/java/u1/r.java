package u1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o1.g;
import q1.c;
import w1.b;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o1.e f26681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1.d f26682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x f26683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f26684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1.b f26685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x1.a f26686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x1.a f26687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v1.c f26688i;

    public r(Context context, o1.e eVar, v1.d dVar, x xVar, Executor executor, w1.b bVar, x1.a aVar, x1.a aVar2, v1.c cVar) {
        this.f26680a = context;
        this.f26681b = eVar;
        this.f26682c = dVar;
        this.f26683d = xVar;
        this.f26684e = executor;
        this.f26685f = bVar;
        this.f26686g = aVar;
        this.f26687h = aVar2;
        this.f26688i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(n1.o oVar) {
        return Boolean.valueOf(this.f26682c.u(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(n1.o oVar) {
        return this.f26682c.d0(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, n1.o oVar, long j8) {
        this.f26682c.b0(iterable);
        this.f26682c.y(oVar, this.f26686g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f26682c.i(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f26688i.a();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f26688i.h(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(n1.o oVar, long j8) {
        this.f26682c.y(oVar, this.f26686g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(n1.o oVar, int i8) {
        this.f26683d.b(oVar, i8 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final n1.o oVar, final int i8, Runnable runnable) {
        try {
            try {
                w1.b bVar = this.f26685f;
                final v1.d dVar = this.f26682c;
                Objects.requireNonNull(dVar);
                bVar.d(new b.a() { // from class: u1.i
                    @Override // w1.b.a
                    public final Object a() {
                        return Integer.valueOf(dVar.g());
                    }
                });
                if (k()) {
                    u(oVar, i8);
                } else {
                    this.f26685f.d(new b.a() { // from class: u1.j
                        @Override // w1.b.a
                        public final Object a() {
                            return this.f26661a.s(oVar, i8);
                        }
                    });
                }
            } catch (w1.a unused) {
                this.f26683d.b(oVar, i8 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public n1.i j(o1.m mVar) {
        w1.b bVar = this.f26685f;
        final v1.c cVar = this.f26688i;
        Objects.requireNonNull(cVar);
        return mVar.a(n1.i.a().i(this.f26686g.a()).k(this.f26687h.a()).j("GDT_CLIENT_METRICS").h(new n1.h(l1.b.b("proto"), ((q1.a) bVar.d(new b.a() { // from class: u1.h
            @Override // w1.b.a
            public final Object a() {
                return cVar.c();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f26680a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public o1.g u(final n1.o oVar, int i8) {
        o1.g gVarB;
        o1.m mVarA = this.f26681b.a(oVar.b());
        long jMax = 0;
        o1.g gVarE = o1.g.e(0L);
        while (true) {
            final long j8 = jMax;
            while (((Boolean) this.f26685f.d(new b.a() { // from class: u1.k
                @Override // w1.b.a
                public final Object a() {
                    return this.f26664a.l(oVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f26685f.d(new b.a() { // from class: u1.l
                    @Override // w1.b.a
                    public final Object a() {
                        return this.f26666a.m(oVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    r1.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    gVarB = o1.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((v1.k) it.next()).b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarB = mVarA.b(o1.f.a().b(arrayList).c(oVar.c()).a());
                }
                gVarE = gVarB;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f26685f.d(new b.a() { // from class: u1.m
                        @Override // w1.b.a
                        public final Object a() {
                            return this.f26668a.n(iterable, oVar, j8);
                        }
                    });
                    this.f26683d.a(oVar, i8 + 1, true);
                    return gVarE;
                }
                this.f26685f.d(new b.a() { // from class: u1.n
                    @Override // w1.b.a
                    public final Object a() {
                        return this.f26672a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j8, gVarE.b());
                    if (oVar.e()) {
                        this.f26685f.d(new b.a() { // from class: u1.o
                            @Override // w1.b.a
                            public final Object a() {
                                return this.f26674a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strJ = ((v1.k) it2.next()).b().j();
                        map.put(strJ, !map.containsKey(strJ) ? 1 : Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                    }
                    this.f26685f.d(new b.a() { // from class: u1.p
                        @Override // w1.b.a
                        public final Object a() {
                            return this.f26675a.q(map);
                        }
                    });
                }
            }
            this.f26685f.d(new b.a() { // from class: u1.q
                @Override // w1.b.a
                public final Object a() {
                    return this.f26677a.r(oVar, j8);
                }
            });
            return gVarE;
        }
    }

    public void v(final n1.o oVar, final int i8, final Runnable runnable) {
        this.f26684e.execute(new Runnable() { // from class: u1.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f26655a.t(oVar, i8, runnable);
            }
        });
    }
}
