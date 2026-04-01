package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f22802a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Surface f22804c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.flutter.embedding.engine.renderer.a f22809h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f22803b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f22805d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22806e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Handler f22807f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set<WeakReference<TextureRegistry.b>> f22808g = new HashSet();

    @Keep
    final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private Image image;
        private boolean released;

        ImageTextureRegistryEntry(long j8) {
            this.id = j8;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            return image;
        }

        @TargetApi(19)
        protected void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f22807f.post(new f(this.id, FlutterRenderer.this.f22802a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        @TargetApi(19)
        public void pushImage(Image image) {
            Image image2;
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.o(this.id);
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        @TargetApi(19)
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.A(this.id);
        }
    }

    class a implements io.flutter.embedding.engine.renderer.a {
        a() {
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void c() {
            FlutterRenderer.this.f22805d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.a
        public void e() {
            FlutterRenderer.this.f22805d = true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f22811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f22812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f22813c;

        public b(Rect rect, d dVar) {
            this.f22811a = rect;
            this.f22812b = dVar;
            this.f22813c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f22811a = rect;
            this.f22812b = dVar;
            this.f22813c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22818a;

        c(int i8) {
            this.f22818a = i8;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22824a;

        d(int i8) {
            this.f22824a = i8;
        }
    }

    final class e implements TextureRegistry.c, TextureRegistry.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SurfaceTextureWrapper f22826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextureRegistry.b f22828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextureRegistry.a f22829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Runnable f22830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private SurfaceTexture.OnFrameAvailableListener f22831g;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f22829e != null) {
                    e.this.f22829e.a();
                }
            }
        }

        class b implements SurfaceTexture.OnFrameAvailableListener {
            b() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (e.this.f22827c || !FlutterRenderer.this.f22802a.isAttached()) {
                    return;
                }
                e eVar = e.this;
                FlutterRenderer.this.o(eVar.f22825a);
            }
        }

        e(long j8, SurfaceTexture surfaceTexture) {
            a aVar = new a();
            this.f22830f = aVar;
            this.f22831g = new b();
            this.f22825a = j8;
            this.f22826b = new SurfaceTextureWrapper(surfaceTexture, aVar);
            b().setOnFrameAvailableListener(this.f22831g, new Handler());
        }

        @Override // io.flutter.view.TextureRegistry.c
        public void a(TextureRegistry.b bVar) {
            this.f22828d = bVar;
        }

        @Override // io.flutter.view.TextureRegistry.c
        public SurfaceTexture b() {
            return this.f22826b.surfaceTexture();
        }

        @Override // io.flutter.view.TextureRegistry.c
        public void c(TextureRegistry.a aVar) {
            this.f22829e = aVar;
        }

        protected void finalize() throws Throwable {
            try {
                if (this.f22827c) {
                    return;
                }
                FlutterRenderer.this.f22807f.post(new f(this.f22825a, FlutterRenderer.this.f22802a));
            } finally {
                super.finalize();
            }
        }

        public SurfaceTextureWrapper g() {
            return this.f22826b;
        }

        @Override // io.flutter.view.TextureRegistry.c
        public long id() {
            return this.f22825a;
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i8) {
            TextureRegistry.b bVar = this.f22828d;
            if (bVar != null) {
                bVar.onTrimMemory(i8);
            }
        }
    }

    static final class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FlutterJNI f22836b;

        f(long j8, FlutterJNI flutterJNI) {
            this.f22835a = j8;
            this.f22836b = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22836b.isAttached()) {
                g5.b.f("FlutterRenderer", "Releasing a Texture (" + this.f22835a + ").");
                this.f22836b.unregisterTexture(this.f22835a);
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f22837a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22838b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22839c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22840d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22841e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22842f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22843g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22844h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22845i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22846j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22847k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22848l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22849m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22850n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22851o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22852p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public List<b> f22853q = new ArrayList();

        boolean a() {
            return this.f22838b > 0 && this.f22839c > 0 && this.f22837a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f22809h = aVar;
        this.f22802a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(long j8) {
        this.f22802a.unregisterTexture(j8);
    }

    private void k() {
        Iterator<WeakReference<TextureRegistry.b>> it = this.f22808g.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j8) {
        this.f22802a.markTextureFrameAvailable(j8);
    }

    private void q(long j8, TextureRegistry.ImageTextureEntry imageTextureEntry) {
        this.f22802a.registerImageTexture(j8, imageTextureEntry);
    }

    private void s(long j8, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f22802a.registerTexture(j8, surfaceTextureWrapper);
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.ImageTextureEntry a() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.f22803b.getAndIncrement());
        g5.b.f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        q(imageTextureRegistryEntry.id(), imageTextureRegistryEntry);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.c b() {
        g5.b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return r(new SurfaceTexture(0));
    }

    public void c(boolean z7) {
        this.f22806e = z7 ? this.f22806e + 1 : this.f22806e - 1;
        this.f22802a.SetIsRenderingToImageView(this.f22806e > 0);
    }

    public void i(io.flutter.embedding.engine.renderer.a aVar) {
        this.f22802a.addIsDisplayingFlutterUiListener(aVar);
        if (this.f22805d) {
            aVar.e();
        }
    }

    void j(TextureRegistry.b bVar) {
        k();
        this.f22808g.add(new WeakReference<>(bVar));
    }

    public void l(ByteBuffer byteBuffer, int i8) {
        this.f22802a.dispatchPointerDataPacket(byteBuffer, i8);
    }

    public boolean m() {
        return this.f22805d;
    }

    public boolean n() {
        return this.f22802a.getIsSoftwareRenderingEnabled();
    }

    public void p(int i8) {
        Iterator<WeakReference<TextureRegistry.b>> it = this.f22808g.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = it.next().get();
            if (bVar != null) {
                bVar.onTrimMemory(i8);
            } else {
                it.remove();
            }
        }
    }

    public TextureRegistry.c r(SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        e eVar = new e(this.f22803b.getAndIncrement(), surfaceTexture);
        g5.b.f("FlutterRenderer", "New SurfaceTexture ID: " + eVar.id());
        s(eVar.id(), eVar.g());
        j(eVar);
        return eVar;
    }

    public void t(io.flutter.embedding.engine.renderer.a aVar) {
        this.f22802a.removeIsDisplayingFlutterUiListener(aVar);
    }

    public void u(boolean z7) {
        this.f22802a.setSemanticsEnabled(z7);
    }

    public void v(g gVar) {
        if (gVar.a()) {
            g5.b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f22838b + " x " + gVar.f22839c + "\nPadding - L: " + gVar.f22843g + ", T: " + gVar.f22840d + ", R: " + gVar.f22841e + ", B: " + gVar.f22842f + "\nInsets - L: " + gVar.f22847k + ", T: " + gVar.f22844h + ", R: " + gVar.f22845i + ", B: " + gVar.f22846j + "\nSystem Gesture Insets - L: " + gVar.f22851o + ", T: " + gVar.f22848l + ", R: " + gVar.f22849m + ", B: " + gVar.f22849m + "\nDisplay Features: " + gVar.f22853q.size());
            int[] iArr = new int[gVar.f22853q.size() * 4];
            int[] iArr2 = new int[gVar.f22853q.size()];
            int[] iArr3 = new int[gVar.f22853q.size()];
            for (int i8 = 0; i8 < gVar.f22853q.size(); i8++) {
                b bVar = gVar.f22853q.get(i8);
                int i9 = i8 * 4;
                Rect rect = bVar.f22811a;
                iArr[i9] = rect.left;
                iArr[i9 + 1] = rect.top;
                iArr[i9 + 2] = rect.right;
                iArr[i9 + 3] = rect.bottom;
                iArr2[i8] = bVar.f22812b.f22824a;
                iArr3[i8] = bVar.f22813c.f22818a;
            }
            this.f22802a.setViewportMetrics(gVar.f22837a, gVar.f22838b, gVar.f22839c, gVar.f22840d, gVar.f22841e, gVar.f22842f, gVar.f22843g, gVar.f22844h, gVar.f22845i, gVar.f22846j, gVar.f22847k, gVar.f22848l, gVar.f22849m, gVar.f22850n, gVar.f22851o, gVar.f22852p, iArr, iArr2, iArr3);
        }
    }

    public void w(Surface surface, boolean z7) {
        if (this.f22804c != null && !z7) {
            x();
        }
        this.f22804c = surface;
        this.f22802a.onSurfaceCreated(surface);
    }

    public void x() {
        if (this.f22804c != null) {
            this.f22802a.onSurfaceDestroyed();
            if (this.f22805d) {
                this.f22809h.c();
            }
            this.f22805d = false;
            this.f22804c = null;
        }
    }

    public void y(int i8, int i9) {
        this.f22802a.onSurfaceChanged(i8, i9);
    }

    public void z(Surface surface) {
        this.f22804c = surface;
        this.f22802a.onSurfaceWindowChanged(surface);
    }
}
