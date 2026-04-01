package i7;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final <T> a<? extends T> a(m7.b<T> bVar, l7.c decoder, String str) {
        q.f(bVar, "<this>");
        q.f(decoder, "decoder");
        a<? extends T> aVarC = bVar.c(decoder, str);
        if (aVarC != null) {
            return aVarC;
        }
        m7.c.a(str, bVar.e());
        throw new e6.h();
    }

    public static final <T> j<T> b(m7.b<T> bVar, l7.f encoder, T value) {
        q.f(bVar, "<this>");
        q.f(encoder, "encoder");
        q.f(value, "value");
        j<T> jVarD = bVar.d(encoder, value);
        if (jVarD != null) {
            return jVarD;
        }
        m7.c.b(z.b(value.getClass()), bVar.e());
        throw new e6.h();
    }
}
