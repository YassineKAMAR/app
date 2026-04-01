package m7;

import java.util.ArrayList;
import l7.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h2<Tag> implements l7.e, l7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Tag> f24927a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24928b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends kotlin.jvm.internal.r implements p6.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2<Tag> f24929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i7.a<T> f24930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f24931c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h2<Tag> h2Var, i7.a<T> aVar, T t7) {
            super(0);
            this.f24929a = h2Var;
            this.f24930b = aVar;
            this.f24931c = t7;
        }

        @Override // p6.a
        public final T invoke() {
            return this.f24929a.u() ? (T) this.f24929a.I(this.f24930b, this.f24931c) : (T) this.f24929a.m();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class b<T> extends kotlin.jvm.internal.r implements p6.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2<Tag> f24932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i7.a<T> f24933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f24934c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h2<Tag> h2Var, i7.a<T> aVar, T t7) {
            super(0);
            this.f24932a = h2Var;
            this.f24933b = aVar;
            this.f24934c = t7;
        }

        @Override // p6.a
        public final T invoke() {
            return (T) this.f24932a.I(this.f24933b, this.f24934c);
        }
    }

    private final <E> E Y(Tag tag, p6.a<? extends E> aVar) {
        X(tag);
        E eInvoke = aVar.invoke();
        if (!this.f24928b) {
            W();
        }
        this.f24928b = false;
        return eInvoke;
    }

    @Override // l7.c
    public final char A(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return L(V(descriptor, i8));
    }

    @Override // l7.c
    public int B(k7.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // l7.c
    public final <T> T C(k7.f descriptor, int i8, i7.a<T> deserializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        return (T) Y(V(descriptor, i8), new b(this, deserializer, t7));
    }

    @Override // l7.e
    public final byte D() {
        return K(W());
    }

    @Override // l7.e
    public final short E() {
        return S(W());
    }

    @Override // l7.e
    public final float F() {
        return O(W());
    }

    @Override // l7.e
    public final double G() {
        return M(W());
    }

    @Override // l7.e
    public final int H(k7.f enumDescriptor) {
        kotlin.jvm.internal.q.f(enumDescriptor, "enumDescriptor");
        return N(W(), enumDescriptor);
    }

    protected <T> T I(i7.a<T> deserializer, T t7) {
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        return (T) e(deserializer);
    }

    protected abstract boolean J(Tag tag);

    protected abstract byte K(Tag tag);

    protected abstract char L(Tag tag);

    protected abstract double M(Tag tag);

    protected abstract int N(Tag tag, k7.f fVar);

    protected abstract float O(Tag tag);

    protected l7.e P(Tag tag, k7.f inlineDescriptor) {
        kotlin.jvm.internal.q.f(inlineDescriptor, "inlineDescriptor");
        X(tag);
        return this;
    }

    protected abstract int Q(Tag tag);

    protected abstract long R(Tag tag);

    protected abstract short S(Tag tag);

    protected abstract String T(Tag tag);

    protected final Tag U() {
        return (Tag) f6.w.I(this.f24927a);
    }

    protected abstract Tag V(k7.f fVar, int i8);

    protected final Tag W() {
        ArrayList<Tag> arrayList = this.f24927a;
        Tag tagRemove = arrayList.remove(f6.o.f(arrayList));
        this.f24928b = true;
        return tagRemove;
    }

    protected final void X(Tag tag) {
        this.f24927a.add(tag);
    }

    @Override // l7.e
    public abstract <T> T e(i7.a<T> aVar);

    @Override // l7.e
    public final boolean f() {
        return J(W());
    }

    @Override // l7.e
    public final char g() {
        return L(W());
    }

    @Override // l7.c
    public final long h(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return R(V(descriptor, i8));
    }

    @Override // l7.c
    public final int i(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return Q(V(descriptor, i8));
    }

    @Override // l7.e
    public final int k() {
        return Q(W());
    }

    @Override // l7.c
    public final l7.e l(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return P(V(descriptor, i8), descriptor.i(i8));
    }

    @Override // l7.e
    public final Void m() {
        return null;
    }

    @Override // l7.e
    public final String n() {
        return T(W());
    }

    @Override // l7.e
    public final l7.e o(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return P(W(), descriptor);
    }

    @Override // l7.c
    public final String p(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return T(V(descriptor, i8));
    }

    @Override // l7.e
    public final long q() {
        return R(W());
    }

    @Override // l7.c
    public final byte r(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return K(V(descriptor, i8));
    }

    @Override // l7.c
    public final short t(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return S(V(descriptor, i8));
    }

    @Override // l7.e
    public abstract boolean u();

    @Override // l7.c
    public final float v(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return O(V(descriptor, i8));
    }

    @Override // l7.c
    public final boolean w(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return J(V(descriptor, i8));
    }

    @Override // l7.c
    public final <T> T x(k7.f descriptor, int i8, i7.a<T> deserializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        return (T) Y(V(descriptor, i8), new a(this, deserializer, t7));
    }

    @Override // l7.c
    public boolean y() {
        return c.a.b(this);
    }

    @Override // l7.c
    public final double z(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return M(V(descriptor, i8));
    }
}
