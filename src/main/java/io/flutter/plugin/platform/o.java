package io.flutter.plugin.platform;

import android.graphics.Canvas;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public interface o {
    void a(int i8, int i9);

    int getHeight();

    long getId();

    Surface getSurface();

    int getWidth();

    Canvas lockHardwareCanvas();

    void release();

    void unlockCanvasAndPost(Canvas canvas);
}
