package z1;

import h2.k4;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f27682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27683c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f27684a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27685b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f27686c = false;

        public z a() {
            return new z(this, null);
        }

        public a b(boolean z7) {
            this.f27686c = z7;
            return this;
        }

        public a c(boolean z7) {
            this.f27685b = z7;
            return this;
        }

        public a d(boolean z7) {
            this.f27684a = z7;
            return this;
        }
    }

    public z(k4 k4Var) {
        this.f27681a = k4Var.f22215a;
        this.f27682b = k4Var.f22216b;
        this.f27683c = k4Var.f22217c;
    }

    /* synthetic */ z(a aVar, i0 i0Var) {
        this.f27681a = aVar.f27684a;
        this.f27682b = aVar.f27685b;
        this.f27683c = aVar.f27686c;
    }

    public boolean a() {
        return this.f27683c;
    }

    public boolean b() {
        return this.f27682b;
    }

    public boolean c() {
        return this.f27681a;
    }
}
