package o7;

import java.util.List;
import k7.j;
import k7.k;
import p7.e;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 implements p7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25364b;

    public q0(boolean z7, String discriminator) {
        kotlin.jvm.internal.q.f(discriminator, "discriminator");
        this.f25363a = z7;
        this.f25364b = discriminator;
    }

    private final void f(k7.f fVar, u6.c<?> cVar) {
        int iF = fVar.f();
        for (int i8 = 0; i8 < iF; i8++) {
            String strG = fVar.g(i8);
            if (kotlin.jvm.internal.q.b(strG, this.f25364b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(k7.f fVar, u6.c<?> cVar) {
        k7.j jVarE = fVar.e();
        if ((jVarE instanceof k7.d) || kotlin.jvm.internal.q.b(jVarE, j.a.f24280a)) {
            throw new IllegalArgumentException("Serializer for " + cVar.b() + " can't be registered as a subclass for polymorphic serialization because its kind " + jVarE + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f25363a) {
            return;
        }
        if (kotlin.jvm.internal.q.b(jVarE, k.b.f24283a) || kotlin.jvm.internal.q.b(jVarE, k.c.f24284a) || (jVarE instanceof k7.e) || (jVarE instanceof j.b)) {
            throw new IllegalArgumentException("Serializer for " + cVar.b() + " of kind " + jVarE + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // p7.e
    public <Base> void a(u6.c<Base> baseClass, p6.l<? super Base, ? extends i7.j<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.q.f(baseClass, "baseClass");
        kotlin.jvm.internal.q.f(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // p7.e
    public <Base> void b(u6.c<Base> baseClass, p6.l<? super String, ? extends i7.a<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.q.f(baseClass, "baseClass");
        kotlin.jvm.internal.q.f(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // p7.e
    public <Base, Sub extends Base> void c(u6.c<Base> baseClass, u6.c<Sub> actualClass, i7.b<Sub> actualSerializer) {
        kotlin.jvm.internal.q.f(baseClass, "baseClass");
        kotlin.jvm.internal.q.f(actualClass, "actualClass");
        kotlin.jvm.internal.q.f(actualSerializer, "actualSerializer");
        k7.f descriptor = actualSerializer.getDescriptor();
        g(descriptor, actualClass);
        if (this.f25363a) {
            return;
        }
        f(descriptor, actualClass);
    }

    @Override // p7.e
    public <T> void d(u6.c<T> cVar, i7.b<T> bVar) {
        e.a.a(this, cVar, bVar);
    }

    @Override // p7.e
    public <T> void e(u6.c<T> kClass, p6.l<? super List<? extends i7.b<?>>, ? extends i7.b<?>> provider) {
        kotlin.jvm.internal.q.f(kClass, "kClass");
        kotlin.jvm.internal.q.f(provider, "provider");
    }
}
