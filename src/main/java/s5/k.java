package s5;

import java.nio.ByteBuffer;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f26254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f26256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0171c f26257d;

    private final class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f26258a;

        /* JADX INFO: renamed from: s5.k$a$a, reason: collision with other inner class name */
        class C0173a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.b f26260a;

            C0173a(c.b bVar) {
                this.f26260a = bVar;
            }

            @Override // s5.k.d
            public void a(Object obj) {
                this.f26260a.a(k.this.f26256c.c(obj));
            }

            @Override // s5.k.d
            public void b(String str, String str2, Object obj) {
                this.f26260a.a(k.this.f26256c.e(str, str2, obj));
            }

            @Override // s5.k.d
            public void c() {
                this.f26260a.a(null);
            }
        }

        a(c cVar) {
            this.f26258a = cVar;
        }

        @Override // s5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f26258a.onMethodCall(k.this.f26256c.b(byteBuffer), new C0173a(bVar));
            } catch (RuntimeException e8) {
                g5.b.c("MethodChannel#" + k.this.f26255b, "Failed to handle method call", e8);
                bVar.a(k.this.f26256c.d("error", e8.getMessage(), null, g5.b.d(e8)));
            }
        }
    }

    private final class b implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f26262a;

        b(d dVar) {
            this.f26262a = dVar;
        }

        @Override // s5.c.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f26262a.c();
                } else {
                    try {
                        this.f26262a.a(k.this.f26256c.f(byteBuffer));
                    } catch (e e8) {
                        this.f26262a.b(e8.f26248a, e8.getMessage(), e8.f26249b);
                    }
                }
            } catch (RuntimeException e9) {
                g5.b.c("MethodChannel#" + k.this.f26255b, "Failed to handle method call result", e9);
            }
        }
    }

    public interface c {
        void onMethodCall(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(s5.c cVar, String str) {
        this(cVar, str, t.f26267b);
    }

    public k(s5.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public k(s5.c cVar, String str, l lVar, c.InterfaceC0171c interfaceC0171c) {
        this.f26254a = cVar;
        this.f26255b = str;
        this.f26256c = lVar;
        this.f26257d = interfaceC0171c;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f26254a.h(this.f26255b, this.f26256c.a(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f26257d != null) {
            this.f26254a.d(this.f26255b, cVar != null ? new a(cVar) : null, this.f26257d);
        } else {
            this.f26254a.e(this.f26255b, cVar != null ? new a(cVar) : null);
        }
    }
}
