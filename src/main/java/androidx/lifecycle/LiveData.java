package androidx.lifecycle;

import androidx.lifecycle.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f2619k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f2620a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m.b<p<? super T>, LiveData<T>.b> f2621b = new m.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2622c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f2624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f2625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f2629j;

    class LifecycleBoundObserver extends LiveData<T>.b implements g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final i f2630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ LiveData f2631f;

        @Override // androidx.lifecycle.g
        public void a(i iVar, d.a aVar) {
            d.b bVarB = this.f2630e.a().b();
            if (bVarB == d.b.DESTROYED) {
                this.f2631f.h(this.f2633a);
                return;
            }
            d.b bVar = null;
            while (bVar != bVarB) {
                b(d());
                bVar = bVarB;
                bVarB = this.f2630e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void c() {
            this.f2630e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean d() {
            return this.f2630e.a().b().c(d.b.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2620a) {
                obj = LiveData.this.f2625f;
                LiveData.this.f2625f = LiveData.f2619k;
            }
            LiveData.this.i(obj);
        }
    }

    private abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p<? super T> f2633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LiveData f2636d;

        void b(boolean z7) {
            if (z7 == this.f2634b) {
                return;
            }
            this.f2634b = z7;
            this.f2636d.b(z7 ? 1 : -1);
            if (this.f2634b) {
                this.f2636d.d(this);
            }
        }

        void c() {
        }

        abstract boolean d();
    }

    public LiveData() {
        Object obj = f2619k;
        this.f2625f = obj;
        this.f2629j = new a();
        this.f2624e = obj;
        this.f2626g = -1;
    }

    static void a(String str) {
        if (l.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(LiveData<T>.b bVar) {
        if (bVar.f2634b) {
            if (!bVar.d()) {
                bVar.b(false);
                return;
            }
            int i8 = bVar.f2635c;
            int i9 = this.f2626g;
            if (i8 >= i9) {
                return;
            }
            bVar.f2635c = i9;
            bVar.f2633a.a((Object) this.f2624e);
        }
    }

    void b(int i8) {
        int i9 = this.f2622c;
        this.f2622c = i8 + i9;
        if (this.f2623d) {
            return;
        }
        this.f2623d = true;
        while (true) {
            try {
                int i10 = this.f2622c;
                if (i9 == i10) {
                    return;
                }
                boolean z7 = i9 == 0 && i10 > 0;
                boolean z8 = i9 > 0 && i10 == 0;
                if (z7) {
                    e();
                } else if (z8) {
                    f();
                }
                i9 = i10;
            } finally {
                this.f2623d = false;
            }
        }
    }

    void d(LiveData<T>.b bVar) {
        if (this.f2627h) {
            this.f2628i = true;
            return;
        }
        this.f2627h = true;
        do {
            this.f2628i = false;
            if (bVar != null) {
                c(bVar);
                bVar = null;
            } else {
                m.b<p<? super T>, LiveData<T>.b>.d dVarG = this.f2621b.g();
                while (dVarG.hasNext()) {
                    c((b) dVarG.next().getValue());
                    if (this.f2628i) {
                        break;
                    }
                }
            }
        } while (this.f2628i);
        this.f2627h = false;
    }

    protected void e() {
    }

    protected void f() {
    }

    protected void g(T t7) {
        boolean z7;
        synchronized (this.f2620a) {
            z7 = this.f2625f == f2619k;
            this.f2625f = t7;
        }
        if (z7) {
            l.c.g().c(this.f2629j);
        }
    }

    public void h(p<? super T> pVar) {
        a("removeObserver");
        LiveData<T>.b bVarU = this.f2621b.u(pVar);
        if (bVarU == null) {
            return;
        }
        bVarU.c();
        bVarU.b(false);
    }

    protected void i(T t7) {
        a("setValue");
        this.f2626g++;
        this.f2624e = t7;
        d(null);
    }
}
