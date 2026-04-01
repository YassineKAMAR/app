package j2;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23945a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23946b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    private final synchronized boolean f() {
        return this.f23946b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f23946b;
    }

    public final synchronized void c(boolean z7) {
        this.f23945a = z7;
    }

    public final synchronized void d(float f8) {
        this.f23946b = f8;
    }

    public final synchronized boolean e() {
        return this.f23945a;
    }
}
