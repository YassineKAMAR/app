package m7;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<Element, Collection, Builder> implements i7.b<Collection> {
    private a() {
    }

    public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
        this();
    }

    public static /* synthetic */ void i(a aVar, l7.c cVar, int i8, Object obj, boolean z7, int i9, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i9 & 8) != 0) {
            z7 = true;
        }
        aVar.h(cVar, i8, obj, z7);
    }

    private final int j(l7.c cVar, Builder builder) {
        int iB = cVar.B(getDescriptor());
        c(builder, iB);
        return iB;
    }

    protected abstract Builder a();

    protected abstract int b(Builder builder);

    protected abstract void c(Builder builder, int i8);

    protected abstract Iterator<Element> d(Collection collection);

    @Override // i7.a
    public Collection deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return f(decoder, null);
    }

    protected abstract int e(Collection collection);

    public final Collection f(l7.e decoder, Collection collection) {
        Builder builderA;
        kotlin.jvm.internal.q.f(decoder, "decoder");
        if (collection == null || (builderA = k(collection)) == null) {
            builderA = a();
        }
        int iB = b(builderA);
        l7.c cVarC = decoder.c(getDescriptor());
        if (!cVarC.y()) {
            while (true) {
                int iS = cVarC.s(getDescriptor());
                if (iS == -1) {
                    break;
                }
                i(this, cVarC, iB + iS, builderA, false, 8, null);
            }
        } else {
            g(cVarC, builderA, iB, j(cVarC, builderA));
        }
        cVarC.d(getDescriptor());
        return l(builderA);
    }

    protected abstract void g(l7.c cVar, Builder builder, int i8, int i9);

    protected abstract void h(l7.c cVar, int i8, Builder builder, boolean z7);

    protected abstract Builder k(Collection collection);

    protected abstract Collection l(Builder builder);
}
