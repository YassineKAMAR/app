package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f328b = new CopyOnWriteArrayList<>();

    public b(boolean z7) {
        this.f327a = z7;
    }

    void a(a aVar) {
        this.f328b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f327a;
    }

    public final void d() {
        Iterator<a> it = this.f328b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    void e(a aVar) {
        this.f328b.remove(aVar);
    }

    public final void f(boolean z7) {
        this.f327a = z7;
    }
}
