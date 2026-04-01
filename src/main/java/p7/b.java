package p7;

import i7.j;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.z;
import m7.o1;
import p6.l;
import p7.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<u6.c<?>, a> f25632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<u6.c<?>, Map<u6.c<?>, i7.b<?>>> f25633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<u6.c<?>, l<?, j<?>>> f25634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<u6.c<?>, Map<String, i7.b<?>>> f25635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<u6.c<?>, l<String, i7.a<?>>> f25636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<u6.c<?>, ? extends a> class2ContextualFactory, Map<u6.c<?>, ? extends Map<u6.c<?>, ? extends i7.b<?>>> polyBase2Serializers, Map<u6.c<?>, ? extends l<?, ? extends j<?>>> polyBase2DefaultSerializerProvider, Map<u6.c<?>, ? extends Map<String, ? extends i7.b<?>>> polyBase2NamedSerializers, Map<u6.c<?>, ? extends l<? super String, ? extends i7.a<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        q.f(class2ContextualFactory, "class2ContextualFactory");
        q.f(polyBase2Serializers, "polyBase2Serializers");
        q.f(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        q.f(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        q.f(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f25632a = class2ContextualFactory;
        this.f25633b = polyBase2Serializers;
        this.f25634c = polyBase2DefaultSerializerProvider;
        this.f25635d = polyBase2NamedSerializers;
        this.f25636e = polyBase2DefaultDeserializerProvider;
    }

    @Override // p7.c
    public void a(e collector) {
        q.f(collector, "collector");
        for (Map.Entry<u6.c<?>, a> entry : this.f25632a.entrySet()) {
            u6.c<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0157a) {
                q.d(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                i7.b<?> bVarB = ((a.C0157a) value).b();
                q.d(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.d(key, bVarB);
            } else if (value instanceof a.b) {
                collector.e(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<u6.c<?>, Map<u6.c<?>, i7.b<?>>> entry2 : this.f25633b.entrySet()) {
            u6.c<?> key2 = entry2.getKey();
            for (Map.Entry<u6.c<?>, i7.b<?>> entry3 : entry2.getValue().entrySet()) {
                u6.c<?> key3 = entry3.getKey();
                i7.b<?> value2 = entry3.getValue();
                q.d(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                q.d(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                q.d(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.c(key2, key3, value2);
            }
        }
        for (Map.Entry<u6.c<?>, l<?, j<?>>> entry4 : this.f25634c.entrySet()) {
            u6.c<?> key4 = entry4.getKey();
            l<?, j<?>> value3 = entry4.getValue();
            q.d(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            q.d(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.a(key4, (l) d0.a(value3, 1));
        }
        for (Map.Entry<u6.c<?>, l<String, i7.a<?>>> entry5 : this.f25636e.entrySet()) {
            u6.c<?> key5 = entry5.getKey();
            l<String, i7.a<?>> value4 = entry5.getValue();
            q.d(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            q.d(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.b(key5, (l) d0.a(value4, 1));
        }
    }

    @Override // p7.c
    public <T> i7.b<T> b(u6.c<T> kClass, List<? extends i7.b<?>> typeArgumentsSerializers) {
        q.f(kClass, "kClass");
        q.f(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f25632a.get(kClass);
        i7.b<?> bVarA = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (bVarA instanceof i7.b) {
            return (i7.b<T>) bVarA;
        }
        return null;
    }

    @Override // p7.c
    public <T> i7.a<? extends T> d(u6.c<? super T> baseClass, String str) {
        q.f(baseClass, "baseClass");
        Map<String, i7.b<?>> map = this.f25635d.get(baseClass);
        i7.b<?> bVar = map != null ? map.get(str) : null;
        if (!(bVar instanceof i7.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<String, i7.a<?>> lVar = this.f25636e.get(baseClass);
        l<String, i7.a<?>> lVar2 = d0.c(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (i7.a) lVar2.invoke(str);
        }
        return null;
    }

    @Override // p7.c
    public <T> j<T> e(u6.c<? super T> baseClass, T value) {
        q.f(baseClass, "baseClass");
        q.f(value, "value");
        if (!o1.i(value, baseClass)) {
            return null;
        }
        Map<u6.c<?>, i7.b<?>> map = this.f25633b.get(baseClass);
        i7.b<?> bVar = map != null ? map.get(z.b(value.getClass())) : null;
        if (!(bVar instanceof j)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<?, j<?>> lVar = this.f25634c.get(baseClass);
        l<?, j<?>> lVar2 = d0.c(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (j) lVar2.invoke(value);
        }
        return null;
    }
}
