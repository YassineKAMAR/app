package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(29)
public class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextureRegistry.ImageTextureEntry f22938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageReader f22939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22940c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22941d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f22942e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageReader.OnImageAvailableListener f22943f = new a();

    class a implements ImageReader.OnImageAvailableListener {
        a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage;
            try {
                imageAcquireLatestImage = imageReader.acquireLatestImage();
            } catch (IllegalStateException e8) {
                g5.b.b("ImageReaderPlatformViewRenderTarget", "New image available but it could not be acquired: " + e8.toString());
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return;
            }
            c.this.f22938a.pushImage(imageAcquireLatestImage);
        }
    }

    public c(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f22938a = imageTextureEntry;
    }

    private void c() {
        if (this.f22939b != null) {
            this.f22938a.pushImage(null);
            this.f22939b.close();
            this.f22939b = null;
        }
    }

    @Override // io.flutter.plugin.platform.o
    public void a(int i8, int i9) {
        if (this.f22939b != null && this.f22940c == i8 && this.f22941d == i9) {
            return;
        }
        c();
        this.f22940c = i8;
        this.f22941d = i9;
        this.f22939b = d();
    }

    protected ImageReader d() {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            return f();
        }
        if (i8 >= 29) {
            return e();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @TargetApi(29)
    protected ImageReader e() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f22940c, this.f22941d, 34, 3, 256L);
        imageReaderNewInstance.setOnImageAvailableListener(this.f22943f, this.f22942e);
        return imageReaderNewInstance;
    }

    @TargetApi(33)
    protected ImageReader f() {
        ImageReader.Builder builder = new ImageReader.Builder(this.f22940c, this.f22941d);
        builder.setMaxImages(3);
        builder.setImageFormat(34);
        builder.setUsage(256L);
        ImageReader imageReaderBuild = builder.build();
        imageReaderBuild.setOnImageAvailableListener(this.f22943f, this.f22942e);
        return imageReaderBuild;
    }

    @Override // io.flutter.plugin.platform.o
    public int getHeight() {
        return this.f22941d;
    }

    @Override // io.flutter.plugin.platform.o
    public long getId() {
        return this.f22938a.id();
    }

    @Override // io.flutter.plugin.platform.o
    public Surface getSurface() {
        return this.f22939b.getSurface();
    }

    @Override // io.flutter.plugin.platform.o
    public int getWidth() {
        return this.f22940c;
    }

    @Override // io.flutter.plugin.platform.o
    public Canvas lockHardwareCanvas() {
        return getSurface().lockHardwareCanvas();
    }

    @Override // io.flutter.plugin.platform.o
    public void release() {
        c();
        this.f22938a = null;
    }

    @Override // io.flutter.plugin.platform.o
    public void unlockCanvasAndPost(Canvas canvas) {
        getSurface().unlockCanvasAndPost(canvas);
    }
}
