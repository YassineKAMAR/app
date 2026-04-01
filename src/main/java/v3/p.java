package v3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p<K, V> extends d<K, V> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final transient o<K, ? extends m<V>> f26924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final transient int f26925b;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<K, Collection<V>> f26926a = g0.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Comparator<? super K> f26927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Comparator<? super V> f26928c;
    }

    p(o<K, ? extends m<V>> oVar, int i8) {
        this.f26924a = oVar;
        this.f26925b = i8;
    }

    @Override // v3.c
    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // v3.c, v3.z
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public o<K, Collection<V>> a() {
        return this.f26924a;
    }

    @Override // v3.c
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // v3.c
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // v3.c
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
