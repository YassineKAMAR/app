package f0;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<b<?>, Object> f21615a = new LinkedHashMap();

    /* JADX INFO: renamed from: f0.a$a, reason: collision with other inner class name */
    public static final class C0104a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0104a f21616b = new C0104a();

        private C0104a() {
        }
    }

    public interface b<T> {
    }

    public final Map<b<?>, Object> a() {
        return this.f21615a;
    }
}
