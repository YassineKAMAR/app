package h5;

import android.os.Handler;
import android.os.Looper;
import h5.c;

/* JADX INFO: loaded from: classes.dex */
public class g implements c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f22434a = b6.a.a(Looper.getMainLooper());

    @Override // h5.c.d
    public void a(Runnable runnable) {
        this.f22434a.post(runnable);
    }
}
