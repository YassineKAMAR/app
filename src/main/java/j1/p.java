package j1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23905a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23906a;

        /* synthetic */ a(v0 v0Var) {
        }

        public p a() {
            if (this.f23906a != null) {
                return new p(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f23906a = str;
            return this;
        }
    }

    /* synthetic */ p(a aVar, w0 w0Var) {
        this.f23905a = aVar.f23906a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f23905a;
    }
}
