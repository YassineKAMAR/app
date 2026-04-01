package m7;

import l7.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements i7.b<T> {
    /* JADX INFO: Access modifiers changed from: private */
    public final T b(l7.c cVar) {
        return (T) c.a.c(cVar, getDescriptor(), 1, i7.f.a(this, cVar, cVar.p(getDescriptor(), 0)), null, 8, null);
    }

    public i7.a<? extends T> c(l7.c decoder, String str) {
        kotlin.jvm.internal.q.f(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public i7.j<T> d(l7.f encoder, T value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        return encoder.a().e(e(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i7.a
    public final T deserialize(l7.e decoder) {
        T t7;
        kotlin.jvm.internal.q.f(decoder, "decoder");
        k7.f descriptor = getDescriptor();
        l7.c cVarC = decoder.c(descriptor);
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        if (cVarC.y()) {
            t7 = (T) b(cVarC);
        } else {
            t7 = null;
            while (true) {
                int iS = cVarC.s(getDescriptor());
                if (iS != -1) {
                    if (iS == 0) {
                        yVar.f24325a = (T) cVarC.p(getDescriptor(), iS);
                    } else {
                        if (iS != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) yVar.f24325a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iS);
                            throw new i7.i(sb.toString());
                        }
                        T t8 = yVar.f24325a;
                        if (t8 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                        yVar.f24325a = t8;
                        t7 = (T) c.a.c(cVarC, getDescriptor(), iS, i7.f.a(this, cVarC, (String) t8), null, 8, null);
                    }
                } else {
                    if (t7 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) yVar.f24325a)).toString());
                    }
                    kotlin.jvm.internal.q.d(t7, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                }
            }
        }
        cVarC.d(descriptor);
        return t7;
    }

    public abstract u6.c<T> e();

    @Override // i7.j
    public final void serialize(l7.f encoder, T value) {
        kotlin.jvm.internal.q.f(encoder, "encoder");
        kotlin.jvm.internal.q.f(value, "value");
        i7.j<? super T> jVarB = i7.f.b(this, encoder, value);
        k7.f descriptor = getDescriptor();
        l7.d dVarC = encoder.c(descriptor);
        dVarC.g(getDescriptor(), 0, jVarB.getDescriptor().a());
        k7.f descriptor2 = getDescriptor();
        kotlin.jvm.internal.q.d(jVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarC.l(descriptor2, 1, jVarB, value);
        dVarC.d(descriptor);
    }
}
