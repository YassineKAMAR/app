package x3;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface d<V> extends Future<V> {
    void c(Runnable runnable, Executor executor);
}
