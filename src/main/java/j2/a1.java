package j2;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f23909a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f23910b = new AtomicInteger(0);

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f23909a.get(num);
    }
}
