package m7;

import java.lang.annotation.Annotation;
import java.util.List;
import k7.f;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1 implements k7.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.f f24910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k7.f f24911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f24912d;

    private e1(String str, k7.f fVar, k7.f fVar2) {
        this.f24909a = str;
        this.f24910b = fVar;
        this.f24911c = fVar2;
        this.f24912d = 2;
    }

    public /* synthetic */ e1(String str, k7.f fVar, k7.f fVar2, kotlin.jvm.internal.j jVar) {
        this(str, fVar, fVar2);
    }

    @Override // k7.f
    public String a() {
        return this.f24909a;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // k7.f
    public k7.j e() {
        return k.c.f24284a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.q.b(a(), e1Var.a()) && kotlin.jvm.internal.q.b(this.f24910b, e1Var.f24910b) && kotlin.jvm.internal.q.b(this.f24911c, e1Var.f24911c);
    }

    @Override // k7.f
    public int f() {
        return this.f24912d;
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
        return (((a().hashCode() * 31) + this.f24910b.hashCode()) * 31) + this.f24911c.hashCode();
    }

    @Override // k7.f
    public k7.f i(int i8) {
        if (i8 >= 0) {
            int i9 = i8 % 2;
            if (i9 == 0) {
                return this.f24910b;
            }
            if (i9 == 1) {
                return this.f24911c;
            }
            throw new IllegalStateException("Unreached".toString());
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
        return a() + '(' + this.f24910b + ", " + this.f24911c + ')';
    }
}
