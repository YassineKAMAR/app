package m7;

import java.lang.annotation.Annotation;
import java.util.List;
import k7.f;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0 implements k7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k7.f f25043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25044b;

    private z0(k7.f fVar) {
        this.f25043a = fVar;
        this.f25044b = 1;
    }

    public /* synthetic */ z0(k7.f fVar, kotlin.jvm.internal.j jVar) {
        this(fVar);
    }

    @Override // k7.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // k7.f
    public int d(String name) {
        kotlin.jvm.internal.q.f(name, "name");
        Integer numI = w6.u.i(name);
        if (numI != null) {
            return numI.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // k7.f
    public k7.j e() {
        return k.b.f24283a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.q.b(this.f25043a, z0Var.f25043a) && kotlin.jvm.internal.q.b(a(), z0Var.a());
    }

    @Override // k7.f
    public int f() {
        return this.f25044b;
    }

    @Override // k7.f
    public String g(int i8) {
        return String.valueOf(i8);
    }

    @Override // k7.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // k7.f
    public List<Annotation> h(int i8) {
        if (i8 >= 0) {
            return f6.o.d();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f25043a.hashCode() * 31) + a().hashCode();
    }

    @Override // k7.f
    public k7.f i(int i8) {
        if (i8 >= 0) {
            return this.f25043a;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // k7.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // k7.f
    public boolean j(int i8) {
        if (i8 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f25043a + ')';
    }
}
