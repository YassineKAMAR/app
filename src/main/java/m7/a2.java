package m7;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 implements k7.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k7.f f24878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f24880c;

    public a2(k7.f original) {
        kotlin.jvm.internal.q.f(original, "original");
        this.f24878a = original;
        this.f24879b = original.a() + '?';
        this.f24880c = p1.a(original);
    }

    @Override // k7.f
    public String a() {
        return this.f24879b;
    }

    @Override // m7.n
    public Set<String> b() {
        return this.f24880c;
    }

    @Override // k7.f
    public boolean c() {
        return true;
    }

    @Override // k7.f
    public int d(String name) {
        kotlin.jvm.internal.q.f(name, "name");
        return this.f24878a.d(name);
    }

    @Override // k7.f
    public k7.j e() {
        return this.f24878a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && kotlin.jvm.internal.q.b(this.f24878a, ((a2) obj).f24878a);
    }

    @Override // k7.f
    public int f() {
        return this.f24878a.f();
    }

    @Override // k7.f
    public String g(int i8) {
        return this.f24878a.g(i8);
    }

    @Override // k7.f
    public List<Annotation> getAnnotations() {
        return this.f24878a.getAnnotations();
    }

    @Override // k7.f
    public List<Annotation> h(int i8) {
        return this.f24878a.h(i8);
    }

    public int hashCode() {
        return this.f24878a.hashCode() * 31;
    }

    @Override // k7.f
    public k7.f i(int i8) {
        return this.f24878a.i(i8);
    }

    @Override // k7.f
    public boolean isInline() {
        return this.f24878a.isInline();
    }

    @Override // k7.f
    public boolean j(int i8) {
        return this.f24878a.j(i8);
    }

    public final k7.f k() {
        return this.f24878a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24878a);
        sb.append('?');
        return sb.toString();
    }
}
