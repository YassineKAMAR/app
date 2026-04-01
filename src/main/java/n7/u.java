package n7;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements i7.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f25216a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25217b = a.f25218b;

    private static final class a implements k7.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f25218b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f25219c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ k7.f f25220a = j7.a.k(j7.a.G(c0.f24298a), j.f25194a).getDescriptor();

        private a() {
        }

        @Override // k7.f
        public String a() {
            return f25219c;
        }

        @Override // k7.f
        public boolean c() {
            return this.f25220a.c();
        }

        @Override // k7.f
        public int d(String name) {
            kotlin.jvm.internal.q.f(name, "name");
            return this.f25220a.d(name);
        }

        @Override // k7.f
        public k7.j e() {
            return this.f25220a.e();
        }

        @Override // k7.f
        public int f() {
            return this.f25220a.f();
        }

        @Override // k7.f
        public String g(int i8) {
            return this.f25220a.g(i8);
        }

        @Override // k7.f
        public List<Annotation> getAnnotations() {
            return this.f25220a.getAnnotations();
        }

        @Override // k7.f
        public List<Annotation> h(int i8) {
            return this.f25220a.h(i8);
        }

        @Override // k7.f
        public k7.f i(int i8) {
            return this.f25220a.i(i8);
        }

        @Override // k7.f
        public boolean isInline() {
            return this.f25220a.isInline();
        }

        @Override // k7.f
        public boolean j(int i8) {
            return this.f25220a.j(i8);
        }
    }

    private u() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        k.g(decoder);
        return new t((Map) j7.a.k(j7.a.G(c0.f24298a), j.f25194a).deserialize(decoder));
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, t value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        k.h(encoder);
        j7.a.k(j7.a.G(c0.f24298a), j.f25194a).serialize(encoder, value);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25217b;
    }
}
