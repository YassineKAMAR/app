package m0;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import q0.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f24446a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f24447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile f f24448c;

    public d(h hVar) {
        this.f24447b = hVar;
    }

    private f c() {
        return this.f24447b.d(d());
    }

    private f e(boolean z7) {
        if (!z7) {
            return c();
        }
        if (this.f24448c == null) {
            this.f24448c = c();
        }
        return this.f24448c;
    }

    public f a() {
        b();
        return e(this.f24446a.compareAndSet(false, true));
    }

    protected void b() {
        this.f24447b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f24448c) {
            this.f24446a.set(false);
        }
    }
}
