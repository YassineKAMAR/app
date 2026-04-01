package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static s f23798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static b f23799f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FlutterJNI f23801b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f23800a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f23802c = new c(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FlutterJNI.b f23803d = new a();

    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j8) {
            if (s.this.f23802c == null) {
                return s.this.new c(j8);
            }
            s.this.f23802c.f23807a = j8;
            c cVar = s.this.f23802c;
            s.this.f23802c = null;
            return cVar;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j8) {
            Choreographer.getInstance().postFrameCallback(b(j8));
        }
    }

    @TargetApi(17)
    class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DisplayManager f23805a;

        b(DisplayManager displayManager) {
            this.f23805a = displayManager;
        }

        void a() {
            this.f23805a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i8) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i8) {
            if (i8 == 0) {
                float refreshRate = this.f23805a.getDisplay(0).getRefreshRate();
                s.this.f23800a = (long) (1.0E9d / ((double) refreshRate));
                s.this.f23801b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i8) {
        }
    }

    private class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f23807a;

        c(long j8) {
            this.f23807a = j8;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j8) {
            long jNanoTime = System.nanoTime() - j8;
            s.this.f23801b.onVsync(jNanoTime < 0 ? 0L : jNanoTime, s.this.f23800a, this.f23807a);
            s.this.f23802c = this;
        }
    }

    private s(FlutterJNI flutterJNI) {
        this.f23801b = flutterJNI;
    }

    @TargetApi(17)
    public static s f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f23798e == null) {
            f23798e = new s(flutterJNI);
        }
        if (f23799f == null) {
            s sVar = f23798e;
            Objects.requireNonNull(sVar);
            b bVar = sVar.new b(displayManager);
            f23799f = bVar;
            bVar.a();
        }
        if (f23798e.f23800a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f23798e.f23800a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f23798e;
    }

    public void g() {
        this.f23801b.setAsyncWaitForVsyncDelegate(this.f23803d);
    }
}
