package kotlin.jvm.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final <T> Iterator<T> a(T[] array) {
        q.f(array, "array");
        return new a(array);
    }
}
