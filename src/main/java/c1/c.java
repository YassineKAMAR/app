package c1;

import f1.p;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements b1.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f3403a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f3404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d1.d<T> f3405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f3406d;

    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(d1.d<T> dVar) {
        this.f3405c = dVar;
    }

    private void h(a aVar, T t7) {
        if (this.f3403a.isEmpty() || aVar == null) {
            return;
        }
        if (t7 == null || c(t7)) {
            aVar.b(this.f3403a);
        } else {
            aVar.a(this.f3403a);
        }
    }

    @Override // b1.a
    public void a(T t7) {
        this.f3404b = t7;
        h(this.f3406d, t7);
    }

    abstract boolean b(p pVar);

    abstract boolean c(T t7);

    public boolean d(String str) {
        T t7 = this.f3404b;
        return t7 != null && c(t7) && this.f3403a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f3403a.clear();
        for (p pVar : iterable) {
            if (b(pVar)) {
                this.f3403a.add(pVar.f21651a);
            }
        }
        if (this.f3403a.isEmpty()) {
            this.f3405c.c(this);
        } else {
            this.f3405c.a(this);
        }
        h(this.f3406d, this.f3404b);
    }

    public void f() {
        if (this.f3403a.isEmpty()) {
            return;
        }
        this.f3403a.clear();
        this.f3405c.c(this);
    }

    public void g(a aVar) {
        if (this.f3406d != aVar) {
            this.f3406d = aVar;
            h(aVar, this.f3404b);
        }
    }
}
