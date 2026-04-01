package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes.dex */
public class l extends SurfaceView implements io.flutter.embedding.engine.renderer.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FlutterRenderer f22658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SurfaceHolder.Callback f22659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f22660g;

    class a implements SurfaceHolder.Callback {
        a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
            g5.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (l.this.f22657d) {
                l.this.j(i9, i10);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            g5.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            l.this.f22655b = true;
            if (l.this.f22657d) {
                l.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            g5.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            l.this.f22655b = false;
            if (l.this.f22657d) {
                l.this.l();
            }
        }
    }

    class b implements io.flutter.embedding.engine.renderer.a {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void e() {
            g5.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            l.this.setAlpha(1.0f);
            if (l.this.f22658e != null) {
                l.this.f22658e.t(this);
            }
        }
    }

    private l(Context context, AttributeSet attributeSet, boolean z7) {
        super(context, attributeSet);
        this.f22655b = false;
        this.f22656c = false;
        this.f22657d = false;
        this.f22659f = new a();
        this.f22660g = new b();
        this.f22654a = z7;
        m();
    }

    public l(Context context, boolean z7) {
        this(context, null, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i8, int i9) {
        if (this.f22658e == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        g5.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i8 + " x " + i9);
        this.f22658e.y(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f22658e == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f22658e.w(getHolder().getSurface(), this.f22656c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        FlutterRenderer flutterRenderer = this.f22658e;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.x();
    }

    private void m() {
        if (this.f22654a) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f22659f);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void a(FlutterRenderer flutterRenderer) {
        g5.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f22658e != null) {
            g5.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f22658e.x();
            this.f22658e.t(this.f22660g);
        }
        this.f22658e = flutterRenderer;
        this.f22657d = true;
        flutterRenderer.i(this.f22660g);
        if (this.f22655b) {
            g5.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f22656c = false;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void b() {
        if (this.f22658e == null) {
            g5.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f22658e = null;
        this.f22656c = true;
        this.f22657d = false;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void c() {
        if (this.f22658e == null) {
            g5.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            g5.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        setAlpha(0.0f);
        this.f22658e.t(this.f22660g);
        this.f22658e = null;
        this.f22657d = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i8 = iArr[0];
        region.op(i8, iArr[1], (getRight() + i8) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f22658e;
    }
}
