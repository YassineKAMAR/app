package j7;

import e6.a0;
import e6.c0;
import e6.d0;
import e6.f0;
import e6.g0;
import e6.w;
import e6.y;
import i7.b;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import m7.a0;
import m7.b1;
import m7.c1;
import m7.d1;
import m7.e2;
import m7.f2;
import m7.g2;
import m7.h;
import m7.h0;
import m7.i;
import m7.i0;
import m7.j1;
import m7.j2;
import m7.l1;
import m7.m2;
import m7.n2;
import m7.p2;
import m7.q2;
import m7.r;
import m7.r0;
import m7.s0;
import m7.s2;
import m7.t2;
import m7.v2;
import m7.w0;
import m7.w2;
import m7.x2;
import m7.z;
import m7.z1;
import u6.c;
import x6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final b<Character> A(f fVar) {
        q.f(fVar, "<this>");
        return r.f24987a;
    }

    public static final b<Double> B(k kVar) {
        q.f(kVar, "<this>");
        return a0.f24874a;
    }

    public static final b<Float> C(l lVar) {
        q.f(lVar, "<this>");
        return i0.f24937a;
    }

    public static final b<Integer> D(p pVar) {
        q.f(pVar, "<this>");
        return s0.f25011a;
    }

    public static final b<Long> E(s sVar) {
        q.f(sVar, "<this>");
        return c1.f24890a;
    }

    public static final b<Short> F(b0 b0Var) {
        q.f(b0Var, "<this>");
        return f2.f24917a;
    }

    public static final b<String> G(c0 c0Var) {
        q.f(c0Var, "<this>");
        return g2.f24923a;
    }

    public static final b<x6.a> H(a.C0190a c0190a) {
        q.f(c0190a, "<this>");
        return m7.b0.f24881a;
    }

    public static final <T, E extends T> b<E[]> a(c<T> kClass, b<E> elementSerializer) {
        q.f(kClass, "kClass");
        q.f(elementSerializer, "elementSerializer");
        return new z1(kClass, elementSerializer);
    }

    public static final b<boolean[]> b() {
        return h.f24925c;
    }

    public static final b<byte[]> c() {
        return m7.k.f24951c;
    }

    public static final b<char[]> d() {
        return m7.q.f24982c;
    }

    public static final b<double[]> e() {
        return z.f25042c;
    }

    public static final b<float[]> f() {
        return h0.f24926c;
    }

    public static final b<int[]> g() {
        return r0.f24989c;
    }

    public static final <T> b<List<T>> h(b<T> elementSerializer) {
        q.f(elementSerializer, "elementSerializer");
        return new m7.f(elementSerializer);
    }

    public static final b<long[]> i() {
        return b1.f24883c;
    }

    public static final <K, V> b<Map.Entry<K, V>> j(b<K> keySerializer, b<V> valueSerializer) {
        q.f(keySerializer, "keySerializer");
        q.f(valueSerializer, "valueSerializer");
        return new d1(keySerializer, valueSerializer);
    }

    public static final <K, V> b<Map<K, V>> k(b<K> keySerializer, b<V> valueSerializer) {
        q.f(keySerializer, "keySerializer");
        q.f(valueSerializer, "valueSerializer");
        return new w0(keySerializer, valueSerializer);
    }

    public static final <K, V> b<e6.r<K, V>> l(b<K> keySerializer, b<V> valueSerializer) {
        q.f(keySerializer, "keySerializer");
        q.f(valueSerializer, "valueSerializer");
        return new l1(keySerializer, valueSerializer);
    }

    public static final b<short[]> m() {
        return e2.f24913c;
    }

    public static final <A, B, C> b<w<A, B, C>> n(b<A> aSerializer, b<B> bSerializer, b<C> cSerializer) {
        q.f(aSerializer, "aSerializer");
        q.f(bSerializer, "bSerializer");
        q.f(cSerializer, "cSerializer");
        return new j2(aSerializer, bSerializer, cSerializer);
    }

    public static final b<e6.z> o() {
        return m2.f24969c;
    }

    public static final b<e6.b0> p() {
        return p2.f24981c;
    }

    public static final b<d0> q() {
        return s2.f25013c;
    }

    public static final b<g0> r() {
        return v2.f25025c;
    }

    public static final <T> b<T> s(b<T> bVar) {
        q.f(bVar, "<this>");
        return bVar.getDescriptor().c() ? bVar : new j1(bVar);
    }

    public static final b<y> t(y.a aVar) {
        q.f(aVar, "<this>");
        return n2.f24971a;
    }

    public static final b<e6.a0> u(a0.a aVar) {
        q.f(aVar, "<this>");
        return q2.f24985a;
    }

    public static final b<e6.c0> v(c0.a aVar) {
        q.f(aVar, "<this>");
        return t2.f25017a;
    }

    public static final b<f0> w(f0.a aVar) {
        q.f(aVar, "<this>");
        return w2.f25030a;
    }

    public static final b<e6.i0> x(e6.i0 i0Var) {
        q.f(i0Var, "<this>");
        return x2.f25036b;
    }

    public static final b<Boolean> y(kotlin.jvm.internal.c cVar) {
        q.f(cVar, "<this>");
        return i.f24935a;
    }

    public static final b<Byte> z(d dVar) {
        q.f(dVar, "<this>");
        return m7.l.f24959a;
    }
}
