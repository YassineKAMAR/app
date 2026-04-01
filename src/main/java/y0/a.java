package y0;

import android.os.Handler;
import android.os.Looper;
import x0.q;

/* JADX INFO: loaded from: classes.dex */
public class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f27341a = androidx.core.os.e.a(Looper.getMainLooper());

    @Override // x0.q
    public void a(long j8, Runnable runnable) {
        this.f27341a.postDelayed(runnable, j8);
    }

    @Override // x0.q
    public void b(Runnable runnable) {
        this.f27341a.removeCallbacks(runnable);
    }
}
