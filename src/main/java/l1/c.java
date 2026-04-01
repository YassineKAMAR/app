package l1;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class c<T> {
    public static <T> c<T> d(T t7) {
        return new a(null, t7, d.DEFAULT);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}
