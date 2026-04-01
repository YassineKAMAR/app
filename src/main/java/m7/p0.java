package m7;

import m7.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements j0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i7.b<T> f24979a;

        a(i7.b<T> bVar) {
            this.f24979a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m7.j0
        public i7.b<?>[] childSerializers() {
            return new i7.b[]{this.f24979a};
        }

        @Override // i7.a
        public T deserialize(l7.e decoder) {
            kotlin.jvm.internal.q.f(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // i7.b, i7.j, i7.a
        public k7.f getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // i7.j
        public void serialize(l7.f encoder, T t7) {
            kotlin.jvm.internal.q.f(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // m7.j0
        public i7.b<?>[] typeParametersSerializers() {
            return j0.a.a(this);
        }
    }

    public static final <T> k7.f a(String name, i7.b<T> primitiveSerializer) {
        kotlin.jvm.internal.q.f(name, "name");
        kotlin.jvm.internal.q.f(primitiveSerializer, "primitiveSerializer");
        return new o0(name, new a(primitiveSerializer));
    }
}
