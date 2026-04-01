package m7;

import java.util.Iterator;
import m7.u1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w1<Element, Array, Builder extends u1<Array>> extends u<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k7.f f25029b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(i7.b<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.q.f(primitiveSerializer, "primitiveSerializer");
        this.f25029b = new v1(primitiveSerializer.getDescriptor());
    }

    @Override // m7.a
    protected final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // m7.a, i7.a
    public final Array deserialize(l7.e decoder) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return f(decoder, null);
    }

    @Override // m7.u, i7.b, i7.j, i7.a
    public final k7.f getDescriptor() {
        return this.f25029b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final Builder a() {
        return k(r());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int b(Builder builder) {
        kotlin.jvm.internal.q.f(builder, "<this>");
        return builder.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(Builder builder, int i8) {
        kotlin.jvm.internal.q.f(builder, "<this>");
        builder.b(i8);
    }

    protected abstract Array r();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void n(Builder builder, int i8, Element element) {
        kotlin.jvm.internal.q.f(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // m7.u, i7.j
    public final void serialize(l7.f encoder, Array array) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        int iE = e(array);
        k7.f fVar = this.f25029b;
        l7.d dVarY = encoder.y(fVar, iE);
        u(dVarY, array, iE);
        dVarY.d(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final Array l(Builder builder) {
        kotlin.jvm.internal.q.f(builder, "<this>");
        return (Array) builder.a();
    }

    protected abstract void u(l7.d dVar, Array array, int i8);
}
