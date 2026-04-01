package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class l1<K, V> extends u0<K, V, e6.r<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k7.f f24962c;

    static final class a extends kotlin.jvm.internal.r implements p6.l<k7.a, e6.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i7.b<K> f24963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i7.b<V> f24964b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i7.b<K> bVar, i7.b<V> bVar2) {
            super(1);
            this.f24963a = bVar;
            this.f24964b = bVar2;
        }

        public final void a(k7.a buildClassSerialDescriptor) {
            kotlin.jvm.internal.q.f(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            k7.a.b(buildClassSerialDescriptor, "first", this.f24963a.getDescriptor(), null, false, 12, null);
            k7.a.b(buildClassSerialDescriptor, "second", this.f24964b.getDescriptor(), null, false, 12, null);
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ e6.i0 invoke(k7.a aVar) {
            a(aVar);
            return e6.i0.f21430a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(i7.b<K> keySerializer, i7.b<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.q.f(keySerializer, "keySerializer");
        kotlin.jvm.internal.q.f(valueSerializer, "valueSerializer");
        this.f24962c = k7.i.b("kotlin.Pair", new k7.f[0], new a(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public K a(e6.r<? extends K, ? extends V> rVar) {
        kotlin.jvm.internal.q.f(rVar, "<this>");
        return rVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public V b(e6.r<? extends K, ? extends V> rVar) {
        kotlin.jvm.internal.q.f(rVar, "<this>");
        return rVar.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.u0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e6.r<K, V> c(K k8, V v7) {
        return e6.x.a(k8, v7);
    }

    @Override // i7.b, i7.j, i7.a
    public k7.f getDescriptor() {
        return this.f24962c;
    }
}
