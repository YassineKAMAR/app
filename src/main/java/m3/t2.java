package m3;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24821a;

    public t2(int i8, String str) {
        super(str);
        this.f24821a = i8;
    }

    public t2(int i8, String str, Throwable th) {
        super(str, th);
        this.f24821a = i8;
    }

    public final t3.e a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new t3.e(this.f24821a, getMessage());
    }
}
