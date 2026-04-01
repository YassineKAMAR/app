package j1;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23901a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23902a;

        /* synthetic */ a(t0 t0Var) {
        }

        public o a() {
            if (this.f23902a != null) {
                return new o(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f23902a = str;
            return this;
        }
    }

    /* synthetic */ o(a aVar, u0 u0Var) {
        this.f23901a = aVar.f23902a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f23901a;
    }
}
