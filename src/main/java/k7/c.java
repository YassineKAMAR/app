package k7;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f24245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.c<?> f24246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24247c;

    public c(f original, u6.c<?> kClass) {
        q.f(original, "original");
        q.f(kClass, "kClass");
        this.f24245a = original;
        this.f24246b = kClass;
        this.f24247c = original.a() + '<' + kClass.b() + '>';
    }

    @Override // k7.f
    public String a() {
        return this.f24247c;
    }

    @Override // k7.f
    public boolean c() {
        return this.f24245a.c();
    }

    @Override // k7.f
    public int d(String name) {
        q.f(name, "name");
        return this.f24245a.d(name);
    }

    @Override // k7.f
    public j e() {
        return this.f24245a.e();
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && q.b(this.f24245a, cVar.f24245a) && q.b(cVar.f24246b, this.f24246b);
    }

    @Override // k7.f
    public int f() {
        return this.f24245a.f();
    }

    @Override // k7.f
    public String g(int i8) {
        return this.f24245a.g(i8);
    }

    @Override // k7.f
    public List<Annotation> getAnnotations() {
        return this.f24245a.getAnnotations();
    }

    @Override // k7.f
    public List<Annotation> h(int i8) {
        return this.f24245a.h(i8);
    }

    public int hashCode() {
        return (this.f24246b.hashCode() * 31) + a().hashCode();
    }

    @Override // k7.f
    public f i(int i8) {
        return this.f24245a.i(i8);
    }

    @Override // k7.f
    public boolean isInline() {
        return this.f24245a.isInline();
    }

    @Override // k7.f
    public boolean j(int i8) {
        return this.f24245a.j(i8);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f24246b + ", original: " + this.f24245a + ')';
    }
}
