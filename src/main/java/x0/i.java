package x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    class a extends i {
        a() {
        }

        @Override // x0.i
        public h a(String str) {
            return null;
        }
    }

    public static i c() {
        return new a();
    }

    public abstract h a(String str);

    public final h b(String str) {
        h hVarA = a(str);
        return hVarA == null ? h.a(str) : hVarA;
    }
}
