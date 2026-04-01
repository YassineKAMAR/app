package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* JADX INFO: loaded from: classes.dex */
public class m extends TextureView implements io.flutter.embedding.engine.renderer.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FlutterRenderer f22666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f22667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextureView.SurfaceTextureListener f22668f;

    class a implements TextureView.SurfaceTextureListener {
        a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
            g5.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            m.this.f22663a = true;
            if (m.this.f22664b) {
                m.this.l();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            g5.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            m.this.f22663a = false;
            if (m.this.f22664b) {
                m.this.m();
            }
            if (m.this.f22667e == null) {
                return true;
            }
            m.this.f22667e.release();
            m.this.f22667e = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
            g5.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (m.this.f22664b) {
                m.this.k(i8, i9);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public m(Context context) {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22663a = false;
        this.f22664b = false;
        this.f22665c = false;
        this.f22668f = new a();
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i8, int i9) {
        if (this.f22666d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        g5.b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i8 + " x " + i9);
        this.f22666d.y(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f22666d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f22667e;
        if (surface != null) {
            surface.release();
            this.f22667e = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f22667e = surface2;
        this.f22666d.w(surface2, this.f22665c);
        this.f22665c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        FlutterRenderer flutterRenderer = this.f22666d;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.x();
        Surface surface = this.f22667e;
        if (surface != null) {
            surface.release();
            this.f22667e = null;
        }
    }

    private void n() {
        setSurfaceTextureListener(this.f22668f);
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void a(FlutterRenderer flutterRenderer) {
        g5.b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f22666d != null) {
            g5.b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f22666d.x();
        }
        this.f22666d = flutterRenderer;
        this.f22664b = true;
        if (this.f22663a) {
            g5.b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void b() {
        if (this.f22666d == null) {
            g5.b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f22666d = null;
        this.f22665c = true;
        this.f22664b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public void c() {
        if (this.f22666d == null) {
            g5.b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            g5.b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        this.f22666d = null;
        this.f22664b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.b
    public FlutterRenderer getAttachedRenderer() {
        return this.f22666d;
    }

    public void setRenderSurface(Surface surface) {
        this.f22667e = surface;
    }
}
