package n7;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements i7.b<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f25163a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k7.f f25164b = a.f25165b;

    private static final class a implements k7.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f25165b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f25166c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ k7.f f25167a = j7.a.h(j.f25194a).getDescriptor();

        private a() {
        }

        @Override // k7.f
        public String a() {
            return f25166c;
        }

        @Override // k7.f
        public boolean c() {
            return this.f25167a.c();
        }

        @Override // k7.f
        public int d(String name) {
            kotlin.jvm.internal.q.f(name, "name");
            return this.f25167a.d(name);
        }

        @Override // k7.f
        public k7.j e() {
            return this.f25167a.e();
        }

        @Override // k7.f
        public int f() {
            return this.f25167a.f();
        }

        @Override // k7.f
        public String g(int i8) {
            return this.f25167a.g(i8);
        }

        @Override // k7.f
        public List<Annotation> getAnnotations() {
            return this.f25167a.getAnnotations();
        }

        @Override // k7.f
        public List<Annotation> h(int i8) {
            return this.f25167a.h(i8);
        }

        @Override // k7.f
        public k7.f i(int i8) {
            return this.f25167a.i(i8);
        }

        @Override // k7.f
        public boolean isInline() {
            return this.f25167a.isInline();
        }

        @Override // k7.f
        public boolean j(int i8) {
            return this.f25167a.j(i8);
        }
    }

    private c() {
    }

    @Override // i7.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        k.g(decoder);
        return new b((List) j7.a.h(j.f25194a).deserialize(decoder));
    }

    @Override // i7.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(l7.f encoder, b value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        k.h(encoder);
        j7.a.h(j.f25194a).serialize(encoder, value);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return f25164b;
    }
}
