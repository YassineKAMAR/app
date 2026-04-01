package u3;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g<T> implements Serializable {
    g() {
    }

    public static <T> g<T> a() {
        return a.e();
    }

    public static <T> g<T> d(T t7) {
        return new i(h.i(t7));
    }

    public abstract T b();

    public abstract boolean c();
}
