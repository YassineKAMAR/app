package androidx.fragment.app;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
class r implements androidx.lifecycle.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.j f2609a = null;

    r() {
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.d a() {
        c();
        return this.f2609a;
    }

    void b(d.a aVar) {
        this.f2609a.h(aVar);
    }

    void c() {
        if (this.f2609a == null) {
            this.f2609a = new androidx.lifecycle.j(this);
        }
    }

    boolean d() {
        return this.f2609a != null;
    }
}
