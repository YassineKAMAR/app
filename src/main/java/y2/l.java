package y2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x2.d f27444a;

    public l(x2.d dVar) {
        this.f27444a = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f27444a));
    }
}
