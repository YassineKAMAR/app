package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f895a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f896b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f897c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f898d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f899e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f900f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f901g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f902h = false;

    d1() {
    }

    public int a() {
        return this.f901g ? this.f895a : this.f896b;
    }

    public int b() {
        return this.f895a;
    }

    public int c() {
        return this.f896b;
    }

    public int d() {
        return this.f901g ? this.f896b : this.f895a;
    }

    public void e(int i8, int i9) {
        this.f902h = false;
        if (i8 != Integer.MIN_VALUE) {
            this.f899e = i8;
            this.f895a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f900f = i9;
            this.f896b = i9;
        }
    }

    public void f(boolean z7) {
        int i8;
        if (z7 == this.f901g) {
            return;
        }
        this.f901g = z7;
        if (this.f902h) {
            if (z7) {
                int i9 = this.f898d;
                if (i9 == Integer.MIN_VALUE) {
                    i9 = this.f899e;
                }
                this.f895a = i9;
                i8 = this.f897c;
                if (i8 == Integer.MIN_VALUE) {
                }
            } else {
                int i10 = this.f897c;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f899e;
                }
                this.f895a = i10;
                i8 = this.f898d;
                if (i8 == Integer.MIN_VALUE) {
                }
            }
            this.f896b = i8;
        }
        this.f895a = this.f899e;
        i8 = this.f900f;
        this.f896b = i8;
    }

    public void g(int i8, int i9) {
        this.f897c = i8;
        this.f898d = i9;
        this.f902h = true;
        if (this.f901g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f895a = i9;
            }
            if (i8 != Integer.MIN_VALUE) {
                this.f896b = i8;
                return;
            }
            return;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f895a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f896b = i9;
        }
    }
}
