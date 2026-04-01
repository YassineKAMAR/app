package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f2690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f2691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f2692c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f2693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f2694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2695c;

        public a(j registry, d.a event) {
            kotlin.jvm.internal.q.f(registry, "registry");
            kotlin.jvm.internal.q.f(event, "event");
            this.f2693a = registry;
            this.f2694b = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2695c) {
                return;
            }
            this.f2693a.h(this.f2694b);
            this.f2695c = true;
        }
    }

    public v(i provider) {
        kotlin.jvm.internal.q.f(provider, "provider");
        this.f2690a = new j(provider);
        this.f2691b = new Handler();
    }

    private final void f(d.a aVar) {
        a aVar2 = this.f2692c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f2690a, aVar);
        this.f2692c = aVar3;
        Handler handler = this.f2691b;
        kotlin.jvm.internal.q.c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public d a() {
        return this.f2690a;
    }

    public void b() {
        f(d.a.ON_START);
    }

    public void c() {
        f(d.a.ON_CREATE);
    }

    public void d() {
        f(d.a.ON_STOP);
        f(d.a.ON_DESTROY);
    }

    public void e() {
        f(d.a.ON_START);
    }
}
