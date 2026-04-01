package l7;

import i7.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import l7.c;
import l7.e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e, c {
    @Override // l7.c
    public final char A(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return g();
    }

    @Override // l7.c
    public int B(k7.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // l7.c
    public <T> T C(k7.f descriptor, int i8, i7.a<T> deserializer, T t7) {
        q.f(descriptor, "descriptor");
        q.f(deserializer, "deserializer");
        return (T) I(deserializer, t7);
    }

    @Override // l7.e
    public abstract byte D();

    @Override // l7.e
    public abstract short E();

    @Override // l7.e
    public float F() {
        Object objJ = J();
        q.d(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }

    @Override // l7.e
    public double G() {
        Object objJ = J();
        q.d(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // l7.e
    public int H(k7.f enumDescriptor) {
        q.f(enumDescriptor, "enumDescriptor");
        Object objJ = J();
        q.d(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    public <T> T I(i7.a<T> deserializer, T t7) {
        q.f(deserializer, "deserializer");
        return (T) e(deserializer);
    }

    public Object J() {
        throw new i(z.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // l7.e
    public c c(k7.f descriptor) {
        q.f(descriptor, "descriptor");
        return this;
    }

    @Override // l7.c
    public void d(k7.f descriptor) {
        q.f(descriptor, "descriptor");
    }

    @Override // l7.e
    public <T> T e(i7.a<T> aVar) {
        return (T) e.a.a(this, aVar);
    }

    @Override // l7.e
    public boolean f() {
        Object objJ = J();
        q.d(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // l7.e
    public char g() {
        Object objJ = J();
        q.d(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // l7.c
    public final long h(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return q();
    }

    @Override // l7.c
    public final int i(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return k();
    }

    @Override // l7.e
    public abstract int k();

    @Override // l7.c
    public e l(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return o(descriptor.i(i8));
    }

    @Override // l7.e
    public Void m() {
        return null;
    }

    @Override // l7.e
    public String n() {
        Object objJ = J();
        q.d(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // l7.e
    public e o(k7.f descriptor) {
        q.f(descriptor, "descriptor");
        return this;
    }

    @Override // l7.c
    public final String p(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return n();
    }

    @Override // l7.e
    public abstract long q();

    @Override // l7.c
    public final byte r(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return D();
    }

    @Override // l7.c
    public final short t(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return E();
    }

    @Override // l7.e
    public boolean u() {
        return true;
    }

    @Override // l7.c
    public final float v(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return F();
    }

    @Override // l7.c
    public final boolean w(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return f();
    }

    @Override // l7.c
    public final <T> T x(k7.f descriptor, int i8, i7.a<T> deserializer, T t7) {
        q.f(descriptor, "descriptor");
        q.f(deserializer, "deserializer");
        return (deserializer.getDescriptor().c() || u()) ? (T) I(deserializer, t7) : (T) m();
    }

    @Override // l7.c
    public boolean y() {
        return c.a.b(this);
    }

    @Override // l7.c
    public final double z(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return G();
    }
}
