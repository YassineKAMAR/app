package m7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class w0<K, V> extends f1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k7.f f25028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i7.b<K> kSerializer, i7.b<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.q.f(kSerializer, "kSerializer");
        kotlin.jvm.internal.q.f(vSerializer, "vSerializer");
        this.f25028c = new v0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // m7.f1, i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f25028c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> a() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.q.f(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(LinkedHashMap<K, V> linkedHashMap, int i8) {
        kotlin.jvm.internal.q.f(linkedHashMap, "<this>");
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
    public LinkedHashMap<K, V> k(Map<K, ? extends V> map) {
        kotlin.jvm.internal.q.f(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map<K, V> l(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.q.f(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
