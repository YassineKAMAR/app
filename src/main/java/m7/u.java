package m7;

import java.util.Iterator;
import l7.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7.b<Element> f25019a;

    private u(i7.b<Element> bVar) {
        super(null);
        this.f25019a = bVar;
    }

    public /* synthetic */ u(i7.b bVar, kotlin.jvm.internal.j jVar) {
        this(bVar);
    }

    @Override // m7.a
    protected final void g(l7.c decoder, Builder builder, int i8, int i9) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        if (!(i9 >= 0)) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
        for (int i10 = 0; i10 < i9; i10++) {
            h(decoder, i8 + i10, builder, false);
        }
    }

    @Override // i7.b, i7.j, i7.a
    public abstract k7.f getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.a
    protected void h(l7.c decoder, int i8, Builder builder, boolean z7) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        n(builder, i8, c.a.c(decoder, getDescriptor(), i8, this.f25019a, null, 8, null));
    }

    protected abstract void n(Builder builder, int i8, Element element);

    @Override // i7.j
    public void serialize(l7.f encoder, Collection collection) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        int iE = e(collection);
        k7.f descriptor = getDescriptor();
        l7.d dVarY = encoder.y(descriptor, iE);
        Iterator<Element> itD = d(collection);
        for (int i8 = 0; i8 < iE; i8++) {
            dVarY.l(getDescriptor(), i8, this.f25019a, itD.next());
        }
        dVarY.d(descriptor);
    }
}
