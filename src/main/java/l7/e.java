package l7;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static final class a {
        public static <T> T a(e eVar, i7.a<T> deserializer) {
            q.f(deserializer, "deserializer");
            return deserializer.deserialize(eVar);
        }
    }

    byte D();

    short E();

    float F();

    double G();

    int H(k7.f fVar);

    c c(k7.f fVar);

    <T> T e(i7.a<T> aVar);

    boolean f();

    char g();

    int k();

    Void m();

    String n();

    e o(k7.f fVar);

    long q();

    boolean u();
}
