package m7;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;
import k7.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d1<K, V> extends u0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k7.f f24897c;

    private static final class a<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f24898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f24899b;

        public a(K k8, V v7) {
            this.f24898a = k8;
            this.f24899b = v7;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.q.b(getKey(), aVar.getKey()) && kotlin.jvm.internal.q.b(getValue(), aVar.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f24898a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f24899b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return ((getKey() == null ? 0 : getKey().hashCode()) * 31) + (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v7) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + getKey() + ", value=" + getValue() + ')';
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.l<k7.a, e6.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i7.b<K> f24900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i7.b<V> f24901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i7.b<K> bVar, i7.b<V> bVar2) {
            super(1);
            this.f24900a = bVar;
            this.f24901b = bVar2;
        }

        public final void a(k7.a buildSerialDescriptor) {
            kotlin.jvm.internal.q.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
            k7.a.b(buildSerialDescriptor, SubscriberAttributeKt.JSON_NAME_KEY, this.f24900a.getDescriptor(), null, false, 12, null);
            k7.a.b(buildSerialDescriptor, "value", this.f24901b.getDescriptor(), null, false, 12, null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(k7.a aVar) {
            a(aVar);
            return e6.i0.f21430a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(i7.b<K> keySerializer, i7.b<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.q.f(keySerializer, "keySerializer");
        kotlin.jvm.internal.q.f(valueSerializer, "valueSerializer");
        this.f24897c = k7.i.c("kotlin.collections.Map.Entry", k.c.f24284a, new k7.f[0], new b(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public K a(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.q.f(entry, "<this>");
        return entry.getKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public V b(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.q.f(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> c(K k8, V v7) {
        return new a(k8, v7);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24897c;
    }
}
