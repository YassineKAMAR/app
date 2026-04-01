package m7;

import java.util.ArrayList;
import l7.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i2<Tag> implements l7.f, l7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Tag> f24941a = new ArrayList<>();

    private final boolean G(k7.f fVar, int i8) {
        Y(W(fVar, i8));
        return true;
    }

    @Override // l7.f
    public final void B(long j8) {
        Q(X(), j8);
    }

    @Override // l7.d
    public final void C(k7.f descriptor, int i8, boolean z7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        I(W(descriptor, i8), z7);
    }

    @Override // l7.d
    public final void D(k7.f descriptor, int i8, int i9) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        P(W(descriptor, i8), i9);
    }

    @Override // l7.d
    public final l7.f E(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return O(W(descriptor, i8), descriptor.i(i8));
    }

    @Override // l7.f
    public final void F(String value) {
        kotlin.jvm.internal.q.f(value, "value");
        S(X(), value);
    }

    public <T> void H(i7.j<? super T> jVar, T t7) {
        f.a.c(this, jVar, t7);
    }

    protected abstract void I(Tag tag, boolean z7);

    protected abstract void J(Tag tag, byte b8);

    protected abstract void K(Tag tag, char c8);

    protected abstract void L(Tag tag, double d8);

    protected abstract void M(Tag tag, k7.f fVar, int i8);

    protected abstract void N(Tag tag, float f8);

    protected l7.f O(Tag tag, k7.f inlineDescriptor) {
        kotlin.jvm.internal.q.f(inlineDescriptor, "inlineDescriptor");
        Y(tag);
        return this;
    }

    protected abstract void P(Tag tag, int i8);

    protected abstract void Q(Tag tag, long j8);

    protected abstract void R(Tag tag, short s8);

    protected abstract void S(Tag tag, String str);

    protected abstract void T(k7.f fVar);

    protected final Tag U() {
        return (Tag) f6.w.H(this.f24941a);
    }

    protected final Tag V() {
        return (Tag) f6.w.I(this.f24941a);
    }

    protected abstract Tag W(k7.f fVar, int i8);

    protected final Tag X() {
        if (!(!this.f24941a.isEmpty())) {
            throw new i7.i("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f24941a;
        return arrayList.remove(f6.o.f(arrayList));
    }

    protected final void Y(Tag tag) {
        this.f24941a.add(tag);
    }

    @Override // l7.d
    public final void d(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        if (!this.f24941a.isEmpty()) {
            X();
        }
        T(descriptor);
    }

    @Override // l7.d
    public <T> void f(k7.f descriptor, int i8, i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(serializer, "serializer");
        if (G(descriptor, i8)) {
            H(serializer, t7);
        }
    }

    @Override // l7.d
    public final void g(k7.f descriptor, int i8, String value) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(value, "value");
        S(W(descriptor, i8), value);
    }

    @Override // l7.f
    public final void h(double d8) {
        L(X(), d8);
    }

    @Override // l7.f
    public final void i(short s8) {
        R(X(), s8);
    }

    @Override // l7.f
    public final void j(byte b8) {
        J(X(), b8);
    }

    @Override // l7.f
    public final void k(boolean z7) {
        I(X(), z7);
    }

    @Override // l7.d
    public <T> void l(k7.f descriptor, int i8, i7.j<? super T> serializer, T t7) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        kotlin.jvm.internal.q.f(serializer, "serializer");
        if (G(descriptor, i8)) {
            q(serializer, t7);
        }
    }

    @Override // l7.d
    public final void m(k7.f descriptor, int i8, long j8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        Q(W(descriptor, i8), j8);
    }

    @Override // l7.d
    public final void n(k7.f descriptor, int i8, double d8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        L(W(descriptor, i8), d8);
    }

    @Override // l7.f
    public final void o(float f8) {
        N(X(), f8);
    }

    @Override // l7.f
    public final void p(char c8) {
        K(X(), c8);
    }

    @Override // l7.f
    public abstract <T> void q(i7.j<? super T> jVar, T t7);

    @Override // l7.d
    public final void s(k7.f descriptor, int i8, short s8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        R(W(descriptor, i8), s8);
    }

    @Override // l7.f
    public final l7.f t(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return O(X(), descriptor);
    }

    @Override // l7.d
    public final void u(k7.f descriptor, int i8, float f8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        N(W(descriptor, i8), f8);
    }

    @Override // l7.d
    public final void v(k7.f descriptor, int i8, byte b8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        J(W(descriptor, i8), b8);
    }

    @Override // l7.f
    public final void w(k7.f enumDescriptor, int i8) {
        kotlin.jvm.internal.q.f(enumDescriptor, "enumDescriptor");
        M(X(), enumDescriptor, i8);
    }

    @Override // l7.d
    public final void x(k7.f descriptor, int i8, char c8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        K(W(descriptor, i8), c8);
    }

    @Override // l7.f
    public l7.d y(k7.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // l7.f
    public final void z(int i8) {
        P(X(), i8);
    }
}
