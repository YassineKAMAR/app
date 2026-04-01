package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {
    public static final <T> T a(n7.a aVar, String discriminator, n7.t element, i7.a<T> deserializer) {
        kotlin.jvm.internal.q.f(aVar, "<this>");
        kotlin.jvm.internal.q.f(discriminator, "discriminator");
        kotlin.jvm.internal.q.f(element, "element");
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        return (T) new h0(aVar, element, discriminator, deserializer.getDescriptor()).e(deserializer);
    }
}
