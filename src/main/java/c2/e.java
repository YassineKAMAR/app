package c2;

import z1.z;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z f3418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f3419g;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private z f3424e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3420a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3421b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3422c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3423d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f3425f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f3426g = false;

        public e a() {
            return new e(this, null);
        }

        public a b(int i8) {
            this.f3425f = i8;
            return this;
        }

        @Deprecated
        public a c(int i8) {
            this.f3421b = i8;
            return this;
        }

        public a d(int i8) {
            this.f3422c = i8;
            return this;
        }

        public a e(boolean z7) {
            this.f3426g = z7;
            return this;
        }

        public a f(boolean z7) {
            this.f3423d = z7;
            return this;
        }

        public a g(boolean z7) {
            this.f3420a = z7;
            return this;
        }

        public a h(z zVar) {
            this.f3424e = zVar;
            return this;
        }
    }

    /* synthetic */ e(a aVar, k kVar) {
        this.f3413a = aVar.f3420a;
        this.f3414b = aVar.f3421b;
        this.f3415c = aVar.f3422c;
        this.f3416d = aVar.f3423d;
        this.f3417e = aVar.f3425f;
        this.f3418f = aVar.f3424e;
        this.f3419g = aVar.f3426g;
    }

    public int a() {
        return this.f3417e;
    }

    @Deprecated
    public int b() {
        return this.f3414b;
    }

    public int c() {
        return this.f3415c;
    }

    public z d() {
        return this.f3418f;
    }

    public boolean e() {
        return this.f3416d;
    }

    public boolean f() {
        return this.f3413a;
    }

    public final boolean g() {
        return this.f3419g;
    }
}
