package s5;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s5.c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s5.c f26239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f26241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.InterfaceC0171c f26242d;

    public interface b {
        void a(Object obj);
    }

    private final class c implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0172d f26243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference<b> f26244b = new AtomicReference<>(null);

        private final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final AtomicBoolean f26246a;

            private a() {
                this.f26246a = new AtomicBoolean(false);
            }

            @Override // s5.d.b
            public void a(Object obj) {
                if (this.f26246a.get() || c.this.f26244b.get() != this) {
                    return;
                }
                d.this.f26239a.c(d.this.f26240b, d.this.f26241c.c(obj));
            }
        }

        c(InterfaceC0172d interfaceC0172d) {
            this.f26243a = interfaceC0172d;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer byteBufferE;
            if (this.f26244b.getAndSet(null) != null) {
                try {
                    this.f26243a.b(obj);
                    bVar.a(d.this.f26241c.c(null));
                    return;
                } catch (RuntimeException e8) {
                    g5.b.c("EventChannel#" + d.this.f26240b, "Failed to close event stream", e8);
                    byteBufferE = d.this.f26241c.e("error", e8.getMessage(), null);
                }
            } else {
                byteBufferE = d.this.f26241c.e("error", "No active stream to cancel", null);
            }
            bVar.a(byteBufferE);
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f26244b.getAndSet(aVar) != null) {
                try {
                    this.f26243a.b(null);
                } catch (RuntimeException e8) {
                    g5.b.c("EventChannel#" + d.this.f26240b, "Failed to close existing event stream", e8);
                }
            }
            try {
                this.f26243a.c(obj, aVar);
                bVar.a(d.this.f26241c.c(null));
            } catch (RuntimeException e9) {
                this.f26244b.set(null);
                g5.b.c("EventChannel#" + d.this.f26240b, "Failed to open event stream", e9);
                bVar.a(d.this.f26241c.e("error", e9.getMessage(), null));
            }
        }

        @Override // s5.c.a
        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j jVarB = d.this.f26241c.b(byteBuffer);
            if (jVarB.f26252a.equals("listen")) {
                d(jVarB.f26253b, bVar);
            } else if (jVarB.f26252a.equals("cancel")) {
                c(jVarB.f26253b, bVar);
            } else {
                bVar.a(null);
            }
        }
    }

    /* JADX INFO: renamed from: s5.d$d, reason: collision with other inner class name */
    public interface InterfaceC0172d {
        void b(Object obj);

        void c(Object obj, b bVar);
    }

    public d(s5.c cVar, String str) {
        this(cVar, str, t.f26267b);
    }

    public d(s5.c cVar, String str, l lVar) {
        this(cVar, str, lVar, null);
    }

    public d(s5.c cVar, String str, l lVar, c.InterfaceC0171c interfaceC0171c) {
        this.f26239a = cVar;
        this.f26240b = str;
        this.f26241c = lVar;
        this.f26242d = interfaceC0171c;
    }

    public void d(InterfaceC0172d interfaceC0172d) {
        if (this.f26242d != null) {
            this.f26239a.d(this.f26240b, interfaceC0172d != null ? new c(interfaceC0172d) : null, this.f26242d);
        } else {
            this.f26239a.e(this.f26240b, interfaceC0172d != null ? new c(interfaceC0172d) : null);
        }
    }
}
