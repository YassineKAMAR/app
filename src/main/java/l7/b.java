package l7;

import i7.i;
import i7.j;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import l7.d;
import l7.f;
import m7.i1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements f, d {
    @Override // l7.d
    public boolean A(k7.f fVar, int i8) {
        return d.a.a(this, fVar, i8);
    }

    @Override // l7.f
    public abstract void B(long j8);

    @Override // l7.d
    public final void C(k7.f descriptor, int i8, boolean z7) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            k(z7);
        }
    }

    @Override // l7.d
    public final void D(k7.f descriptor, int i8, int i9) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            z(i9);
        }
    }

    @Override // l7.d
    public final f E(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return G(descriptor, i8) ? t(descriptor.i(i8)) : i1.f24939a;
    }

    @Override // l7.f
    public void F(String value) {
        q.f(value, "value");
        I(value);
    }

    public boolean G(k7.f descriptor, int i8) {
        q.f(descriptor, "descriptor");
        return true;
    }

    public <T> void H(j<? super T> jVar, T t7) {
        f.a.c(this, jVar, t7);
    }

    public void I(Object value) {
        q.f(value, "value");
        throw new i("Non-serializable " + z.b(value.getClass()) + " is not supported by " + z.b(getClass()) + " encoder");
    }

    @Override // l7.f
    public d c(k7.f descriptor) {
        q.f(descriptor, "descriptor");
        return this;
    }

    @Override // l7.d
    public void d(k7.f descriptor) {
        q.f(descriptor, "descriptor");
    }

    @Override // l7.f
    public void e() {
        throw new i("'null' is not supported by default");
    }

    @Override // l7.d
    public <T> void f(k7.f descriptor, int i8, j<? super T> serializer, T t7) {
        q.f(descriptor, "descriptor");
        q.f(serializer, "serializer");
        if (G(descriptor, i8)) {
            H(serializer, t7);
        }
    }

    @Override // l7.d
    public final void g(k7.f descriptor, int i8, String value) {
        q.f(descriptor, "descriptor");
        q.f(value, "value");
        if (G(descriptor, i8)) {
            F(value);
        }
    }

    @Override // l7.f
    public void h(double d8) {
        I(Double.valueOf(d8));
    }

    @Override // l7.f
    public abstract void i(short s8);

    @Override // l7.f
    public abstract void j(byte b8);

    @Override // l7.f
    public void k(boolean z7) {
        I(Boolean.valueOf(z7));
    }

    @Override // l7.d
    public <T> void l(k7.f descriptor, int i8, j<? super T> serializer, T t7) {
        q.f(descriptor, "descriptor");
        q.f(serializer, "serializer");
        if (G(descriptor, i8)) {
            q(serializer, t7);
        }
    }

    @Override // l7.d
    public final void m(k7.f descriptor, int i8, long j8) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            B(j8);
        }
    }

    @Override // l7.d
    public final void n(k7.f descriptor, int i8, double d8) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            h(d8);
        }
    }

    @Override // l7.f
    public void o(float f8) {
        I(Float.valueOf(f8));
    }

    @Override // l7.f
    public void p(char c8) {
        I(Character.valueOf(c8));
    }

    @Override // l7.f
    public <T> void q(j<? super T> jVar, T t7) {
        f.a.d(this, jVar, t7);
    }

    @Override // l7.f
    public void r() {
        f.a.b(this);
    }

    @Override // l7.d
    public final void s(k7.f descriptor, int i8, short s8) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            i(s8);
        }
    }

    @Override // l7.f
    public f t(k7.f descriptor) {
        q.f(descriptor, "descriptor");
        return this;
    }

    @Override // l7.d
    public final void u(k7.f descriptor, int i8, float f8) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            o(f8);
        }
    }

    @Override // l7.d
    public final void v(k7.f descriptor, int i8, byte b8) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            j(b8);
        }
    }

    @Override // l7.f
    public void w(k7.f enumDescriptor, int i8) {
        q.f(enumDescriptor, "enumDescriptor");
        I(Integer.valueOf(i8));
    }

    @Override // l7.d
    public final void x(k7.f descriptor, int i8, char c8) {
        q.f(descriptor, "descriptor");
        if (G(descriptor, i8)) {
            p(c8);
        }
    }

    @Override // l7.f
    public d y(k7.f fVar, int i8) {
        return f.a.a(this, fVar, i8);
    }

    @Override // l7.f
    public abstract void z(int i8);
}
