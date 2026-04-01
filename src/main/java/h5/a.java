package h5;

import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import s5.c;
import s5.u;

/* JADX INFO: loaded from: classes.dex */
public class a implements s5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FlutterJNI f22390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f22391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h5.c f22392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s5.c f22393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f22394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f22395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f22396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c.a f22397h;

    /* JADX INFO: renamed from: h5.a$a, reason: collision with other inner class name */
    class C0117a implements c.a {
        C0117a() {
        }

        @Override // s5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            a.this.f22395f = u.f26270b.b(byteBuffer);
            if (a.this.f22396g != null) {
                a.this.f22396g.a(a.this.f22395f);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22401c;

        public b(String str, String str2) {
            this.f22399a = str;
            this.f22400b = null;
            this.f22401c = str2;
        }

        public b(String str, String str2, String str3) {
            this.f22399a = str;
            this.f22400b = str2;
            this.f22401c = str3;
        }

        public static b a() {
            j5.d dVarC = g5.a.e().c();
            if (dVarC.k()) {
                return new b(dVarC.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f22399a.equals(bVar.f22399a)) {
                return this.f22401c.equals(bVar.f22401c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f22399a.hashCode() * 31) + this.f22401c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f22399a + ", function: " + this.f22401c + " )";
        }
    }

    private static class c implements s5.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h5.c f22402a;

        private c(h5.c cVar) {
            this.f22402a = cVar;
        }

        /* synthetic */ c(h5.c cVar, C0117a c0117a) {
            this(cVar);
        }

        @Override // s5.c
        public c.InterfaceC0171c a(c.d dVar) {
            return this.f22402a.a(dVar);
        }

        @Override // s5.c
        public /* synthetic */ c.InterfaceC0171c b() {
            return s5.b.a(this);
        }

        @Override // s5.c
        public void c(String str, ByteBuffer byteBuffer) {
            this.f22402a.h(str, byteBuffer, null);
        }

        @Override // s5.c
        public void d(String str, c.a aVar, c.InterfaceC0171c interfaceC0171c) {
            this.f22402a.d(str, aVar, interfaceC0171c);
        }

        @Override // s5.c
        public void e(String str, c.a aVar) {
            this.f22402a.e(str, aVar);
        }

        @Override // s5.c
        public void h(String str, ByteBuffer byteBuffer, c.b bVar) {
            this.f22402a.h(str, byteBuffer, bVar);
        }
    }

    public interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f22394e = false;
        C0117a c0117a = new C0117a();
        this.f22397h = c0117a;
        this.f22390a = flutterJNI;
        this.f22391b = assetManager;
        h5.c cVar = new h5.c(flutterJNI);
        this.f22392c = cVar;
        cVar.e("flutter/isolate", c0117a);
        this.f22393d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f22394e = true;
        }
    }

    @Override // s5.c
    @Deprecated
    public c.InterfaceC0171c a(c.d dVar) {
        return this.f22393d.a(dVar);
    }

    @Override // s5.c
    public /* synthetic */ c.InterfaceC0171c b() {
        return s5.b.a(this);
    }

    @Override // s5.c
    @Deprecated
    public void c(String str, ByteBuffer byteBuffer) {
        this.f22393d.c(str, byteBuffer);
    }

    @Override // s5.c
    @Deprecated
    public void d(String str, c.a aVar, c.InterfaceC0171c interfaceC0171c) {
        this.f22393d.d(str, aVar, interfaceC0171c);
    }

    @Override // s5.c
    @Deprecated
    public void e(String str, c.a aVar) {
        this.f22393d.e(str, aVar);
    }

    @Override // s5.c
    @Deprecated
    public void h(String str, ByteBuffer byteBuffer, c.b bVar) {
        this.f22393d.h(str, byteBuffer, bVar);
    }

    public void j(b bVar, List<String> list) {
        if (this.f22394e) {
            g5.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        b6.e.a("DartExecutor#executeDartEntrypoint");
        try {
            g5.b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f22390a.runBundleAndSnapshotFromLibrary(bVar.f22399a, bVar.f22401c, bVar.f22400b, this.f22391b, list);
            this.f22394e = true;
        } finally {
            b6.e.d();
        }
    }

    public boolean k() {
        return this.f22394e;
    }

    public void l() {
        if (this.f22390a.isAttached()) {
            this.f22390a.notifyLowMemoryWarning();
        }
    }

    public void m() {
        g5.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f22390a.setPlatformMessageHandler(this.f22392c);
    }

    public void n() {
        g5.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f22390a.setPlatformMessageHandler(null);
    }
}
