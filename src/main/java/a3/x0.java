package a3;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f173b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f174c;

    public x0(c cVar, Object obj) {
        this.f174c = cVar;
        this.f172a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f172a;
            if (this.f173b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e8) {
                throw e8;
            }
        }
        synchronized (this) {
            this.f173b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f172a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f174c.f41r) {
            this.f174c.f41r.remove(this);
        }
    }
}
