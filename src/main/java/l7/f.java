package l7;

import i7.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public interface f {

    public static final class a {
        public static d a(f fVar, k7.f descriptor, int i8) {
            q.f(descriptor, "descriptor");
            return fVar.c(descriptor);
        }

        public static void b(f fVar) {
        }

        public static <T> void c(f fVar, j<? super T> serializer, T t7) {
            q.f(serializer, "serializer");
            if (serializer.getDescriptor().c()) {
                fVar.q(serializer, t7);
            } else if (t7 == null) {
                fVar.e();
            } else {
                fVar.r();
                fVar.q(serializer, t7);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(f fVar, j<? super T> serializer, T t7) {
            q.f(serializer, "serializer");
            serializer.serialize(fVar, t7);
        }
    }

    void B(long j8);

    void F(String str);

    p7.c a();

    d c(k7.f fVar);

    void e();

    void h(double d8);

    void i(short s8);

    void j(byte b8);

    void k(boolean z7);

    void o(float f8);

    void p(char c8);

    <T> void q(j<? super T> jVar, T t7);

    void r();

    f t(k7.f fVar);

    void w(k7.f fVar, int i8);

    d y(k7.f fVar, int i8);

    void z(int i8);
}
