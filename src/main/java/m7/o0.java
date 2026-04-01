package m7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends r1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f24974m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String name, j0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.q.f(name, "name");
        kotlin.jvm.internal.q.f(generatedSerializer, "generatedSerializer");
        this.f24974m = true;
    }

    @Override // m7.r1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            k7.f fVar = (k7.f) obj;
            if (kotlin.jvm.internal.q.b(a(), fVar.a())) {
                o0 o0Var = (o0) obj;
                if ((o0Var.isInline() && Arrays.equals(p(), o0Var.p())) && f() == fVar.f()) {
                    int iF = f();
                    for (int i8 = 0; i8 < iF; i8++) {
                        if (kotlin.jvm.internal.q.b(i(i8).a(), fVar.i(i8).a()) && kotlin.jvm.internal.q.b(i(i8).e(), fVar.i(i8).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // m7.r1
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // m7.r1, k7.f
    public boolean isInline() {
        return this.f24974m;
    }
}
