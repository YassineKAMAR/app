package l5;

import android.content.Context;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.m;
import io.flutter.view.TextureRegistry;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: l5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0144a {
        String a(String str);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.a f24415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f24416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextureRegistry f24417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final m f24418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InterfaceC0144a f24419f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final d f24420g;

        public b(Context context, io.flutter.embedding.engine.a aVar, c cVar, TextureRegistry textureRegistry, m mVar, InterfaceC0144a interfaceC0144a, d dVar) {
            this.f24414a = context;
            this.f24415b = aVar;
            this.f24416c = cVar;
            this.f24417d = textureRegistry;
            this.f24418e = mVar;
            this.f24419f = interfaceC0144a;
            this.f24420g = dVar;
        }

        public Context a() {
            return this.f24414a;
        }

        public c b() {
            return this.f24416c;
        }

        public InterfaceC0144a c() {
            return this.f24419f;
        }

        @Deprecated
        public io.flutter.embedding.engine.a d() {
            return this.f24415b;
        }

        public m e() {
            return this.f24418e;
        }
    }

    void onAttachedToEngine(b bVar);

    void onDetachedFromEngine(b bVar);
}
