package m7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l0<K, V> extends f1<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k7.f f24961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i7.b<K> kSerializer, i7.b<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.q.f(kSerializer, "kSerializer");
        kotlin.jvm.internal.q.f(vSerializer, "vSerializer");
        this.f24961c = new k0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // m7.f1, i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24961c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> a() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap<K, V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        return map.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap<K, V> map, int i8) {
        kotlin.jvm.internal.q.f(map, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> d(Map<K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map<K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> k(Map<K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(HashMap<K, V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        return map;
    }
}
