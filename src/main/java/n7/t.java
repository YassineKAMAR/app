package n7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import o7.v0;

/* JADX INFO: loaded from: classes2.dex */
@i7.h(with = u.class)
public final class t extends h implements Map<String, h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f25213c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, h> f25214b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    static final class b extends kotlin.jvm.internal.r implements p6.l<Map.Entry<? extends String, ? extends h>, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25215a = new b();

        b() {
            super(1);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, ? extends h> entry) {
            kotlin.jvm.internal.q.f(entry, "<name for destructuring parameter 0>");
            String key = entry.getKey();
            h value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            v0.c(sb, key);
            sb.append(':');
            sb.append(value);
            String string = sb.toString();
            kotlin.jvm.internal.q.e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Map<String, ? extends h> content) {
        super(null);
        kotlin.jvm.internal.q.f(content, "content");
        this.f25214b = content;
    }

    public boolean a(String key) {
        kotlin.jvm.internal.q.f(key, "key");
        return this.f25214b.containsKey(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h compute(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h computeIfAbsent(String str, Function<? super String, ? extends h> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h computeIfPresent(String str, BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return a((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof h) {
            return g((h) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, h>> entrySet() {
        return n();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return kotlin.jvm.internal.q.b(this.f25214b, obj);
    }

    public boolean g(h value) {
        kotlin.jvm.internal.q.f(value, "value");
        return this.f25214b.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ h get(Object obj) {
        if (obj instanceof String) {
            return i((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f25214b.hashCode();
    }

    public h i(String key) {
        kotlin.jvm.internal.q.f(key, "key");
        return this.f25214b.get(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f25214b.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return p();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h merge(String str, h hVar, BiFunction<? super h, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<Map.Entry<String, h>> n() {
        return this.f25214b.entrySet();
    }

    public Set<String> p() {
        return this.f25214b.keySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h put(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends h> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h putIfAbsent(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ h replace(String str, h hVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, h hVar, h hVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super h, ? extends h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return u();
    }

    public String toString() {
        return f6.w.G(this.f25214b.entrySet(), com.amazon.a.a.o.b.f.f3942a, "{", "}", 0, null, b.f25215a, 24, null);
    }

    public int u() {
        return this.f25214b.size();
    }

    public Collection<h> v() {
        return this.f25214b.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<h> values() {
        return v();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public h remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
