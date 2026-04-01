package l3;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f24383a;

    public e(Looper looper) {
        super(looper);
        this.f24383a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f24383a = Looper.getMainLooper();
    }
}
