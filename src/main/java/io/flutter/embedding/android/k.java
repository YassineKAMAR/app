package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class k extends View implements io.flutter.embedding.engine.renderer.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageReader f22644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Image f22645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f22646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FlutterRenderer f22647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f22648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22649f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22650a;

        static {
            int[] iArr = new int[b.values().length];
            f22650a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22650a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public k(Context context, int i8, int i9, b bVar) {
        this(context, g(i8, i9), bVar);
    }

    k(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f22649f = false;
        this.f22644a = imageReader;
        this.f22648e = bVar;
        h();
    }

    private void e() {
        Image image = this.f22645b;
        if (image != null) {
            image.close();
            this.f22645b = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader g(int i8, int i9) {
        int i10;
        int i11;
        if (i8 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i8));
            i10 = 1;
        } else {
            i10 = i8;
        }
        if (i9 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i9));
            i11 = 1;
        } else {
            i11 = i9;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i10, i11, 1, 3, 768L) : ImageReader.newInstance(i10, i11, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        g5.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(29)
    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f22645b.getHardwareBuffer();
            this.f22646c = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f22645b.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f22645b.getHeight();
        Bitmap bitmap = this.f22646c;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f22646c.getHeight() != height) {
            this.f22646c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f22646c.copyPixelsFromBuffer(buffer);
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void a(FlutterRenderer flutterRenderer) {
        if (a.f22650a[this.f22648e.ordinal()] == 1) {
            flutterRenderer.z(this.f22644a.getSurface());
            flutterRenderer.c(true);
        }
        setAlpha(1.0f);
        this.f22647d = flutterRenderer;
        this.f22649f = true;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void c() {
        if (this.f22649f) {
            setAlpha(0.0f);
            d();
            this.f22646c = null;
            e();
            invalidate();
            this.f22649f = false;
            if (this.f22648e == b.background) {
                this.f22647d.c(false);
            }
        }
    }

    @TargetApi(19)
    public boolean d() {
        if (!this.f22649f) {
            return false;
        }
        Image imageAcquireLatestImage = this.f22644a.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            e();
            this.f22645b = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public void f() {
        this.f22644a.close();
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f22647d;
    }

    public ImageReader getImageReader() {
        return this.f22644a;
    }

    public Surface getSurface() {
        return this.f22644a.getSurface();
    }

    public void j(int i8, int i9) {
        if (this.f22647d == null) {
            return;
        }
        if (i8 == this.f22644a.getWidth() && i9 == this.f22644a.getHeight()) {
            return;
        }
        e();
        f();
        this.f22644a = g(i8, i9);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22645b != null) {
            k();
        }
        Bitmap bitmap = this.f22646c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        if (!(i8 == this.f22644a.getWidth() && i9 == this.f22644a.getHeight()) && this.f22648e == b.background && this.f22649f) {
            j(i8, i9);
            this.f22647d.z(this.f22644a.getSurface());
        }
    }
}
