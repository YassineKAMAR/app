package r2;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25862b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25863a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25864b = "";

        public e a() {
            return new e(this, null);
        }

        public a b(String str) {
            this.f25864b = str;
            return this;
        }

        public a c(String str) {
            this.f25863a = str;
            return this;
        }
    }

    /* synthetic */ e(a aVar, h hVar) {
        this.f25861a = aVar.f25863a;
        this.f25862b = aVar.f25864b;
    }

    public String a() {
        return this.f25862b;
    }

    public String b() {
        return this.f25861a;
    }
}
