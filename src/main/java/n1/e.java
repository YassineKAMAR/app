package n1;

import android.content.Context;
import java.util.concurrent.Executor;
import n1.u;
import u1.w;
import u1.x;
import v1.m0;
import v1.n0;
import v1.u0;

/* JADX INFO: loaded from: classes.dex */
final class e extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d6.a<Executor> f25099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d6.a<Context> f25100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d6.a f25101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d6.a f25102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d6.a f25103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d6.a<String> f25104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d6.a<m0> f25105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d6.a<u1.f> f25106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d6.a<x> f25107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d6.a<t1.c> f25108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d6.a<u1.r> f25109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d6.a<u1.v> f25110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d6.a<t> f25111m;

    private static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f25112a;

        private b() {
        }

        @Override // n1.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f25112a = (Context) p1.d.b(context);
            return this;
        }

        @Override // n1.u.a
        public u build() {
            p1.d.a(this.f25112a, Context.class);
            return new e(this.f25112a);
        }
    }

    private e(Context context) {
        h(context);
    }

    public static u.a d() {
        return new b();
    }

    private void h(Context context) {
        this.f25099a = p1.a.a(k.a());
        p1.b bVarA = p1.c.a(context);
        this.f25100b = bVarA;
        o1.j jVarA = o1.j.a(bVarA, x1.c.a(), x1.d.a());
        this.f25101c = jVarA;
        this.f25102d = p1.a.a(o1.l.a(this.f25100b, jVarA));
        this.f25103e = u0.a(this.f25100b, v1.g.a(), v1.i.a());
        this.f25104f = p1.a.a(v1.h.a(this.f25100b));
        this.f25105g = p1.a.a(n0.a(x1.c.a(), x1.d.a(), v1.j.a(), this.f25103e, this.f25104f));
        t1.g gVarB = t1.g.b(x1.c.a());
        this.f25106h = gVarB;
        t1.i iVarA = t1.i.a(this.f25100b, this.f25105g, gVarB, x1.d.a());
        this.f25107i = iVarA;
        d6.a<Executor> aVar = this.f25099a;
        d6.a aVar2 = this.f25102d;
        d6.a<m0> aVar3 = this.f25105g;
        this.f25108j = t1.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        d6.a<Context> aVar4 = this.f25100b;
        d6.a aVar5 = this.f25102d;
        d6.a<m0> aVar6 = this.f25105g;
        this.f25109k = u1.s.a(aVar4, aVar5, aVar6, this.f25107i, this.f25099a, aVar6, x1.c.a(), x1.d.a(), this.f25105g);
        d6.a<Executor> aVar7 = this.f25099a;
        d6.a<m0> aVar8 = this.f25105g;
        this.f25110l = w.a(aVar7, aVar8, this.f25107i, aVar8);
        this.f25111m = p1.a.a(v.a(x1.c.a(), x1.d.a(), this.f25108j, this.f25109k, this.f25110l));
    }

    @Override // n1.u
    v1.d a() {
        return this.f25105g.get();
    }

    @Override // n1.u
    t c() {
        return this.f25111m.get();
    }
}
