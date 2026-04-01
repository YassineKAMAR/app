package f7;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f21842i = new c();

    private c() {
        super(l.f21855c, l.f21856d, l.f21857e, l.f21853a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // y6.b0
    public String toString() {
        return "Dispatchers.Default";
    }
}
