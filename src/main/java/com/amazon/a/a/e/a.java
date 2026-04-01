package com.amazon.a.a.e;

import com.amazon.a.a.e.a;
import com.amazon.a.a.k.d;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<T>> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3607b = new com.amazon.a.a.o.c("Expirable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f3608a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f3609c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b<T>> f3610d = new Vector();

    private void h() {
        this.f3608a.a(com.amazon.a.a.n.b.d.BACKGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.a.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                a.this.c();
            }

            public String toString() {
                return "Expire: " + a.this.toString();
            }
        }, a());
    }

    private void i() {
        Iterator<b<T>> it = this.f3610d.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    protected abstract Date a();

    public final void a(b<T> bVar) {
        this.f3610d.add(bVar);
    }

    protected void b() {
    }

    public void c() {
        if (this.f3609c.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f3947a) {
                f3607b.a("Expiring: " + this);
            }
            d();
            if (com.amazon.a.a.o.c.f3947a) {
                f3607b.a("Notifying Observers of expiration: " + this);
            }
            i();
        }
    }

    protected abstract void d();

    @Override // com.amazon.a.a.k.d
    public final void e() {
        h();
        b();
    }

    public final void f() {
        if (this.f3609c.compareAndSet(false, true)) {
            i();
        }
    }

    protected boolean g() {
        return this.f3609c.get();
    }
}
