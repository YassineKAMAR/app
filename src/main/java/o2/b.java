package o2;

import z1.z;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f25287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f25288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25290h;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private z f25294d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f25291a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25292b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f25293c = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25295e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25296f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f25297g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25298h = 0;

        public b a() {
            return new b(this, null);
        }

        public a b(int i8, boolean z7) {
            this.f25297g = z7;
            this.f25298h = i8;
            return this;
        }

        public a c(int i8) {
            this.f25295e = i8;
            return this;
        }

        public a d(int i8) {
            this.f25292b = i8;
            return this;
        }

        public a e(boolean z7) {
            this.f25296f = z7;
            return this;
        }

        public a f(boolean z7) {
            this.f25293c = z7;
            return this;
        }

        public a g(boolean z7) {
            this.f25291a = z7;
            return this;
        }

        public a h(z zVar) {
            this.f25294d = zVar;
            return this;
        }
    }

    /* synthetic */ b(a aVar, c cVar) {
        this.f25283a = aVar.f25291a;
        this.f25284b = aVar.f25292b;
        this.f25285c = aVar.f25293c;
        this.f25286d = aVar.f25295e;
        this.f25287e = aVar.f25294d;
        this.f25288f = aVar.f25296f;
        this.f25289g = aVar.f25297g;
        this.f25290h = aVar.f25298h;
    }

    public int a() {
        return this.f25286d;
    }

    public int b() {
        return this.f25284b;
    }

    public z c() {
        return this.f25287e;
    }

    public boolean d() {
        return this.f25285c;
    }

    public boolean e() {
        return this.f25283a;
    }

    public final int f() {
        return this.f25290h;
    }

    public final boolean g() {
        return this.f25289g;
    }

    public final boolean h() {
        return this.f25288f;
    }
}
