package n7;

import java.lang.annotation.Annotation;
import java.util.List;
import k7.f;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    public static final class a implements k7.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e6.k f25202a;

        a(p6.a<? extends k7.f> aVar) {
            this.f25202a = e6.m.b(aVar);
        }

        private final k7.f b() {
            return (k7.f) this.f25202a.getValue();
        }

        @Override // k7.f
        public String a() {
            return b().a();
        }

        @Override // k7.f
        public boolean c() {
            return f.a.c(this);
        }

        @Override // k7.f
        public int d(String name) {
            kotlin.jvm.internal.q.f(name, "name");
            return b().d(name);
        }

        @Override // k7.f
        public k7.j e() {
            return b().e();
        }

        @Override // k7.f
        public int f() {
            return b().f();
        }

        @Override // k7.f
        public String g(int i8) {
            return b().g(i8);
        }

        @Override // k7.f
        public List<Annotation> getAnnotations() {
            return f.a.a(this);
        }

        @Override // k7.f
        public List<Annotation> h(int i8) {
            return b().h(i8);
        }

        @Override // k7.f
        public k7.f i(int i8) {
            return b().i(i8);
        }

        @Override // k7.f
        public boolean isInline() {
            return f.a.b(this);
        }

        @Override // k7.f
        public boolean j(int i8) {
            return b().j(i8);
        }
    }

    public static final g d(l7.e eVar) {
        kotlin.jvm.internal.q.f(eVar, "<this>");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + z.b(eVar.getClass()));
    }

    public static final l e(l7.f fVar) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        l lVar = fVar instanceof l ? (l) fVar : null;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + z.b(fVar.getClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k7.f f(p6.a<? extends k7.f> aVar) {
        return new a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(l7.e eVar) {
        d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l7.f fVar) {
        e(fVar);
    }
}
