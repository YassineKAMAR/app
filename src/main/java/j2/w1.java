package j2;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.e53;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends e53 {
    public w1(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.e53
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            g2.t.r();
            k2.l(g2.t.q().c(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e8) {
            g2.t.q().u(e8, "AdMobHandler.handleMessage");
        }
    }
}
