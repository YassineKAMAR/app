package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(26)
public class y implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextureRegistry.c f23008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SurfaceTexture f23009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Surface f23010d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextureRegistry.a f23013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextureRegistry.b f23015i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f23007a = new AtomicLong(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23011e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23012f = 0;

    class a implements TextureRegistry.a {
        a() {
        }

        @Override // io.flutter.view.TextureRegistry.a
        public void a() {
            if (Build.VERSION.SDK_INT == 29) {
                y.this.f23007a.decrementAndGet();
            }
        }
    }

    class b implements TextureRegistry.b {
        b() {
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i8) {
            if (i8 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            y.this.f23014h = true;
        }
    }

    public y(TextureRegistry.c cVar) {
        a aVar = new a();
        this.f23013g = aVar;
        this.f23014h = false;
        b bVar = new b();
        this.f23015i = bVar;
        if (Build.VERSION.SDK_INT < 23) {
            throw new UnsupportedOperationException("Platform views cannot be displayed below API level 23You can prevent this issue by setting `minSdkVersion: 23` in build.gradle.");
        }
        this.f23008b = cVar;
        this.f23009c = cVar.b();
        cVar.c(aVar);
        cVar.a(bVar);
        e();
    }

    private void e() {
        int i8;
        int i9 = this.f23011e;
        if (i9 > 0 && (i8 = this.f23012f) > 0) {
            this.f23009c.setDefaultBufferSize(i9, i8);
        }
        Surface surface = this.f23010d;
        if (surface != null) {
            surface.release();
            this.f23010d = null;
        }
        this.f23010d = d();
        Canvas canvasLockHardwareCanvas = lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        } finally {
            unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    private void f() {
        if (Build.VERSION.SDK_INT == 29) {
            this.f23007a.incrementAndGet();
        }
    }

    private void g() {
        if (this.f23014h) {
            Surface surface = this.f23010d;
            if (surface != null) {
                surface.release();
                this.f23010d = null;
            }
            this.f23010d = d();
            this.f23014h = false;
        }
    }

    @Override // io.flutter.plugin.platform.o
    public void a(int i8, int i9) {
        this.f23011e = i8;
        this.f23012f = i9;
        SurfaceTexture surfaceTexture = this.f23009c;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i8, i9);
        }
    }

    protected Surface d() {
        return new Surface(this.f23009c);
    }

    @Override // io.flutter.plugin.platform.o
    public int getHeight() {
        return this.f23012f;
    }

    @Override // io.flutter.plugin.platform.o
    public long getId() {
        return this.f23008b.id();
    }

    @Override // io.flutter.plugin.platform.o
    public Surface getSurface() {
        g();
        return this.f23010d;
    }

    @Override // io.flutter.plugin.platform.o
    public int getWidth() {
        return this.f23011e;
    }

    @Override // io.flutter.plugin.platform.o
    public Canvas lockHardwareCanvas() {
        g();
        if (Build.VERSION.SDK_INT == 29 && this.f23007a.get() > 0) {
            return null;
        }
        SurfaceTexture surfaceTexture = this.f23009c;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            g5.b.b("SurfaceTexturePlatformViewRenderTarget", "Invalid RenderTarget: null or already released SurfaceTexture");
            return null;
        }
        f();
        return this.f23010d.lockHardwareCanvas();
    }

    @Override // io.flutter.plugin.platform.o
    public void release() {
        this.f23009c = null;
        Surface surface = this.f23010d;
        if (surface != null) {
            surface.release();
            this.f23010d = null;
        }
    }

    @Override // io.flutter.plugin.platform.o
    public void unlockCanvasAndPost(Canvas canvas) {
        this.f23010d.unlockCanvasAndPost(canvas);
    }
}
