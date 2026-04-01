package y6;

import h6.g;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    static final class a extends kotlin.jvm.internal.r implements p6.p<h6.g, g.b, h6.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27471a = new a();

        a() {
            super(2);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h6.g invoke(h6.g gVar, g.b bVar) {
            return bVar instanceof z ? gVar.X(((z) bVar).Q()) : gVar.X(bVar);
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.p<h6.g, g.b, h6.g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y<h6.g> f27472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f27473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.y<h6.g> yVar, boolean z7) {
            super(2);
            this.f27472a = yVar;
            this.f27473b = z7;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, h6.g] */
        @Override // p6.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h6.g invoke(h6.g gVar, g.b bVar) {
            if (!(bVar instanceof z)) {
                return gVar.X(bVar);
            }
            g.b bVarA = this.f27472a.f24325a.a(bVar.getKey());
            if (bVarA != null) {
                kotlin.jvm.internal.y<h6.g> yVar = this.f27472a;
                yVar.f24325a = yVar.f24325a.E(bVar.getKey());
                return gVar.X(((z) bVar).M(bVarA));
            }
            z zVarQ = (z) bVar;
            if (this.f27473b) {
                zVarQ = zVarQ.Q();
            }
            return gVar.X(zVarQ);
        }
    }

    static final class c extends kotlin.jvm.internal.r implements p6.p<Boolean, g.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f27474a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z7, g.b bVar) {
            return Boolean.valueOf(z7 || (bVar instanceof z));
        }

        @Override // p6.p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, g.b bVar) {
            return a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final h6.g a(h6.g gVar, h6.g gVar2, boolean z7) {
        boolean zC = c(gVar);
        boolean zC2 = c(gVar2);
        if (!zC && !zC2) {
            return gVar.X(gVar2);
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f24325a = gVar2;
        h6.h hVar = h6.h.f22443a;
        h6.g gVar3 = (h6.g) gVar.P(hVar, new b(yVar, z7));
        if (zC2) {
            yVar.f24325a = ((h6.g) yVar.f24325a).P(hVar, a.f27471a);
        }
        return gVar3.X((h6.g) yVar.f24325a);
    }

    public static final String b(h6.g gVar) {
        return null;
    }

    private static final boolean c(h6.g gVar) {
        return ((Boolean) gVar.P(Boolean.FALSE, c.f27474a)).booleanValue();
    }

    public static final h6.g d(e0 e0Var, h6.g gVar) {
        h6.g gVarA = a(e0Var.d(), gVar, true);
        return (gVarA == s0.a() || gVarA.a(h6.e.T) != null) ? gVarA : gVarA.X(s0.a());
    }

    public static final d2<?> e(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof o0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof d2) {
                return (d2) eVar;
            }
        }
        return null;
    }

    public static final d2<?> f(h6.d<?> dVar, h6.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.a(e2.f27488a) != null)) {
            return null;
        }
        d2<?> d2VarE = e((kotlin.coroutines.jvm.internal.e) dVar);
        if (d2VarE != null) {
            d2VarE.D0(gVar, obj);
        }
        return d2VarE;
    }
}
