package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f2083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f2084b;

    /* JADX INFO: renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0026a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f2085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f2086b;

        RunnableC0026a(g.c cVar, Typeface typeface) {
            this.f2085a = cVar;
            this.f2086b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2085a.b(this.f2086b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f2088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2089b;

        b(g.c cVar, int i8) {
            this.f2088a = cVar;
            this.f2089b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2088a.a(this.f2089b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2083a = cVar;
        this.f2084b = handler;
    }

    private void a(int i8) {
        this.f2084b.post(new b(this.f2083a, i8));
    }

    private void c(Typeface typeface) {
        this.f2084b.post(new RunnableC0026a(this.f2083a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2112a);
        } else {
            a(eVar.f2113b);
        }
    }
}
