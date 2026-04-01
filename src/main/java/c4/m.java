package c4;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class m {
    public static m a(long j8, long j9, long j10) {
        return new a(j8, j9, j10);
    }

    public static m e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
