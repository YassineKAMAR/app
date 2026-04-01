package j1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23892a;

    /* JADX INFO: renamed from: j1.a$a, reason: collision with other inner class name */
    public static final class C0135a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f23893a;

        /* synthetic */ C0135a(r rVar) {
        }

        public a a() {
            String str = this.f23893a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f23892a = str;
            return aVar;
        }

        public C0135a b(String str) {
            this.f23893a = str;
            return this;
        }
    }

    /* synthetic */ a(v vVar) {
    }

    public static C0135a b() {
        return new C0135a(null);
    }

    public String a() {
        return this.f23892a;
    }
}
