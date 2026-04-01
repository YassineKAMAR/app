package o7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class u {
    public static final <K, V> Map<K, V> a(int i8) {
        return new ConcurrentHashMap(i8);
    }
}
