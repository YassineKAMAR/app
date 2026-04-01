package i4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f22552b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Class<?>, Object> f22554b = null;

        b(String str) {
            this.f22553a = str;
        }

        public c a() {
            return new c(this.f22553a, this.f22554b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f22554b)));
        }

        public <T extends Annotation> b b(T t7) {
            if (this.f22554b == null) {
                this.f22554b = new HashMap();
            }
            this.f22554b.put(t7.annotationType(), t7);
            return this;
        }
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f22551a = str;
        this.f22552b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f22551a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.f22552b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22551a.equals(cVar.f22551a) && this.f22552b.equals(cVar.f22552b);
    }

    public int hashCode() {
        return (this.f22551a.hashCode() * 31) + this.f22552b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f22551a + ", properties=" + this.f22552b.values() + "}";
    }
}
