package e3;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f21377a = new h();

    private h() {
    }

    public static e d() {
        return f21377a;
    }

    @Override // e3.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // e3.e
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // e3.e
    public final long c() {
        return System.nanoTime();
    }
}
