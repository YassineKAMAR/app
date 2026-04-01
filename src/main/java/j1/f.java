package j1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23896a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23897a;

        /* synthetic */ a(e0 e0Var) {
        }

        public f a() {
            String str = this.f23897a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            f fVar = new f(null);
            fVar.f23896a = str;
            return fVar;
        }

        public a b(String str) {
            this.f23897a = str;
            return this;
        }
    }

    /* synthetic */ f(f0 f0Var) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f23896a;
    }
}
