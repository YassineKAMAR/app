package l7;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, k7.f descriptor) {
            q.f(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, k7.f fVar, int i8, i7.a aVar, Object obj, int i9, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i9 & 8) != 0) {
                obj = null;
            }
            return cVar.C(fVar, i8, aVar, obj);
        }
    }

    char A(k7.f fVar, int i8);

    int B(k7.f fVar);

    <T> T C(k7.f fVar, int i8, i7.a<T> aVar, T t7);

    p7.c a();

    void d(k7.f fVar);

    long h(k7.f fVar, int i8);

    int i(k7.f fVar, int i8);

    e l(k7.f fVar, int i8);

    String p(k7.f fVar, int i8);

    byte r(k7.f fVar, int i8);

    int s(k7.f fVar);

    short t(k7.f fVar, int i8);

    float v(k7.f fVar, int i8);

    boolean w(k7.f fVar, int i8);

    <T> T x(k7.f fVar, int i8, i7.a<T> aVar, T t7);

    boolean y();

    double z(k7.f fVar, int i8);
}
