package m7;

import java.lang.annotation.Annotation;
import java.util.List;
import k7.f;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 implements k7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.e f25035b;

    public x1(String serialName, k7.e kind) {
        kotlin.jvm.internal.q.f(serialName, "serialName");
        kotlin.jvm.internal.q.f(kind, "kind");
        this.f25034a = serialName;
        this.f25035b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // k7.f
    public String a() {
        return this.f25034a;
    }

    @Override // k7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // k7.f
    public int d(String name) {
        kotlin.jvm.internal.q.f(name, "name");
        b();
        throw new e6.h();
    }

    @Override // k7.f
    public int f() {
        return 0;
    }

    @Override // k7.f
    public String g(int i8) {
        b();
        throw new e6.h();
    }

    @Override // k7.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // k7.f
    public List<Annotation> h(int i8) {
        b();
        throw new e6.h();
    }

    @Override // k7.f
    public k7.f i(int i8) {
        b();
        throw new e6.h();
    }

    @Override // k7.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // k7.f
    public boolean j(int i8) {
        b();
        throw new e6.h();
    }

    @Override // k7.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public k7.e e() {
        return this.f25035b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
