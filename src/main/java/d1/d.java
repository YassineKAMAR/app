package d1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import x0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f20952f = j.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final h1.a f20953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f20954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f20955c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<b1.a<T>> f20956d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    T f20957e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f20958a;

        a(List list) {
            this.f20958a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f20958a.iterator();
            while (it.hasNext()) {
                ((b1.a) it.next()).a(d.this.f20957e);
            }
        }
    }

    d(Context context, h1.a aVar) {
        this.f20954b = context.getApplicationContext();
        this.f20953a = aVar;
    }

    public void a(b1.a<T> aVar) {
        synchronized (this.f20955c) {
            if (this.f20956d.add(aVar)) {
                if (this.f20956d.size() == 1) {
                    this.f20957e = b();
                    j.c().a(f20952f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f20957e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f20957e);
            }
        }
    }

    public abstract T b();

    public void c(b1.a<T> aVar) {
        synchronized (this.f20955c) {
            if (this.f20956d.remove(aVar) && this.f20956d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t7) {
        synchronized (this.f20955c) {
            T t8 = this.f20957e;
            if (t8 != t7 && (t8 == null || !t8.equals(t7))) {
                this.f20957e = t7;
                this.f20953a.a().execute(new a(new ArrayList(this.f20956d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
